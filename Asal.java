import java.util.Scanner;

public class Asal {

    static void asal(int a, int i) {
        if (i==a){
            System.out.println("Girdiğiniz sayı asal sayıdır.");
            return;
        } else if (a%i==0) {
            System.out.println("Girdiğiniz sayı asal sayı değildir.");
            return;
        }
        asal(a,i+1);
    }

    public static void main(String[] args) {
        int sayi;
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = sc.nextInt();
        sc.close();

        asal(sayi,2);
    }
    
}
