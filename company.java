package collection1.advance8.optional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class company {
     public static void main(String[] args) {

         LocalTime k=LocalTime.now();
         LocalDate k1=LocalDate.now();
         LocalDateTime k2=LocalDateTime.now();
         LocalDate one=k1.minusDays(4);
         LocalDate on=k1.plusDays(8);
         LocalDate onw=k1.plusWeeks(5);
         System.out.println(one);
         System.out.println(onw);
         System.out.println(k2);
     }
}
