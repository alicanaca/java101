import java.util.Scanner;

public interface Manav {
    public static void main (String args[]){
        double armut, muz, elma, domates, patlican, tutar;
        double armutRate=2.14;
        double muzRate=0.95;
        double elmaRate=3.67;
        double domatesRate=1.11;
        double patlicanRate=5.00;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Armutun kilosu: ");
            armut = input.nextDouble();
            System.out.print("Muzun kilosu: ");
            muz = input.nextDouble();
            System.out.print("Elmanın kilosu: ");
            elma = input.nextDouble();
            System.out.print("Domatesin kilosu: ");
            domates = input.nextDouble();
            System.out.print("Patlıcanın kilosu: ");
            patlican = input.nextDouble();
        }
        tutar = (armut*armutRate)+(muz*muzRate)+(elma*elmaRate)+(domates*domatesRate)+(patlican*patlicanRate);
        System.out.print("Toplam tutar: "+tutar);
    }
}
