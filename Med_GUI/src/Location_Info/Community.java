/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Location_Info;

/**
 *
 * @author Anirudh
 */
public class Community {
    
    private String communityName;
    private City City;

    public City getCity() {
        return City;
    }

    public void setCity(City City) {
        this.City = City;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }

}
