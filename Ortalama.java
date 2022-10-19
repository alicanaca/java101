import java.util.Scanner;

public class Ortalama {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int che, mat, psy, tur, mus, average, ders=5;

        System.out.print("Please enter your math grade: ");
        mat = sc.nextInt();
        if(!(mat>=0) || !(mat<=100)){mat=0; ders--;}

        System.out.print("Please enter your chemistry grade: ");
        che = sc.nextInt();
        if(!(che>=0) || !(che<=100)){che=0; ders--;}

        System.out.print("Please enter your psyhics grade: ");
        psy = sc.nextInt();
        if(!(psy>=0) || !(psy<=100)){psy=0; ders--;}

        System.out.print("Please enter your turkish grade: ");
        tur = sc.nextInt();
        if(!(tur>=0) || !(tur<=100)){tur=0; ders--;}

        System.out.print("Please enter your music grade: ");
        mus = sc.nextInt();
        if(!(mus>=0) || !(mus<=100)){mus=0; ders--;}

        if(!(ders==0)){
            average = (mat+che+psy+tur+mus)/ders;
            System.out.print("Your average grade is: "+average+"\n");
            if (average>=55){
                System.out.print("Congratz you've passed!");
            } else {
                System.out.print("You shall not pass!");
            }
        } else {
            System.out.print("You've entered wrong numbers!");
        }
        sc.close();
    }
}
