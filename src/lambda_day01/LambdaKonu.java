package lambda_day01;

public class LambdaKonu {
    public static void main(String[] args) {

        //lambda (functional programming)                    java (structured programing
        // 1)nasıl yaparım ne yaparım sorulur               ne yaparımdan çok nasıl yaparım düşünülür
        //2)kod kısalığı, kod okunabilirliği, ve             kod genelde uzundur , başkası sizin ne yaptığınızı anlayamayabilir
        // hatasız kod yazma bakımından elverişli
        //3)lambda sadece collection larda array lerde kullanılır.
        // (map lerde kullanılmaz)



        /* LambdaFile "Functional Programming"                                  Java "Structured Programming"
     1) "nasıl yaparım" değil " ne yaparım"                     ne yaparımdan çok nasıl yaparım düşünülür
     2) kod kısalığı kod okunabilirliği ve                     kod genelde uzundur, başkası sizin ne yaptığınızı
     hatasız kod yazma bakımından çok faydalıdır.              anlayamayabilir, özellikle parantez hatası yapma
     3) LambdaFile sadece collecions larda (List Queue, Set)        olasılığı yükselir
     ve Arraylerde kullanılabilir
        */
        //javada LambdaFile fonksiyonları (metodları) sadece Fonksiyonel Interface ler (lambda da bulunan metodlar=> filter, reduce  ...gibi)
        //kullanıcı isterse kendi fonksiyonel interface sini (metodunu) yazabilir =>mesela bir çift sayı belirleme metodu
        // oluşturup lambda da onu kullanabiliriz
        //Stream (akış) bir API'dir ve nesne koleksiyonlarını işlemek için kullanılır.API:Uygulama programlama arayüzü
        // (İngilizce: Application Programming Interface, kısaca API), bir yazılımın başka bir yazılımda tanımlanmış işlevlerini
        // kullanabilmesi için oluşturulmuş bir tanım bütünüdür.API, yazılım bileşeniyle olan etkileşimlerin bir özelliğidir.
        //Bu da örnek olarak şu anlama gelir. Bir arabanın bir yazılımı olduğunu hayal edin. Bu arabanın API'si arabanın neler
        // yapabileceği hakkında bilgi içerir; hızlanma, frenleme, camları açma, vs. Ayrıca bunların nasıl yapabileceğine dair bilgiler de içerir.
        //Örneğin hızlanmak için ayağınızı gaz pedalına koyup itersiniz. API, ayağınızı gaza bastığınızda motorun içinde neler
        // olduğunu açıklamak zorunda değildir.Bu nedenle, içten yanmalı motorlu bir araba kullanmayı öğrendiyseniz, tamamen
        // yeni bir dizi beceri öğrenmek zorunda kalmadan API sayesinde elektrikli bir arabayı rahatlıkla kullanabilirsiniz.

        // foreEach(), map(), filter(), reduce() gibi HOF'lar(higher-order function) fonksiyonel interfaceler ile çalıştığı için
// içerisinde LambdaFile fonksiyonları yazmak mümkündür
        // mesela google ın görünen yüzü var, birde arkada bilgilerin olduğu bir yer var.
// google, kullanıcı ile bilgiler arasında bir arayüz.LambdaFile bizim için bir arayüz, kütüphanesinde metodlar var,
// Javada genelde bu gibi fonksiyonlar üzerinden LambdaFile ifadeleri kullanıyoruz

    /*foreach:
     Stream içindeki tek tek tüketmek için oluşturulmuş bir yapıdır.stream işlemi artık tüketilmiş olarak kabul edilir ve
     sonrasında birşey yazılamaz*/

 /*filter:
           dizimiz veya collection ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda filtreleme işlemi yapar
           Bu işlem sonrasında belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılmazlar    */
        //filter(t-> t%2==0 && t<15)==> elemanlar içinde filtreleme yapar, örneğin çift ve 15 ten küçük sayılar

        // map() metodu collection üzerinde bir transformation işlemi sağlayan ara işlem metodudur.
        // Eğer bir collection'ın verilerininin değişik hallerini hesaplamak istersek map() kullanabiliriz.
        //örneğin:elemanların karesini almak... map(t-> t*t)(4 elemanını=>16 yapar)
        //  map ile Math class ındaki metodları kullanabiliriz...map(Math::sqrt)==> burada elemanların karesini almışız
        //map(String::toUpperCase)==> String class ından metod çağırabiliriz...list imizin data type ının class ındaki metodları
        // kullanabiliriz.

        //  sorted(): list i natural order a göre sıralar.
        //sorted(Comparator.reverseOrder()):büyükten küçüğe sıralamak istersek, Comparator class ından reverseOrder() metoduyla
        //terse çevirip sorted() ile büyükten küçüğe sıralamış oluyoruz
        // sorted(Comparator.comparing(t-> t.length())):elemanları kendi istediğimiz bir duruma göre sıralamak istediğimizde
        // örneğin burada elemanların length() ine göre sıralamışız

        //limit(a):ilk a kadar elemanı verir.
        //skip(a):ilk a elemanı pas geç diğerlerini yazdır

        //reduce(ilk_değer,Integer::min)==> Integer class ından metod çağırabiliriz (örneğin min sayı bulma metodu)
        // reduce(ilk_değer,Math::max)==>(örneğin list in max elemanı istenirse kullanılır ve Math class ından metod çağırabiliriz)

    }
}