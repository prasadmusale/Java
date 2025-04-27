package Core_Java;

class Employee {

    // created static variable
    static String company;
    int id;
    String name;
    int salary;

    // This is static block which is implemented only once while loading class .
    static {
        System.out.println("This is static block");
    }

    // created static method and accesing non static variables in static method
    static void show(Employee emp) {
        System.out.println("It is static method");
        System.out.println(emp.id + " , " + emp.name + " , " + emp.salary + " , " + company);
    }

    // accesing static and non static variables in non static method .
    void show1() {
        System.out.println("This is non static method");
        System.out.println(id + " , " + name + " , " + salary + " , " + company);
    }
}

public class concept3 {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 1;
        emp1.name = "Prasad";
        emp1.salary = 100000;
        Employee.company = "Visa"; // Accessed statc veriable using class name

        Employee.show(emp1);
        emp1.show1();
    }
}
