package FunctionalInterface;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getDBConnectionUrl());
        System.out.println(getDBConnectionUrlSupplier.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:3306/products";
    }

    static Supplier<String> getDBConnectionUrlSupplier = () ->
            "jdbc://localhost:3306/users";
}
