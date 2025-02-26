package corejava.classandobject;

import java.util.Scanner;

//1. Company Information:
//Create a Company class with fields companyName, ceoName, and employeesCount.
//Create a CompanyOperations class with methods to check if the company is large (more than 500 employees) or small (less than 50 employees).
class Company{
    private String companyName, ceoName;
    private int emloyeesCount;

    public void setCeoName(String ceoName) {
        this.ceoName = ceoName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setEmloyeesCount(int emloyeesCount) {
        this.emloyeesCount = emloyeesCount;
    }

    public int getEmloyeesCount() {
        return emloyeesCount;
    }

    public String getCeoName() {
        return ceoName;
    }

    public String getCompanyName() {
        return companyName;
    }
}

class CompanyOperations{
    public void checkCompany(Company ...c){
        for (Company co: c){
            if (co.getEmloyeesCount()>=500){
                System.out.println(co.getCompanyName()+" is Large Company");
                System.out.println("It's CEO is "+co.getCeoName()+" and they had "+co.getEmloyeesCount()+" Employee");
            } else if (co.getEmloyeesCount()<=50) {
                System.out.println(co.getCompanyName()+" is Small Company");
                System.out.println("It's CEO is "+co.getCeoName()+" and they had "+co.getEmloyeesCount()+" Employee");
            }else{
                System.out.println(co.getCompanyName()+" is Medium Company");
                System.out.println("It's CEO is "+co.getCeoName()+" and they had "+co.getEmloyeesCount()+" Employee");
            }
        }
    }
}
public class CompanyInfo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Company c[]= new Company[3];
        for (int i=0;i< c.length;i++){
            c[i]= new Company();
            System.out.print("Enter Company Name: ");
            c[i].setCompanyName(sc.next());
            System.out.print("Enter Ceo Name: ");
            c[i].setCeoName(sc.next());
            System.out.print("Enter Employees Count: ");
            c[i].setEmloyeesCount(sc.nextInt());
        }
        CompanyOperations co= new CompanyOperations();
        co.checkCompany(c);
    }
}
