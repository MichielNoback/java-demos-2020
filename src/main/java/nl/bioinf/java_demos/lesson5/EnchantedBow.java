package nl.bioinf.java_demos.lesson5;

public class EnchantedBow implements Shootable {
    @Override
    public void shoot() {
        System.out.println("[EnchantedBow] Shooting an enchanted arrow that kills any troll!");
    }
}
