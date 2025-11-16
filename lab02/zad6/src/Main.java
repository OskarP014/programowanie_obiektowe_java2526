//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    ArrayList<Integer> lista = new ArrayList<>();

    lista.add(12);
    lista.add(11);
    lista.add(101);
    lista.add(-6);

    int wynik = minValue(lista);
    System.out.println("Najmniejsza: " + wynik);
}

public static int minValue(ArrayList<Integer> lista){
    int min = lista.getFirst();

    for(int liczba : lista){
        if(liczba < min){
            min = liczba;
        }
    }
    return min;
}
