package questions;

public class QA01_GrubCalismasi {

    /* FOR WHILE 2. SORU
       Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
        Input :
        30 and 40
        Expected OutPut:
        GCD for 30 and 40 = 10
        LCM for 30 and 40 = 120

           Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM (En Küçük Ortak Kat) değerlerini bulun
        Giriş :
        30 ve 40
        Beklenen Çıktı:
        30 ve 40 için GCD = 10
        30 ve 40 için LCM = 120

     */



    public static void main(String[] args) {

        int a = 30;
        int b = 40;
        int ebob = 1;

        for (int i = 1; i <30 ; i++) {
            if (a%i==0 &&b %i==0){
                ebob=i;
            }

        }
        int ekok=(a*b)/ebob;
        System.out.println("GCD for 30 and 40 =" +ebob);
        System.out.println("LCM for 30 and 40 =" +ekok);

    }
}
