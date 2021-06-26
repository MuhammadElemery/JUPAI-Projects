package org.example;

import joinery.DataFrame;

import java.io.IOException;
import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Jounery
{
   public  static void main(String args []) {
       joinery();
   }

    public static void joinery(){
       try{
        DataFrame<Object> titanic = DataFrame.readCsv("C:/Users/V E R S I O N/Downloads/JUPAI5_Examples/JUPAI5_Examples/src/main/resources/data/titanic.csv");
        System.out.println(titanic.describe());
        DataFrame<Object> df2=titanic.retain("ticket","name","pclass","age");
           System.out.println(df2.head(5));
           List<Object> xcol= titanic.col("home.dest");
           System.out.println(df2.add("x_col",xcol));
           System.out.println(df2.head(5));
           Double mean= (Double) titanic.describe().col("age").get(1);
           System.out.println(" mean of ages = " +mean);
           DataFrame<Object> alldatamean= titanic.mean();
           System.out.println(alldatamean);
           DataFrame<Object> min = titanic.min();
           System.out.println(min);

           //merging dataframes

           DataFrame<Object> merged = titanic.join(df2);
           System.out.println(merged);
    }
       catch (IOException e){
           e.printStackTrace();
       }

}


}
