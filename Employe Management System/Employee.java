public class Employee{
    public String nameOfTheEmployee;
    public int ageOfTheEmployee;
    public int ID;
    public String designation;
    public String department;
    public int salary;
    public Employee(int ID,String nameOfTheEmployee, int ageOfTheEmployee, String designation,String department,int salary) {
        this.nameOfTheEmployee = nameOfTheEmployee;
        this.ID = ID;
        this.ageOfTheEmployee = ageOfTheEmployee;
        this.designation = designation;
        this.department = department;
        this.salary = salary;
    }
    public String getDepartment() {
        return department;
    }
    public String getNameOfTheEmployee() {
        return nameOfTheEmployee;
    }
    public String getDesignation() {
        return designation;
    }
    public int getAgeOfTheEmployee() {
        return ageOfTheEmployee;
    }
    public int getID() {
        return ID;
    }
    public int getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "name: " + getNameOfTheEmployee() +
           " age: " + getAgeOfTheEmployee() +
           " designation: " + getDesignation() +
           " department: " + getDepartment() +
           " ID: " + getID() +
           " salary: " + getSalary();
    }

}