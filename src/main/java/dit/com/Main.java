package dit.com;

import dit.com.data.Card;
import dit.com.data.VisaCard;

public class Main {

    public static void main(String[] args){
        Card masterCard = new VisaCard();
        masterCard.setBalance(100);



        System.out.println(masterCard.getPaymentSystem());





    }


}
