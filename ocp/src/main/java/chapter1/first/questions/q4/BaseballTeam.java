package chapter1.first.questions.q4;

/**
 * Created by chaialong on 8/20/2016.
 */
public class BaseballTeam {
    private String city, mascot;
    private int numberOfPlayers;

    public boolean equals(Object obj) {
        if (!(obj instanceof BaseballTeam)) {
            return false;
        }
        BaseballTeam other = (BaseballTeam) obj;
        return city.equals(other.city) && mascot.equals(other.mascot);
    }

    @Override
    public int hashCode() {
        return numberOfPlayers;
    }

    public BaseballTeam(String city, String mascot) {
        this.city = city;
        this.mascot = mascot;
    }

    public static void main(String[] args) {
        BaseballTeam b1 = new BaseballTeam("aaa", "bbb");
        BaseballTeam b2 = new BaseballTeam("aaa", "bbb");
        System.out.println(b1.equals(b2));
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }
}
