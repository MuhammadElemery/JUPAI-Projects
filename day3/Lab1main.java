/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansourag2.day3lab1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author V E R S I O N
 */
public class Lab1main {
    
    static String cityfile= "E:\\AI-Pro – ITI\\Java\\Day03\\cities.csv";
    static String countryfile= "E:\\AI-Pro – ITI\\Java\\Day03\\countries.csv";
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CityDAO city_one = new CityDAO();
        CountriesDAO country_one = new CountriesDAO();
        
        List<Cities> cities_list = city_one.readcitycsv(cityfile);
        List<Countries> countries_list = country_one.readcountriescsv(countryfile);
        
        Map <String,List<Cities>> country_city = new HashMap<>();
        for (int i = 0; i<cities_list.size(); i++){
            
            Cities city = cities_list.get(i);
            if(country_city.get(city.getcountryid())==null){
                List<Cities> l =new ArrayList<>();
                l.add(city);
                country_city.put(city.getcountryid(), l);
            }
            else{
                        country_city.get(city.getcountryid()).add(city);
                        }
            
            
        }
         
        //Lab 1:
        
        country_city.forEach((k, v) -> v.stream().map(Cities::getPopulation).sorted().collect(Collectors.toList()));
        System.out.println(country_city.size());
        System.out.println(country_city);
        
        // Lab 3 :
        
        // highest population city for each country
        
        country_city.forEach((k,v)->System.out.println("countryid: " +k+" highest population city : " +v.stream().max(Comparator.comparing(Cities::getPopulation))));
        
        //highest population capital
        
        Map<String, List<Cities>> h =cities_list.stream().collect(Collectors.groupingBy(Cities::getCapital));
        h.forEach((k,v)-> System.out.println("Type of capital: "+k+ "  highest population capital : " + v.stream().max(Comparator.comparing(Cities::getPopulation))));
        
        //highest population primary capital

        System.out.println(cities_list.stream().filter(val -> val.getCapital().equalsIgnoreCase("primary")).max(Comparator.comparing(Cities:: getPopulation)));
        
            
        }
        
        
        
    }
    

