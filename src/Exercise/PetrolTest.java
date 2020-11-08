package Exercise;
import java.util.Scanner;

public class PetrolTest {
    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    Petrol driver_1 = new Petrol("Yaba busStop", "Gasoline", 6, 1200, 20);

        System.out.println("Your purchase details :\n" + "Address: " + driver_1.getPetLocation() + "\n" + "Type_of_petrol : " + driver_1.getPetType()+ "\n" + "Quantity_of_petrol : "  + driver_1.getPetQuantity() + "\n" + "Petrol_price : " + "$" + driver_1.getPetPrice()+ "\n" + "Discount : " + driver_1.getPetPercentageDis() + "\n");

        System.out.print("Enter petrol quantity: ");
        double petQuantity = userInput.nextDouble();

        System.out.print("Enter petrol price per liter: ");
        double petPrice = userInput.nextDouble();

        System.out.println("Your net_price is : " +  "$" + driver_1.getPurchaseAmount(petQuantity, petPrice));
    }

}
