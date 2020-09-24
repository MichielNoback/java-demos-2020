package nl.bioinf.java_demos.lesson5;

public class Game {
    public static void main(String[] args) {
        System.out.println("[Game] Game starting");
        System.out.println("[Game] Spawning a GameCharacter1");
        GameCharacter1 gameCharacter1 = new GameCharacter1();
        System.out.println("[Game] A troll enters the arena");
        gameCharacter1.shoot();


//        System.out.println("[Game] Spawning GameCharacter2");
//        GameCharacter2 gameCharacter2 = new GameCharacter2();
//        Stengun gun = new Stengun();
//        gameCharacter2.setWeapon(gun);
//        gameCharacter2.shoot();
    }
}
