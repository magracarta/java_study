package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String availableZondeId : ZoneId.getAvailableZoneIds()) {
            System.out.println("availableZondeId = "+availableZondeId);
            ZoneId zoneId = ZoneId.of(availableZondeId);
            System.out.println(zoneId+ " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId.systemDefault() = " + zoneId);

        ZoneId seoulZoneId = zoneId.of("Asia/Seoul");

        System.out.println("seoulZoneId = "+seoulZoneId);
    }
}
