import java.util.Scanner;

public class Taksi {
    public static void main(String args[]){
        int open = 10;
        double rate = 2.2;
        int km;
        double price;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter how many kilometers you have travelled: ");
            km = input.nextInt();
        }
        price = open + (km*rate);
        if (price<=20){
            System.out.println("Price to be paid: 20");
        } else {
            System.out.println("Price to be paid: "+price);
        }
    }
}
