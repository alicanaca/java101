import java.util.Scanner;

public class Fibonacci {
    static int Fibo(int num){
        if(num==1 || num==2){
            return 1;
        }
        return Fibo(num-1)+Fibo(num-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci serisi içinde bulmak istediğiniz eleman sayısını giriniz: ");
        int eleman = sc.nextInt();
        sc.close();
        System.out.println(Fibo(eleman));
    }
}
