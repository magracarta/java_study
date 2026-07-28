package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        for(String availAbleZoneId:ZoneId.getAvailableZoneIds()){
            System.out.println("availAbleZoneId = " + availAbleZoneId);
            ZoneId zoneId = ZoneId.of(availAbleZoneId);

            System.out.println(zoneId + " | "+ zoneId.getRules());

        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId = " + zoneId);


        ZoneId zoneId2 = ZoneId.of("Asia/Seoul");
        System.out.println("zoneId2 = " + zoneId2);
    }
}
