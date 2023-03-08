package School;

public class Teachers extends Schools{
    String subject;
    int classroomNum;
    public Teachers(){
        subject = "math";
        classroomNum = 1234;
    }
    public Teachers(String subject, int classroomNum){
        this.subject = subject;
        this.classroomNum= classroomNum;
    }
    public void teach(){
        System.out.println("I am teaching");
    }
    public void meetings(){
        System.out.println("teacher goes to meeting");
    }
    public void setSubject(String x){
        x = subject;
    }
    public String getSubject(){
        return subject;
    }
    public void setClassNum(int x){
        x = classroomNum;
    }
    public int getClassNum(){
        return classroomNum;
    }
}
