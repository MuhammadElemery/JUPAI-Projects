package org.example;

import com.google.errorprone.annotations.Var;
import tech.tablesaw.api.IntColumn;
import tech.tablesaw.api.Table;

import java.io.IOException;

import static tech.tablesaw.aggregate.AggregateFunctions.*;

public class TableSaw {
    public static void main(String[] args){


        try{
            Table titanic = Table.read().csv("C:/Users/V E R S I O N/Downloads/JUPAI5_Examples/JUPAI5_Examples/src/main/resources/data/titanic.csv");
            System.out.println(titanic.structure().toString());
            System.out.println(titanic.summary().toString());

            int colcount = titanic.columnCount();
            System.out.println("columns count=  "+colcount);
            int rowcout = titanic.rowCount();
            System.out.println("rows count=  "+rowcout);

            var summary = titanic.summarize("age", mean, sum, min, max,stdDev);
            System.out.println(summary.apply());

            Table titanicL=titanic.select("name","age","survived");
            System.out.println(titanicL.summary().toString());
            Table titanicR=titanic.select("name","pclass","sibsp","parch");
            System.out.println(titanicR.summary().toString());

            System.out.println(titanicL.joinOn("name").fullOuter(titanicR).summary().toString());

            int[] genders = titanic.stream().mapToInt(row ->{
                String gender = row.getString("sex");
                if(gender.equals("male")) {
                    return 1;
                }
                    else{
                        return 0;
                    }

            }).toArray();

            IntColumn gendercolumn =IntColumn.create("gender",genders);
            titanic.addColumns(gendercolumn);
            titanic.removeColumns("sex");
            System.out.println(titanic.first(10));
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
