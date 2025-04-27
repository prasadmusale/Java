package Core_Java;

// Creating and managing student object array .
class Student {
    public int id;
    public String name;
    public int marks;

}

public class concept2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Prasad";
        s1.marks = 70;

        Student s2 = new Student();
        s2.id = 2;
        s2.name = "Pooja";
        s2.marks = 80;

        Student s3 = new Student();
        s3.id = 3;
        s3.name = "Abhi";
        s3.marks = 100;

        Student stud[] = new Student[3];
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;

        for (Student n : stud) {
            System.out.println(n.id + " , " + n.name + " , " + n.marks);
        }
    }
}
