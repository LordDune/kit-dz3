package pac.main;

public class Calculate {

    public static <T extends Number> double sum(T x, T y) {
        return x.doubleValue() + y.doubleValue();
    }

    public static <T extends Number> double multiply(T x, T y) {
        return x.doubleValue() * y.doubleValue();
    }

    public static <T extends Number> double divide(T x, T y) {
        return x.doubleValue() / y.doubleValue();
    }

    public static <T extends Number> double subtract(T x, T y) {
        return x.doubleValue() - y.doubleValue();
    }
}
