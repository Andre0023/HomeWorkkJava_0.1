package dit.com.data;

public abstract class Card extends Object {

    protected String cardHolder;
    protected int balance;
    protected String cardNubmer;
    protected PaymentSystem paymentSystem;


    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCardNubmer() {
        return cardNubmer;
    }

    public void setCardNubmer(String cardNubmer) {
        this.cardNubmer = cardNubmer;
    }

    public void setPaymentSystem(PaymentSystem paymentSystem) {
        this.paymentSystem = paymentSystem;
    }

    public Card(PaymentSystem paymentSystem){
        this.paymentSystem = paymentSystem;

    }

    public PaymentSystem getPaymentSystem(){
        return paymentSystem;
    }

    public abstract void payInContry(Country country, int amount);



}
