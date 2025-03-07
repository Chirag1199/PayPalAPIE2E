package bdd.pojo;

import java.util.List;

public class Orders {

    // Create a variable for the 'keys' present in the JSON Body.

    private String id;
    private String intent;
    private String status;
    private List<PurchaseUnits> purchaseUnits;
    private String createTime;
    private List<Links> links;

    public List<Links> getLinks() {
        return links;
    }

    public void setLinks(List<Links> links) {
        this.links = links;
    }


    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public List<PurchaseUnits> getPurchaseUnits() {
        return purchaseUnits;
    }

    public void setPurchaseUnits(List<PurchaseUnits> purchaseUnits) {
        this.purchaseUnits = purchaseUnits;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
