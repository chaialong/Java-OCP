package interview.mi.cloneable;

public class CloneDemo implements Cloneable{
    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public CloneDemo(Student stu) {
        this.stu = stu;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        CloneDemo obj = (CloneDemo) super.clone();
        obj.stu = new Student(obj.getStu().getName(), obj.getStu().getAge());

        return obj;
    }
}
