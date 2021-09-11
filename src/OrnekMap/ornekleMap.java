package OrnekMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ornekleMap {
    static   Scanner scan =new Scanner(System.in);

    public static void main(String[] args) {
        /*
 	1- Kullanıcıdan birçok kimlik numarsını(4 haneli), tam ismini, adresini , telefonunu alın.
      2- Kimlik numarasını key olarak, diğer bilgileri value olarak bir mape depolayın
      3- Kimlik numarasını girerek kullanıcını bilgilerini ekrana yazdırın
     4- Tum kullanicalarin isimlerini ekrana  yazdirin

 */

        String secim=" ";
           HashMap<Integer, HashMap<String, String>> kisiListesi = new HashMap<>();

do{
           HashMap<String, String> kimlikBilgi = new HashMap<>();
           System.out.println("Adinizi ve soyadinizi giriniz");
           kimlikBilgi.put("ad", scan.nextLine());

           System.out.println("lutfen adresinizi giriniz ");

           kimlikBilgi.put("adres", scan.nextLine());

           System.out.println("lutfen telofon girini");
           kimlikBilgi.put("telefon", scan.nextLine());

           System.out.println("4 haneli kimlik no giriniz");

           kisiListesi.put(scan.nextInt(), kimlikBilgi);
           System.out.println(kimlikBilgi);
           System.out.println(kisiListesi);
           System.out.println("Devam etmek istiyor musunuz (E/H)");

       }

while (secim.equalsIgnoreCase("E"));
        System.out.println("goruntulemek istediginiz kisinin bilgilerini gormek ister misiniz");
        System.out.println(kisiListesi.get(scan.nextInt()));

//ne haber
    }
}
