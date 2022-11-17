import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = sc.nextInt();
        double total=0;
        sc.close();

        for(int i=1; i<=sayi; i++){
            total += 1.0/i;
        }

        System.out.printf("Harmonik sayı toplamı: %,.2f",total);
    }
}
