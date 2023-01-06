
import java.util.Scanner;


//Program to swap numbers without using other variable
public class moroseangel {
    public static void main(String[] args) {

        int randomA, randomB;
        Scanner takeInput = new Scanner(System.in);
        System.out.println("Enter 1st no to store in A");
        randomA = takeInput.nextInt();
        System.out.println("Enter 1st no to store in B");
        randomB = takeInput.nextInt();
        randomA = randomA+randomB; //Store the addition to A
        randomB = randomA-randomB; //Extract the other value by subtracting
        System.out.println("Value in B is"+randomB);
        randomA=randomA-randomB; //Extract other by subtarcting the previous value
        System.out.println("Value in A is"+randomA);
    }
}