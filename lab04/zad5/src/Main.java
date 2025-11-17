//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Szkola szkola = new Szkola();
    szkola.dodajUcznia("Oskar Prokopowicz");
    szkola.dodajUcznia("Anna Nowak");
    szkola.dodajUcznia("Piotr Wiśniewski");

    ArrayList<String> lista1 = szkola.zwrocUczniow();
    lista1.remove(0);

    System.out.println("Lista uczniow: " + szkola.zwrocUczniow());

}
