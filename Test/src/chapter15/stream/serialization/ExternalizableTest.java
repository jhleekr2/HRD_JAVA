package chapter15.stream.serialization;

import java.io.*;

class Dog implements Externalizable {
    String name;

    public Dog() {}


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
    }

    public String toString() {
        return name;
    }
}
public class ExternalizableTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog myDog = new Dog();
        myDog.name = "멍멍이";

        FileOutputStream fos = new FileOutputStream("./src/chapter15/stream/serialization/external.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        try(fos; oos) {
            oos.writeObject(myDog);
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileInputStream fis = new FileInputStream("./src/chapter15/stream/serialization/external.out");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Dog dog = (Dog)ois.readObject();
        System.out.println(dog);
    }
}
