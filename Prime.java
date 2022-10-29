import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {

        int sayi, top=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = sc.nextInt();
        sc.close();

        do{
            for(int i=2; i<sayi; i++){
                if(sayi%i==0){
                    top += i;
                }
            }
            if(top==0){
                System.out.printf("%d ",sayi);
            }
            top=0;
            sayi--;
        } while(sayi>1);
        
    }
}
