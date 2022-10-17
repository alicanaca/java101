import java.util.Scanner;

public class Sifre {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Kullanıcı adınızı giriniz: ");
        String username = sc.nextLine();
        System.out.printf("Şifrenizi giriniz: ");
        String password = sc.nextLine();
        if(username.equals("patika") && password.equals("java123")){
            System.out.printf("Başarılı giriş yaptınız.");
        } else if(!password.equals("java123") || !username.equals("patika")) {
            System.out.printf("Yanlış şifre girdiniz. ");
            System.out.printf("Şifrenizi sıfırlamak istiyorsanız 1'e basın. İstemiyorsanız 0'a basın: ");
            int a = sc.nextInt();
            if(a==0){
                System.out.printf("Başarıyla çıkış yaptınız.");
            } else if(a==1){
                System.out.printf("Yeni şifreyi giriniz: ");
                sc.nextLine();
                String newpass = sc.nextLine();
                if(newpass.equals(password) || newpass.equals("java123")){
                    System.out.printf("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                } else {
                    System.out.printf("Başarıyla şifre oluşturdunuz.");
                }
            }
        } else {
            System.out.printf("Kullanıcı adı veya şifre hatalı.");
        }
        sc.close();
    }
}
