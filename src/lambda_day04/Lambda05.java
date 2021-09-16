package lambda_day04;

import Lambda_day02.MethodLambda;

import java.util.stream.IntStream;

public class Lambda05 {
    public static void main(String[] args) {

        // 1) 1 den 20 ye kadar olan sayilari yazdiriniz.
        // range(1,20) olursa 1 dahil 20 dahil degil olur. rangeClosad(1,20) ikiside dahil olur.
        IntStream.rangeClosed(1,20).forEach(MethodLambda::bosluklaYazdir); // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

        System.out.println();

        // 2) functional programlamayı kullanarak 3 den ile 98 e kadar olan çift tam sayıların toplamını bulun
        System.out.println(IntStream.rangeClosed(3, 98).filter(t -> t % 2 == 0).sum()); // 2448 // zaten Integer classinda oldugumuz icin direkt sum() methodunu kullanabiliriz.

        // 3) functional programming kullanarak 9! i bul (9!=1*2*3...*9)
        System.out.println(IntStream.rangeClosed(1, 9).reduce(1, Math::multiplyExact)); // 362880

        // 4) İlk 7 çift sayma sayısının çarpımını bulun (2,4,6,8,10,12,14)
        System.out.println(IntStream.rangeClosed(2, 14).filter(t -> t % 2 == 0).reduce(1, Math::multiplyExact)); // 645120

        // 5)  6'dan büyük ilk 150 tek sayma sayısının toplamını bulun ==> 7, 9, 11, 13, 15, 17, 19
        System.out.println(IntStream.iterate(7, t -> t + 2).limit(150).sum()); // 23400

        // 6) İlk 23 cift sayma sayısının toplamını bulun
        System.out.println(IntStream.iterate(2, t -> t + 2).limit(23).sum()); // 552

        //7)  (11,22) arasındaki her tam sayının rakamlarının toplamını hesaplamak için bir metod oluşturun
        IntStream.rangeClosed(11,33).map(MethodLambda::rakamlarToplami).forEach(MethodLambda::bosluklaYazdir);



    }
}
