import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Harmonik hesaplama için eleman sayısı giriniz: ");
        int eleman = scan.nextInt();
        double result = 0.0;

        for (int i = 1; i < eleman; i++) {
            result += (1.0/i);
        }

        System.out.println("Harmonik seri sonucu: " + result);
        System.out.println("Harmonik serinin ortalaması: " + eleman/result);
        scan.close();
    }
}
