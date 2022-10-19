import java.util.Scanner;

public class Flight {
    public static void main(String[] args) {
        double rate = 0.1, tutar, indirim;
        int km, yas, tip;

        Scanner sc = new Scanner(System.in);
        System.out.print("Yolculuk mesafenizi km cinsinden giriniz: ");
        km = sc.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = sc.nextInt();

        System.out.print("Yolculuk tipiniz tek yön ise 1'e, gidiş dönüş ise 2'ye basınız: ");
        tip = sc.nextInt();

        tutar = km * rate;

        if(yas<12){
            indirim = 0.5;
            tutar = tutar * indirim;
        } else if(yas>=12 && yas<24){
            indirim = 0.1;
            tutar = tutar - (tutar * indirim);
        } else if(yas>=65){
            indirim = 0.3;
            tutar = tutar - (tutar * indirim);
        }

        if(km>0 && yas>0){
            if(tip==1){
                System.out.print("Toplam tutar: "+tutar);
            } else if(tip==2) {
                double secondDis = 0.2;
                tutar = tutar - (tutar * secondDis);
                System.out.print("Toplam tutar: "+tutar);
            } else {
                System.out.print("Yanlış veri girdiniz.");
            }
        } else {
            System.out.print("Yanlış veri girdiniz.");
        }
        sc.close();
    }
}
