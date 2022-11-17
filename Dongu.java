import java.util.Scanner;

public class Dongu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deger, total=0, times=0;
        
        do{
            System.out.print("Bir sayı giriniz (çıkmak için 0'a basınız): ");
            deger = sc.nextInt();

            if(deger%4==0 && deger!=0){
                times++;
                total += deger;
            }

        }while(deger>0);

        System.out.println("4'ün katlarının toplamı: "+(total));
        System.out.println("4'ün katlarının ortalaması: "+(total/times));

        sc.close();
    }
}
