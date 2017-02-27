package interview.design.pattern.delegate;

public class Test {
    public static void main(String[] args) {
        SchoolGirl mm = new SchoolGirl("Jiaojiao");

        Proxy daili = new Proxy(mm);
        daili.GiveDolls();
        daili.GiveChocolate();
        daili.GiveFlowers();
    }
}
