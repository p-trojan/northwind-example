package com.trojanus.northwind.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by trojanus on 3/22/2017.
 */
@Entity
@Table(name = "inventory_transactions")
public class InventoryTransactions {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "transaction_type")
    private int transactionType;

    @Column(name = "transaction_create_date")
    private Date transactionCreatedDate;

    @Column(name = "transaction_modified_date")
    private Date transactionModifiedDate;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "purchase_order_id")
    private int purchaseOrderId;

    @Column(name = "customer_order_id")
    private int customerOrderId;

    @Column(name = "comments")
    private String comments;

    public InventoryTransactions() {}

    public InventoryTransactions(int id, int transactionType, Date transactionCreatedDate, Date transactionModifiedDate,
                                 int productId, int quantity, int purchaseOrderId, int customerOrderId,
                                 String comments) {
        this.id = id;
        this.transactionType = transactionType;
        this.transactionCreatedDate = transactionCreatedDate;
        this.transactionModifiedDate = transactionModifiedDate;
        this.productId = productId;
        this.quantity = quantity;
        this.purchaseOrderId = purchaseOrderId;
        this.customerOrderId = customerOrderId;
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(int transactionType) {
        this.transactionType = transactionType;
    }

    public Date getTransactionCreatedDate() {
        return transactionCreatedDate;
    }

    public void setTransactionCreatedDate(Date transactionCreatedDate) {
        this.transactionCreatedDate = transactionCreatedDate;
    }

    public Date getTransactionModifiedDate() {
        return transactionModifiedDate;
    }

    public void setTransactionModifiedDate(Date transactionModifiedDate) {
        this.transactionModifiedDate = transactionModifiedDate;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPurchaseOrderId() {
        return purchaseOrderId;
    }

    public void setPurchaseOrderId(int purchaseOrderId) {
        this.purchaseOrderId = purchaseOrderId;
    }

    public int getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(int customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "InventoryTransactions{" +
                "id=" + id +
                ", transactionType=" + transactionType +
                ", transactionCreatedDate=" + transactionCreatedDate +
                ", transactionModifiedDate=" + transactionModifiedDate +
                ", productId=" + productId +
                ", quantity=" + quantity +
                ", purchaseOrderId=" + purchaseOrderId +
                ", customerOrderId=" + customerOrderId +
                ", comments='" + comments + '\'' +
                '}';
    }
}
