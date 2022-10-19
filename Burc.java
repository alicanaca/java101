import java.util.Scanner;

public class Burc {
    public static void main(String[] args) {
        int ay, gun;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your birth month as a number: ");
        ay = sc.nextInt();

        System.out.print("Enter your birth day: ");
        gun = sc.nextInt();

        if(ay==1){
            if(gun<=21){
                System.out.print("Your zodiac sign is: Capricorn");
            } else if(gun<=31) {
                System.out.print("Your zodiac sign is: Aquarius");
            } else {
                System.out.print("You've entered invalid numbers.");
            }
        } else if(ay==2){
            if(gun<=19){
                System.out.print("Your zodiac sign is: Aquarius");
            } else if(gun<=29) {
                System.out.print("Your zodiac sign is: Pisces");
            } else {
                System.out.print("You've entered invalid numbers.");
            }
        } else if(ay==3){
            if(gun<=20){
                System.out.print("Your zodiac sign is: Pisces");
            } else if(gun<=31) {
                System.out.print("Your zodiac sign is: Aries");
            } else {
                System.out.print("You've entered invalid numbers.");
            }
        } else if(ay==4){
            if(gun<=20){
                System.out.print("Your zodiac sign is: Aries");
            } else if(gun<=30) {
                System.out.print("Your zodiac sign is: Taurus");
            } else {
                System.out.print("You've entered invalid numbers.");
            }
        } else if(ay==5){
            if(gun<=21){
                System.out.print("Your zodiac sign is: Taurus");
            } else if(gun<=31) {
                System.out.print("Your zodiac sign is: Gemini");
            } else {
                System.out.print("You've entered invalid numbers.");
            }
        } else if(ay==6){
            if(gun<=22){
                System.out.print("Your zodiac sign is: Gemini");
            } else if(gun<=30) {
                System.out.print("Your zodiac sign is: Cancer");
            } else {
                System.out.print("You've entered invalid numbers.");
            }
        } else if(ay==7){
            if(gun<=22){
                System.out.print("Your zodiac sign is: Cancer");
            } else if(gun<=31) {
                System.out.print("Your zodiac sign is: Leo");
            } else {
                System.out.print("You've entered invalid numbers.");
            }
        } else if(ay==8){
            if(gun<=22){
                System.out.print("Your zodiac sign is: Leo");
            } else if(gun<=31) {
                System.out.print("Your zodiac sign is: Virgo");
            } else {
                System.out.print("You've entered invalid numbers.");
            }
        } else if(ay==9){
            if(gun<=22){
                System.out.print("Your zodiac sign is: Virgo");
            } else if(gun<=30) {
                System.out.print("Your zodiac sign is: Libra");
            } else {
                System.out.print("You've entered invalid numbers.");
            }
        } else if(ay==10){
            if(gun<=22){
                System.out.print("Your zodiac sign is: Libra");
            } else if(gun<=31) {
                System.out.print("Your zodiac sign is: Scorpio");
            } else {
                System.out.print("You've entered invalid numbers.");
            }
        } else if(ay==11){
            if(gun<=21){
                System.out.print("Your zodiac sign is: Scorpio");
            } else if(gun<=30) {
                System.out.print("Your zodiac sign is: Sagittarius");
            } else {
                System.out.print("You've entered invalid numbers.");
            }
        } else if(ay==12){
            if(gun<=21){
                System.out.print("Your zodiac sign is: Sagittarius");
            } else if(gun<=31) {
                System.out.print("Your zodiac sign is: Capricorn");
            } else {
                System.out.print("You've entered invalid numbers.");
            }
        } else {
            System.out.print("You've entered invalid numbers.");
        }
        sc.close(); 
    }
}
