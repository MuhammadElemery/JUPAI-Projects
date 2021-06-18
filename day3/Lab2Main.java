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
public class Lab2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "Elmgharbel";
        String s2= "gharbol";
        StringUtils c1 = new StringUtils();
        System.out.println(c1.betterstring(s1, s2, (s11,s22) -> s11.length()>s22.length()));
        
        System.out.println(c1.checkalphapet(s1, (s_one) -> {
            for(int i=0; i<s_one.length(); i++){
                if(!Character.isLetter(s_one.charAt(i))){
                    return false;
                           
                }
            }
            
           return true ;
            
        }));
        
        
    }
    
}
