package Abstraction;

import java.util.Scanner;

public class Runner_Ekmek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Nerden alisveris yapacaksiniz (1 Market / 2 Halk Ekmek");
        int secim = scan.nextInt();


        musteri l1 = new musteri();
//l1.alisveris();
        l1.anaabstract = new Market();
        l1.alisveris();

        if (secim == 1) {
            l1.anaabstract = new Market();
        } else {
            l1.anaabstract = new Halk_Ekmek();
        }l1.alisveris();
    }
}

	/*
	 5 farklı market
	 5 farklı ürün alışverişi yapılsın.(ürün fiyatları farklı olsun)
	 sonra toplam tutarları karşılaştırsın

	 */