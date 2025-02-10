package chapter8.inheritance;

public class VIPCustomer extends Customer{
    private int agentID; //VIP 고객 상담원 이ㅏ이디
    double saleRatio;

    public VIPCustomer() {
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIPCustomer() 생성자 호출");
    }

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
//        System.out.println("VIPCustomer(int, String, int) 생성자 호출");
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio; //보너스 포인트 적립
        return price - (int)(price * saleRatio); //할인된 가격을 계산하여 반환
    }
    
    public int getAgentID() {
        return agentID;
    }
}
