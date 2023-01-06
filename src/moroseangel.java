
import java.util.Scanner;


//Program to swap
public class moroseangel {
    public static void main(String[] args) {

        int randomA, randomB;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter 1st no to store in A");
        randomA = takeInput.nextInt();
        System.out.println("Enter 1st no to store in B");
        randomB = takeInput.nextInt();
        randomA = randomA+randomB;
        randomB = randomA-randomB;
        System.out.println("Value in B is"+randomB);
        randomA=randomA-randomB;
        System.out.println("Value in A is"+randomA);


    }
}