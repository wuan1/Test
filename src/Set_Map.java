import java.util.HashMap;
import java.util.Map;

public class Set_Map {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        //通过put方法来插入键值对
        map.put("及时雨","宋江");
        map.put("黑旋风","李逵");
        map.put("行者","武松");
        //System.out.println(map);
        //使用map最大的目的往往是根据key来找value
        String value = map.get("行者");
        System.out.println(value);
    }

}
