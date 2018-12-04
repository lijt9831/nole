<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/view/jsp/common/resources.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${baseUrl}/resources/bui/css/imgview.css" rel="stylesheet" type="text/css" />
<title>照片</title>
<script type="text/javascript">
  
</script>
<script type="text/javascript">
  $(function(){
    BUI.use([ 'bui/imgview'], function(ImgView){
        var imgList = [{
            src: "https://s.tbcdn.cn/g/fi/act/finder/img/test/1.jpg",
            miniSrc: "https://s.tbcdn.cn/g/fi/act/finder/img/test/1.jpg"
          },{
            src: "https://s.tbcdn.cn/g/fi/act/finder/img/test/2.jpg",
            miniSrc: "https://s.tbcdn.cn/g/fi/act/finder/img/test/2.jpg"
          },{
            src: "https://s.tbcdn.cn/g/fi/act/finder/img/test/3.jpg",
            miniSrc: "https://s.tbcdn.cn/g/fi/act/finder/img/test/3.jpg"
          },{
            src: "https://s.tbcdn.cn/g/fi/act/finder/img/test/4.jpg",
            miniSrc: "https://s.tbcdn.cn/g/fi/act/finder/img/test/4.jpg"
          },{
            src: "https://s.tbcdn.cn/g/fi/act/finder/img/test/5.jpg",
            miniSrc: "https://s.tbcdn.cn/g/fi/act/finder/img/test/5.jpg"
          },{
            src: "https://s.tbcdn.cn/g/fi/act/finder/img/test/6.jpg",
            miniSrc: "https://s.tbcdn.cn/g/fi/act/finder/img/test/6.jpg"
          },{
            src: "https://s.tbcdn.cn/g/fi/act/finder/img/test/7.jpg",
            miniSrc: "https://s.tbcdn.cn/g/fi/act/finder/img/test/7.jpg"
          },{
            src: "https://s.tbcdn.cn/g/fi/act/finder/img/test/8.jpg",
            miniSrc: "https://s.tbcdn.cn/g/fi/act/finder/img/test/8.jpg"
          },{
            src: "https://s.tbcdn.cn/g/fi/act/finder/img/test/1.jpg",
            miniSrc: "https://s.tbcdn.cn/g/fi/act/finder/img/test/1.jpg"
          },{
            src: "https://s.tbcdn.cn/g/fi/act/finder/img/test/2.jpg",
            miniSrc: "https://s.tbcdn.cn/g/fi/act/finder/img/test/2.jpg"
          },{
            src: "https://s.tbcdn.cn/g/fi/act/finder/img/test/3.jpg",
            miniSrc: "https://s.tbcdn.cn/g/fi/act/finder/img/test/3.jpg"
          },{
            src: "https://s.tbcdn.cn/g/fi/act/finder/img/test/4.jpg",
            miniSrc: "https://s.tbcdn.cn/g/fi/act/finder/img/test/4.jpg"
          },{
            src: "https://s.tbcdn.cn/g/fi/act/finder/img/test/5.jpg",
            miniSrc: "https://s.tbcdn.cn/g/fi/act/finder/img/test/5.jpg"
          },{
            src: "https://s.tbcdn.cn/g/fi/act/finder/img/test/6.jpg",
            miniSrc: "https://s.tbcdn.cn/g/fi/act/finder/img/test/6.jpg"
          },{
            src: "https://s.tbcdn.cn/g/fi/act/finder/img/test/7.jpg",
            miniSrc: "https://s.tbcdn.cn/g/fi/act/finder/img/test/7.jpg"
          },{
            src: "https://s.tbcdn.cn/g/fi/act/finder/img/test/8.jpg",
            miniSrc: "https://s.tbcdn.cn/g/fi/act/finder/img/test/8.jpg"
          }]
          var imgList2 = [{
            src: "https://s.tbcdn.cn/g/fi/act/finder/img/test/1.jpg",
            miniSrc: "https://s.tbcdn.cn/g/fi/act/finder/img/test/1.jpg"
          },{
            src: "https://s.tbcdn.cn/g/fi/act/finder/img/test/2.jpg",
            miniSrc: "https://s.tbcdn.cn/g/fi/act/finder/img/test/2.jpg"
          }]
    	var imgView = new ImgView.ImgView({
            render: "#imgviewWrap",
            width: $(window).width(),
            height: $(window).height() - 50,
            imgList: imgList,
            imgNum: 2, // 默认取第几张图片，默认为0，取第一张
            autoRender: false // 是否自动渲染,默认为false
          });
          // autoRender如果为true就代表自动渲染。
          imgView.render();
          
          jQuery(window).resize(function(){
              imgView.set('width', jQuery(window).width());
              imgView.set('height', jQuery(window).height() - 50);
          })
    });
  });
</script>
</head>
<body>
    <div class="clearfix">
      <div id="imgviewWrap"></div>
    </div>
</body>
</html>