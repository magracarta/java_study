package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        /*student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;*/

        Student student2 = new Student();


        initStudents(student1,"학생1",15,90);
        initStudents(student2,"학생2",16,80);
        printStudent(student1);
        printStudent(student2);

    }
    static void initStudents(Student student, String name , int age , int grase){
        student.name = name;
        student.age = age;
        student.grade = grase;

    }

    static void printStudent(Student student){
        System.out.println("이름 : " + student.name + "나이 : "+ student.age  + "성정 : "+student.grade);
    }
}
