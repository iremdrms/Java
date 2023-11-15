public class Student {

    private String Name;
    private String Surname;
    private int Id;
    private String Department;
    private String Gender;

    public void setName(String name) {
        this.Name=name;
    }
    public String getName() {
        return Name;
    }

    public void setSurname(String surname) {
        this.Surname = surname;
    }

    public String getSurname() {
        return Surname;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public int getId() {
        return Id;
    }

    public void setDepartment(String department) {
        this.Department = department;
    }

    public String getDepartment() {
        return Department;
    }

    public void setGender(String gender) {
        this.Gender = gender;
    }

    public String getGender() {
        return Gender;
    }

    public void displayMessage()
    {
        System.out.println("Name: "+getName());
        System.out.println("Surname: "+getSurname());
        System.out.println("ID: "+ getId());
        System.out.println("Gender: "+ getGender());
        System.out.println("Department: "+getDepartment());

    }
}
