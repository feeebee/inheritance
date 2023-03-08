package School;

public class Students extends Schools{
    double grade;
    public Students(){
        
    }
    public Students(boolean publicSchool, boolean open, double grade){
        super(publicSchool, open);
        this.grade = grade;
        //System.out.println("hi");
    }
    public void setGrade(double grade){
        this.grade = grade;
    }
    public double getGrade(){
        return grade;
    }
    public void study(){
        System.out.println("The student studies");
    }
    public void extracurriculars(){
        System.out.println("the student takes extracurriculars");
    }
}
