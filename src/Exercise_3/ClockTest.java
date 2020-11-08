package Exercise_3;
//import java.util.Scanner;
public class ClockTest {
    public static void main(String[] args) {
        Clock ourClock = new Clock(3, 45, 56);

        System.out.println("The current time is: " + ourClock.getHour() + "PM" + ": " + ourClock.getMinutes() + ": " + ourClock.getSeconds());

    }
}
