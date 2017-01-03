package chapter1.first.questions.q17;

/**
 * Created by chaialong on 8/20/2016.
 */
public enum AnimalClasses {
    MAMMAL(true), FISH(Boolean.FALSE), BIRD(false);
    boolean hasHair;
    AnimalClasses(boolean b) {
        this.hasHair = b;
    }
    public boolean hasHair(){
        return hasHair;
    }
    public void giveWig(){
        this.hasHair = false;
    }
}
