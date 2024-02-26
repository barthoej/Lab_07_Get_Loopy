import java.util.Scanner;

public class CtoFConverter
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius = 0;
        double fahrenheit = 0;

        while(true)
        {
            System.out.println("Enter temperature in celsius: ");
            if (in.hasNextDouble()) {
                celsius = in.nextDouble();
                break;}

            else{
                System.out.println("Invalid input. Please enter a valid number.");
                in.next();
            }
        }

        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("The equivalent temperature in Fahrenheit is " + fahrenheit);
    }
}
