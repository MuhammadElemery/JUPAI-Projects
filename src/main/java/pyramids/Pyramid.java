package pyramids;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author V E R S I O N
 */
public class Pyramid {
    private String pharoah;
    private String modern_name;
    private String site;
    private double height;
    
    public Pyramid(String pharoah, String modern_name, String site, double height){
        try {
            this.height = height;
        } catch (Exception e) {
        }

        try {
            this.modern_name = modern_name;
        } catch (Exception e) {
        }
        try {
            this.pharoah = pharoah;
        } catch (Exception e) {
        }try {
            this.site = site;
        } catch (Exception e) {
        }

  
    }

    Pyramid(String field, String field0, String field1, String field2, String field3) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getPharoah() {
        return pharoah;
    }

    public void setPharoah(String pharoah) {
        this.pharoah = pharoah;
    }

    public String getModern_name() {
        return modern_name;
    }

    public void setModern_name(String modern_name) {
        this.modern_name = modern_name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public String getSite(){
        return site;
    }
    public void setSite(String site){
        this.site = site;
    }
    @Override
    public String toString() {
        return "Pyramid{" +
                "height='" + height + '\'' +
                ", modern_name='" + modern_name + '\'' +
                ", pharaoh='" + pharoah + '\'' +
                ", site='" + site + '\'' +
                '}';
    
}
}
