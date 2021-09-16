package Lambda_day02;

import com.sun.jdi.IntegerValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {
        // Method Reference'da bizim oluşturduğumuz metodları  veya Java metodlarını kullanırız.
        //Method Reference Syntax ı ==> ClassName::MethodName  System.out.println();  ==  System.out::println;

        List<Integer> l=new ArrayList<>(Arrays.asList(15,14,9,13,4,9,2,4,14));
        elemanYazdir(l);
        System.out.println();
        ciftSayiYazdir(l);
        System.out.println();
        tekSayiKare(l);
        System.out.println();
        tekSayiKupTekrarsiz(l);
        System.out.println();
        farkliCiftSayiKareToplam(l);
        System.out.println();
        farkliCiftSayiKupCarpim(l);
        System.out.println();
        System.out.println(farkliTersSirala(l)); // [7]
        System.out.println();
        enBuyukElemaniBul(l);

    }




    //1)List in elemanlarını aralarında boşluk bırakarak yanyana yazdır.
    // (Method Reference- kendi metodumuz)
    public static void elemanYazdir(List<Integer> l) {
        l.stream().forEach(MethodLambda::bosluklaYazdir); // kendi methodumuz // 15 14 9 13 4 9 2 4 14
        l.stream().forEach(System.out::print); // javanin methodu // 1514913492414
    }

    //2)List in elemanlarından çift olanları aralarında boşluk bırakarak yanyana yazdır..(Method Reference)
    public static void ciftSayiYazdir(List<Integer> l) {
        l.stream().filter(MethodLambda::ciftMi).forEach(MethodLambda::bosluklaYazdir);  // 14 4 2 4 14
    }

    //3)List teki tek sayıların karelerini alıp aralarında boşluk bırakarak yanyana yazdır
    public static void tekSayiKare(List<Integer> l) {
        l.stream().filter(MethodLambda::tekMi).map(MethodLambda::kareAl).forEach(MethodLambda::bosluklaYazdir); // 225 81 169 81
    }

    //4)List teki tekrarlı olanları silip tek sayıların küplerini alıp aralarında boşluk bırakarak yanyana yazdır.
    public static void tekSayiKupTekrarsiz(List<Integer> l) {
        l.stream().distinct().filter(MethodLambda::tekMi).map(MethodLambda::kupAl).forEach(MethodLambda::bosluklaYazdir); // 3375 729 2197
    }

    //5)Farklı çift sayıların karelerinin toplamını yazdır (Use Method Reference)
    public static void farkliCiftSayiKareToplam(List<Integer> l) {                                         // gelen hepsini yandakinin uzerine ekle demek
        int num=l.stream().distinct().filter(MethodLambda::ciftMi).map(MethodLambda::kareAl).reduce(0,Math::addExact);
        System.out.println(num); // 216
    }

    //6)Farklı çift sayıların küplerinin çarpımını yazdır .(Use Method Reference)
    public static void farkliCiftSayiKupCarpim(List<Integer> l) {
        int num1= l.stream().distinct().filter(MethodLambda::ciftMi).map(MethodLambda::kupAl).reduce(1,Math::multiplyExact);
        System.out.println(num1); // 1404928
    }

    //7)List teki farklı ve 5 ten büyük ve cift elemanlarının yarısını alıp ters sıralayarak list olarak yazdır.(Use Me
    public static List farkliTersSirala(List<Integer> l) {
        return l.stream().distinct().filter(t->t>5 && t%2==0).map(t->t/2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

    }
    // 8) List teki en buyukl elemani bul(use method referance)
    private static void enBuyukElemaniBul(List<Integer> l) {
        System.out.println(l.stream().reduce(Integer.MAX_VALUE,Math::min));
        System.out.println(l.stream().reduce(Integer.MIN_VALUE,Math::max));

        l.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(MethodLambda::bosluklaYazdir);
        l.stream().sorted().limit(1).forEach(MethodLambda::bosluklaYazdir); // 15 2
    }

}
