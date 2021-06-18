/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansourag2.day3lab1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author V E R S I O N
 */
public class CityDAO {
    public List<Cities> readcitycsv(String cityfile){
    List<Cities> city_list = new ArrayList<Cities>();
    
    File cit = new File(cityfile);
    List <String> lines = new ArrayList<String>();
    
    try{
        lines= Files.readAllLines(cit.toPath());
        
        for(int i=1;i<lines.size(); i++){
            String line=lines.get(i);
            String[] fields = line.split(",");
            Cities new_city = createcity(fields);
            city_list.add (new_city);       
        
        }
        return city_list;
    }
    catch (IOException e) {
            e.printStackTrace();
            return null;
    }
    
    }
    

    private Cities createcity(String[] fields){
   
        int cityid=Integer.parseInt (fields[0].trim());
        String city = fields[1].trim();
        String countryid = fields[2].trim();
        String capital = fields[3].trim();
        int population;
        try{
            population=Integer.parseInt(fields[4].trim());
        
        }catch(Exception e){
            population=-1;
        }
    
    
    
    Cities new_city = new Cities(cityid, city, countryid, capital, population);
        return new_city;
}
    
}
