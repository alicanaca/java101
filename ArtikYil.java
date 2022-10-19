import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int yil, kalan;

        Scanner sc = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        yil = sc.nextInt();
        sc.close();

        kalan = yil % 4;

        if(kalan==0){
            if((yil%100)==0 && (yil%400)!=0){
                System.out.print("Girdiğiniz yıl bir artık yıl değildir.");
            } else {
                System.out.print("Girdiğiniz yıl bir artık yıldır.");
            }
        } else {
            System.out.print("Girdiğiniz yıl bir artık yıl değildir.");
        }
    }
}
