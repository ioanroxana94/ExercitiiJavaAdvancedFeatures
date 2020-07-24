package entities;
import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name= "Delete_Employe_By_Age", query = "delete Employee where age > : age"),
        @NamedQuery(name= "Update_Employee_Job_Position_By_Age", query = "update Employee set jobPosition= :jobPosition where age > :age and age < :age "),
        @NamedQuery(name= "Select_Employee_By_Department", query = "select employee from Employee employee where employee.departmentName= :departmentName"),
        @NamedQuery(name= "Select_Department_And_Job_Position_By_Employee_Name", query= "select departmentName from Employee departmentName where departmentName.name = :name")
})


@Entity
@Table(name= "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name= "name")
    private String name;
    @Column(name= "surname")
    private String surname;
    @Column(name= "adress")
    private String adress;
    @Column(name= "age")
    private int age;
    @Column(name= "job_position")
    private String jobPosition;
    @Column(name= "department_name")
    private String departmentName;

    public Employee( String name, String surname, String adress, int age, String jobPosition, String departmentName){
        this.name=name;
        this.surname= surname;
        this.adress= adress;
        this.age=age;
        this.jobPosition= jobPosition;
        this.departmentName= departmentName;
    }
    public Employee(){

    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAdress() {
        return adress;
    }

    public int getAge() {
        return age;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", adress='" + adress + '\'' +
                ", age=" + age +
                ", jobPosition='" + jobPosition + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
