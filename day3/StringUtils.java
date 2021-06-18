/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mansourag2.day3lab1;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 *
 * @author V E R S I O N
 */
public class StringUtils {
    public String betterstring(String s1, String s2, BiPredicate<String, String> bp){
       if( bp.test(s1, s2)){
           return s1;
       }
       else{
           return s2;
                      }
       
        
        
    }
    public boolean checkalphapet(String s1, Predicate<String> sh){
        return sh.test(s1);
    }
    
}
