package dit.com.data;

public class UniaonPayCard extends Card {

    public UniaonPayCard(){
        super(PaymentSystem.UNION_PAY);
    }


    @Override
    public void payInContry(Country country, int amount) {

    }

    public boolean isConuntryValidForTheseCard(Country country){

        return country == Country.CN;

    }
}
