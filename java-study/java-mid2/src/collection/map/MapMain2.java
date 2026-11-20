package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain2 {
    static void main() {
        Map<String, Integer> studentMap = new HashMap<>();

        //학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        studentMap.put("studentA", 100);
        System.out.println(studentMap);

        boolean containKey = studentMap.containsKey("studentA");
        System.out.println("containKey = " + containKey);

        //특정 학생의 값 삭제
        studentMap.remove("studentA");
        System.out.println(studentMap);

    }
}
