import java.time.LocalDate;
import java.time.Period;

public class WiproExperienceCalculator {
    public static void main(String[] args) {
        LocalDate startDateAtWipro = LocalDate.of(2018, 5, 15);

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the period between the start date and current date
        Period experiencePeriod = Period.between(startDateAtWipro, currentDate);

        int years = experiencePeriod.getYears();
        int months = experiencePeriod.getMonths();
        int days = experiencePeriod.getDays();

        System.out.println("Years of experience at Wipro: " + years);
        System.out.println("Months of experience at Wipro: " + months);
        System.out.println("Days of experience at Wipro: " + days);
    }
}
