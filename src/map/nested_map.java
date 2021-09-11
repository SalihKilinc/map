package map;

import java.util.HashMap;
import java.util.Map;

public class nested_map {
    public static void main(String[] args) {
        HashMap<Integer,HashMap<String,String>>kisilistesi=new HashMap<>();
        HashMap<String,String> kimlik1=new HashMap();
        kimlik1.put("Ad" , "Kenan");
        kimlik1.put("SoyAd" , "KILINC");
        kimlik1.put("Adres" , "Adana");
        kimlik1.put("bolum" , "fen");

    //    System.out.println("kimlik1 = " + kimlik1);

        HashMap<String,String> kimlik2=new HashMap();
        kimlik2.put("Ad" , "Tarcin");
        kimlik2.put("SoyAd" , "KILINC");
        kimlik2.put("Adres" , "Sion");
        kimlik2.put("bolum" , "Miyav");
       // System.out.println("kimlik2 = " + kimlik2);
        kisilistesi.put(1544,kimlik2);
        kisilistesi.put(1545, kimlik2);
        System.out.println("kisilistesi = " + kisilistesi);
        System.out.println(kisilistesi.get(1545).get("Ad"));
        System.out.println("----------------------------");

        for (Map.Entry<Integer, HashMap<String, String>> entry : kisilistesi.entrySet())
        {
            System.out.println("No = " + entry.getKey() + ", Kitap Bilgileri= " + entry.getValue());
            System.out.println(entry.getValue().get("ad")+" "+entry.getValue().get("soyad")+" "+
                    entry.getValue().get("bolum"));

        }
    }
}
