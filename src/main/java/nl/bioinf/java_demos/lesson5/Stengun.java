package nl.bioinf.java_demos.lesson5;

public class Stengun implements Shootable{
    @Override
    public void shoot() {
        System.out.println("[Stengun] firing, but not effective against trolls");
    }
}
