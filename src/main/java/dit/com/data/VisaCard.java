package dit.com.data;

public class VisaCard extends Card{

    public VisaCard(){
        super(PaymentSystem.VISA);
    }


    @Override
    public void payInContry(Country country, int amount) {

    }

    public boolean isConuntryValidForTheseCard(Country country){
        return true;

    }
}
