
import java.util.Scanner;

public class Kdv {

    public static void main(String args[]){
        int value, price, tax;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the price of the product: ");
            value = input.nextInt();
        }
        if (value<=1000){
            System.out.println("Price before tax: "+value);
            price = value + (value*18/100);
            System.out.println("Price after tax: "+price);
            tax = value * 18 / 100;
            System.out.println("Tax value: "+tax);
        } else {
            System.out.println("Price before tax: "+value);
            price = value + (value*8/100);
            System.out.println("Price after tax: "+price);
            tax = value * 8 / 100;
            System.out.println("Tax value: "+tax);
        }

    }

}
