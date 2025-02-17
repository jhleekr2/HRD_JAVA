package chapter11.object;

import java.util.Objects;

class Student {
    int studentId;
    String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public String toString() {
        return studentId + "," + studentName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student std = (Student) obj;
            if (this.studentId == std.studentId)
                return true;
            else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return studentId;
    }
}

public class EqualsTest {
    public static void main(String[] args) {
        Student studentLee = new Student(100, "이상원");
        Student studentLee2 = studentLee; //주소 복사
        Student studentSang = new Student(100, "이상원");

        if(studentLee == studentLee2) //== 기호로 비교
            System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
        else
            System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");

        if(studentLee.equals(studentLee2)) //equals() 메서드로 비교
            System.out.println("studentLee와 studentLee2는 동일합니다.");
        else
            System.out.println("studentLee와 studentLee2는 다릅니다.");

        if(studentLee == studentSang) //== 기호로 비교
            System.out.println("studentLee와 studentSang의 주소는 같습니다.");
        else
            System.out.println("studentLee와 studentSang의 주소는 다릅니다.");

        if(studentLee.equals(studentSang)) //equals() 메서드로 비교
            System.out.println("studentLee와 studentSang은 동일합니다.");
        else
            System.out.println("studentLee와 studentSang은 다릅니다.");

        System.out.println("studentLee의 hashcode :" + studentLee.hashCode());
        System.out.println("studentSang의 hashcode :" + studentSang.hashCode());

        System.out.println("studentLee의 실제 주소값 :" + System.identityHashCode(studentLee));
        System.out.println("studentSang의 실제 주소값 :" + System.identityHashCode(studentSang));
    }
}
