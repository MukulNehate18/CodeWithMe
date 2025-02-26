package corejava.inheritance;
//4. Write program to Create class name as PersonalInfo with parameterized constructor
// PersonalInfo(String name, String middlename, String lastname) and you have to create
// class name as ProfessionalInfo with parameterized constructor like as
// ProfessionalInfo(int id,String des,int salary,String skillset) and you have to inherit
// PersonalInfo class in ProfessionalInfo and pass parameter from ProfessionalInfo
// class to PersonalInfo using super() constructor and you have to define void show()
// method in ProfessionalInfo and you have to show the all data in show() method

class PersonalInfo{
    protected String name, middlename, lastname;
    public PersonalInfo(String name, String middlename, String lastname){
        this.name=name;
        this.middlename=middlename;
        this.lastname=lastname;
    }
}
class ProfessionalInfo extends PersonalInfo{
    private int id, salary;
    private String skillset, des;
    public ProfessionalInfo(int id, String des, int salary, String skillset, String name, String middlename, String lastname){
        super(name, middlename, lastname);
        this.id=id;
        this.des=des;
        this.salary=salary;
        this.skillset=skillset;
    }
    public void show(){
        System.out.println(name+" "+middlename+" "+lastname);
        System.out.println(id);
        System.out.println(salary);
        System.out.println(des);
        System.out.println(skillset);
    }
}
public class Info {
    public static void main(String[] args) {
        ProfessionalInfo pi= new ProfessionalInfo(23, "IT", 34500, "php", "Mukul", "Vikas", "Nehate");
        pi.show();
    }
}
