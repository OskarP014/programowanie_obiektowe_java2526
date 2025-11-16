//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int n=3
            ;
    double wynik = oblicz7(n);

    System.out.println("Wynik to: " + wynik);
}

public static double oblicz7(int n){
    double mianownik = 1.0;
    for(int i=0;i<n;i++){
        mianownik = mianownik *7;
    }
    return 1.0/mianownik;
}
