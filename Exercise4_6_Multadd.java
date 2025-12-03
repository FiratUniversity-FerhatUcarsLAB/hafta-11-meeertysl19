public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        // a * b + c islemini yapar
        return a * b + c;
    }

    public static double expSum(double x) {
        // x * e^(-x) + sqrt(1 - e^(-x))
        return x * Math.exp(-x) + Math.sqrt(1 - Math.exp(-x));
    }

    public static void main(String[] args) {

        // Basit test
        System.out.println("multadd(2, 3, 4) = " + multadd(2, 3, 4));

        // 1) sin(π/4) + cos(π/4)/2
        double expr1 = multadd(Math.sin(Math.PI / 4), 1, Math.cos(Math.PI / 4) / 2);
        System.out.println("Expression 1 = " + expr1);

        // 2) log 10 + log 20
        double expr2 = multadd(Math.log(10), 1, Math.log(20));
        System.out.println("Expression 2 = " + expr2);

        // expSum test
        System.out.println("expSum(5) = " + expSum(5));
    }
}
