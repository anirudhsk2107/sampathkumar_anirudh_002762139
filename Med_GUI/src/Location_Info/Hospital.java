/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Location_Info;

/**
 *
 * @author Anirudh
 */
public class Hospital {
    
    private int hospId;
    private String hospName;
    private City city;
    private Community community;

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community.setCommunityName(community);
    }

    public int getHospId() {
        return hospId;
    }

    public void setHospId(int hospId) {
        this.hospId = hospId;
    }

    public String getHospName() {
        return hospName;
    }

    public void setHospName(String hospName) {
        this.hospName = hospName;
    }

    public City getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city.setCityName(city);
    }
}
