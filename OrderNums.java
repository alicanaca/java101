import java.util.Scanner;

public class OrderNums {
    public static void main(String args[]){
        int a, b, c;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        a = sc.nextInt();

        System.out.print("Enter the second number: ");
        b = sc.nextInt();

        System.out.print("Enter the third number: ");
        c = sc.nextInt();

        if (a>b && a>c){
            if(b>c){
                System.out.print("The order is: "+c+" < "+b+" < "+a);
            } else {
                System.out.print("The order is: "+b+" < "+c+" < "+a);
            }
        } else if(b>a && b>c){
            if(a>c){
                System.out.print("The order is: "+c+" < "+a+" < "+b);
            } else {
                System.out.print("The order is: "+a+" < "+c+" < "+b);
            }
        } else if(c>a && c>b){
            if(a>b){
                System.out.print("The order is: "+b+" < "+a+" < "+c);
            } else {
                System.out.print("The order is: "+a+" < "+b+" < "+c);
            }
        }
        sc.close();
    }
}
