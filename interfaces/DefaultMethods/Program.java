package DefaultMethods;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        InterestService interestRateBrazil = new BrazilInterestService(2);
        InterestService interestRateUSA = new UsaInterestService(1);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        System.out.print("Payment after " + months + " months in Brazil: " +
                String.format("%.2f", interestRateBrazil.payment(amount, months)));
        System.out.println();
        System.out.print("Payment after " + months + " months in USA: " +
                String.format("%.2f", interestRateUSA.payment(amount, months)));
    }

}
