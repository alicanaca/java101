import java.util.Scanner;

public class Asal {
    public static void main(String[] args) {
        int sayi,top=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = sc.nextInt();
        sc.close();

        for(int i=2; i<sayi; i++){
            if(sayi%i==0){
                top += i;
            }
        }

        if(top==0 && sayi>1){
            System.out.print("Girdiğiniz sayı asal sayıdır.");
        } else if (top!=0){
            System.out.print("Girdiğiniz sayı asal sayı değildir.");
        } else {
            System.out.print("Yanlış bir giriş yaptınız.");
        }
    }
    
}
