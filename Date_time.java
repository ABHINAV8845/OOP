package task2_practical;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
public class Date_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println("Current Date-Time: " + now.format(format));

        LocalDate startDate = LocalDate.of(2025, 1, 1);
        Period diff = Period.between(startDate, LocalDate.now());
        System.out.println("Difference: " + diff.getYears() + " years, " + diff.getMonths() + " months");
	}

}
