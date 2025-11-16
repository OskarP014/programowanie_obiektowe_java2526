public class Kalkulator {
    public int obliczSume(int a, int b){

        boolean czyDanePoprawne = sprawdzDane(a,b);

        if(czyDanePoprawne){
            return a + b;
        }
        else{
            return 0;
        }
    }

    private boolean sprawdzDane(int a, int b){
        if(a>0 && b>0){
            return true;
        }else {
            System.out.println("Podano liczby ujemne lub zera");
            return false;
        }
    }

}
