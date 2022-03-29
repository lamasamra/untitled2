package maltepe.edu.tr.oop;

public class Student extends Person {

    public Student(String name,int id) {
        this.stu_ID=id;
        this.stu_name=name;
    }
    private int stu_ID;
    private String stu_name;


    public void setstu_ID (int si) {
        this.stu_ID = si;
    }
    public int getstu_ID() {
        return stu_ID;
    }

    public   void setName (String n){
        this.stu_name=n;
    }
    public String getName(){
        return stu_name;
    }
    void learns() {


    }
}