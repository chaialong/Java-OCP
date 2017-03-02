package interview.mi.cloneable;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        CloneDemo cloneDemo = new CloneDemo(new Student("aaa", 12));
        CloneDemo newDemo = (CloneDemo) cloneDemo.clone();
        newDemo.getStu().setName("bbb");

        System.out.println(cloneDemo.getStu().getName());
        System.out.println(newDemo.getStu().getName());
    }
}
