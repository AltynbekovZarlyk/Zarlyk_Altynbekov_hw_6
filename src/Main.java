public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(70);
        boss.setHealth(500);
        boss.weapon.setNameOfWeapon("Super Protection");
        boss.weapon.setWeapon(WeaponTupe.MAGIC_WEAPON);
        System.out.println(boss.printInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setDamage(30);
        skeleton.setHealth(350);
        skeleton.setArrows(18);
        skeleton.weapon.setNameOfWeapon("Arrow Attack");
        skeleton.weapon.setWeapon(WeaponTupe.COLD_WEAPON);
        System.out.println(skeleton.printInfo());

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setDamage(40);
        skeleton2.setHealth(400);
        skeleton2.setArrows(20);
        skeleton2.weapon.setNameOfWeapon("Arrow Attack");
        skeleton2.weapon.setWeapon(WeaponTupe.COLD_WEAPON);
        System.out.println(skeleton2.printInfo());

    }
}