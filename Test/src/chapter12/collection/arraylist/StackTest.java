package chapter12.collection.arraylist;

import java.util.ArrayList;

class MyStack {
    private ArrayList<String> arrayStack = new ArrayList<String>();

    public void push(String data) {
        arrayStack.add(data); // 스택의 맨 뒤에 요소를 추가
    }

    public String pop() {
        int len = arrayStack.size(); // arrayStack에 저장된 유효한 자료의 개수
        if(len == 0) {
            System.out.println("스택이 비었습니다.");
            return null;
        }

        return(arrayStack.remove(len-1)); // 스택 맨 뒤에서 자료 꺼내고 반환한 다음 배열에서 제거
    }
}

public class StackTest {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
