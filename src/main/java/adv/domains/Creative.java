package adv.domains;

import javax.persistence.*;

@Entity
@Table(name = "Creatives")
public class Creative {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Description")
    private String description;
    @Column(name = "Url")
    private String url;
    @Column(name = "Os")
    private String os;
    @Column(name = "Country")
    private String country;
    @Column(name = "Excluded_Os")
    private String excludedOs;
    @Column(name = "Excluded_Countries")
    private String excludedCountries;

    public Creative(){
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getExcludedOs() {
        return excludedOs;
    }

    public void setExcludedOs(String excludedOs) {
        this.excludedOs = excludedOs;
    }

    public String getExcludedCountries() {
        return excludedCountries;
    }

    public void setExcludedCountries(String excludedCountries) {
        this.excludedCountries = excludedCountries;
    }
}
