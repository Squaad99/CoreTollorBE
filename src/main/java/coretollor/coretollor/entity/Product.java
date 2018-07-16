package coretollor.coretollor.entity;


import coretollor.coretollor.model.ProductModel;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "baseP")
    private Float baseP;

    @Column(name = "baseM")
    private Float baseM;

    @Column(name = "oneSideP")
    private Float oneSideP;

    @Column(name = "twoSideP")
    private Float twoSideP;

    @Column(name = "threeSideP")
    private Float threeSideP;

    @Column(name = "oneSideM")
    private Float oneSideM;

    @Column(name = "twoSideM")
    private Float twoSideM;

    @Column(name = "threeSideM")
    private Float threeSideM;

    @Column(name = "compartmentP")
    private Float compartmentP;

    @Column(name = "compartmentM")
    private Float compartmentM;

    public Product() {}

    public Product(String name, Float baseP, Float baseM, Float oneSideP, Float twoSideP, Float threeSideP, Float oneSideM, Float twoSideM, Float threeSideM, Float compartmentP, Float compartmentM) {
        this.name = name;
        this.baseP = baseP;
        this.baseM = baseM;
        this.oneSideP = oneSideP;
        this.twoSideP = twoSideP;
        this.threeSideP = threeSideP;
        this.oneSideM = oneSideM;
        this.twoSideM = twoSideM;
        this.threeSideM = threeSideM;
        this.compartmentP = compartmentP;
        this.compartmentM = compartmentM;
    }

    public Product(ProductModel productModel) {
        this.name = productModel.getName();
        this.baseP = productModel.getBaseP();
        this.baseM = productModel.getBaseM();
        this.oneSideP = productModel.getOneSideP();
        this.twoSideP = productModel.getTwoSideP();
        this.threeSideP = productModel.getThreeSideP();
        this.oneSideM = productModel.getOneSideM();
        this.twoSideM = productModel.getTwoSideM();
        this.threeSideM = productModel.getThreeSideM();
        this.compartmentP = productModel.getCompartmentP();
        this.compartmentM = productModel.getCompartmentM();
    }

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

    public Float getBaseP() {
        return baseP;
    }

    public void setBaseP(Float baseP) {
        this.baseP = baseP;
    }

    public Float getBaseM() {
        return baseM;
    }

    public void setBaseM(Float baseM) {
        this.baseM = baseM;
    }

    public Float getOneSideP() {
        return oneSideP;
    }

    public void setOneSideP(Float oneSideP) {
        this.oneSideP = oneSideP;
    }

    public Float getTwoSideP() {
        return twoSideP;
    }

    public void setTwoSideP(Float twoSideP) {
        this.twoSideP = twoSideP;
    }

    public Float getThreeSideP() {
        return threeSideP;
    }

    public void setThreeSideP(Float threeSideP) {
        this.threeSideP = threeSideP;
    }

    public Float getOneSideM() {
        return oneSideM;
    }

    public void setOneSideM(Float oneSideM) {
        this.oneSideM = oneSideM;
    }

    public Float getTwoSideM() {
        return twoSideM;
    }

    public void setTwoSideM(Float twoSideM) {
        this.twoSideM = twoSideM;
    }

    public Float getThreeSideM() {
        return threeSideM;
    }

    public void setThreeSideM(Float threeSideM) {
        this.threeSideM = threeSideM;
    }

    public Float getCompartmentP() {
        return compartmentP;
    }

    public void setCompartmentP(Float compartmentP) {
        this.compartmentP = compartmentP;
    }

    public Float getCompartmentM() {
        return compartmentM;
    }

    public void setCompartmentM(Float compartmentM) {
        this.compartmentM = compartmentM;
    }
}
