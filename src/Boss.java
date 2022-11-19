public class Boss extends CameEntity {
    Weapon weapon = new Weapon();

    public String printInfo() {
        return "Boss Health: " + getHealth() + "; Boss Damage: " + getDamage() + "; Boss Weapon: "
                + weapon.getNameOfWeapon("Super Protection") + "; Boss Weapon Type: " + weapon.getWeapon();
    }
}
