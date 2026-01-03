package APRILCODE;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTime {
    public static void main(String[] args) {
        ZonedDateTime indiaTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println(indiaTime);
    }
}
