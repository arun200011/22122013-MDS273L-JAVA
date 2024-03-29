import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


class LAB6 {
    private static final int total_stud = 200;
    private static final Student[] students = new Student[total_stud];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("**********MENU************");
            System.out.println("1. Add a student");
            System.out.println("2. Search for a student");
            System.out.println("3. Update the details of a student");
            System.out.println("4. Display all students");
            System.out.println("5. Save the student details to a file");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    searchStudent(scanner);
                    break;
                case 3:
                    updateStudent(scanner);
                    break;
                case 4:
                    displayAllStudents();
                    break;
                case 5:
                    saveStudentDetailsToFile(scanner);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again");
            }
        } while (choice != 6);
    }

    private static void addStudent(Scanner scanner) {  //function for adding a student
        int regNo;
        String name, email, phone, classs, department;
        System.out.println("Enter the details of the student:");
        System.out.print("Reg No.: ");
        regNo = Integer.parseInt(scanner.nextLine());
        scanner.nextLine(); // consume the newline character
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Email: ");
        email = scanner.nextLine();
        System.out.print("Phone: ");
        phone = scanner.nextLine();
        System.out.print("Class: ");
        classs = scanner.nextLine();
        System.out.print("Department: ");
        department = scanner.nextLine();
        Student student = new Student(regNo, name, email, phone, classs, department);
        for (int i = 0; i < total_stud; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println("Student added successfully");
                break;
            }
            if (i == total_stud - 1) {
                System.out.println("Maximum number of students reached, cannot add more students");
            }
        }
    }

    private static void searchStudent(Scanner scanner) {  //function for searching a student
        System.out.println("Enter the search term (either name or register number):");
        String searchTerm = scanner.nextLine();
        boolean found = false;
        for (Student student : students) {
            if (student != null) {
                if (student.getName().equalsIgnoreCase(searchTerm) || String.valueOf(student.getRegNo()).equals(searchTerm)) {
                    student.printDetails();
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Student not found");
        }
    }

    private static void updateStudent(Scanner scanner) {  //function for updating an existing student
        System.out.println("Enter the search term (Either name or register number):");
        String searchTerm = scanner.nextLine();
        boolean found = false;
        for (Student student : students) {
            if (student != null) {
                if (student.getName().equalsIgnoreCase(searchTerm) || String.valueOf(student.getRegNo()).equals(searchTerm)) {
                    System.out.println("Enter the new details:");
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Class: ");
                    String classs = scanner.nextLine();
                    System.out.print("Department: ");
                    String department = scanner.nextLine();
                    student.setName(name);
                    student.setEmail(email);
                    student.setPhone(phone);
                    student.setCls(classs);
                    student.setDepartment(department);
                    System.out.println("Student details updated successfully");
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Student not found");
        }
    }

    private static void displayAllStudents() {
        for (Student student : students) {
            if (student != null) {
                student.printDetails();
            }
        }
    }

    private static void saveStudentDetailsToFile(Scanner scanner) {
        System.out.println("Enter the name of the student to save the details to a file:");
        String studentName = scanner.nextLine();
        for (Student student : students) {
            if (student != null) {
                if (student.getName().equalsIgnoreCase(studentName)) {
                    String fileName = student.getName() + ".txt";
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                        writer.write(student.toString());
                        System.out.println("Student details saved to file successfully");
                    } catch (IOException e) {
                        System.out.println("Error occurred while saving student details to the file: " + e.getMessage());
                    }
                    return;
                }
            }
        }
        System.out.println("Student not found");
    }
}

class Student {
    private int regNo;
    private String name;
    private String email;
    private String phone;
    private String classs;
    private String department;

    public Student(int regNo, String name, String email, String phone, String classs, String department) {
        this.regNo = regNo;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.classs = classs;
        this.department = department;
    }

    public void printDetails() {  //function for printing details of all students
        System.out.println("Reg No.: " + regNo);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Class: " + classs);
        System.out.println("Department: " + department);
    }

    public String toString() {  //converting to string
        return regNo + "," + name + "," + email + "," + phone + "," + classs + "," + department;
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCls(String classs) {
        this.classs = classs;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
