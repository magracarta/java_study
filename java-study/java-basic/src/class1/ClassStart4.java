package class1;

public class ClassStart4 {
    public static void main(String[] args) {
        Student studen1;
        studen1 = new Student();
        studen1.name = "학생1";
        studen1.age = 15;
        studen1.grade = 90;


        Student studen2 = new Student();
        studen2.name = "학생2";
        studen2.age = 16;
        studen2.grade = 80;

        Student[] students = new Student[2];
        students[0] = studen1;
        students[1] = studen2;


        for(int i=0; i<students.length; i++){
            Student s = students[i];
            System.out.println("이름 : "+ s.name
                    + " 나이 : " + s.age + " 성적 : " +s.grade );
        }
        for(Student s : students){
            System.out.println("이름 : "+ s.name
                    + " 나이 : " + s.age + " 성적 : " +s.grade );
        }

    }
}
