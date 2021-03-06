package sample.model;

public class ModelTableTeachers {

    private String id;
    private String name;
    private String addr;
    private String phone;

    public ModelTableTeachers(String id, String name, String addr, String phone){
        this.id = id;
        this.name = name;
        this.addr = addr;
        this.phone = phone;
    }

    public String getId(){ return id; }
    public String getName(){ return name; }
    public String getAddr(){ return addr; }
    public String getPhone(){ return phone; }
}
