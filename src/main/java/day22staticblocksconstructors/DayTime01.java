package day22staticblocksconstructors;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DayTime01 {

    public static void main(String[] args) {

        Date myDate = new Date();
        System.out.println(myDate);

        System.out.println(myDate.getTime());

        //icinde bulundugumuz an nasil alinir

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        //Dunyanin herhangi bir saat dilimindeki saati nasil aliriz?
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Vienna"))); //2023-01-07T21:46:03.823077500
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo"))); //2023-01-08T05:46:03.824073500
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow"))); //2023-01-07T23:46:03.824073500

        //Ileriki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35)); //2030-07-12

        //Geriki bir tarihe nasil gidertiz?

        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-05

        //Ileriki bir zamana nasil gidilir ?
        System.out.println(LocalTime.now().plusHours(3)); //02:56:25.564030700

        //Geriki bir zamana nasil gidertiz?
        System.out.println(LocalTime.now().minusMinutes(45)); //23:13:17.952923300

        //Zaman'da belli bir bölümü nasil aliriz?
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());

        //Tarihte belli bir bolumu nasil aliriz
        System.out.println(LocalDate.now().getMonthValue()+ ":"+LocalDate.now().getDayOfMonth());

        //İki tarih nasil karsilastirilir
        //24/02/1987 08/02/1982
        boolean result =LocalDate.of(1982,02,8).isAfter(LocalDate.of(1987,02,24));
        System.out.println(result);

        //tarihlerin formatlari nasil degistirilir

        // M--> Tek arakamla ay nosu yazar - MM--> Ikı rakamla ay nosunu yazar-MMM-->Ay ismini ilk uc ısmını yazar
        //MMMM--> ay ısımının tamamını yazar.

        //d--> Tek rakamla gün nosunu yazar  -- dd--> Iki rakamla gun nosunu yazar
        //yy--> Yilin son iki rakamini yazar-- yyyy Yilin tamamini yazar

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf.format(LocalDate.now()));



    }
}
