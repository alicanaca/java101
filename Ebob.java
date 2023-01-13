import java.util.Scanner;

public class Ebob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ebob=1;
        int sayi1, sayi2;
        do {
            System.out.print("İlk sayıyı giriniz (Çıkmak için 0'a basınız.): ");
            sayi1 = sc.nextInt();
            if(sayi1==0){
                break;
            }
            System.out.print("İkinci sayıyı giriniz: ");
            sayi2 = sc.nextInt();
            if(sayi1<sayi2){
                for(int i=1;i<sayi2;i++){
                    if(sayi1%i==0 && sayi2%i==0){
                        ebob=i;
                    }
                }
            } else {
                for(int i=1;i<sayi1;i++){
                    if(sayi1%i==0 && sayi2%i==0){
                        ebob=i;
                    }
                }
            }
            int ekok = (sayi1*sayi2)/ebob;
            System.out.printf("Ebob = %d\n", ebob);
            System.out.printf("Ekok = %d\n", ekok);
        } while (sayi1!=0);
        sc.close();
    }
}
