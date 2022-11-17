import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        
        int sayi;
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = sc.nextInt();
        sc.close();

        for(int i=0; i<sayi; i++){
            for(int k=0; k<(i*2)-1; k++){
                System.out.printf("*");
            }
            System.out.printf("\n");
            for(int j=0; j<sayi-i; j++){
                System.out.printf(" ");
            }
        }
        for(int i=sayi; i>0; i--){
            for(int k=0; k<(i*2)-1; k++){
                System.out.printf("*");
            }
            System.out.printf("\n");
            for(int j=0; j<=sayi-i+1; j++){
                System.out.printf(" ");
            }
        }
    }
}