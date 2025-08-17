package com.upgrade.demo2;

public class Manager extends Employee{
    private String department;

    public Manager(int empId, String firstname, String lastName, double salary, String department) {
        super(empId, firstname, lastName, salary);
        this.department = department;
    }
    public Manager(){

    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
   public void manageProject(){
        System.out.println(getFirstname()+" "+getLastName()+" is managing the "+department+"Department");

    }
    @Override                                 // dynamic polymorphism - method overriding  happen in diff class parent and child
    public void printData() {
        super.printData();       // call parent class method
        System.out.println("Department: "+department);
    }
    }

