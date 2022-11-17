import java.util.Scanner;

public class Katlar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        int deger = sc.nextInt();
        sc.close();

        System.out.print("4'ün kuvvetleri: ");
        for(int i=1; i<=deger; i*=4){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.print("5'in kuvvetleri: ");
        for(int i=1; i<=deger; i*=5){
            System.out.print(i+" ");
        }
    }
}
