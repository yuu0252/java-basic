package text.section_22;

import java.time.LocalDate;

public class DateTime2_Test8 {
    public static void main(String args[]) {
        LocalDate date1 = LocalDate.of(1999, 1, 2);

        System.out.println(date1);
        System.out.println("一年前は" + date1.minusYears(1));
        System.out.println("一ヶ月前は" + date1.minusMonths(1));
        System.out.println("五日前は" + date1.minusDays(5));
    }
}
