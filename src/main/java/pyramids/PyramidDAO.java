package pyramids;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import static javax.swing.Spring.height;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author V E R S I O N
 */
public class PyramidDAO {
    
    public PyramidDAO(){
    }
        public List<Pyramid> readPyramidFromCSV(String filename){
        List <Pyramid>  pyramid_list= new ArrayList<Pyramid>();
        //access the data csv file
        File pyramid = new File (filename);
        
        //read all data lines in the csv file , and save them in a list
        List<String> lines;
        lines = new ArrayList<String>();
        try {
            lines = Files.readAllLines(pyramid.toPath());
        }catch(Exception e){
            System.out.println("An issue has been happened during reading the file pyramid" + e);
        }
        //extract all pyramid info and save it in a list
        for(int lineidx=1;lineidx<lines.size();lineidx++){
            String line = lines.get(lineidx);
            
            String[] fields = line.split(",");
            Pyramid new_pyramid = CreatePyramid(fields);
            pyramid_list.add(new_pyramid);
            
            }
        return pyramid_list;
        }
        public Pyramid CreatePyramid(String[]fields){
            double height;
            String pharoah = fields[0].trim();
            String modern_name= fields[2].trim();
            String site = fields[4].trim();
            try{
                height = Double.parseDouble(fields[7].trim());
            }
            catch(Exception e){
                height=-1;
            }
            Pyramid new_pyramid = new Pyramid(pharoah,modern_name,site,height);
            return new_pyramid;
            
            
        }
        
    }
    
    
    

