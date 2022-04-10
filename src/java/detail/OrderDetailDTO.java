/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package detail;

/**
 *
 * @author haida
 */
public class OrderDetailDTO {
    String detailID;
    int price;
    int quantity;
    int orderID;
    int productID;

    public OrderDetailDTO() {
    }

    public OrderDetailDTO(String detailID, int price, int quantity, int orderID, int productID) {
        this.detailID = detailID;
        this.price = price;
        this.quantity = quantity;
        this.orderID = orderID;
        this.productID = productID;
    }

    public String getDetailID() {
        return detailID;
    }

    public void setDetailID(String detailID) {
        this.detailID = detailID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

   
    
    public String nextOrderDetailID(String orderDetailID){
        String nextOrderDetailID="";
        int nextNumber = Integer.parseInt(orderDetailID);
        nextOrderDetailID += (++nextNumber);        
        return nextOrderDetailID;
    }
}
