/**
 * Created by Alpit on 03-09-2017.
 */
public abstract class Abstract {
    private String student;
    private int marks;

    public Abstract(String name, int marks) {
        this.student = name;
        this.marks = marks;
    }

    public void marks() {
        System.out.println(this.marks);
    }

    public void name() {
        System.out.println(this.student);
    }

    public abstract void age();
}

class school extends Abstract {
    int age;

    public school(String name, int marks, int age) {
        super(name, marks);
        this.age = age;
    }


    public static void main(String args[]) {
        school school = new school("Prachee", 12, 23);
        school sh = new school("ALpit", 12, 100);
        school.marks();
        school.name();
        school.age();
        sh.age();

    }

    @Override
    public void age() {
        System.out.println(age);
    }
}
