package entities;
import javax.persistence.*;

@NamedQueries({
        @NamedQuery(name= "Delete_Departaments_By_Number_Of_Employees", query = "delete Department where numberOfEmployees= : numberOfEmployees"),
        @NamedQuery(name= "Select_Floor_By_Department", query= "select floor from Department floor where floor.departmentName= :departmentName")
})

@Entity
@Table(name= "departments")
public class Department {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(name = "department_name")
    private String departmentName;
    @Column(name = "floor")
    private int floor;
    @Column(name = "number_of_employees")
    private int numberOfEmployees;
    @Column(name = "name_director_department")
    private String nameDirectorDepartment;

    public Department(String departmentName, int floor, int numberOfEmployees, String nameDirectorDepartment){
        this.departmentName= departmentName;
        this.floor= floor;
        this.numberOfEmployees= numberOfEmployees;
        this.nameDirectorDepartment= nameDirectorDepartment;
    }

    public Department(){

    }

    public int getId() {
        return id;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public int getFloor() {
        return floor;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getNameDirectorDepartment() {
        return nameDirectorDepartment;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setNameDirectorDepartment(String nameDirectorDepartment) {
        this.nameDirectorDepartment = nameDirectorDepartment;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", departmentName='" + departmentName + '\'' +
                ", floor=" + floor +
                ", numberOfEmployees=" + numberOfEmployees +
                ", nameDirectorDepartment='" + nameDirectorDepartment + '\'' +
                '}';
    }
}
