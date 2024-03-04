import java.util.*;
public class DataBase {
    public static List<Employee> employees = new ArrayList<>();

    static{
        
        employees.add(new Employee(1, "Arun", 40, "Manager", "Finance",10000));
        employees.add(new Employee(2, "Bala", 35, "Assistant Manager", "Finance",20000));
        employees.add(new Employee(3, "Chandru", 30, "Team Lead", "Finance",30000));
        employees.add(new Employee(4, "Durga", 45, "Manager", "HR",40000));
        employees.add(new Employee(5, "Elakkiya", 33, "Assistant Manager", "HR",50000));
        employees.add(new Employee(6, "Fizer", 28, "Team Lead", "HR",60000));
        employees.add(new Employee(7, "Gokul", 50, "Manager", "IT",70000));
        employees.add(new Employee(8, "Hardic", 29, "Assistant Manager", "IT",80000));
        employees.add(new Employee(9, "Ishwarya", 32, "Team Lead", "IT",90000));
        employees.add(new Employee(10, "Jaf",23, "Manager", "Marketing",85000));
    }
    public static List<Employee> getEmployees() {
        return employees;
    }
    public static boolean compareAge(int age, String comparator, int value) {
    switch (comparator) {
        case ">":
            return age > value;
        case "<":
            return age < value;
        case "==":
            return age == value;
        case "!=":
            return age != value;
        default:
            System.out.println("Invalid comparator for age.");
            return false;
    }
}
public static boolean compareName(String name, String comparator, String value) {
    switch (comparator) {
        case "contains":
            return name.contains(value);
        case "equals":
            return name.equals(value);
        case "notequals":
            return !name.equals(value);
        case "startswith":
            return name.startsWith(value);
        case "endswith":
            return name.endsWith(value);
        default:
            System.out.println("Invalid comparator for name.");
            return false;
    }
}
    

}