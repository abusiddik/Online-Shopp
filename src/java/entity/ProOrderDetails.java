package entity;
// Generated Feb 5, 2017 7:41:36 PM by Hibernate Tools 4.3.1



/**
 * ProOrderDetails generated by hbm2java
 */
public class ProOrderDetails  implements java.io.Serializable {


     private Integer orderDetaolsId;
     private ProOrder proOrder;
     private Product product;
     private int proQty;

    public ProOrderDetails() {
    }

    public ProOrderDetails(ProOrder proOrder, Product product, int proQty) {
       this.proOrder = proOrder;
       this.product = product;
       this.proQty = proQty;
    }
   
    public Integer getOrderDetaolsId() {
        return this.orderDetaolsId;
    }
    
    public void setOrderDetaolsId(Integer orderDetaolsId) {
        this.orderDetaolsId = orderDetaolsId;
    }
    public ProOrder getProOrder() {
        return this.proOrder;
    }
    
    public void setProOrder(ProOrder proOrder) {
        this.proOrder = proOrder;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getProQty() {
        return this.proQty;
    }
    
    public void setProQty(int proQty) {
        this.proQty = proQty;
    }




}


