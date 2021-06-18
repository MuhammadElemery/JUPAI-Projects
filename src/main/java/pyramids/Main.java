package pyramids;


import java.util.List;
import java.awt.*;
import java.io.File;
import java.util.stream.Collectors;

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
     static String filename="E:\\AI-Pro – ITI\\Java\\Day02\\pyramids.csv";

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
    
       List<Double> Heights= pyramids.stream().map(Pyramid::getHeight).sorted().collect(Collectors.toList());
       int x = Heights.size()/2;
       int y = x/2;
      if(Heights.size()%2!=0){
          System.out.println("median =  "+ Heights.get((int) (x+.5))
          + ", LowerQuartile = " + Heights.get((int) (y+.75))
          +", upperquartile = " + Heights.get((int) (x+.5+y+.75)));
      }
          else{
                  System.out.println("median = "+(Heights.get(x)+Heights.get(x+1))/2
                  + ", LowerQuartile = " + (Heights.get(y)+Heights.get(y+1))/2
                  +", upperquartile = " + (Heights.get(x+y)+Heights.get(x+y+1))/2);
                  }
       }
}

