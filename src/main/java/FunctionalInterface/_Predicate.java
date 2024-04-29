package FunctionalInterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("01065800000"));
        System.out.println(isPhoneNumberValid("0765800000"));

        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("01065800004"));
        System.out.println(isPhoneNumberValidPredicate.test("0765800000"));

        System.out.println(isPhoneNumberValidPredicate.and(containsNumber4).test("07065800004"));
        System.out.println(isPhoneNumberValidPredicate.or(containsNumber4).test("07065800004"));

        System.out.println("BiConsumer");
        System.out.println(isValidAndIsActive.test("07065800004", true));
        System.out.println(isValidAndIsActive.test("070658234", false));
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber4 = phoneNumber ->
            phoneNumber.contains("4");

    static BiPredicate<String, Boolean> isValidAndIsActive = (phoneNumber, isActive) ->
            !phoneNumber.isEmpty() && isActive;
}
