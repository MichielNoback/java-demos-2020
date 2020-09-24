package nl.bioinf.java_demos.lesson5;

public class GameCharacter1 {
    Bazooka bazooka = new Bazooka();

    public void shoot() {
        this.bazooka.shoot();
        System.out.println("[GameCharacter1] Oh no it is a troll, and I can't swap weapons...Arghhhh");
    }

}
