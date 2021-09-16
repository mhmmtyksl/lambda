package lambda_day03;

import Lambda_day02.MethodLambda;

import java.util.*;

public class Lambda04 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(Arrays.asList("Ali", "Ali", "Aysima", "Abdurrahman", "Mehmet", "Mustafa", "Bedirhan", "Yüksel", "Süleyman"));

        yazdirBuyuk1(l);
        System.out.println();
        uzunlukSirala(l);
        System.out.println();
        farkliSonHarfSirala(l);
        System.out.println();
        uzunlukSiralaIlkEleman(l);
        System.out.println();
        yazdirAIleBaslayanlari(l);
        System.out.println();
        aIleBaslayanVeyaIIleBiten(l);
        System.out.println();
        siralaBuyut(l);
        System.out.println();
        isimUzunlukSirala(l);
        System.out.println();
        karesiniAlSiralaSil(l);
        System.out.println();
        ebikGabik(l);
        System.out.println();
        sondanIkinciSiralaIlk(l);
        System.out.println();
        terstenSiralaIlkYazdir(l);


    }


    // 1) List in elemanlarini buyuk harfle yazdir.
    public static void yazdirBuyuk1(List<String> l) {
        l.stream().map(t -> t.toUpperCase()).forEach(MethodLambda::bosluklaYazdir);// ALI ALI AYSIMA ABDURRAHMAN MEHMET MUSTAFA BEDIRHAN YÜKSEL SÜLEYMAN
        System.out.println();
        l.stream().map(String::toUpperCase).forEach(MethodLambda::bosluklaYazdir); // ALI ALI AYSIMA ABDURRAHMAN MEHMET MUSTAFA BEDIRHAN YÜKSEL SÜLEYMAN
    }
    // elemanlari uzunluklarina gore sirala ve yazdir.
    //not: java elemanlari varsayilan olarak artan siraya bakar.

    public static void uzunlukSirala(List<String> l) {
        l.stream().sorted(Comparator.comparing(String::length)).forEach(MethodLambda::bosluklaYazdir);// Ali Ali Aysima Mehmet Yüksel Mustafa Bedirhan Süleyman Abdurrahman
        System.out.println();
        l.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(MethodLambda::bosluklaYazdir);// Abdurrahman Bedirhan Süleyman Mustafa Aysima Mehmet Yüksel Ali Ali
    }

    //3) farklı elemanlarını son harflerine göre sıralayıp yazdır
    public static void farkliSonHarfSirala(List<String> l) {
        l.stream().distinct().sorted(Comparator.comparing(t -> t.substring(t.length() - 1))).forEach(MethodLambda::bosluklaYazdir);// Aysima Mustafa Ali Yüksel Abdurrahman Bedirhan Süleyman Mehmet

    }

    //4) Elemanları uzunluklarına ve ardından (aynı uzunlukta olanları) ilk karakterlerine göre sıralamak için bir yöntem oluşturun
    public static void uzunlukSiralaIlkEleman(List<String> l) {
        l.add("Ata");
        l.stream().sorted(Comparator.comparing(String::length).thenComparing(t -> t.substring(0, 1))).forEach(MethodLambda::bosluklaYazdir);// Ali Ali Ata Aysima Mehmet Yüksel Mustafa Bedirhan Süleyman Abdurrahman
        System.out.println();
        l.stream().sorted(Comparator.comparing(String::length).thenComparing(t -> t.substring(0, 1)).thenComparing(t -> t.substring(1, 2))).forEach(MethodLambda::bosluklaYazdir);
    }

    // 5)Büyük harflerle, "A" ile başlayan liste öğelerini yazdırmak için bir yöntem oluşturun
    public static void yazdirAIleBaslayanlari(List<String> l) {
        l.stream().filter(t -> t.startsWith("A")).map(String::toUpperCase).forEach(MethodLambda::bosluklaYazdir); // ALI ALI AYSIMA ABDURRAHMAN ATA
    }

    // 6)  Küçük harflerle, "A" ile başlayan veya "i" ile biten liste öğelerini yazdırmak için bir yöntem oluşturun
    public static void aIleBaslayanVeyaIIleBiten(List<String> l) {
        l.stream().map(String::toLowerCase).filter(t -> t.startsWith("a") || t.endsWith("i")).forEach(MethodLambda::bosluklaYazdir); // ali ali aysima abdurrahman ata
    }

    //7) Öğeleri uzunluklarına göre sıraladıktan sonra büyük harflerle yazdırmak için bir yöntem oluşturun
    public static void siralaBuyut(List<String> l) {
        l.stream().map(String::toUpperCase).sorted(Comparator.comparing(String::length)).forEach(MethodLambda::bosluklaYazdir); // ALI ALI ATA AYSIMA MEHMET YÜKSEL MUSTAFA BEDIRHAN SÜLEYMAN ABDURRAHMAN
    }

    //8) Elemanları uzunluklarına göre sıralayın önce elemanı sonra uzunluğunu yazdırın
    public static void isimUzunlukSirala(List<String> l) {
        l.stream().sorted(Comparator.comparing(String::length)).map(t -> t + ":" + t.length()).forEach(MethodLambda::bosluklaYazdir); // Ali:3 Ali:3 Ata:3 Aysima:6 Mehmet:6 Yüksel:6 Mustafa:7 Bedirhan:8 Süleyman:8 Abdurrahman:11
    }

    //9) Her elemanın uzunluğunun karesini alıp tekrarlıları sil, bunların 20'den büyük olanlarını ters sırada  yazdırın
    public static void karesiniAlSiralaSil(List<String> l) {
        l.stream().distinct().map(t -> t.length() * t.length()).filter(t -> t > 20).sorted(Comparator.reverseOrder()).forEach(MethodLambda::bosluklaYazdir); // 121 64 64 49 36 36 36
    }

    //10) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol etmek için bir metod oluşturun
    //11) bütün elemanların "x" ile başlamadığını kontrol etmek için bir yöntem oluşturun
    //12) en az 1 tane "R" ile biten eleman olup olmadığını kontrol etmek için bir metod oluşturun.
    public static void ebikGabik(List<String> l) {
        boolean result1 = l.stream().allMatch(t -> t.length() < 12);
        System.out.println("Elemanlarin uzunluklari 12 en kucuk mu : " + result1);// true
        System.out.println();
        boolean result2 = l.stream().noneMatch(t -> t.startsWith("X")); // true
        System.out.println("X ile baslayan oge yok : " + result2);
        System.out.println();
        boolean result3 = l.stream().anyMatch(t -> t.endsWith("R"));
        System.out.println("Elemanlardan herhangi biri R ile bitiyor mu : " + result3); // false
    }

    // 13) elemanları sondan 2. elemanlarına göre sıralayıp ilk elemanı yazdır
    public static void sondanIkinciSiralaIlk(List<String> l) {
        System.out.println(l.stream().sorted(Comparator.comparing(t -> t.charAt(t.length() - 2))).findFirst()); // Optional[Abdurrahman]
    }

    //14) elemanlari uzunluklarina gore tersten siralayip ilk elemani yazdir
    private static void terstenSiralaIlkYazdir(List<String> l) {
        System.out.println(l.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst()); // Optional[Abdurrahman]


    // 15) eleman 'A' ile basliyor veya 'n' ile bitiyorsa o elemani silin

    l.removeIf(t->t.toUpperCase().startsWith("A") || t.toUpperCase().endsWith("N"));
        System.out.println(l); // [Mehmet, Mustafa, Yüksel]

}
}
