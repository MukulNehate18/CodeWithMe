package miniproject;

import java.util.Scanner;

class Employee{
    private int  id, contact, salary;
    private String  name, email, address;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public int getContact() {
        return contact;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
class Company{
    Scanner sc= new Scanner(System.in);
    public int display(int count, Employee ...e){
        for (int i = 0; i < count; i++) {
            System.out.println(e[i]);  // Assuming Employee has a toString() method
        }
        return count;
    }
    public int sortById(int count, Employee ...e){
        for (int i=0;i<count;i++){
          for (int j =i+1;j<count;j++) {
              if (e[i].getId() < e[j].getId()) {
                  Employee temp = e[i];
                  e[i] = e[j];
                  e[j] = temp;
              }
          }
        }
        display(count, e);
        return 1;
    }
    public int sortByName(int count, Employee ...e){
        for (int i=0;i<count;i++){
            for (int j =i+1;j<count;j++){
                if (e[i].getName().compareTo(e[j].getName())==0) {
                    Employee temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
        }
        display(count, e);
        return 1;
    }
    public int sortByEmail(int count, Employee ...e){
        for (int i=0;i<count;i++){
            for (int j =i+1;j<count;j++){
                if (e[i].getEmail().compareTo(e[j].getEmail())==0) {
                    Employee temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
        }
        display(count, e);
        return 1;
    }
    public int sortBySalary(int count, Employee ...e) {
        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (e[i].getSalary() < e[j].getSalary()) {
                    Employee temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
        }
        display(count, e);
        return 1;
    }
    public int sortByAddress(int count, Employee ...e){
        for (int i=0;i<count;i++){
            for (int j =i+1;j<count;j++){
                if (e[i].getAddress().compareTo(e[j].getAddress())==0) {
                    Employee temp = e[i];
                    e[i] = e[j];
                    e[j] = temp;
                }
            }
        }
        display(count, e);
        return 1;
    }
    public boolean update(int i, Employee ...e){
        System.out.print("Enter Name of Employee:");
        e[i].setName(sc.next());
        System.out.print("Enter Id of Employee:");
        e[i].setId(sc.nextInt());
        System.out.print("Enter Email of Employee:");
        e[i].setEmail(sc.next());
        System.out.print("Enter Address of Employee:");
        e[i].setAddress(sc.next());
        System.out.print("Enter Salary Of Employee:");
        e[i].setSalary(sc.nextInt());
        System.out.print("Enter Contact Of Employee:");
        e[i].setContact(sc.nextInt());
        return true;
    }
    public boolean delete(int i, int count, Employee ...e){
        for (int j=i;j<count-i;j++){
            e[j]=e[j+1];
        }
        e[count-1]=null;
        return true;
    }
    public boolean search(int i, Employee ...e){
        System.out.println("Name: "+e[i].getName());
        System.out.println("Id: "+e[i].getId());
        System.out.println("Email: "+e[i].getEmail());
        System.out.println("Address: "+e[i].getAddress());
        System.out.println("Salary: "+e[i].getSalary());
        System.out.println("Contact: "+e[i].getContact());
        return true;
    }
}
public class CompanySystem {
    public static void main(String[] args) {
        Employee[] e= new Employee[100];
        Company c= new Company();
        Scanner sc = new Scanner(System.in);
        int ch, count=0;
        do {
            System.out.println("\n1.Add Employee Details.\n" +
                    "2.Show Employee Details.\n" +
                    "3.Search Employee.\n" +
                    "4.Delete Employee Details.\n" +
                    "5.Update Employee Details.\n" +
                    "6.Sorting Employee Details.\n" +
                    "7.Display the employee details in highest salary.\n" +
                    "8.Display the employee details in minimum salary is 10000 to maximum salary is 50000.\n" +
                    "9.Exit.\n");
            System.out.println("Enter your Choice:");
            ch=sc.nextInt();
            switch (ch){
                case 1:
                    if (count<e.length){
                        e[count]= new Employee();
                        System.out.print("Enter Name of Employee:");
                        e[count].setName(sc.next());
                        System.out.print("Enter Id of Employee:");
                        e[count].setId(sc.nextInt());
                        System.out.print("Enter Email of Employee:");
                        e[count].setEmail(sc.next());
                        System.out.print("Enter Address of Employee:");
                        e[count].setAddress(sc.next());
                        System.out.print("Enter Salary Of Employee:");
                        e[count].setSalary(sc.nextInt());
                        System.out.print("Enter Contact Of Employee:");
                        e[count].setContact(sc.nextInt());
                        count++;
                        System.out.println("Employee Details added successfully!");
                    }else {
                        System.out.println("Company is Full.");
                    }
                    break;

                case 2:
                    if (count ==0){
                        System.out.println("No Employee is to Display!!");
                    }else{
                        for (int i=0;i<count;i++){
                            System.out.println("Name: "+e[i].getName());
                            System.out.println("Id: "+e[i].getId());
                            System.out.println("Email: "+e[i].getEmail());
                            System.out.println("Address: "+e[i].getAddress());
                            System.out.println("Salary: "+e[i].getSalary());
                            System.out.println("Contact: "+e[i].getContact());
                        }
                    }
                    break;

                case 3:
                    if (count>0) {
                        int x = 0;
                        while (x < 1) {
                            System.out.println("Search Employee Using:\n" +
                                    "1.id.\n" +
                                    "2.name.\n" +
                                    "3.email.\n" +
                                    "4.salary.\n" +
                                    "5.address.\n");
                            System.out.println("Enter your option:");
                            int a = sc.nextInt();
                            x++;
                            switch (a) {
                                case 1:
                                    System.out.println("Enter Id:");
                                    int id= sc.nextInt();
                                    boolean foundId=false;
                                    for (int i=0;i<count;i++){
                                        if (id==e[i].getId()){
                                            foundId=c.search(i, e);
                                        }
                                    }
                                    if (!foundId){
                                        System.out.println("Employee not found.");
                                    }
                                    break;

                                case 2:
                                    System.out.println("Enter name:");
                                    String name= sc.next();
                                    boolean foundName=false;
                                    for (int i=0;i<count;i++){
                                        if (e[i].getName().equalsIgnoreCase(name)){
                                            foundName=c.search(i, e);
                                        }
                                    }
                                    if (!foundName){
                                        System.out.println("Employee not found.");
                                    }
                                    break;

                                case 3:
                                    System.out.println("Enter Email:");
                                    String email= sc.next();
                                    boolean foundEmail=false;
                                    for (int i=0;i<count;i++){
                                        if (e[i].getEmail().equalsIgnoreCase(email)){
                                            foundEmail=c.search(i, e);
                                        }
                                    }
                                    if (!foundEmail){
                                        System.out.println("Employee not found.");
                                    }
                                    break;

                                case 4:
                                    System.out.println("Enter Salary:");
                                    int salary= sc.nextInt();
                                    boolean foundSalary=false;
                                    for (int i=0;i<count;i++){
                                        if (salary==e[i].getId()){
                                            foundSalary=c.search(i, e);
                                        }
                                    }
                                    if (!foundSalary){
                                        System.out.println("Employee not found.");
                                    }
                                    break;

                                case 5:
                                    System.out.println("Enter Address:");
                                    String address= sc.next();
                                    boolean foundAddress=false;
                                    for (int i=0;i<count;i++){
                                        if (e[i].getAddress().equalsIgnoreCase(address)){
                                            foundAddress=c.search(i, e);
                                        }
                                    }
                                    if (!foundAddress){
                                        System.out.println("Employee not found.");
                                    }
                                    break;

                            }
                        }
                    }else{
                        System.out.println("No Employee details.");
                    }
                    break;

                case 4:
                    if (count>0) {
                        int x = 0;
                        while (x < 1) {
                            System.out.println("Delete Employee Details by Using:\n" +
                                    "1.id.\n" +
                                    "2.name.\n" +
                                    "3.email.\n" +
                                    "4.salary.\n" +
                                    "5.address.\n");
                            System.out.println("Enter your option:");
                            int a = sc.nextInt();
                            x++;
                            switch (a) {
                                case 1:
                                    System.out.println("Enter Id:");
                                    int id= sc.nextInt();
                                    boolean foundId=false;
                                    for (int i=0;i<count;i++){
                                        if (id==e[i].getId()){
                                            foundId=c.delete(i, count, e);
                                            count--;
                                            System.out.println("Details deleted successfully!");
                                        }
                                    }
                                    if (!foundId){
                                        System.out.println("Employee not found.");
                                    }
                                    break;

                                case 2:
                                    System.out.println("Enter name:");
                                    String name= sc.next();
                                    boolean foundName=false;
                                    for (int i=0;i<count;i++){
                                        if (e[i].getName().equalsIgnoreCase(name)){
                                            foundName=c.delete(i, count, e);
                                            count--;
                                            System.out.println("Details deleted successfully!");
                                        }
                                    }
                                    if (!foundName){
                                        System.out.println("Employee not found.");
                                    }
                                    break;

                                case 3:
                                    System.out.println("Enter Email:");
                                    String email= sc.next();
                                    boolean foundEmail=false;
                                    for (int i=0;i<count;i++){
                                        if (e[i].getEmail().equalsIgnoreCase(email)){
                                            foundEmail=c.delete(i, count, e);
                                            count--;
                                            System.out.println("Details deleted successfully!");
                                        }
                                    }
                                    if (!foundEmail){
                                        System.out.println("Employee not found.");
                                    }
                                    break;

                                case 4:
                                    System.out.println("Enter Salary:");
                                    int salary= sc.nextInt();
                                    boolean foundSalary=false;
                                    for (int i=0;i<count;i++){
                                        if (salary==e[i].getId()){
                                            foundSalary=c.delete(i, count, e);
                                            count--;
                                            System.out.println("Details deleted successfully!");
                                        }
                                    }
                                    if (!foundSalary){
                                        System.out.println("Employee not found.");
                                    }
                                    break;

                                case 5:
                                    System.out.println("Enter Address:");
                                    String address= sc.next();
                                    boolean foundAddress=false;
                                    for (int i=0;i<count;i++){
                                        if (e[i].getAddress().equalsIgnoreCase(address)){
                                            foundAddress=c.delete(i, count, e);
                                            count--;
                                            System.out.println("Details deleted successfully!");
                                        }
                                    }
                                    if (!foundAddress){
                                        System.out.println("Employee not found.");
                                    }
                                    break;

                            }
                        }
                    }else{
                        System.out.println("Zero Employee details.");
                    }
                    break;

                case 5:
                    if (count>0) {
                        int x = 0;
                        while (x < 1) {
                            System.out.println("Update Employee Details Using:\n" +
                                    "1.id.\n" +
                                    "2.name.\n" +
                                    "3.email.\n" +
                                    "4.salary.\n" +
                                    "5.address.\n");
                            System.out.println("Enter your option:");
                            int a = sc.nextInt();
                            x++;
                            switch (a) {
                                case 1:
                                    System.out.println("Enter Id:");
                                    int id= sc.nextInt();
                                    boolean foundId=false;
                                    for (int i=0;i<count;i++){
                                        if (id==e[i].getId()){
                                            foundId=c.update(i, e);
                                            System.out.println("Details updated successfully!");
                                        }
                                    }
                                    if (!foundId){
                                        System.out.println("Employee not found.");
                                    }
                                    break;

                                case 2:
                                    System.out.println("Enter name:");
                                    String name= sc.next();
                                    boolean foundName=false;
                                    for (int i=0;i<count;i++){
                                        if (e[i].getName().equalsIgnoreCase(name)){
                                            
                                            foundName=c.update(i, e);
                                            System.out.println("Details updated successfully!");

                                        }
                                    }
                                    if (!foundName){
                                        System.out.println("Employee not found.");
                                    }
                                    break;

                                case 3:
                                    System.out.println("Enter Email:");
                                    String email= sc.next();
                                    boolean foundEmail=false;
                                    for (int i=0;i<count;i++){
                                        if (e[i].getEmail().equalsIgnoreCase(email)){
                                            foundEmail=c.update(i, e);
                                            System.out.println("Details updated successfully!");

                                        }
                                    }
                                    if (!foundEmail){
                                        System.out.println("Employee not found.");
                                    }
                                    break;

                                case 4:
                                    System.out.println("Enter Salary:");
                                    int salary= sc.nextInt();
                                    boolean foundSalary=false;
                                    for (int i=0;i<count;i++){
                                        if (salary==e[i].getId()){
                                            foundSalary=c.update(i, e);
                                            System.out.println("Details updated successfully!");

                                        }
                                    }
                                    if (!foundSalary){
                                        System.out.println("Employee not found.");
                                    }
                                    break;

                                case 5:
                                    System.out.println("Enter Address:");
                                    String address= sc.next();
                                    boolean foundAddress=false;
                                    for (int i=0;i<count;i++){
                                        if (e[i].getAddress().equalsIgnoreCase(address)){
                                            foundAddress=c.update(i, e);
                                            System.out.println("Details updated successfully!");

                                        }
                                    }
                                    if (!foundAddress){
                                        System.out.println("Employee not found.");
                                    }
                                    break;
                            }
                        }
                    }else{
                        System.out.println("No Employee details.");
                    }
                    break;
                    
                case 6:
                    if (count>0) {
                        int x = 0;
                        while (x < 1) {
                            System.out.println("Sorting Employee Details Using:\n" +
                                    "1.id.\n" +
                                    "2.name.\n" +
                                    "3.email.\n" +
                                    "4.salary.\n" +
                                    "5.address.\n");
                            System.out.println("Enter your option:");
                            int a = sc.nextInt();
                            x++;
                            switch (a) {
                                case 1:
                                    int s1=c.sortById(count, e);
                                    if (s1==1){
                                        System.out.println("Sorted by Id successfully.");
                                    }
                                    break;

                                case 2:
                                    int s2=c.sortByName(count, e);
                                    if (s2==1){
                                        System.out.println("Sorted by Name successfully.");
                                    }
                                    break;

                                case 3:
                                    int s3=c.sortByEmail(count, e);
                                    if (s3==1){
                                        System.out.println("Sorted by Email successfully.");
                                    }
                                    break;

                                case 4:
                                    int s4=c.sortBySalary(count, e);
                                    if (s4==1){
                                        System.out.println("Sorted by Salary successfully.");
                                    }
                                    break;

                                case 5:
                                    int s5=c.sortByAddress(count, e);
                                    if (s5==1){
                                        System.out.println("Sorted by Address successfully.");
                                    }
                                    break;
                            }
                        }
                    }else{
                        System.out.println("Not enough Employee to sort.");
                    }
                    break;
                    
                case 7:
                    if (count==0){
                        System.out.println("Not enough Employee.");
                        break;
                    }else{
                        int max=0;
                        for (int i=0;i<count;i++){
                            if (e[max].getSalary()<e[i].getSalary()){
                                max=i;
                            }
                        }
                        System.out.println("Highest Salary Employee is: ");
                        System.out.println("Name: "+e[max].getName());
                        System.out.println("Id: "+e[max].getId());
                        System.out.println("Email: "+e[max].getEmail());
                        System.out.println("Address: "+e[max].getAddress());
                        System.out.println("Salary: "+e[max].getSalary());
                        System.out.println("Contact: "+e[max].getContact());
                        break;
                    }

                case 8:
                    if (count==0){
                        System.out.println("Not enough Employee.");
                        break;
                    }else{
                        for (int i=0;i<count;i++){
                            if (10000<=e[i].getSalary() && e[i].getSalary()<=50000){
                                System.out.println("Name: "+e[i].getName());
                                System.out.println("Id: "+e[i].getId());
                                System.out.println("Email: "+e[i].getEmail());
                                System.out.println("Address: "+e[i].getAddress());
                                System.out.println("Salary: "+e[i].getSalary());
                                System.out.println("Contact: "+e[i].getContact());                            }
                        }
                        break;
                    }
                case 9:
                    System.exit(1);

                default:
                    System.out.println("Invalid Choice!!");
            }
        }while (true);
    }
}
