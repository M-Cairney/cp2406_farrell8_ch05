import java.util.Scanner;

/**
 * Created by jc260799 on 21/08/17.
 */
public class EvenOdd {

    public static void main(String[] args) {

        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        num = input.nextInt();
        if((num % 2) == 0)
            System.out.println("The number is Even");
        else
            System.out.println("The Number is Odd");
    }
}
