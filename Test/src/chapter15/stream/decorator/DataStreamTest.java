package chapter15.stream.decorator;

import java.io.*;

public class DataStreamTest {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("./src/chapter15/stream/decorator/data.txt");
             DataOutputStream dos = new DataOutputStream(fos)) {
            dos.writeByte(100);
            dos.writeChar('A');
            dos.writeInt(10);
            dos.writeFloat(3.14f);
            dos.writeUTF("Test");
        } catch(IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream fis = new FileInputStream("./src/chapter15/stream/decorator/data.txt");
             DataInputStream dis = new DataInputStream(fis)) {
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readInt());
            System.out.println(dis.readFloat());
            System.out.println(dis.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
        //자바 입출력 스트림은 GoF의 디자인 패턴 중 데코레이터 패턴
        // - 객체간의 결합을 통해 기능을 동적으로 유연하게 확장하는 상속의 대안으로 사용되는 패턴
    }
}
