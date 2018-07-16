package coretollor.coretollor.model;


import coretollor.coretollor.entity.Addon;

public class AddonModel {

    private Long id;
    private String name;
    private Float baseP;
    private Float baseM;
    private Float compartmentP;
    private Float compartmentM;

    public AddonModel() {}

    public AddonModel(Long id, String name, Float baseP, Float baseM, Float compartmentP, Float compartmentM) {
        this.id = id;
        this.name = name;
        this.baseP = baseP;
        this.baseM = baseM;
        this.compartmentP = compartmentP;
        this.compartmentM = compartmentM;
    }

    public AddonModel(Addon addon) {
        this.id = addon.getId();
        this.name = addon.getName();
        this.baseP = addon.getBaseP();
        this.baseM = addon.getBaseM();
        this.compartmentP = addon.getCompartmentP();
        this.compartmentM = addon.getCompartmentM();
    }

    public AddonModel(AddonModel addonModel) {
        this.id = addonModel.getId();
        this.name = addonModel.getName();
        this.baseP = addonModel.getBaseP();
        this.baseM = addonModel.getBaseM();
        this.compartmentP = addonModel.getCompartmentP();
        this.compartmentM = addonModel.getCompartmentM();
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
