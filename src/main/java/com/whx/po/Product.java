package com.whx.po;


/**
 * @author o浩Y旭o
 * @create 2019-11-21-14:23
 */

public class Product {
    private int product_id;
    private String product_name ;
    private int product_num;
    private  int product_price;
    private Status product_status;

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_sum=" + product_num +
                ", product_price=" + product_price +
                ", product_status=" + product_status +
                '}';
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_num() {
        return product_num;
    }

    public void setProduct_num(int product_num) {
        this.product_num = product_num;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public Status getProduct_status() {
        return product_status;
    }

    public void setProduct_status(Status product_status) {
        this.product_status = product_status;
    }
}
