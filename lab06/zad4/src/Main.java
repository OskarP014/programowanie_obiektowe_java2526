//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Gradebook gb1 = new Gradebook("Jan", "Kowalski");
    gb1.addGrade(5);
    gb1.addGrade(4);
    gb1.addGrade(3);

    System.out.println("--- Test toString() i averageGrade() ---");
    System.out.println(gb1);

    gb1.removeGrade(1);
    System.out.println("Po usunięciu oceny '4': " + gb1);

    System.out.println("\n--- Test equals() i hashCode() ---");

    Gradebook gb2 = new Gradebook("Jan", "Kowalski");
    gb2.addGrade(5);
    gb2.addGrade(3);


    Gradebook gb3 = new Gradebook("Anna", "Nowak");
    gb3.addGrade(6);

    System.out.println("gb1 == gb2 (identyczne) " + gb1.equals(gb2));
    System.out.println("gb1 == gb3 (różne) " + gb1.equals(gb3));


    System.out.println("Hash gb1: " + gb1.hashCode());
    System.out.println("Hash gb2: " + gb2.hashCode());
    System.out.println("Czy hash gb1 i gb2 jest taki sam? " + (gb1.hashCode() == gb2.hashCode()));
}

