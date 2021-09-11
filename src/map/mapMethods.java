package map;

import java.util.HashMap;

public class mapMethods {
    public static void main(String[] args) {
        HashMap<Integer,String> hm1=new HashMap<>();
        hm1.put(101, "Ali Han");// eleman eklemek için kullanılır.
        hm1.put(102, "veli Can");
        hm1.put(103, "Ayşe Tan");
        hm1.put(101, "Kemal Yıldız"); // aynı key kullanıldığında eski kaydın üzerine yazar.
        System.out.println(hm1);
        hm1.put(104 , "veli can");//tekrarli key e izin vermez ama value degerini getirebilir
        System.out.println("hm1 = " + hm1);
        hm1.put(null , "merve aslan");
        System.out.println("hm1 = " + hm1);
        hm1.put(null, "hakan inal");
        System.out.println("hm1 = " + hm1);
        hm1.put(105, null);
        System.out.println("hm1 = " + hm1);
        hm1.put(106 ,null);

        System.out.println("hm1 = " + hm1);

        System.out.println(hm1.get(103));//get ile eleman cagirdik
        //hm1.values();
      //  System.out.println("hm1 = " + hm1);
        System.out.println(hm1.values());
        System.out.println(hm1.keySet());//numaralari getirir
        hm1.putIfAbsent(104 , "Kubilay ");//var olan keye ait  degerler ve value oldugu icin ekleme yapmaz
        System.out.println("***********************");

        System.out.println("hm1 = " + hm1);
        hm1.putIfAbsent(107 , "Hakan tetik");
        System.out.println("hm1 = " + hm1);
        hm1.putIfAbsent(105 , "faruk efehan ");
        System.out.println("hm1 = " + hm1);

        HashMap<Integer,String>hm2=new HashMap<>();
        hm2.put(107 ," elma");
        hm2.put(106 , "armut");
        hm2.put(200 , "mandalina");
        hm1.putAll(hm2);
        System.out.println("hm1 = " + hm1);
        System.out.println("hm2.size() = " + hm2.size());
        System.out.println("hm2 = " + hm2);

    }
}
