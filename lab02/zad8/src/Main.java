//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String tekst = "essa";

    String wynik = zamien(tekst);
    System.out.println("Zamienione: " + wynik);
}

public static String zamien(String tekst){

    char pierwsza = tekst.charAt(0);
    char ostatnia = tekst.charAt(tekst.length()-1);

    String srodek = tekst.substring(1, tekst.length() -1);

    return ostatnia + srodek + pierwsza;
}