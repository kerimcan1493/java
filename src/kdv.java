import java.util.Scanner;

public class kdv {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tutar giriniz  :  ");

        int tutar=input.nextInt();



        double kdv1  = tutar*0.18;
        int kdvliFiyat =tutar+=tutar*0.18;
        System.out.println("kdv tutarı : "+ kdv1);

        System.out.print("KDV'li fiyat : " + kdvliFiyat);


    }
}
