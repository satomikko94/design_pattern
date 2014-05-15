package idcard;

import java.util.*;

import framework.Factory;
import framework.Product;

public class IDCardFactory extends Factory {
    //private List owners = new ArrayList();
    private HashMap cardMap = new HashMap();
    private int cardNo = 0;
    @Override
    protected synchronized Product createProduct(String owner) {
        cardNo++;
        return new IDCard(owner, cardNo);
    }

    @Override
    protected void registerProduct(Product product) {
        //owners.add(((IDCard)product).getOwner());
        IDCard card = (IDCard)product;
        cardMap.put(card.getCardNo(), card.getOwner() );
    }

    /**
    public List getOwners() {
        return owners;
    }
    **/

    public HashMap getCardMap() {
        return cardMap;
    }
    
    

}
