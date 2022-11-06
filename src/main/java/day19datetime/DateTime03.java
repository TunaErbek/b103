package day19datetime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {

    public static void main(String[] args) {

//Example 1: Japonya ile Almanya arasindaki zaman farkini hesaplayan kodu yaziniz
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime currentDateTimeInGermany = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        Long fark = ChronoUnit.HOURS.between(currentDateTimeInGermany,currentDateTimeInJapan);
        System.out.println("fark = " + fark);

//Example 3: USA icin "Woow!", UK icin "Big", "CANADA" icin "Cold",
// "TURKEY" icin "Vatan", "GERMANY" icin "Araba", "RWANDA" icin "Cay"

       Countries country = Countries.UK;
       switch (country){
           case USA:
               System.out.println("Woow");
               break;
           case UK:
               System.out.println("Big");
       }
    }
}
