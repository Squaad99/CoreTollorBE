package coretollor.coretollor.entity;

import coretollor.coretollor.model.AddonModel;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "addon")
public class Addon implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addon_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "baseP")
    private Float baseP;

    @Column(name = "baseM")
    private Float baseM;

    @Column(name = "compartmentP")
    private Float compartmentP;

    @Column(name = "compartmentM")
    private Float compartmentM;

    public Addon() {}

    public Addon(String name, Float baseP, Float baseM, Float compartmentP, Float compartmentM) {
        this.name = name;
        this.baseP = baseP;
        this.baseM = baseM;
        this.compartmentP = compartmentP;
        this.compartmentM = compartmentM;
    }

    public Addon(AddonModel addonModel) {
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
