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
    private Community community;
    private String HouseName;

    public House(){
        this.City = new City();
        this.community = new Community();
    }
    
    public City getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City.setCityName(City);
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community.setCommunityName(community);
    }

    public String getHouseName() {
        return HouseName;
    }

    public void setHouseName(String HouseName) {
        this.HouseName = HouseName;
    }    
    
    @Override
    public String toString(){
        return this.HouseName;
    }
}
