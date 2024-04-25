import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.entity.Collage;
import com.entity.Student;

import java.util.Scanner;

public class StudentDriver {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("amit");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Fetch Record");
            System.out.println("3. Update Record");
            System.out.println("4. Delete Student Record");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addStudent(em, et);
                    break;
                case 2:
                    fetchRecord(em, scanner);
                    break;
                case 3:
                    updateRecord(em,et, scanner);
                    break;
                case 4:
                    deleteRecord(em, et, scanner);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        scanner.close();
        em.close();
        emf.close();
    }

    private static void addStudent(EntityManager em, EntityTransaction et) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student details:");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = scanner.nextInt();
        System.out.print("Mobile Number: ");
        long mobNo = scanner.nextLong();
        scanner.nextLine(); // Consume newline character
        System.out.print("Collage Registration Number: ");
        int regNo = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Collage Name: ");
        String collageName = scanner.nextLine();
        System.out.print("Collage University: ");
        String university = scanner.nextLine();
        System.out.print("Collage Address: ");
        String address = scanner.nextLine();

        Collage collage = new Collage();
        collage.setReg_no(regNo);
        collage.setName(collageName);
        collage.setUniversity(university);
        collage.setAddress(address);

        Student student = new Student();
        student.setName(name);
        student.setAge(age);
        student.setMob_no(mobNo);
        student.setCollage(collage);

        et.begin();
        em.persist(collage);
        em.persist(student);
        et.commit();

        System.out.println("Student added successfully!");
    }

    private static void fetchRecord(EntityManager em, Scanner scanner) {
        System.out.println("Fetch Record Menu:");
        System.out.println("1. Fetch by Student ID");
        System.out.println("2. Fetch by Mobile Number");
        System.out.println("3. Fetch all Records (sorted)");
        System.out.println("4. Fetch all Records by Age");
        System.out.println("5. Fetch all Records by Name");
        System.out.print("Enter your choice: ");
        int fetchChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Query query;
        List<Student> students;

        switch (fetchChoice) {
            case 1:
                System.out.print("Enter Student ID: ");
                int sid = scanner.nextInt();
                Student studentById = em.find(Student.class, sid);
                if (studentById != null) {
                    System.out.println("Student found: " + studentById);
                } else {
                    System.out.println("Student with ID " + sid + " not found.");
                }
                break;
            case 2:
                System.out.print("Enter Mobile Number: ");
                long mobNo = scanner.nextLong();
                query = em.createQuery("SELECT s FROM Student s WHERE s.mob_no = :mobNo");
                query.setParameter("mobNo", mobNo);
                students = query.getResultList();
                if (!students.isEmpty()) {
                    System.out.println("Students with Mobile Number " + mobNo + ":");
                    for (Student student : students) {
                        System.out.println(student);
                    }
                } else {
                    System.out.println("No student found with Mobile Number " + mobNo);
                }
                break;
            case 3:
                query = em.createQuery("SELECT s FROM Student s ORDER BY s.name");
                students = query.getResultList();
                if (!students.isEmpty()) {
                    System.out.println("All Students (Sorted by Name):");
                    for (Student student : students) {
                        System.out.println(student);
                    }
                } else {
                    System.out.println("No students found.");
                }
                break;
            case 4:
                query = em.createQuery("SELECT s FROM Student s ORDER BY s.age");
                students = query.getResultList();
                if (!students.isEmpty()) {
                    System.out.println("All Students (Sorted by Age):");
                    for (Student student : students) {
                        System.out.println(student);
                    }
                } else {
                    System.out.println("No students found.");
                }
                break;
            case 5:
                query = em.createQuery("SELECT s FROM Student s ORDER BY s.name");
                students = query.getResultList();
                if (!students.isEmpty()) {
                    System.out.println("All Students (Sorted by Name):");
                    for (Student student : students) {
                        System.out.println(student);
                    }
                } else {
                    System.out.println("No students found.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 5.");
        }
    }

    private static void updateRecord(EntityManager em, EntityTransaction et,Scanner scanner) {
        System.out.println("Update Record Menu:");
        System.out.println("1. Update by Mobile Number");
        System.out.println("2. Update by Student ID");
        System.out.print("Enter your choice: ");
        int updateChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (updateChoice) {
            case 1:
                System.out.print("Enter Mobile Number of the student to update: ");
                long mobNo = scanner.nextLong();
                scanner.nextLine(); // Consume newline character
                Query query = em.createQuery("SELECT s FROM Student s WHERE s.mob_no = :mobNo");
                query.setParameter("mobNo", mobNo);
                List<Student> students = query.getResultList();
                if (!students.isEmpty()) {
                    System.out.println("Enter new details:");
                    System.out.print("New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("New Age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    et.begin();
                    for (Student student : students) {
                        student.setName(newName);
                        student.setAge(newAge);
                        em.merge(student);
                    }
                    et.commit();
                    System.out.println("Record(s) updated successfully!");
                } else {
                    System.out.println("No student found with Mobile Number " + mobNo);
                }
                break;
            case 2:
                System.out.print("Enter Student ID to update: ");
                int sid = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                Student student = em.find(Student.class, sid);
                if (student != null) {
                    System.out.println("Enter new details:");
                    System.out.print("New Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("New Age: ");
                    int newAge = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    et.begin();
                    student.setName(newName);
                    student.setAge(newAge);
                    em.merge(student);
                    et.commit();
                    System.out.println("Record updated successfully!");
                } else {
                    System.out.println("No student found with ID " + sid);
                }
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }

    private static void deleteRecord(EntityManager em, EntityTransaction et, Scanner scanner) {
        System.out.println("Delete Student Record Menu:");
        System.out.println("1. Delete by Mobile Number");
        System.out.println("2. Delete by Student ID");
        System.out.print("Enter your choice: ");
        int deleteChoice = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        switch (deleteChoice) {
            case 1:
                System.out.print("Enter Mobile Number of the student to delete: ");
                long mobNo = scanner.nextLong();
                scanner.nextLine(); // Consume newline character
                Query query = em.createQuery("SELECT s FROM Student s WHERE s.mob_no = :mobNo");
                query.setParameter("mobNo", mobNo);
                List<Student> students = query.getResultList();
                if (!students.isEmpty()) {
                    et.begin();
                    for (Student student : students) {
                        em.remove(student);
                    }
                    et.commit();
                    System.out.println("Record(s) deleted successfully!");
                } else {
                    System.out.println("No student found with Mobile Number " + mobNo);
                }
                break;
            case 2:
                System.out.print("Enter Student ID to delete: ");
                int sid = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
                Student student = em.find(Student.class, sid);
                if (student != null) {
                    et.begin();
                    em.remove(student);
                    et.commit();
                    System.out.println("Record deleted successfully!");
                } else {
                    System.out.println("No student found with ID " + sid);
                }
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }
}
