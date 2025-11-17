//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    RPGGame game1 = new RPGGame("Wiedźmin 3", "CD Projekt", "Kontynent");
    game1.addRating(10.0);
    game1.addRating(9.5);

    RPGGame game2 = new RPGGame("Wiedźmin 3", "CD Projekt", "Kontynent");
    game2.addRating(10.0);
    game2.addRating(9.5);


    System.out.println(game1);

    System.out.println("game1 == game2 (identyczne)? \t" + game1.equals(game2)); // Oczekiwano: true

    System.out.println("Hash game1: " + game1.hashCode());
    System.out.println("Hash game2: " + game2.hashCode());

    System.out.println("Oceny 'game1' przed atakiem: " + game1.getRatings());

    ArrayList<Double> listaAtakujacego = game1.getRatings();

    listaAtakujacego.clear();

    System.out.println("Oceny 'game1' po ataku: " + game1.getRatings());
}

