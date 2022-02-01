package co.s4n;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ZoneId toZoneID = ZoneId.of("America/Toronto");
        ZoneId utcZoneID = ZoneId.of("Etc/UTC");

        String utcTimeDecString = "2021-12-05 12:00";
        String utcTimeMayString = "2021-05-01 12:00";
        String dateTimeFormat = "yyyy-MM-dd HH:mm";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateTimeFormat).withZone(utcZoneID);
        ZonedDateTime toTimeDec = ZonedDateTime.parse(utcTimeDecString,formatter).withZoneSameInstant(toZoneID);
        ZonedDateTime toTimeMay = ZonedDateTime.parse(utcTimeMayString, formatter).withZoneSameInstant(toZoneID);

        System.out.println("Winter " + DateTimeFormatter.ofPattern(dateTimeFormat).format(toTimeDec));
        System.out.println("Summer " + DateTimeFormatter.ofPattern(dateTimeFormat).format(toTimeMay));

    }
}
