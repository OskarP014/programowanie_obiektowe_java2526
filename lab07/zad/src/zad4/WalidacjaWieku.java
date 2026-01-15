package zad4;

public class WalidacjaWieku {


    public static void testujWiek(int wiek) {
        try {
            System.out.print("Wiek: " + wiek + " ");
            checkAge(wiek);
            System.out.println("Dostęp przyznany");
        } catch (IllegalArgumentException e) {
            System.out.println("Odmowa: " + e.getMessage());
        }
    }

    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Musi mieć co najmniej 18 lat");
        }
    }
}
