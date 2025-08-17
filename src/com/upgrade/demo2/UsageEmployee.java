package com.upgrade.demo2;

public class UsageEmployee {
    public static void main(String[] args) {

        // created 2 objects which calls constructors automatically
        Employee emp1 = new Employee(101, "zeeshan", "ansari", 10000);
       /* System.out.println(emp.empId);
        System.out.println(emp.firstname + " " + emp.lastName);               // rather than using this we will print the data though method calling by objects
        System.out.println(emp.salary);*/

        Employee emp2 = new Employee(102, "Harry", "Khan", 120000);
        /*System.out.println(emp1.empId);
        System.out.println(emp1.firstname + " " + emp1.lastName);
        System.out.println(emp1.salary);*/

        emp1.printData();                        // calling user defined method
        emp2.printData();

        Employee emp3 = new Employee();
        emp3.setEmpId(103);
        emp3.setFirstname("Rizwan");
        emp3.setLastName("Ansari");
        emp3.setSalary(15000);
        System.out.println(emp3.getEmpId());
        System.out.println(emp3.getFirstname());
        System.out.println(emp3.getLastName());
        System.out.println(emp3.getSalary());

       Manager manager = new Manager(203, "Shaziya", "Ansari",256464, "HR");
        Developer developer = new Developer(204, "Guarav", "Dabral",746474, "Java");
        manager.printData();
        manager.manageProject();
        manager.increment(5.5f);
        developer.printData();
        developer.writeCode();
        developer.increment(5000);

    }
}
