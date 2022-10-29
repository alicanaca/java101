import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        double taban, us, res;
        Scanner sc = new Scanner(System.in);

        System.out.print("Taban sayısını giriniz: ");
        taban = sc.nextDouble();

        System.out.print("Üs değerini giriniz: ");
        us = sc.nextDouble();
        sc.close();

        res = Math.pow(taban, us);
        System.out.printf("Sonuç: %.0f", res);        
    }
}
