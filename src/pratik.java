import java.util.Scanner;


public class pratik {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih , muzik;


        Scanner input = new Scanner(System.in);

        System.out.print ("Matematik notunu giriniz : ");
        mat = input.nextInt();

        System.out.print("Fizik notunu giriniz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunu giriniz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe notunu giriniz : ");
        turkce = input.nextInt();

        System.out.print("Tarih notunu giriniz : ") ;
        tarih = input.nextInt();

        System.out.print("Müzik notunu giriniz :");
        muzik = input.nextInt();

        int toplam= (mat+fizik+kimya+turkce+tarih+muzik);
        double ortalama = toplam/6;
        System.out.print("Ortalamanız : ");
        System.out.println(ortalama);

        boolean kosul1= ortalama>= 60 ;
        String str = kosul1 ? "Geçti"  : "Kaldı";
        System.out.print(str);





        


    }
}
