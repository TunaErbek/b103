package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {

        //Examle 1:  "Anlik tarihi(Current Date) ekrana yazdiren kodu yaziniz

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);//22-10-21
//Examle 1:  "Anlik Zamani(Current Time) ekrana yazdiren kodu yaziniz
        LocalTime currentTime = LocalTime.now();//20 43
        System.out.println(currentTime);
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime);

        //Examle 4: Japonya'daki Anlık Tarihi ve Anlik zamaniekrana yazdiran kodu yazdiriniz
        LocalDateTime currentDateTimeInJapan = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);

        LocalDateTime currentDateTimeInIstanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeInIstanbul);

        //Examle 6: Bugunden 789 gun sonra emekli olcaginiza göre emeklilik tarihini hesaplayan koddu yaziniz
        LocalDate currentDate2 = LocalDate.now();
        LocalDate retiredate = currentDate2.plusDays(789);
        System.out.println(retiredate);

        //examle 7: İki cocugunuzun dogum tarihleri arasinaki farki gün olarak hesaplayan kodu yaziniz

        LocalDate dobAli = LocalDate.of(2005, 5, 17);
        LocalDate dobVeli = LocalDate.of(2013, 2, 8);

        //Between Method2u kullanildi
        Long diff = ChronoUnit.DAYS.between(dobAli, dobVeli);
        System.out.println(diff);

        //examle 8 : Istanbul'un fethi ile Cumhuriyet'in kurulması arsinda
        // kac ay oldugunu gosteren kodu yaziniz.

        LocalDate istanbulunFethi = LocalDate.of(1453, 5, 29);
        LocalDate cumhuriyetKurulus = LocalDate.of(1923, 10, 29);
        long aySayisi = ChronoUnit.MONTHS.between(istanbulunFethi, cumhuriyetKurulus);

        System.out.println(aySayisi);

        //Example 9: Verilen tarihin hangi burcta oldugunu gosteren kodu yaziniz

        LocalDate myDate = LocalDate.of(1989, 3, 13);


        int day = myDate.getDayOfMonth();
        int month = myDate.getMonthValue();

        if (day > 21 && month == 3 || month == 4 && day < 20) {
            System.out.println("Koç");
        }
        if (day > 21 && month == 4 || month == 5 && day < 20) {
            System.out.println("Boğa");
        }
        if (day > 21 && month == 5 || month == 6 && day < 21) {
            System.out.println("İkizler");
        }
        if (day > 22 && month == 6 || month == 7 && day < 22) {
            System.out.println("Yengeç");
        }
        if (day > 23 && month == 7 || month == 8 && day < 23) {
            System.out.println("Aslan");
        }
        if (day > 24 && month == 8 || month == 9 && day < 23) {
            System.out.println("Başak");
        }
        if (day > 24 && month == 9 || month == 10 && day < 23) {
            System.out.println("Terazi");
        }
        if (day > 24 && month == 10 || month == 11 && day < 22) {
            System.out.println("Akrep");
        }
        if (day > 23 && month == 11 || month == 12 && day < 21) {
            System.out.println("Yay");
        }
        if (day > 22 && month == 12 || month == 1 && day < 20) {
            System.out.println("Oğlak");
        }
        if (day > 21 && month == 1 || month == 2 && day < 19) {
            System.out.println("Kova");
        }
    }
}
