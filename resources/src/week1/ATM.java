package week1;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);
        int wrongPass = 3;
        int balance = 1500;
        int select;
        while (wrongPass > 0) {
            System.out.print("Kullanıcı Adınız :");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Patika Bankasına Hoşgeldiniz!");

                System.out.println("1-Para yatırma\n" +
                        "2-Para Çekme\n" +
                        "3-Bakiye Sorgula\n" +
                        "4-Çıkış Yap");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.println("Yatırmak istediğiniz miktarı girin: ");
                            int addBalance = input.nextInt();
                            balance += addBalance;
                            System.out.println("Yeni bakiyeniz: " +balance);
                            break;
                        case 2:
                            System.out.println("Çekmek istediğiniz miktarı girin:");
                            int withdrawMoney = input.nextInt();
                            if (withdrawMoney>=balance) {
                                System.out.println("Bakiye yetersiz!");
                            }else {
                                balance -= withdrawMoney;
                                System.out.println(withdrawMoney+ "miktarı ödendi.");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " +balance);
                            break;
                        case 4:
                            System.out.println("Tekrar görüşmek üzere.");
                            break;
                    }
            } else {
                //Şifre yanlış:
                --wrongPass;
                System.out.println("Kullanıcı adı veya şifre yanlış!");
                if(wrongPass == 0) {
                    System.out.println("Hesanınız kitlenmiştir. Banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan hakkınız: "+wrongPass);
                }
            }
        }
    }
}