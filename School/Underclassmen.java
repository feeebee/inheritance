package School;
public class Underclassmen extends Students {
    boolean permit;
    public Underclassmen(){

    }
    public Underclassmen(boolean publicSchool, boolean open, double grade){
        super(publicSchool, open, grade);
    }
    public void skipClass(){
        System.out.println("This underclassman skips class");
    }
    public void makeFriends(){
        System.out.println("The underclassman makes new friends");
    }
    public boolean getPermit(){
        return permit;
    }
    public void setPermit(boolean x){
        x = permit;
    }
}
