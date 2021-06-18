/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansourag2.day3lab1;

/**
 *
 * @author V E R S I O N
 */
public class Cities {
    int cityid;
    String city;
    String countryid;
    String capital;
    int population;


public Cities(int cityid, String city, String countryid, String capital, int population){
    try{
        this.capital = capital;
    }catch(Exception e){
    }
    try{
        this.city=city;
    }catch(Exception e){
    }
    try{
        this.cityid=cityid;
    }catch(Exception e){
    }
    try{
        this.countryid=countryid;
    }catch(Exception e){
    }
    try{
        this.population=population;
    }catch(Exception e){
    }
    
    }

    public void Setcountryid(String countryid){
    this.countryid = countryid;
        }
    public String getcountryid(){
        return countryid;
    }

    public int getCityid() {
        return cityid;
    }

    public void setCityid(int cityid) {
        this.cityid = cityid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "Cities{" + "cityid=" + cityid + '\'' +", city=" + city +'\''+ ", countryid=" + countryid +'\''+ ", capital=" + capital +'\''+ ", population=" + population + '\''+'}';
    }
  


}
