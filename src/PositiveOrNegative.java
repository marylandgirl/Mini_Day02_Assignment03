import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String[] args){
        int number;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.println("Test Data");

        if (number > 0){
            System.out.printf("%d is positive",number);
        }
        else if (number < 0){
            System.out.printf("%d is negative",number);
        } else {
            System.out.println("You entered 0");
        }
    }
}
