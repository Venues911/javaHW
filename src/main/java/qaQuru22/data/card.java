package qaQuru22.data;

public abstract class card extends Object {

    public String cardHolder;
    public int balance;
    public String cartNumber;
    public Payment paymentSys;

    public card(Payment paymentSys) {
        this.paymentSys = paymentSys;
    }

    public Payment getPaymentSys() {
     return paymentSys;
    }



    abstract void payInCounry(Country country, int amount) ;

}
