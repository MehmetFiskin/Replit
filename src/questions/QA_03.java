package questions;

public class QA_03 {
    /*
       1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız.

    Test Data
    34
    Beklenen Çıktı
    7
     */

    public static void main(String[] args) {
        int sayi=34;
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        while (sayi>0){
            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10;


        }
        System.out.println(rakamlarToplami);
    }
}
