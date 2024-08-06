package text.section_22;

import java.time.LocalDate;

public class DateTime2_Test7 {
    public static void main(String args[]) {
        LocalDate date1 = LocalDate.of(1999, 1, 2);

        System.out.println(date1);
        System.out.println(("一年後は" + date1.plusYears(1)));
        System.out.println("一ヶ月後は" + date1.plusMonths(1));
        System.out.println("五日後は" + date1.plusDays(5));
    }
}
