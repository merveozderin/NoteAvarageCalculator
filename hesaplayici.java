import java.util.Scanner;
public class hesaplayici
{
    public static void main(String[] args)
    {
        String str ;
        int mat, fizik, kimya, turkce, tarih, müzik;

        Scanner input_value = new Scanner(System.in);

        System.out.print("Matematik notunu giriniz: ");
        mat = input_value.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        fizik = input_value.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        kimya = input_value.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkce = input_value.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        tarih = input_value.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        müzik = input_value.nextInt();

        int toplam = mat + fizik + kimya + turkce + tarih + müzik ;
        float sonuc = toplam/6 ;

        System.out.print("Not ortalamanız: " +sonuc);
        System.out.print("\n");
        System.out.print("\n");
        str = sonuc > 60 ?  "Sınıfı geçti!" : "Sınıfta kaldı!" ;
        System.out.print(str);


    }

}
