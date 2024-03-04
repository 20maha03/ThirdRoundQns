import java.util.*;

public class EmployeeMain {
    private static DataBase db;

    public static void main(String args[]) {
        db = new DataBase();
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Enter query:");
            input = scanner.nextLine();
            if (!input.equals("exit")) {
                processQuery(input);
            }
        } while (!input.equals("exit"));
    }

    public static void processQuery(String input) {
        String[] queries = input.split("AND");
        Set<Employee> tempResult = new HashSet<>();

        for (String query : queries) {
            String[] array = query.trim().split(" ");
            System.out.println("Query is: " + query);

            if (array.length < 4) {
                System.out.println("Invalid query format");
                return;
            }


            if ("age".equals(array[1])) {
                String value = array[2];
                for (Employee employee : db.employees) {
                    if (db.compareAge(employee.getAgeOfTheEmployee(), value, Integer.parseInt(array[3]))) {
                        tempResult.add(employee);
                    }
                }
            } 
            else if ("name".equals(array[1])) {
                String value = array[2];
                for (Employee employee : db.employees) {
                    if (db.compareName(employee.getNameOfTheEmployee(), value, array[3])) {
                        tempResult.add(employee);
                    }
                }
            } 
            else if ("designation".equals(array[1])) {
                String value = array[2];
                for (Employee employee : db.employees) {
                    if (db.compareName(employee.getDesignation(), value, array[3])) {
                        tempResult.add(employee);
                    }
                }
            } 
            else if ("department".equals(array[1])) {
                String value = array[2];
                for (Employee employee : db.employees) {
                    if (db.compareName(employee.getDepartment(), value, array[3])) {
                        tempResult.add(employee);
                    }
                }
            } 
            else if ("salary".equals(array[1])) {
                String value = array[2];
                for (Employee employee : db.employees) {
                    if (db.compareAge(employee.getSalary(), value, Integer.parseInt(array[3]))) {
                        tempResult.add(employee);
                    }
                }
            } 
            else {
                System.out.println("Invalid query");
                return;
            }

        }

        for (Employee e : tempResult) {

            System.out.println(e);
        }
    }
}
