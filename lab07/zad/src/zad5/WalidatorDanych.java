package zad5;

public class WalidatorDanych {
    public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException {
        String wzorzecEmail = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

        if (dane == null || !dane.matches(wzorzecEmail)) {

            throw new NiepoprawnyFormatDanychException(dane + " nie spełnia wymogów maila");
        }
    }
}
