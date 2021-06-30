package XChart;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.knowm.xchart.*;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;


public class Xchart {
    public static void main(String[] args) {
        Xchart xchart = new Xchart();
        List<Passenger> allpassenger = xchart.getpassengerfromjsonfile();
        xchart.graphpassengersages(allpassenger);

        try{

            System.in.read();
        }
        catch (IOException e){
            Logger.getLogger(Xchart.class.getName()).log(Level.SEVERE, null, e);

        }
        xchart.graphpassengerclass(allpassenger);
    }
        public List<Passenger> getpassengerfromjsonfile () {
            List<Passenger> allpassenger = new ArrayList<>();
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            try (FileInputStream input = new FileInputStream("E:\\AI-Pro – ITI\\Java\\JavaAssignments-main\\Day4\\titanic_csv.json"))
            {
                allpassenger=objectMapper.readValue(input, new TypeReference<List<Passenger>>() {
                });
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return allpassenger;
        }

public void graphpassengersages(List<Passenger> passengerList) {
    List<Float> pAges = passengerList.stream().map(Passenger::getAge).limit(10
    ).collect(Collectors.toList());
    List<String> pNames = passengerList.stream().map(Passenger::getName).limit(10).collect(Collectors.toList());

    CategoryChart chart = new CategoryChartBuilder().width(1024).
            height(768).title("age histogram").yAxisTitle("ages").xAxisTitle("names").build();
    chart.addSeries("passenger ages", pNames, pAges);
    new SwingWrapper(chart).displayChart();
}
public void graphpassengerclass(List<Passenger> passengerList){
        Map<String, Long> pclass = passengerList.stream()
                .collect(Collectors.groupingBy(Passenger::getPclass,Collectors.counting()));

    PieChart chart =new PieChartBuilder().width(800).height(600).title(getClass().getSimpleName()).build();
    Color[] sliceColors= new Color[]{new Color (180, 68, 50), new Color (130, 105, 120), new Color (80, 143, 160)};
    chart.getStyler().setSeriesColors(sliceColors);

    chart.addSeries("First Class",pclass.get("1"));
    chart.addSeries("Second Class",pclass.get("2"));
    chart.addSeries("third Class", pclass.get("3"));

    new SwingWrapper(chart).displayChart();

}
    }
