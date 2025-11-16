import zad1.Employee;
import zad2.Car;
import zad3.Game;
import zad3.RPG;
import zad4.Hammer;
import zad4.Saw;
import zad4.Screwdriver;
import zad5.Armor;
import zad5.Fighter;
import zad5.Weapon;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Employee emp= new Employee("Prokopowicz", "Oskar");
    emp.wywietl();

    Car auto = new Car("Peugeot", "3008", 5);
    System.out.println(auto);

    RPG gra = new RPG();
    System.out.println("czy zainicjowana: " + gra.isCzyZainiciowana());

    Hammer mlotek = new Hammer("Młotek ", 1990);

    Screwdriver srubokret = new Screwdriver("Wkretak " , 2001);

    Saw pila = new Saw("Piła ", 1400);

    mlotek.use();
    srubokret.use();
    pila.use();

    Armor zbroja = new Armor("zbroja sigmy", 50);
    Weapon miecz = new Weapon("Mieczor", 80);
    Weapon luk = new Weapon("Luk miecz", 25);

    Fighter woj = new Fighter();
    woj.setArmor(zbroja);
    woj.addWeapons(miecz);
    woj.addWeapons(luk);

    woj.useEquipment();


}
