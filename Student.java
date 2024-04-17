package Assignments.Assignment1;

/**
 * A student class for practice
 * @author Sebastian Bruce
 * @since 2024-02-06
 * @version 1.1
 */
public class Student {
    /** The name of the student */
    String name;
    private int age = 17;
    private double gpa = 1.1;

    enum Colleges {GEORGIAN, LAKEHEAD, NOTHING_ELSE}
    private Colleges college;

    public Student(String name, int age, double gpa, String college) {
        this.name = name;
        setAge(age);
        setGpa(gpa);
        setCollege(college);
    }

    public static Student MatureStudent(String name, int age, double gpa) {
        return new Student(name, age < 30 ? 30 : age, gpa, "Georgian");
    }

    public static Student HonorStudent(String name, int age, int gpa) {
        return new Student(name, age, gpa < 3.5 ? 3.5 : gpa, "Georgian");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age > 17 ? age : 18;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if(gpa >= 1 && gpa <= 4) {
            this.gpa = gpa;
        }
    }

    public Colleges getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = switch (college.toLowerCase()){
            case "georgian"->Colleges.GEORGIAN;
            case "lakehead"->Colleges.LAKEHEAD;
            default -> Colleges.NOTHING_ELSE;
        };
    }
}
