import java.util.ArrayList;
import java.util.Scanner;

public class DailyTemperatures {

    public static void main(String[] args) {
        // Initialize ArrayLists for daysOfWeek and temperatures
        ArrayList<String> daysOfWeek = new ArrayList<>();
        ArrayList<Double> temperatures = new ArrayList<>();

        // Populate the ArrayLists
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        // Simulated temperature data
        temperatures.add(20.5);
        temperatures.add(22.3);
        temperatures.add(19.4);
        temperatures.add(21.2);
        temperatures.add(25.6);
        temperatures.add(27.8);
        temperatures.add(23.1);

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day of the week (Monday through Sunday) or 'week' for weekly data:");
        String input = scanner.nextLine();

        // Check if user wants the weekly average
        if ("week".equalsIgnoreCase(input)) {
            double sum = 0;
            for (int i = 0; i < daysOfWeek.size(); i++) {
                System.out.println(daysOfWeek.get(i) + ": " + temperatures.get(i) + "°C");
                sum += temperatures.get(i);
            }
            double weeklyAverage = sum / daysOfWeek.size();
            System.out.printf("Weekly Average Temperature: %.2f°C\n", weeklyAverage);
        } else {
            // Display temperature for the requested day
            boolean dayFound = false;
            for (int i = 0; i < daysOfWeek.size(); i++) {
                if (input.equalsIgnoreCase(daysOfWeek.get(i))) {
                    System.out.println(daysOfWeek.get(i) + ": " + temperatures.get(i) + "°C");
                    dayFound = true;
                    break;
                }
            }
            if (!dayFound) {
                System.out.println("Invalid day. Please enter a valid day of the week.");
            }
        }

        scanner.close();
    }
}
