package ru.morozov.onlinestore.entity;

import ru.morozov.onlinestore.entity.AbstractEntity;
import ru.morozov.onlinestore.entity.Category;
import ru.morozov.onlinestore.enums.ProductType;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Product extends AbstractEntity {

    @Column(nullable = false, columnDefinition = "TEXT")
    private String name = "";

    @Column
    private String description = "";

    private Date date;

    @ManyToOne
    private Category category;

    private Boolean publish;

    @Enumerated(EnumType.STRING)
    private ProductType productType;

    public Boolean getPublish() {
        return publish;
    }

    public void setPublish(Boolean publish) {
        this.publish = publish;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
