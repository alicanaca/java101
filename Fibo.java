import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        int sayi, top=0, pre=0, next=1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Fibonacci serisi için istediğiniz eleman sayısını giriniz: ");
        sayi = sc.nextInt();
        sc.close();

        do{
            top = pre + top;
            System.out.printf("%d ", top);
            pre = next;
            next = top;
            sayi--;
        } while(sayi>0);
    }
}