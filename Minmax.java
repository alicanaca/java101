import java.util.Scanner;

public class Minmax {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Kaç tane sayı gireceksiniz: ");
        int Num = sc.nextInt();
        int[] arr = new int[Num];
        for(int i=0;i<Num;i++){
            int w = i+1;
            System.out.printf("%d. Sayıyı giriniz: ", w);
            int z = sc.nextInt();
            arr[i]=z;
        }
        int small = arr[0];
        int large = arr[0];
        for(int k=0;k<Num;k++){
            if(small>arr[k]){
                small = arr[k];
            } else if(large<arr[k]) {
                large = arr[k];
            }
        }
        System.out.printf("En büyük sayı: %d\n", large);
        System.out.printf("En küçük sayı: %d", small);
        sc.close();
    }
}
