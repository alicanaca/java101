import java.util.Scanner;

public class Power {

    public static int UsAlma(int taban,int us)
    {   
        if(taban==1||us==0)
            return 1;
        else
        {
         return UsAlma(taban,us-1)*taban;
        }
    }

    public static void main(String[] args) {
        int taban, us;
        Scanner sc = new Scanner(System.in);

        System.out.print("Taban sayısını giriniz: ");
        taban = sc.nextInt();

        System.out.print("Üs değerini giriniz: ");
        us = sc.nextInt();
        sc.close();

        System.out.printf("Sonuç: %d", UsAlma(taban, us));        
    }
}
