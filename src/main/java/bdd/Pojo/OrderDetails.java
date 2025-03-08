package bdd.Pojo;

import java.util.List;

public class OrderDetails {

    private String id;
    private String intent;
    private String status;
    private List<PurchaseUnits> purchase_units;
    private String create_time;
    private List<Link> links;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<PurchaseUnits> getPurchase_units() {
        return purchase_units;
    }

    public void setPurchase_units(List<PurchaseUnits> purchase_units) {
        this.purchase_units = purchase_units;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }
}
