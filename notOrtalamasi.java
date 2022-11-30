import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class notOrtalamasi {
    public static void main(String[] args) {
        //Degiskenleri olustur
        int matematik, fizik, kimya , turkce, tarih, muzik;

        Scanner input = new Scanner(System.in);

        //Degerleri al
        System.out.print("Matematik notunuz : ");
        matematik = input.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        System.out.print("Turkce notunuz : ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = input.nextInt();

        System.out.print("Muzik notunuz : ");
        muzik = input.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalamaniz : " + sonuc);

        String pass = sonuc > 60 ? "Sinifi gecti" : "Sinifta kaldi";

        System.out.println(pass);

    }
}
