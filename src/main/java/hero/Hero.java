package hero;

import java.util.Arrays;
import java.util.List;

public class Hero {
    public static void main(String[] args) {


    }

    private String name;
    private int armorStrength;
    private String weapon;
    private List<String> bag;
    private boolean isHuman;

    public Hero(String name, int armorStrength, String weapon, List<String> bag, boolean isHuman) {
        this.name = name;
        this.armorStrength = armorStrength;
        this.weapon = weapon;
        this.bag = bag;
        this.isHuman = isHuman;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmorStrength() {
        return armorStrength;
    }

    public void setArmorStrength(int armorStrength) {
        this.armorStrength = armorStrength;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public List<String> getBag() {
        return bag;
    }

    public void setBag(List<String> bag) {
        this.bag = bag;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public void setHuman(boolean human) {
        isHuman = human;
    }



    public static void checkingHero() {

        List<String> heroBag = Arrays.asList("Bow", "Axe", "Gold");
        Hero emmett = new Hero("Emmett", 50, "sword", heroBag, true);

        /*
        1. Проверить, что герой создался с именем Emmett
        2. Проверить, что значение прочности брони героя равно 50
        3. Проверить, что у героя оружие типа sword
        4. Проверить содержимое инвентаря героя (не пустой, размер 3, содержимое "Bow", "Axe", "Gold", порядок не важен)
        5. Проверить, что герой человек (свойство true)
        */

        assert "Emmett".equals(emmett.getName()): "Name should be Emmett";
        assert 50 == emmett.getArmorStrength();
        assert "sword".equalsIgnoreCase(emmett.getWeapon());
        assert 3 == heroBag.size();
        assert emmett.isHuman();
    }


}
