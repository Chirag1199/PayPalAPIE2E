package bdd.Pojo;

public class PurchaseUnits {

    private String reference_id;
    private Amount amount;
    private Payee payee;
    private String soft_descriptor;

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public Payee getPayee() {
        return payee;
    }

    public void setPayee(Payee payee) {
        this.payee = payee;
    }

    public String getReference_id() {
        return reference_id;
    }

    public void setReference_id(String reference_id) {
        this.reference_id = reference_id;
    }

    public String getSoft_descriptor() {
        return soft_descriptor;
    }

    public void setSoft_descriptor(String soft_descriptor) {
        this.soft_descriptor = soft_descriptor;
    }
}
