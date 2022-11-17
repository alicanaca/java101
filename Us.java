import java.util.Scanner;

public class Us {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Taban sayısını giriniz: ");
        int taban = sc.nextInt();
        System.out.print("Üs sayısını giriniz: ");
        int us = sc.nextInt();
        sc.close();
        int result=1;

        for(int i=1; i<=us; i++){
            result *= taban;
        }

        System.out.print("Sonuç: "+result);
    }
}
