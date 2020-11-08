package Exercise_4;
import java.util.Scanner;
public class HeartRateTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HeartRates Abdullah = new HeartRates("Ismail", "Abdullah", 2001);

        System.out.println("Hi, " + Abdullah.getFirstName() + " " + Abdullah.getLastName() + " " +
                "here are your details: " + "\n" + "Age: " + Abdullah.getAge() + "\n" + "Your maximum heart beat per minute (bpm): " + Abdullah.getMaxHeart() + "bpm");

        System.out.print("Enter your firstName: ");
        String userName = input.next();


        System.out.print("Enter your lastName: ");
        String userName_2 = input.next();

        System.out.print("Enter year of birth: ");
        int userYear = input.nextInt();

        HeartRates userName_3 = new HeartRates(userName, userName_2, userYear);

        System.out.println("Hi, " +  userName_3.getName(userName, userName_2) +
                " here are your details: " + "\n" + "Age: " + userName_3.getBirthday(userYear) + "\n" + "Your maximum heart beat per minute (bpm): " + userName_3.getMaxHeartRate(userYear) + "bpm");
    }
}
