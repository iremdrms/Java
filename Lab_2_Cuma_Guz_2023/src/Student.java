public class Student {
    private String name,surname,gender,department,id;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setStudent(String name,String surname,String department,String id,String gender)
    {
        this.name=name;
        this.surname=surname;
        this.department=department;
        this.id=id;
        this.gender=gender;
    }

    public void displayStudentInfo ()
    {
        System.out.println("ID:"+getId()+"\nName:" +getName()+"\nSurname:"+getSurname()+"\nGender:"+getGender()+"\nDepartment:"+getDepartment());
    }
}
