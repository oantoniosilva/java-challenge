import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numberEmployee;
        double numberHour, valueHour, salary;

        numberEmployee = sc.nextInt();
        numberHour = sc.nextDouble();
        valueHour = sc.nextDouble();

        salary = (numberHour * valueHour);



        System.out.println("NUMBER = " + numberEmployee);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        sc.close();
    }
}
