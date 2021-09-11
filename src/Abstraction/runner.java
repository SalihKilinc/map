package Abstraction;

import java.util.Scanner;

public class runner {
  static  Dikdortgen dikdortgen =new Dikdortgen();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("kisa kenar  ");
    dikdortgen.kk=scanner.nextInt();
        //int kk=scanner.nextInt();
        System.out.println("uzun kenar :");
    //int uk =scanner.nextInt();
        dikdortgen.uk=scanner.nextInt();
        System.out.println("dikdortgen cevresi :" +dikdortgen.cevre());
        System.out.println("dikdortgen alani :" +dikdortgen.alan());


    }




}
