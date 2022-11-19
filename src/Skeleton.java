public class Skeleton extends Boss{
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    public String printInfo(){
        return "Skeleton Health: " + getHealth() + "; Skeleton Damage: " + getDamage() + "; Skeleton Weapon: " + weapon.getNameOfWeapon("Arrow Attack") + "; Skeleton Weapon Type: " + weapon.getWeapon() + "; Arrows: " + this.arrows;
    }
}
