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
public class Countries {
    private String country;
    private String code;
    
    public Countries(String country, String code){
        try{
        this.country=country;
    }catch(Exception e){
    }
    try{
        this.code=code;
    }catch(Exception e){
    }
        
    }


    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Countries{" + "country=" + country + ", code=" + code + '}';
    }
    
    
    
    
    
}
