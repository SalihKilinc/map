package map;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Listof_Map {
    public static void main(String[] args) {

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

      /*  List<String>meyveler =new ArrayList<>();
        meyveler.add("elma");
        meyveler.add("cilek");
        meyveler.add("armut");
       // System.out.println("meyveler = " + meyveler);
        List<String>meyveler= Arrays.asList("elma" , "armut" , "cilek");
        karisik.put(meyveler);

        List<String>sebzeler= Arrays.asList("kabak" , "patates" , "tarhana");
        karisik.put("meyveler",sebzeler);

        List<String>vitaminler= Arrays.asList("e" , "a" , "c");
        karisik.put("meyveler",vitaminler);*/
      /*  List<String>sebzeler =new ArrayList<>();
        sebzeler.add("ispanak");
        sebzeler.add("patlican");
        sebzeler.add("marul");
        System.out.println("sebzeler = " + sebzeler);

     // List<String>*/
        HashMap<String, List<String> > karisik =new HashMap<>();

			/*
			List<String>meyveler=new ArrayList();
			meyveler.add("elma");
			meyveler.add("armut");
			meyveler.add("çilek");
			System.out.println(meyveler);
			*/

        List<String> meyveler=Arrays.asList("elma","armut","çilek");
        karisik.put("meyveler",meyveler );

        List<String> sebzeler=Arrays.asList("kabak","patlıcan","marul","ıspanak");
        karisik.put("sebzeler", sebzeler);

        List<String> vitaminler=Arrays.asList("a","b","c","d");
        karisik.put("vitaminler", vitaminler);
        System.out.println(karisik);

    }
}
