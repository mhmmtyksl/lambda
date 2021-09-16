package Lambda_day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {
    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>(Arrays.asList(7, 12, 14, 4, 9, 2, 4, 12, 16));

        ilkDortEleman(l);
        System.out.println();
        ilkDortElemanGec(l);
        System.out.println();
        ucElemanYazdir(l);


    }


    //1) Kucukten buyuge sirala sonra ilk 4 elemani yazdir.
    public static void ilkDortEleman(List<Integer> l) {
        l.stream().sorted().limit(4).forEach(MethodLambda::bosluklaYazdir); // 2 4 4 7
    }


    //2) kucukten buyuge sirala ilk 4 elemani atla
    public static void ilkDortElemanGec(List<Integer> l) {
        l.stream().sorted().skip(4).forEach(MethodLambda::bosluklaYazdir); // 9 12 12 14 16
    }


    // 3) kucukten buyuge sirali 4,5,6. elamani yazdir.
    private static void ucElemanYazdir(List<Integer> l) {
        l.stream().sorted().skip(3).limit(3).forEach(MethodLambda::bosluklaYazdir); // 7 9 12
        System.out.println();
        l.stream().sorted().limit(6).skip(3).forEach(MethodLambda::bosluklaYazdir);
    }

}
