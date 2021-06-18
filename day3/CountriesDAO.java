/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansourag2.day3lab1;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author V E R S I O N
 */
public class CountriesDAO {
    public List<Countries> readcountriescsv(String countryfile){
        List <Countries> country_list = new ArrayList <Countries>();
        
        File count = new File(countryfile);
        List <String> lines = new ArrayList <String>();
        
        try{
            lines = Files.readAllLines(count.toPath());
        }catch(Exception e){
            System.out.println("something wrong happened during reading lines from the file");
            
        }
        for(int i=1;i<lines.size();i++){
           String line= lines.get(i);
           String[] fields = line.split(",");
           Countries new_country = createcountry(fields);
           country_list.add(new_country);
        }
        
        return country_list;
    }
    public Countries createcountry(String[] fields){
        
         String country;
         String code;
         try{
            country = fields[0].trim();
            code= fields[1].trim();
        }
        catch(Exception e){
            country = null;
            code= null;
        }
        Countries new_country = new Countries(country,code);
        return new_country;
         
    }
    
}
