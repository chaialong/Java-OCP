package chapter1.first.enum2;

public enum Season {
    SPRING("medium"), SUMMER("high"), FALL("medium"), WINTER("low");

    private String expectedVisitors;
    Season(String medium) {
        this.expectedVisitors = medium;
    }
    public void printExpectedVisotors(){
        System.out.println(this.expectedVisitors);
    }

    public static void main(String[] args) {
        Season.SPRING.printExpectedVisotors();
        Season.SPRING.printExpectedVisotors();
    }
}
