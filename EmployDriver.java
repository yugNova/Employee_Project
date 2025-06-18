import java.util.Scanner;
class EmployDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array:");
        int size = sc.nextInt();
        sc.nextLine(); // Consume newline

        Employ[] emp = new Employ[size];

        // Taking employee details input
        for (int i = 0; i < size; i++) {
            System.out.println("Enter name:");
            String name = sc.nextLine();
            System.out.println("Enter id:");
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline
  System.out.println("Enter age:");
            int age = sc.nextInt();
            sc.nextLine(); // Consume newline
            System.out.println("Enter salary:");
            double salary = sc.nextDouble();
            sc.nextLine(); // Consume newline
            emp[i] = new Employ(name, id, age, salary);
        }

        while (true) {
            System.out.println("\nEnter From Below Options:");
            System.out.println("Press 1 to ==> access all the employees");
            System.out.println("Press 2 to ==> print and count employees with age < 30 years");
            System.out.println("Press 3 to ==> print employ with highest and least salary");
            System.out.println("Press 4 to ==> search an employ by id");
            System.out.println("Press 5 to ==> search an employ by name");
 System.out.println("Press 6 to ==> count and print employees with salary more than average salary");
            System.out.println("Press 0 to ==> exit");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    accessAllEmployees(emp);
                    break;
case 2:
                    accessAllEmployWithAge(emp);
                    break;
                case 3:
                    getEmployWithSalary(emp);
                    break;
                case 4:
                    searchEmployById(emp, sc);
                    break;
                case 5:
                    searchEmployByName(emp, sc);
                    break;
                case 6:
                    countEmployAboveAvgSalary(emp);
                    break;
                case 0:
                    System.out.println("Exiting...");
 sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static void accessAllEmployees(Employ[] emp) {
        for (Employ e : emp) {
            System.out.println(e.getDetails());
        }
 }

    public static void accessAllEmployWithAge(Employ[] emp) {
        int count = 0;
        for (Employ e : emp) {
            if (e.age < 30) {
                System.out.println(e.getDetails());
                count++;
            }
        }
        System.out.println("Count of employees under 30: " + count);
    }
public static void getEmployWithSalary(Employ[] emp) {
        Employ highestSalary = emp[0], lowestSalary = emp[0];
        for (Employ e : emp) {
            if (e.salary > highestSalary.salary) highestSalary = e;
            if (e.salary < lowestSalary.salary) lowestSalary = e;
        }
        System.out.println("Employee with highest salary: " + highestSalary.getDetails());
        System.out.println("Employee with lowest salary: " + lowestSalary.getDetails());
    }

    public static void searchEmployById(Employ[] emp, Scanner sc) {
        System.out.print("Enter Employee ID to search: ");
        int searchId = sc.nextInt();
        for (Employ e : emp) {
            if (e.id == searchId) {
                System.out.println("Employee found: " + e.getDetails());
                return;
 }
        }
        System.out.println("Employee not found.");
    }

    public static void searchEmployByName(Employ[] emp, Scanner sc) {
        System.out.print("Enter Employee Name to search: ");
        String searchName = sc.nextLine();
        for (Employ e : emp) {
            if (e.name.equalsIgnoreCase(searchName)) {
                System.out.println("Employee found: " + e.getDetails());
                return;
            }
        }
        System.out.println("Employee not found.");
    }
 public static void countEmployAboveAvgSalary(Employ[] emp) {
        double totalSalary = 0;
        for (Employ e : emp) {
            totalSalary += e.salary;
        }
        double avgSalary = totalSalary / emp.length;

        System.out.println("Employees with salary above average (" + avgSalary + "):");
        int count = 0;
        for (Employ e : emp) {
            if (e.salary > avgSalary) {
                System.out.println(e.getDetails());
                count++;
            }
        }
System.out.println("Count: " + count);
    }

}




