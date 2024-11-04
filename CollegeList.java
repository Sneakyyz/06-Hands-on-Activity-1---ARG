import java.util.Scanner;
public class CollegeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
        String choice = scanner.nextLine().trim().toUpperCase();
        
        switch (choice) {
            case "E":
                Employee employee = new Employee();
                System.out.println("Type employee's name, contact number, salary, and department.");
                System.out.println("Press Enter after every input.");
                
                employee.setName(scanner.nextLine());
                employee.setContactNum(scanner.nextLine());
                employee.setSalary(Double.parseDouble(scanner.nextLine()));
                employee.setDepartment(scanner.nextLine());
                
                System.out.println("-------------------------------------------");
                System.out.println("Name: " + employee.getName());
                System.out.println("Contact Number: " + employee.getContactNum());
                System.out.println("Salary: " + employee.getSalary());
                System.out.println("Department: " + employee.getDepartment());
                break;
                
            case "F":
                Faculty faculty = new Faculty();
                System.out.println("Type faculty's name, contact number, salary, department, and regular status (Y/N).");
                System.out.println("Press Enter after every input.");
                
                faculty.setName(scanner.nextLine());
                faculty.setContactNum(scanner.nextLine());
                faculty.setSalary(Double.parseDouble(scanner.nextLine()));
                faculty.setDepartment(scanner.nextLine());
                faculty.setStatus(scanner.nextLine().equalsIgnoreCase("Y"));
                
                System.out.println("-------------------------------------------");
                System.out.println("Name: " + faculty.getName());
                System.out.println("Contact Number: " + faculty.getContactNum());
                System.out.println("Salary: " + faculty.getSalary());
                System.out.println("Department: " + faculty.getDepartment());
                System.out.println("Status: " + (faculty.isRegular() ? "Regular" : "Non-Regular"));
                break;
                
            case "S":
                Student student = new Student();
                System.out.println("Type student's name, contact number, program, and year level.");
                System.out.println("Press Enter after every input.");
                
                student.setName(scanner.nextLine());
                student.setContactNum(scanner.nextLine());
                student.setProgram(scanner.nextLine());
                student.setYearLevel(scanner.nextLine());
                
                System.out.println("-------------------------------------------");
                System.out.println("Name: " + student.getName());
                System.out.println("Contact Number: " + student.getContactNum());
                System.out.println("Program: " + student.getProgram());
                System.out.println("Year Level: " + student.getYearLevel());
                break;
                
            default:
                System.out.println("Error. Please choose one (1) only: E, F, or S.");
                break;
        }
        scanner.close();
    }
}
