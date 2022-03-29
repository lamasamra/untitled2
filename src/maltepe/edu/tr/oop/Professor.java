package maltepe.edu.tr.oop;

public class Professor extends Person{
    public Professor(String name,int num)
    {
        this.pro_ID=num;
        this.pro_name=name;
    }
    private int pro_ID;
    private String pro_name;


    public void setPro_ID (int pi) {

        pro_ID = pi;
    }
    public int getpro_ID() {
        return pro_ID;

    }

    public void setName (String n){

        this.pro_name=n;
    }
    public String getName1(){
        return pro_name;
    }



    void teaches () {

        System.out.println("prof"+pro_name+"is teaching now" );
    }

    public void work() {
    }
}