package School;

public class Staff extends Schools {
    int age;
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void talkToKids(){
        System.out.println("The staff talks to kids");
    }
    public void goHome(){
        System.out.println("The staff goes home");
    }
    public Staff(){

    }
    public Staff(boolean publicSchool, boolean open){
        super(publicSchool, open);
    }
}
