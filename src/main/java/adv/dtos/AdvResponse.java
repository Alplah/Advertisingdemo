package adv.dtos;

import adv.domains.Creative;

import java.util.List;


public class AdvResponse {
    private List<Creative> ads;

    public List<Creative> getAds() {
        return ads;
    }

    public void setAds(List<Creative> ads) {
        this.ads = ads;
    }
}
