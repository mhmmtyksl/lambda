package lambda_day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>(Arrays.asList(14, 9, 13, 4, 9, 2, 4, 14, 15));
        yazdirJava(l);
        System.out.println();// bunun amaci arada bir bosluk birakmak
        yazdirLambda(l);
        System.out.println();
        ciftSayiJava(l);
        System.out.println();
        ciftSayiLambda(l);
        System.out.println();
        tekSayiKare(l);
        System.out.println();
        farkliTekKup(l);
        System.out.println();
        farkliCiftKareToplam(l);
        System.out.println();
        farkliCiftKupCarpim(l);
        System.out.println();
        tersDuzSira(l);


    }




    // 1)List in elemanlarini yanyana java( structured) ile yazdir.
    private static void yazdirJava(List<Integer> l) {
        for (Integer w : l) {
            System.out.print(w + " ");// 14 9 13 4 9 2 4 14 15
        }
    }

    // 1) lambda(functional) ile yazdiralim.
    public static void yazdirLambda(List<Integer> l) {
        l.stream().forEach(t -> System.out.print(t + " "));// 14 9 13 4 9 2 4 14 15
    }

    //2)List in elemanlarından ÇİFT olanları aralarında boşluk
    // bırakarak yazdıran metod oluştur(Structured)
    private static void ciftSayiJava(List<Integer> l) {
        for (Integer w:l) {
            if (w%2==0) {
                System.out.print(w+" ");// 14 4 2 4 14
            }
        }
    }
    // 2) lambda(functional) ile
        public static void ciftSayiLambda(List<Integer> l) {
        l.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" ")); // 14 4 2 4 14
        }

    //3) List teki tek sayıların karelerini yazdıran metod oluşturun

        public static void tekSayiKare(List<Integer> l) {
        l.stream().filter(t->t%2!=0).forEach(t-> System.out.print(t*t+ " ")); // 81 169 81 225
        }
        // 4) Listedeki tekrarlı elemanları silip tek sayı olanların
    // küplerini yazdıran metod oluştur
        public static void farkliTekKup(List<Integer> l) {
        l.stream().distinct().filter(t->t%2==1).map(t->t*t*t).forEach(t-> System.out.print(t+" ")); // 729 2197 3375
            }



            // 5) Listedeki tekrarli elemanlari silip cift olanlarin karelerinin toplamini yazdiran method yaziniz.

        public static void farkliCiftKareToplam(List<Integer> l) {
            System.out.print(l.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, (x,y)->x+y)); // 216
        }
            //6)Listedeki tekrarlı elemanları silip çift sayı olanların küplerinin çarpımını yazdıran metod oluştur

    public static void farkliCiftKupCarpim(List<Integer> l) {
        System.out.print(l.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(x,y)->x*y )); // 1404928
    }

    //7)Listedeki elemanları sıralayarak ve ters sıralayarak yazdır

    private static void tersDuzSira(List<Integer> l) {
        l.stream().sorted().forEach(t-> System.out.print(t+" ")); // 2 4 4 9 9 13 14 14 15
        System.out.println();
        l.stream().sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" ")); // 15 14 14 13 9 9 4 4 2

    }







}