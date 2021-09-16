package lambda_day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Lambda07 {
    public static void main(String[] args) {
        // functional programming kullanilarak bir dosya nasil okunur.
        try {
            Files.lines(Paths.get("/Users/muhammetyuksel/eclipse-workspace/lambda/src/lambda_day04/LambdaFile")).forEach(t-> System.out.println(t));
        } catch (IOException e) {
            System.out.println(e);
        }

        //Tüm karakterleri büyük harfe dönüştürün ve okuyun
        try {
            Files.lines(Paths.get("/Users/muhammetyuksel/eclipse-workspace/lambda/src/lambda_day04/LambdaFile")).map(String::toUpperCase).forEach(t-> System.out.println(t));
        } catch (IOException e) {
            System.out.println(e);
        }

        //metindeki farklı kelimeleri yazdır
        try {
            Files.lines(Paths.get("/Users/muhammetyuksel/eclipse-workspace/lambda/src/lambda_day04/LambdaFile")).map(t->t.split(" ")).flatMap(Arrays::stream).map(t->t.replaceAll("\\W", "")).distinct().forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }

        // metinde "e" içeren tüm kelimeleri yazdırın. (sayısınıda yazdırabilirsin)
        try {
            Files.lines(Paths.get("/Users/muhammetyuksel/eclipse-workspace/lambda/src/lambda_day04/LambdaFile")).map(t->t.split(" ")).flatMap(Arrays::stream).filter(t->t.contains("e")).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
