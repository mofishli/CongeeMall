package com.congee.mall.pojo;


/**
 * Created by zhouli on 17/4/21.
 */


public class ProductList {


    private Integer id;
    private String name;
    private Integer price;
    private String pic;
    private Integer buynum;
    private Boolean freepost;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getBuynum() {
        return buynum;
    }

    public void setBuynum(Integer buynum) {
        this.buynum = buynum;
    }

    public Boolean getFreepost() {
        return freepost;
    }

    public void setFreepost(Boolean freepost) {
        this.freepost = freepost;
    }
}
