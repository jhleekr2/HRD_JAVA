package chapter12.collection.arraylist;

import java.util.ArrayList;
import chapter12.collection.Member; // Member 클래스는 collection 패키지에 있으므로 import

public class MemberArrayList {
    private ArrayList<Member> arrayList; // ArrayList 선언

    public MemberArrayList() {
        arrayList = new ArrayList<Member>(); // Member 형으로 선언한 ArrayList 생성
    }

    public void addMember(Member member) {
        arrayList.add(member); // ArrayList에 회원을 추가하는 메서드
    }

    public boolean removeMember(int memberId) {
        for(int i=0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i); // get() 메서드로 회원을 순차적으로 가져옴
            int tempId = member.getMemberId();
            if(tempId == memberId ) {
                arrayList.remove(i);
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false; // 반복문이 끝날 때까지 해당 아이디를 찾지 못한 경우
    }

    public void showAllMember() {
        for(Member member : arrayList) {
            System.out.println(member); // 전체 회원을 출력하는 메서드
        }
        System.out.println();
    }
}
