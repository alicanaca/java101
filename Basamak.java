import java.util.Scanner;

public class Basamak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int deger = sc.nextInt();
        int total=0, num, temp=deger;
        sc.close();

        while(temp!=0){
            num = temp%10;
            total += num;
            temp /= 10;
        }

        System.out.printf("%d sayısının basamakları toplamı: %d",deger,total);
    }
}