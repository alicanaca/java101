import java.util.Scanner;

public class Cift {
    public static void main(String[] args) {
        int total = 0;
        int times = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("0'dan başlayacak şekilde istediğiniz aralığı giriniz: ");
        int range = sc.nextInt();
        sc.close();

        for(int i=0; i<=range; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        for(int i=1; i<=range; i++){
            if(i%12==0){
                times++;
                total += i;
            }
        }

        System.out.println("3 ve 4'e bölünen sayıların ortalaması: " + (total/times));
    }
    
}
