package idcard;

import framework.Product;

public class IDCard extends Product {
    private String owner;
    private int cardNo;
    IDCard(String owner, int cardNo) {
        System.out.println(owner + "のカード(" + cardNo + ")を作ります");
        this.owner = owner;
        this.cardNo = cardNo;
    }
    
    @Override
    public void use() {
        System.out.println(owner + "のカード(" + cardNo + ")を使います");
    }
    public String getOwner() {
        return owner;
    }

    public int getCardNo() {
        return cardNo;
    }
    

}
