import java.util.Scanner;
import java.util.GregorianCalendar;

public class TestHeartRates{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("first name?");
        String fName = input.nextLine();
        System.out.println("last name?");
        String lName = input.nextLine();
        System.out.println("what year were you born?");
        int bYear = input.nextInt();


        boolean validYears = bYear <= new GregorianCalendar().get(GregorianCalendar.YEAR);

        if (validYears) {
            HearRates user = new HeartRates(fName, lName, bYear);
            System.out.printf("First Name : " + user.get_fName() + "\n");
            System.out.printf("Last Name : " + user.get_lName() + "\n);
            System.out.printf("Age : " + user.get_Age() + "\n");
            System.out.printf("Maximum Heart Rate : " + user.maxHeartRate() + "\n");
            user.targetHeartRate();
        } else {
            System.out.printf("please re-type your information");
        }
    }
}