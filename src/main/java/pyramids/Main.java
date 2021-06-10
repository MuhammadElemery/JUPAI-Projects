package pyramids;


import java.util.List;
import java.awt.*;
import java.io.File;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author V E R S I O N
 */
public class Main{
     static String filename="E:\\AI-Pro – ITI\\Java\\pyramids.csv";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    PyramidDAO Pyramid1;
        Pyramid1 = new PyramidDAO();
      
    List<Pyramid> pyramids = Pyramid1.readPyramidFromCSV(filename);
    
     for(Pyramid p:pyramids) {
        String i = null;
            System.out.println("#" + " pharoas Name : "+p.getPharoah()
        + ", Modern Name : "+p.getModern_name()
        + ", Site : "+p.getSite()
        + ", Height : "+p.getHeight()); 
        }
    
    
}
}
