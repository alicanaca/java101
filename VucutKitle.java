import java.util.Scanner;

public class VucutKitle {
    public static void main(String args[]){
        double boy, index;
        int kilo;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Please enter your weight: ");
            kilo = input.nextInt();
            System.out.println("Please enter your height (in meters): ");
            boy = input.nextDouble();
        }
        index = kilo / (boy * boy);
        System.out.println("Your body index is: "+index);
    }
}
