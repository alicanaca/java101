import java.util.Scanner;

public class Suggestion {
    public static void main(String args[]){
        int heat;
        Scanner sc = new Scanner(System.in);
        System.out.print("How is the temperature right now: ");
        heat = sc.nextInt();
        sc.close();

        if(heat<5){
            System.out.print("You can choose to go Skiing.");
        } else if(heat>=5 && heat<15){
            System.out.print("You can choose to go to Cinema.");
        } else if(heat>=15 && heat<25){
            System.out.print("You can choose to plan a Picnic.");
        } else if(heat>=25){
            System.out.print("You can choose to go Swimming.");
        }
    }
}
