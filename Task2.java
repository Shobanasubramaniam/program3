import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the base currency (e.g., USD): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the exchange rate (e.g., if 1 " + baseCurrency + " = 0.85 " + targetCurrency + "): ");
        double exchangeRate = scanner.nextDouble();

        double convertedAmount = amount * exchangeRate;
        System.out.printf("%.2f %s = %.2f %s%n", amount, baseCurrency, convertedAmount, targetCurrency);
        scanner.close();

    }
}
