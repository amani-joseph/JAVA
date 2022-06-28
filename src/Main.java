import java.text.Format;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    final byte MonthsInYears = 12;
    final byte percent = 100;

    Scanner scanner = new Scanner(System.in);
    System.out.print("How much loan do you wish for ? ");
    int principle = Integer.parseInt(scanner.next());
    System.out.print("Length of loan in years ? ");
    int timeInYears = Integer.parseInt(scanner.next());
    System.out.print("Whats your interest (annual) ? ");
    double interest = Double.parseDouble(scanner.next());

    double monthlyInterest = (interest/100)/ 12;
    int time = timeInYears * MonthsInYears;
    double mortgage = principle * (
            (monthlyInterest * (Math.pow((1 + monthlyInterest),time))) /
                    (Math.pow((1 + monthlyInterest), time) - 1)
            );
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String TotalMortgage = currency.format(mortgage);
//    int result = principle * (());
//    System.out.println(principle);
//    System.out.println(time );
//    System.out.println(monthlyInterest );
    System.out.println("Your Mortgage is: " + TotalMortgage );


    }
}