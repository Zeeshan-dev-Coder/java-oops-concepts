package com.upgrade.demo2;

public class Developer extends Employee {
    private String progLang;

    public Developer(int empId, String firstname, String lastName, double salary, String progLang) {
        super(empId, firstname, lastName, salary);
        this.progLang = progLang;
    }

    public String getProgLang() {
        return progLang;
    }

    public void setProgLang(String progLang) {
        this.progLang = progLang;
    }
    public void writeCode(){
        System.out.println(getFirstname()+" "+getLastName()+" is coding in "+ progLang+" language");
    }
    @Override
    public void printData(){
        super.printData();          // call parent class method
        System.out.println("Programming Language: "+progLang);
    }
}
