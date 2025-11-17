public class KalkulatorStatyczny {

    public static int liczbaOperacji = 0;

    public static int dodaj(int a, int b){
        liczbaOperacji++;
        return a+b;
    }

    public static int odejmij(int a, int b){
        liczbaOperacji++;
        return a - b;
    }

    public static int pomoz(int a, int b){
        liczbaOperacji++;
        return a * b;
    }

}
