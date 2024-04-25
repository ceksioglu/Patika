import java.util.Scanner;
public class KullanıcıGirişi  {
    public static void main(String[] args) {
        //Kullanıcı girişleri:
        String userName, password;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kullanıcı adını giriniz:");
        userName = scanner.nextLine();

        System.out.println("Şifrenizi giriniz:");
        password = scanner.nextLine();

        //Kullanıcı adı ve şifre kontrol:
        if (userName.equals("patika") && password.equals("java123")){
         System.out.println("Giriş yaptınız!");
        } else {
            System.out.println("Şifre yanlış!");
            System.out.println("Şifre değiştirmek için 'evet' yazın:");
            String choice = scanner.nextLine();

            //Şifre değiştirme algoritması:
            switch(choice){
                case "evet":
                    System.out.println("Yeni şifrenizi girin:");
                    String newPassword = scanner.nextLine();
                    if(password.equals(newPassword)) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu");
                    }
                default:
                    System.out.println("Lütfen tekrar giriş yapmayı deneyin.");
            }
        }
    }
}
