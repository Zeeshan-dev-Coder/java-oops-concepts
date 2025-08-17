package com.upgrade.demo2;

public class Employee {
   private int empId;                                            // It is Encapsulation because the data is private and we use getter and setter for ggetting the values from private fields
   private String firstname;
   private String lastName;
   private double salary;

   // Default Constructor
   public Employee(){

   }

    // user-defined constructor
    public Employee(int empId, String firstname, String lastName, double salary) {
        // member variables
        this.empId = empId;
        this.firstname = firstname;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Setting Setter And Getter
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
   //
    public void increment(float percentage){
       salary+=((salary*percentage)/100);
        System.out.println("Salary incremented"+salary);
    }                                                            // static polymorphism - method overloading happen in same class
    //@overload
    public void increment(int bonus){
       salary+=bonus;
        System.out.println("Salary increment "+salary);
    }

    // method as per the requirement
    public void printData(){
        System.out.println("******************************** Employee Id:"+empId+"************");
        System.out.println("Salary: " +salary);
        System.out.println("Full Name: " + firstname+" "+lastName);
    }

}
