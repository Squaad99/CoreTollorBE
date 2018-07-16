package coretollor.coretollor.entity;

import javax.persistence.*;

@Entity
@Table(name = "offert")
public class Offert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "offert_id")
    private Long offertId;

    @Column(name = "name")
    private String name;

    @Column(name = "creator")
    private String creator;

    @Column(name = "createdDate")
    private String createdDate;

    @Column(name = "description")
    private String description;

    public Offert() {}

    public Offert(String name, String creator, String createdDate, String description) {
        this.name = name;
        this.creator = creator;
        this.createdDate = createdDate;
        this.description = description;
    }

    public Long getOffertId() {
        return offertId;
    }

    public void setOffertId(Long offertId) {
        this.offertId = offertId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
