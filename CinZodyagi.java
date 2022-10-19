import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int yil, yilMod;

        Scanner sc = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        yil = sc.nextInt();
        sc.close();

        yilMod = yil%12;

        if(yilMod==0){
            System.out.print("Çin Zodyağı Burcunuz : Maymun");
        } else if(yilMod==1){
            System.out.print("Çin Zodyağı Burcunuz : Horoz");
        } else if(yilMod==2){
            System.out.print("Çin Zodyağı Burcunuz : Köpek");
        } else if(yilMod==3){
            System.out.print("Çin Zodyağı Burcunuz : Domuz");
        } else if(yilMod==4){
            System.out.print("Çin Zodyağı Burcunuz : Fare");
        } else if(yilMod==5){
            System.out.print("Çin Zodyağı Burcunuz : Öküz");
        } else if(yilMod==6){
            System.out.print("Çin Zodyağı Burcunuz : Kaplan");
        } else if(yilMod==7){
            System.out.print("Çin Zodyağı Burcunuz : Tavşan");
        } else if(yilMod==8){
            System.out.print("Çin Zodyağı Burcunuz : Ejderha");
        } else if(yilMod==9){
            System.out.print("Çin Zodyağı Burcunuz : Yılan");
        } else if(yilMod==10){
            System.out.print("Çin Zodyağı Burcunuz : At");
        } else if(yilMod==11){
            System.out.print("Çin Zodyağı Burcunuz : Koyun");
        } 
    }
}
