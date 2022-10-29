import java.util.Scanner;

public class Mukemmel {
    public static void main(String[] args) {
        
        int sayi, top=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = sc.nextInt();
        sc.close();
        
        for(int i=1; i<sayi; i++){
            if(sayi%i==0){
                top += i;
            }
        }

        if(top==sayi){
            System.out.println("Girdiğiniz sayı bir mükemmel sayıdır.");
        } else {
            System.out.println("Girdiğiniz sayı bir mükemmel sayı değildir.");
        }
        
    }
}
