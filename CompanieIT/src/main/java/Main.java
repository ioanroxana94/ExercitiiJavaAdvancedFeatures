import entities.Department;
import entities.Employee;
import entities.Product;
import org.hibernate.Session;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*Sa se modeleze o companie IT.
        Vom avea:
        - O clasa Employee: cu nume, prenume, adresa, varsta, nume departament, functie
        - O clasa Department: nume, etajul, nr de angajati, nume sef departament
        - O clasa Product: nume, versiunea, numar de clienti, pret */




        // Sa se salveze cel putin 10 angajati, 5 departamente, 5 produse
        // ANGAJATI

        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        Metadata metadata= new MetadataSources(serviceRegistry).getMetadataBuilder().build();
        Session session= metadata.getSessionFactoryBuilder().build().openSession();

        session.beginTransaction();
        Employee employee= new Employee("Grigorescu", "Andrei", "Galati, strada Frunzei", 38, "Web developer", "IT department");
        session.save(employee);
        session.getTransaction().commit();

        session.beginTransaction();
        Employee employee1= new Employee("Anghel", "Florin", "Galati, strada Oltului", 30, "Human Resources", "HR department");
        session.save(employee1);
        session.getTransaction().commit();

        session.beginTransaction();
        Employee employee2= new Employee("Chirnoaga", "Mirela", "Braila, strada Morunului", 43, "Manager human resources", "HR department");
        session.save(employee2);
        session.getTransaction().commit();

        session.beginTransaction();
        Employee employee3=  new Employee("Popescu", "Olivia", "Galati, strada Frunzei", 25, "Junior software developer", "IT department");
        session.save(employee3);
        session.getTransaction().commit();

        session.beginTransaction();
        Employee employee4=  new Employee("Georgescu", "Alin", "Galati, Tiglina 2", 37, "Financial manager", "Finance depertment");
        session.save(employee4);
        session.getTransaction().commit();

        session.beginTransaction();
        Employee employee5=  new Employee("Alexandrescu", "Lucian", "Galati, strada Mihai Eminescu", 46, "Customer and Trade Insights", "Marketing department");
        session.save(employee5);
        session.getTransaction().commit();

        session.beginTransaction();
        Employee employee6=  new Employee("Cristache", "Andrei", "Galati, Tiglina 3", 66, "Contability", "Finance department");
        session.save(employee6);
        session.getTransaction().commit();

        session.beginTransaction();
        Employee employee7=  new Employee("Tufa", "Liliana", "Galati, Parc C.F.R.", 44, "Brand management", "Marketing department");
        session.save(employee7);
        session.getTransaction().commit();

        session.beginTransaction();
        Employee employee8=  new Employee("Dorin", "Mircea", "Galati, General", 27, "Database administrator", "Productipn department");
        session.save(employee8);
        session.getTransaction().commit();

        session.beginTransaction();
        Employee employee9=  new Employee("Tanasaciuc", "Grigore", "Galati, str. Furnalistilor", 29, "Industrial strategy", "Production department");
        session.save(employee9);
        session.getTransaction().commit();

        session.beginTransaction();
        Employee employee10=  new Employee("Ioan", "Roxana", "Galati. str. Molidului", 26, "Sales manager", "Sales department");
        session.save(employee10);
        session.getTransaction().commit();

        //DEPARTAMENTE

        session.beginTransaction();
        Department department=  new Department("Finance department", 2,5, "Cujba Andrei");
        session.save(department);
        session.getTransaction().commit();

        session.beginTransaction();
        Department department1= new Department("IT department", 3, 7, "Ilie Cosmin");
        session.save(department1);
        session.getTransaction().commit();

        session.beginTransaction();
        Department department2= new Department("Production department", 3, 4, "Bujor Maria");
        session.save(department2);
        session.getTransaction().commit();

        session.beginTransaction();
        Department department3= new Department("Marketing department", 2, 6, "Argatu Bogdan");
        session.save(department3);
        session.getTransaction().commit();

        session.beginTransaction();
        Department department4= new Department("HR department", 1, 3, "Dumitriu Camelia");
        session.save(department4);
        session.getTransaction().commit();

        session.beginTransaction();
        Department department5= new Department("Sales department", 1, 8, "Nastase Eduard");
        session.save(department5);
        session.getTransaction().commit();

        //PRODUSE
        session.beginTransaction();
        Product product= new Product("Nvidia geforce", "gtx 1050", 10, 1500);
        session.save(product);
        session.getTransaction().commit();

        session.beginTransaction();
        Product product1= new Product("AMD Ryzen 5", "3rd generation", 15, 1032);
        session.save(product1);
        session.getTransaction().commit();

        session.beginTransaction();
        Product product2= new Product("Placa de baza MSI", "B450M PRO-VDH MAX", 25, 373);
        session.save(product2);
        session.getTransaction().commit();

        session.beginTransaction();
        Product product3= new Product("Cooler procesor ID-Cooling", "Frostflow X 240", 10, 299);
        session.save(product3);
        session.getTransaction().commit();

        session.beginTransaction();
        Product product4= new Product("Memorie ADATA XPG Gammix", "D10", 40, 429);
        session.save(product4);
        session.getTransaction().commit();

        session.beginTransaction();
        Product product5= new Product("Carcasa Deepcool", "MATREXX55", 10, 278);
        session.save(product5);
        session.getTransaction().commit();



        // Sa se stearga angajatii cu varsta > 65 ani
        session.beginTransaction();
        Query deleteEmployeeByAgeQuery =  session.createNamedQuery("Delete_Employe_By_Age");
        deleteEmployeeByAgeQuery.setParameter("age", 65);
        int result= deleteEmployeeByAgeQuery.executeUpdate();
        System.out.println("Rezultatul este: " + result);
        session.getTransaction().commit();


        // Sa se stearga departamentele care nu anu nici un angajat
        session.beginTransaction();
        Query deleteDepartmentByNumberOfEmployeesQuery= session.createNamedQuery("Delete_Departaments_By_Number_Of_Employees");
        deleteDepartmentByNumberOfEmployeesQuery.setParameter("numberOfEmployees", 0);
        result= deleteDepartmentByNumberOfEmployeesQuery.executeUpdate();
        System.out.println("Rezultateul este: " + result);
        session.getTransaction().commit();

        // Sa se stearga produsele care au mai putin de 10 clienti
        session.beginTransaction();
        Query deleteProductByNumberOfClientsQuery= session.createNamedQuery("Delete_Product_By_Number_Of_Clients");
        deleteProductByNumberOfClientsQuery.setParameter("numberOfClients", 10);
        result= deleteProductByNumberOfClientsQuery.executeUpdate();
        System.out.println("Rezultatul este: " + result);
        session.getTransaction().commit();

        // Sa se mareasca pretul tuturor produselor cu 20%


        // Sa se modifice functia angajatilor cu varsta intre 35 si 40 ani
        session.beginTransaction();
        Query updateEmployeeJobPositionByAge= session.createNamedQuery("Update_Employee_Job_Position_By_Age");
        updateEmployeeJobPositionByAge.setParameter("jobPosition", "manager");
        updateEmployeeJobPositionByAge.setParameter("age", 35);
        updateEmployeeJobPositionByAge.setParameter("age", 40);
        result= updateEmployeeJobPositionByAge.executeUpdate();
        System.out.println("Rezultatul este: " + result);
        session.getTransaction().commit();

        // Sa se afiseze angajatii dintr-un anumit departament
        session.beginTransaction();
        Query selectEmployeeByDepartmentQuery= session.createNamedQuery("Select_Employee_By_Department");
        selectEmployeeByDepartmentQuery.setParameter("departmentName", "IT department");
        List<Employee> resultSelectEmployee= selectEmployeeByDepartmentQuery.getResultList();

        for (Employee employeeResult : resultSelectEmployee){
            System.out.println("Rezultatul este: " + employeeResult);
        }
        session.getTransaction().commit();

        // Sa se afiseze produsele care au mai mult de 200 de clienti
        session.beginTransaction();
        Query selectProductByNumberOfClientsQuery= session.createNamedQuery("Select_Product_By_Number_Of_Clients");
        selectProductByNumberOfClientsQuery.setParameter("numberOfClients", 200);
        List<Product> resultSelectProduct= selectProductByNumberOfClientsQuery.getResultList();

        for (Product productResult : resultSelectProduct){
            System.out.println("Rezultatul este: " + productResult);
        }
        session.getTransaction().commit();

        // Sa se afiseze etajul unui anumit departament
        session.beginTransaction();
        Query selectFloorByDepartmentQuery= session.createNamedQuery("Select_Floor_By_Department");
        selectFloorByDepartmentQuery.setParameter("departmentName", "Marketing department");
        List<Department> resultSelectFloor= selectFloorByDepartmentQuery.getResultList();

        for (Department floorResult: resultSelectFloor){
            System.out.println("Rezultatul este: " + floorResult);
        }
        session.getTransaction().commit();

        // Sa se afiseze departamentul si functia unui anumit angajat
        session.beginTransaction();
        Query selectDepartmentAndFunctionByNameEmployee= session.createNamedQuery("Select_Department_And_Job_Position_By_Employee_Name");
        selectDepartmentAndFunctionByNameEmployee.setParameter("name", "Tufa");
        List<Employee> resultDepartmentAndFunction= selectDepartmentAndFunctionByNameEmployee.getResultList();

        for (Employee departmentFunctionResult: resultDepartmentAndFunction){
            System.out.println("Rezultatul este: " + departmentFunctionResult);
        }
        session.getTransaction().commit();

        // Sa se afisez versiunea unui anumit produs
        session.beginTransaction();
        Query selectVersionByProductName= session.createNamedQuery("Select_Version_By_Product_Name");
        selectVersionByProductName.setParameter("productName", "Nvidia geforce");
        List<Product> resultSelectVersion= selectVersionByProductName.getResultList();

        for (Product resultVersion : resultSelectVersion){
            System.out.println("Rezultatul este: " + resultVersion);
        }
        session.getTransaction().commit();
    }
}
