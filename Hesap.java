import java.util.Scanner;

public class Hesap {
    public static void main(String args[]){
        int n1,n2,s;
        try (Scanner scan = new Scanner(System.in)) {
            System.out.printf("Enter the first number: ");
            n1 = scan.nextInt();
            System.out.printf("\nEnter the second number: ");
            n2 = scan.nextInt();
            System.out.printf("\nFor Addition press 1\nFor Substraction press 2\nFor Multiplication press 3\nFor Division press 4");
            System.out.printf("\nEnter your selection: ");
            s = scan.nextInt();
        }
        switch(s){
            case 1:
            int z = n1 + n2;
            System.out.println(z);
            break;
            case 2:
            z = n1 - n2;
            System.out.println(z);
            break;
            case 3:
            z = n1 * n2;
            System.out.println(z);
            break;
            case 4:
            if(n2!=0){
                float v = n1 / n2;
                System.out.printf("%f", v);
            }
            break;
            default:
            System.out.println("You selected wrong");
        }
    }
}
