public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();  
        // CEVAP: Hicbir sey olmaz, program normal calisir.
        // Derleyici uyarı veya hata vermez.
        // Ancak dönüs degeri kullanilmadigi icin IDE "unused return value" uyarisi gösterebilir.

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // CEVAP: Derleme hatasi olur.
        // Hata: "void method cannot be used in an expression"
        // Cunku sayHello() bir deger DÖNDÜRMEZ (void), bu nedenle + 7 gibi bir islemin parçası olamaz.
    }
}
