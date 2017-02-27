package interview.design.pattern.delegate;

public class Pursuit implements GiveGift {
    SchoolGirl mm;

    public Pursuit(SchoolGirl mm) {
        this.mm = mm;
    }

    @Override
    public void GiveDolls() {
        System.out.println(mm.getName() + " give you doll.");
    }

    @Override
    public void GiveFlowers() {
        System.out.println(mm.getName() + " give you flowers.");
    }

    @Override
    public void GiveChocolate() {
        System.out.println(mm.getName() + " give you chocolate.");
    }
}
