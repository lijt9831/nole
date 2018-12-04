import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @user create by lxn
 * @date 2018/4/10 15:37
 **/
public class Test {

    public static void main(String[] args) {

//        Map<String,String> map = new HashMap<String, String>();
        SortedMap<Object, Object> map = new TreeMap<Object, Object>();

        map.put("aa","AA");
        map.put("bb","BB");

        System.out.println(map.toString());

    }
}
