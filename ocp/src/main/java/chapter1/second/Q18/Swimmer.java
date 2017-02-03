package chapter1.second.Q18;

public class Swimmer {
    enum AnimalClasses{
        MAMMAL, FISH{public boolean hasFins(){
            return true;}},
        BIRD, REPTILE, AMPHIBIAN, INVERTERTATE;
//        public abstract boolean hasFins();
    }
}
