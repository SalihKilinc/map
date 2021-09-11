package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
;
public class mapOrnek {
    public static void main(String[] args) {
        HashMap<Integer, String> ogrenciBilgileri = new HashMap<>();

        ogrenciBilgileri.put(11, "Ali can - 7/B");
        ogrenciBilgileri.put(112, "Ayse cetin - 8/A");
        ogrenciBilgileri.put(113, "Aykut Demir- 5/B");
        ogrenciBilgileri.put(114, "Kenan Kilic 4/A");
        ogrenciBilgileri.put(115, "Selma Kilinc- 7/B");
        // System.out.println(ogrenciBilgileri.putIfAbsent(113, "Aykut Demir- 5/B"));
        System.out.println("ogrenciBilgileri = " + ogrenciBilgileri);
        //yeni ogrenci girisi yap var olan no ile kayit yapmaya calistiginda o numarali kaydin oldugunu ve o numaraya ait kisinin bilgisini getirsin
        //eger belirtilen no kayitli degilse kaydiniz eklenmistir desin
        Scanner scan = new Scanner(System.in);
      /*  System.out.println("numara giriniz");
        int numara = scan.nextInt();
        System.out.println("Ogrenci bilgisini giriniz");
        String bilgi = scan.nextLine();

        if (ogrenciBilgileri.putIfAbsent(numara, bilgi) == null) {
            System.out.println("Kaydiniz alindi = " + ogrenciBilgileri.get(numara));
        } else {
            System.out.println("boyle bir kayit mevcuttur  : Kayit = " + ogrenciBilgileri.putIfAbsent(numara, bilgi) + "kayitlidir");
        }*/
        System.out.println("numara giriniz");
        int numara =scan.nextInt();
        scan.nextLine();
        System.out.println(ogrenciBilgileri.get(numara).substring(ogrenciBilgileri.get(numara).indexOf('-')+1));

//maplerde bir keye karsilik birden fazla value olabilir mi
        /*
        meyveler  ---> elma
                       armut
                       cilek
         sebzeler---->
                       patlican
                       marul
                       ispanak
          vitaminler--->
                        a
                        b
                        c
                        d

         */
        HashMap<Integer,List<String>> karisik=new HashMap<>();

       List<String>meyveler =new ArrayList<>();
       meyveler.add("elma");
        meyveler.add("cilek");
        meyveler.add("armut");



    }
}