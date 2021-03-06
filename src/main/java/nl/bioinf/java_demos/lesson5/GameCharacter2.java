package nl.bioinf.java_demos.lesson5;

public class GameCharacter2 {
    private Shootable weapon;

    public void setWeapon(Shootable newWeapon) {
        this.weapon = newWeapon;
    }

    public void shoot() {
        this.weapon.shoot();
        System.out.println("[GameCharacter2] Oh no, not effective against trolls, let's swap weapons");
        setWeapon(new EnchantedBow());
        this.weapon.shoot();
        System.out.println("[GameCharacter2] Troll-paté");
    }
}
