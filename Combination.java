import java.util.Scanner;

public class Combination {
    static int Comp(int x){
        if(x==1){
            return x;
        }
        return x*Comp(x-1);
    }
    public static void main(String[] args) {
        int first, second, comb;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kombinasyon hesaplamak için ilk sayıyı giriniz: ");
        first = sc.nextInt();
        System.out.print("Kombinasyon hesaplamak için ikinci sayıyı giriniz: ");
        second = sc.nextInt();
        sc.close();

        comb = Comp(first) / (Comp(second)*Comp(first-second));
        System.out.printf("C(%d,%d): %d",first,second,comb);
        
    }
}
