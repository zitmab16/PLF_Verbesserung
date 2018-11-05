
package gui;


public class Wetterstation {
    private String place;
    private int sealvl;
    private float temp;
    private int humidity;

    public Wetterstation(String place, int sealvl, float temp, int humidity) throws Exception {
        this.place = place;
        this.sealvl = sealvl;
        setTemp(temp);
        setHumidity(humidity);
    }

    public void setTemp(float temp) throws Exception{
       
        if(temp <-35 || temp>45){
            throw new Exception("falsche Temperaturwerte!");
        }
        
        this.temp = temp;
    }

    public void setHumidity(int humidity) throws Exception {
        
        if(humidity<0 ||humidity>100){
            throw new Exception("falsche Luftfeuchtigkeitswerte");
        }
        this.humidity = humidity;
    }

    public String getPlace() {
        return place;
    }

    public int getSealvl() {
        return sealvl;
    }

    public float getTemp() {
        return temp;
    }

    public int getHumidity() {
        return humidity;
    }
    
    
    
}
