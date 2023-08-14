import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Conversion Tool");
        System.out.println("----------------------------");

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            if (choice == 3) {
                System.out.println("Exiting the program.");
                break;
            }
            
            double temperature;

            if (choice == 1) {
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = scanner.nextDouble();
                double celsius = fahrenheitToCelsius(temperature);
                System.out.println(temperature + "°F is " + celsius + "°C");
            } else if (choice == 2) {
                System.out.print("Enter temperature in Celsius: ");
                temperature = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(temperature);
                System.out.println(temperature + "°C is " + fahrenheit + "°F");
            } else {
                System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

