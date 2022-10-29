/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Location_Info;

/**
 *
 * @author Anirudh
 */
public class House {
    
    private City City ;
    private Community Community;
    private String HouseName;

    public City getCity() {
        return City;
    }

    public void setCity(City City) {
        this.City = City;
    }

    public Community getCommunity() {
        return Community;
    }

    public void setCommunity(Community Community) {
        this.Community = Community;
    }

    public String getHouseName() {
        return HouseName;
    }

    public void setHouseName(String HouseName) {
        this.HouseName = HouseName;
    }    
}
