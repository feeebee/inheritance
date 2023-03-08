package School;

public class Upperclassmen extends Students{
    boolean parkingSpot;
    public Upperclassmen(){

    }
    public Upperclassmen(boolean publicSchool, boolean open, double grade){
        super(publicSchool, open, grade);
    }
    public void prom(){
        System.out.println("The upperclassmen goes to prom");
    }
    public void drive(){
        System.out.println("The student drives to school");
    }
    public boolean getParkingSpot(){
        return parkingSpot;
    }
    public void setParkingSpot(boolean x){
        x = parkingSpot;
    }
}
