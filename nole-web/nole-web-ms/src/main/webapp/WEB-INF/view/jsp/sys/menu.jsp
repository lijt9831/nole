<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/jsp/common/resources.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
  $(function(){
    var fileArray = [];
    fileArray.push('bui/tree');
    fileArray.push('bui/menu');
    fileArray.push('bui/data');
    fileArray.push('bui/editor');
    fileArray.push('bui/toolbar');
    fileArray.push('bui/mask');
    BUI.use(fileArray, function(Tree, Menu, Data, Editor, Toolbar, Mask){
      var selectedNode;
      var deleteNodeIdSet = {};
      var store = new Data.TreeStore({
        url:'getMenuConfig'
      });
      var tree = new Tree.TreeList({
        render:'#t1',
        store:store,
        showLine:true
      });
      tree.render();
      store.load();
      var editor = new Editor.Editor({
        field:{ //设置编辑的字段
          rules:{
            required:true
          }
        },
        autoUpdate:false, //不自动更新对应DOM的文本，而使用store更新数据
        changeSourceEvent:null
      });
      editor.render();

      editor.on('accept', function(){
        var text = editor.getValue(), node = editor.get('curNode');
        node.text = text;
        store.update(node);
      });

      //显示编辑器
      function showEditor(node){
        var element = tree.findElement(node);
        editor.setValue(node.text);

        editor.set('curNode', node); //缓存当前编辑的记录
        editor.set('align', { //设置对齐
          node:$(element).find('.x-tree-icon-wraper'),
          points:[ 'tr', 'tl' ]
        });
        editor.show();
        editor.focus(); //获取焦点
      }

      var addSameLevel = function(){
        var newNode;
        // 将id标识为新增 
        newNode = {
          id:'new_' + new Date().getTime(),
          text:'请修改此处内容',
          expanded:true
        };
        newNode = store.add(newNode, selectedNode.parent);
        showEditor(newNode);
        menu.hide();
      }
      var addNextLevel = function(){
        var newNode;
        newNode = {
          id:'new_' + new Date().getTime(),
          text:'请修改此处内容',
          expanded:true
        };
        newNode = store.add(newNode, selectedNode);
        showEditor(newNode);
        menu.hide();
      }
      var deleteCascade = function(){
        var id = selectedNode.id;
        // 新增的直接删除，不放入队列 
        if (isNaN(id) && id.indexOf('new_') > -1){
          store.remove(selectedNode);
        } else {
          // 寻找所有的子
          var deleteNodeArray = [];
          var tempArray = [];
          tempArray.push(selectedNode);
          analyze(deleteNodeArray, tempArray);
          $.each(deleteNodeArray, function(i, n){
            var id = n.id;
            // 放入队列 
            if (isNaN(id)){
              if (id.indexOf('new_') > -1){
                return;
              } else if (id.indexOf('edit_') > -1){
                id = id.replace('edit_', '');
              }
            }
            if (deleteNodeIdSet[id] == undefined){
              deleteNodeIdSet[id] = id;
            }
          });
          store.remove(selectedNode);
        }

      }
      var edit = function(){
        // 将id 标识为编辑 
        var id = selectedNode.id;
        if (!isNaN(id)){
          selectedNode.id = 'edit_' + id.toString().replace('edit_', '');
        }
        showEditor(selectedNode);
        menu.hide();
      }

      var menu = new Menu.ContextMenu({
        children:[ {
          iconCls:' icon-plus',
          text:'增加同级',
          listeners:{
            'click':addSameLevel
          }
        }, {
          xclass:'menu-item-sparator'
        }, {
          iconCls:'icon-plus',
          text:'增加下级',
          listeners:{
            'click':addNextLevel
          }
        }, {
          iconCls:'icon-remove',
          text:'删除',
          listeners:{
            'click':deleteCascade
          }
        }, {
          iconCls:'icon-pencil',
          text:'编辑',
          listeners:{
            'click':edit
          }
        } ]
      });
      var menuWithOut = new Menu.ContextMenu({
        children:[ {
          iconCls:' icon-plus',
          text:'增加同级',
          listeners:{
            'click':addSameLevel
          }
        }, {
          iconCls:'icon-remove',
          text:'删除',
          listeners:{
            'click':deleteCascade
          }
        }, {
          iconCls:'icon-pencil',
          text:'编辑',
          listeners:{
            'click':edit
          }
        } ]
      });
      tree.on('itemcontextmenu', function(ev){
        var item = ev.target;
        if (item.id){
          // 全局变量（当前选中节点）
          selectedNode = tree.getItem(item.id);
          if (!selectedNode){
            selectedNode = tree.getItem('edit_' + item.id);
          }
          tree.setSelectedByField(selectedNode.id);
          // 禁止第4级 
          if (selectedNode.level == 3){
            menuWithOut.set('xy', [ ev.pageX, ev.pageY ]);
            menuWithOut.show();
          } else {
            menu.set('xy', [ ev.pageX, ev.pageY ]);
            menu.show();
          }
        }
        return false; //prevent the default menu
      });
      var bar = new Toolbar.Bar({
        render:'#tbar',
        elCls:'button-group',
        children:[{
          elCls:'button button-small',
          content:'保存修改',
          handler:function(){
            saveMenu();
          }
        }]
      });
      bar.render();
      var loadMask = new Mask.LoadMask({
        el:'#panel',
        msg:'loading ....'
      });
      function saveMenu(){
        loadMask.show();
        var deletedKeyArray = [];
        var nodeArray = [];
        // 转换为数值 
        for (k in deleteNodeIdSet){
          deletedKeyArray.push(1 * k);
        }
        // 收集新增和修改的节点 
        analyze(nodeArray, store.getResult());
        var data = {
          nodeArray:JSON.stringify(nodeArray),
          deletedKeyArray:JSON.stringify(deletedKeyArray)
        };
        $.post("saveMenu", data, function(result){
          loadMask.hide();
          BUI.Message.Show({
            msg:result.content,
            icon:result.code,
            closeable:false,
            cancel:function(){
              return false;
            },
            buttons:[{
              text:'确定',
              elCls:'button button-primary',
              handler:function(){
                this.hide();
                if (top.topManager && result.code == 'success'){
                  top.topManager.reloadPage();
                }
              }
            }]//button
          })//show
        });
      }

      // 消除tree结构，将所有节点并排放进数组 
      function analyze(nodeArray, storeResultTreeArray){
        $.each(storeResultTreeArray, function(i, n){
          var obj = {};
          // String
          obj.id = isNaN(n.id) ? n.id:n.id.toString();
          // int
          obj.level = n.level;
          // String
          obj.pid = n.parent.id == null ? '0' :(isNaN(n.parent.id) ? n.parent.id:n.parent.id.toString());
          // String 
          obj.name = n.text;
          nodeArray.push(obj);
          if (n.children && n.children.length > 0){
            analyze(nodeArray, n.children);
          }
        });
      }
    });
  });
</script>
</head>
<body>
  <div class="container">
    <div class="span8 offset3" style="margin-top: 20px;">
      <div id="panel" class="panel" style="border: 0px">
        <div class="panel-header clearfix">
          <h3 class="pull-left">右键编辑</h3>
          <div class="pull-right" id="tbar"></div>
        </div>
        <div id="t1" style="height:300px;overflow:auto;border: thin;"></div>
      </div>
    </div>
  </div>
</body>
</html>