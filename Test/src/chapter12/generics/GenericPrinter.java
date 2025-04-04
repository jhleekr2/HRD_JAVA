package chapter12.generics;

public class GenericPrinter<T extends Material> {
    private T material; // T 자료형으로 선언한 변수

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material; // T 자료형 변수 material을 반환하는 제네릭 메서드
    }

    public String toString() {
        return material.toString();
    }

    public void Printing() {
        material.doPrinting(); // 상위 클래스 Material의 메서드 호출
    }
}
