package class1;

public class ClassStart5 {
    public static void main(String[] args) {

        Student student1= new Student(); // 1. student1 = x001; (참조 주소값 보관)
        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 80;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 90;

        // => 이렇게 할 경우 메모리에 학생이 두개 생기는 것(x001, x002)


        // 배열도 new로 생성한다.
//        Student[] students = new Student[]{student1, student2};
        Student[] students = {student1, student2};

        for(int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + " 나이: " + students[i].age + " 성적 : " + students[i].grade);
        }

        for(int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적 : " + s.grade);
        }

        // 향상된 for문 - 실제로 엄청 많이 씀
        for(Student s : students) {
            System.out.println("이름: " + s.name + " 나이: " + s.age + " 성적 : " + s.grade);
        }


    }
}
