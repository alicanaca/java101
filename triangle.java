import java.util.Scanner;

public class triangle {
    public static void main(String args[]){
        int x,y,alan;
        double z;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Üçgenin ilk dik kenarını giriniz: ");
            x = input.nextInt();
            System.out.println("Üçgenin ikinci dik kenarını giriniz: ");
            y = input.nextInt();
        }
        z = Math.sqrt((x*x)+(y*y));
        System.out.println("Üçgenin hipotenüsü: "+z);
        alan = x*y/2;
        System.out.println("Üçgenin alanı: "+alan);
    }
}
