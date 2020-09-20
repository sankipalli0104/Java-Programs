public class Employee{
    
    private String id;
    private String name;
    private String department;
    private int age;
    
    public Employee(){        
    }
    
    public Employee(String id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }
 
    //constructor with age argument
    public Employee(String id, String name, String department, int age){
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }
 
    public String getId() {
        return id;
    }
 
    public void setId(String id) {
        this.id = id;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getDepartment() {
        return department;
    }
 
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public int getAge() {
        return age;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
 
    public String toString(){
 
        return "[" + 
            this.getId() + 
            " : " + 
            this.getName() + 
            " : " + 
            this.getDepartment() + 
            "]";
    }
 
}