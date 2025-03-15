package chapter12.generics;

public class GenericPrinterTest2 {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        // Powder 형으로 GenericPrinter 클래스 생성

        powderPrinter.setMaterial(new Powder());
        powderPrinter.Printing();

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        // Plastic 형으로 GenericPrinter 클래스 생성

        plasticPrinter.setMaterial(new Plastic());
        plasticPrinter.Printing();
    }
}
