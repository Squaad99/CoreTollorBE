package coretollor.coretollor.model;


import coretollor.coretollor.entity.Product;

public class ProductModel {

    private Long id;
    private String name;
    private Float baseP;
    private Float baseM;
    private Float oneSideP;
    private Float twoSideP;
    private Float threeSideP;
    private Float oneSideM;
    private Float twoSideM;
    private Float threeSideM;
    private Float compartmentP;
    private Float compartmentM;

    public ProductModel() {}

    public ProductModel(Long id, String name, Float baseP, Float baseM, Float oneSideP, Float twoSideP, Float threeSideP, Float oneSideM, Float twoSideM, Float threeSideM, Float compartmentP, Float compartmentM) {
        this.id = id;
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

    public ProductModel(Product product) {
        this.id = product.getId();
        this.name = product.getName();
        this.baseP = product.getBaseP();
        this.baseM = product.getBaseM();
        this.oneSideP = product.getOneSideP();
        this.twoSideP = product.getTwoSideP();
        this.threeSideP = product.getThreeSideP();
        this.oneSideM = product.getOneSideM();
        this.twoSideM = product.getTwoSideM();
        this.threeSideM = product.getThreeSideM();
        this.compartmentP = product.getCompartmentP();
        this.compartmentM = product.getCompartmentM();
    }

    public ProductModel(ProductModel product) {
        this.id = product.getId();
        this.name = product.getName();
        this.baseP = product.getBaseP();
        this.baseM = product.getBaseM();
        this.oneSideP = product.getOneSideP();
        this.twoSideP = product.getTwoSideP();
        this.threeSideP = product.getThreeSideP();
        this.oneSideM = product.getOneSideM();
        this.twoSideM = product.getTwoSideM();
        this.threeSideM = product.getThreeSideM();
        this.compartmentP = product.getCompartmentP();
        this.compartmentM = product.getCompartmentM();
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
