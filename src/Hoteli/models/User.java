package Hoteli.models;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private String salt;
    public User(){
        this(-1,"","","","");
    }
    public User(
             int id,
             String name,
             String email,  String password,
             String salt){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
        this.salt=salt;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getSalt(){
        return salt;
    }

}
