import java.util.Scanner;

public class Palindrom {
    static void isPalindrom(int num){
        int temp=num,lastDigit,reverse=0;
        do{
            lastDigit = temp%10;
            reverse = (reverse*10)+lastDigit;
            temp /= 10;
        }while(temp!=0);
        if(reverse==num){
            System.out.print("Girdiğiniz sayı bir Palindrom sayıdır.");
            return;
        } else {
            System.out.print("Girdiğiniz sayı bir Palindrom sayı değildir.");
            return;
        }
    }
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        number = sc.nextInt();
        sc.close();

        isPalindrom(number);
    }
}
