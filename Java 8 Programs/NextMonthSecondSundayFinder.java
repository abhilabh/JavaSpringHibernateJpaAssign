import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class NextMonthSecondSundayFinder {
    public static LocalDate findNextMonthSecondSunday() {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the first day of next month
        LocalDate firstDayOfNextMonth = currentDate.plusMonths(1).withDayOfMonth(1);

        // Find the second Sunday of next month
        LocalDate secondSunday = firstDayOfNextMonth.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY))
                .with(TemporalAdjusters.next(DayOfWeek.SUNDAY));

        return secondSunday;
    }

    public static void main(String[] args) {
        LocalDate nextMonthSecondSunday = findNextMonthSecondSunday();
        System.out.println("The date of next month's second Sunday is: " + nextMonthSecondSunday);
    }
}
