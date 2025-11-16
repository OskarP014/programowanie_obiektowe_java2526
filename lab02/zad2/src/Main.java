//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int n =50;
    int wynik = znajdzPierwszaMniejsza(n);

    System.out.println("Pierwsza mniejsza: " + wynik
    );
}


public static int znajdzPierwszaMniejsza(int n){
    for(int i=n-1; i>=2; i--){
        if(czyPierwsza(i)){
            return i;
        }
    }
    return -1;
}

public static boolean czyPierwsza(int liczba){
    for(int j=2; j*j <= liczba; j++){
        if(liczba % j ==0){
            return false;
        }
    }
    return true;
}
