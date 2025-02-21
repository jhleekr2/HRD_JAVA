package chapter11.string;

public class StringBuilderTest {
    public static void main(String[] args) {
        String javaStr = new String("java");
        System.out.println("javaStr 문자열 주소 :" + System.identityHashCode(javaStr));

        StringBuilder buffer = new StringBuilder(javaStr);
        System.out.println("연산 전 buffer 메모리 주소 :" + System.identityHashCode(buffer));

        buffer.append(" and");
        buffer.append(" android");
        buffer.append(" programming is fun!!");

        javaStr = buffer.toString();
        System.out.println(javaStr);
        System.out.println("새로 만들어진 javaStr 문자열 주소 :" + System.identityHashCode(javaStr));
    }
}
