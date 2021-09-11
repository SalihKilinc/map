package Abstraction;

import java.util.Scanner;

public class musteri {
    Anaabstract anaabstract;
    Scanner scanner=new Scanner(System.in);
   public  void alisveris(){
       System.out.println("Ekmek hesapla : ");
       System.out.println("Kac adet ekmak almak istersiniz :");
   int x =scanner.nextInt();
       System.out.println("Ekmek fiyati :" + anaabstract.ekmekAl(x)/x+"tl");
       System.out.println("Tutar :" + anaabstract.ekmekAl(x) +"tl");



   }
}
