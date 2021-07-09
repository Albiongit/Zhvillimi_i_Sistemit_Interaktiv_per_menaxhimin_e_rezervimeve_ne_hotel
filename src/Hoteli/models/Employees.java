package Hoteli.models;

public class Employees {
    private int id;
    private String name;
    private String Lastname;
    private String phone;
    private int jobtime;
    private int salary;

    public Employees(int id, String name, String Lastname, String phone,int jobtime,int salary) {
        this.id = id;
        this.name = name;
        this.Lastname = Lastname;
        this.phone = phone;
        this.jobtime=jobtime;
        this.salary=salary;
    }

    public Employees() {
        this(-1, "", "","",0, 0);
    }

    public Employees(int id, String name,String Lastname, int salary) {
        this.id = id;
        this.name = name;
        this.Lastname=Lastname;
        this.salary=salary;
    }


    public int getid() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getLastname() {
        return Lastname;
    }


    public String getphone() {
        return phone;
    }
    public int getJobtime() {
        return jobtime;
    }
    public int getsalary(){
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setLastname(String Lastname) {
       this.Lastname = Lastname;
   }
    public void setphone(String phone) {
        this.phone = phone;
    }
    public void setJobtime(int jobtime){
        this.jobtime=jobtime;
    }
    public void setsalary(int salary){
        this.salary=salary;
    }



}
