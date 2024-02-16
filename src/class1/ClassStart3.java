package class1;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1;   // 2. 여기에 참조값(x001)을 보관한다. => 이걸 참조하여 메모리 어딘가에 존재하는 실제 객체(인스턴스)의 참조값을 가지고 있다.
        // => 따라서 이 변수를 통해서 객체를 접근(참조)할 수 있다.
        student1 = new Student(); // 1. student1 = x001; (참조 주소값 보관)
        student1.name = "학생1";
        student1.age = 16;
        student1.grade = 80;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 17;
        student2.grade = 90;

        // => 이렇게 할 경우 메모리에 학생이 두개 생기는 것(x001, x002)


        System.out.println(student1);
        System.out.println(student2);

        System.out.println("이름: " + student1.name + " 나이: " + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름: " + student2.name + " 나이: " + student2.age + " 성적 : " + student2.grade);
    }
}
