package dit.com.data;

public class MasterCard extends Card {

    public MasterCard(){
        super(PaymentSystem.MASTERCARD);
    }


    @Override
    public void payInContry(Country country, int amount) {

    }

    public boolean isConuntryValidForTheseCard(Country country){
        return true;

    }
}
