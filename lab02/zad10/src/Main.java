//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    StringBuffer tekst = new StringBuffer("essa");

    capitalizeEverySecond(tekst);
    System.out.println("Po zmianie:   " + tekst);
}

public static void capitalizeEverySecond(StringBuffer buffer){
    for (int i = 1; i < buffer.length(); i += 2){
        char aktualnaLitera = buffer.charAt(i);
        char duzaLitera = Character.toUpperCase(aktualnaLitera);
        buffer.setCharAt(i, duzaLitera);
    }
}