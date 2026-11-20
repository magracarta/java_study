package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain3 {
    static void main() {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("studentA", 50);
        System.out.println(studentMap);

        //학생이 없는경우에만 추가1
        if(!studentMap.containsKey("studentA")){
            studentMap.put("studentA", 100);
        }
        System.out.println(studentMap);

        studentMap.putIfAbsent("studentA", 90);
        studentMap.putIfAbsent("studentB", 90);
        System.out.println(studentMap);

    }
}
