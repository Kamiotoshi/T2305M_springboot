package com.example.t2305m_springboot.dto.res;

public class ProductRes {
    private Long id;
    private String name;
    private Double price;
    private Integer qty;
    private String description;
    private CategoryRes category;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryRes getCategory() {
        return category;
    }

    public void setCategory(CategoryRes category) {
        this.category = category;
    }
}
