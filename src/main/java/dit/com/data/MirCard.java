package dit.com.data;

public class MirCard extends Card {

    public MirCard(){
        super(PaymentSystem.MIR);
    }




    @Override
    public void payInContry(Country country, int amount) {

    }

    public boolean isConuntryValidForTheseCard(Country country){
        if (country == Country.RU || country == Country.TYR)
            return true;
        else
            return false;





    }
}
