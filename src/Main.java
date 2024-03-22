//task1
public class Main {
    public static void main(String[] args) {
        int a, b;
        a = 19;
        b = 8;
        int result1 = a / b;
        int result2 = a % b;
        System.out.println((double)result1);
        System.out.println(result2);
    }
}
//task2
public class Main {
    public static void main(String[] args) {
        int a;
        a = 87;
        System.out.println(((int)a / 10) + ((int)a / 11));
    }
}
//task3
public class Main {
    public static void main(String[] args) {
        double number = 3.5;

        // Get the integer part
        int integerPart = (int) number;

        // Get the decimal part
        double decimalPart = number - integerPart;
        double x = (decimalPart >= 0.5) ? 1 : 0;

        System.out.println("Integer part: " + decimalPart);
        System.out.println(integerPart + x);
    }
}