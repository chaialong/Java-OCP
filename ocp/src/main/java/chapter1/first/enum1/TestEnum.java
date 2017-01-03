package chapter1.first.enum1;

public class TestEnum {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season.name() + " " + season.ordinal());
        }

        Season season = Season.SUMMER;
        switch (season) {
            case WINTER:
                System.out.println("It is very cold");
                break;
            case SPRING:
                System.out.println("Good day");
                break;
            case FALL:
                System.out.println("The season of harvest");
                break;
            default:
                System.out.println("Is it very hot?");
        }
    }
}
