package Exercise_2;
import java.util.Scanner;

public class CarApplication{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Car user_1 = new Car("Lexus", "2020", 100_335);
        Car user_2 = new Car("Camry", "2010", 55_790);

        System.out.println("User_1 car detail: " + "\n" + "Car_model: "+ user_1.getCmodel() + "\n" + "Year_of_produce: " + user_1.getCyear() + "\n" + "Car_price: " + "$" + user_1.getCprice() + "\n");
        System.out.println("User_2 car detail: " + "\n" + "Car_model: "+ user_2.getCmodel() + "\n" + "Year_of_produce: " + user_2.getCyear() + "\n" + "Car_price: " + "$" + user_2.getCprice());

        System.out.println("Enter your desire car price: ");
        double cprice = input.nextDouble();

        System.out.println("Enter your desire discount percentage (%): ");
        double discount = input.nextDouble();

        System.out.println("The discount price of your car is; " + "$" + user_1.getDiscount(cprice, discount));
    }
}
