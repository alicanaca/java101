import java.util.Scanner;

public class Desen {
    static void tekrar(int a, int b, int count){
        System.out.printf("%d ", a);
        if(a<=0){
            do{
                a += b;
                System.out.printf("%d ", a);
            } while(a<(b*(count-1)));
            return;
        }
        count++;
        tekrar((a-b), b, count);
    }
    public static void main(String[] args) {
        int sayi;
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        sayi = sc.nextInt();
        sc.close();

        tekrar(sayi,5,0);
    }
}
