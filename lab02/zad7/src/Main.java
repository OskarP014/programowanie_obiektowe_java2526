//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    ArrayList<Integer> lista = new ArrayList<>();
    lista.add(21);
    lista.add(3);
    lista.add(12);
    lista.add(10);
    lista.add(0);

    ArrayList<Integer> odwrocona = reverseArray(lista);
    System.out.println("Lista po odwroceniu: " + odwrocona);
}

public static ArrayList<Integer> reverseArray(ArrayList<Integer> lista){
    ArrayList<Integer> nowa = new ArrayList<>();

    for(int i = lista.size() -1; i >= 0; i--){
        int element = lista.get(i);
        nowa.add(element);
    }
    return nowa;
}