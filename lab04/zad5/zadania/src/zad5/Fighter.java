package zad5;

import java.util.ArrayList;

public class Fighter {
    public Armor armor;
    public ArrayList<Weapon> weapons;

    public Fighter(){
        this.weapons = new ArrayList<>();
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public ArrayList<Weapon> getWeapons() {
        return new ArrayList<>(this.weapons);
    }

    public void setWeapons(ArrayList<Weapon> weapons) {
        this.weapons = new ArrayList<>(weapons);
    }

    public void addWeapons(Weapon weapon) {
        this.weapons.add(weapon);
    }

    public void useEquipment(){
        if (this.armor != null) {
            this.armor.use();
        } else {
            System.out.println("Nie ma zbroi.");
        }

        if (this.weapons.isEmpty()) {
            System.out.println("FIghter nie ma broni imagine");
        } else {
            for (Weapon w : this.weapons) {
                w.use();
            }
        }
    }
}


