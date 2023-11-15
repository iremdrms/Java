import java.util.Scanner;

public class StudentTest {

    public static void main(String[] args) {

        Student sObj1 = new Student();

        sObj1.setStudent("Zeynep","Kaplan","Ebe","12","Kadın");
        sObj1.displayStudentInfo();
        System.out.println("-----------------------");
        sObj1.setDepartment("Yazılım");
        sObj1.displayStudentInfo();
        System.out.println("Department: "+sObj1.getDepartment());

        Scanner input = new Scanner(System.in);
        System.out.print("Name?:");
        String name = input.next();
        System.out.print("Surname?:");
        String surname = input.next();
        System.out.print("Department?:");
        String department = input.next();
        System.out.print("Gender?:");
        String gender = input.next();
        System.out.print("ID?:");
        String id = input.next();

        Student sObj2 = new Student();
        sObj2.setName(name);
        sObj2.setSurname(surname);
        sObj2.setDepartment(department);
        sObj2.setGender(gender);
        sObj2.setId(id);

        sObj2.displayStudentInfo();

        Student sObj3 = new Student();
        sObj3.displayStudentInfo();


    }
}
