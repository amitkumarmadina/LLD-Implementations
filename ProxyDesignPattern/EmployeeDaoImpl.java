package ProxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{
     
    public void create(String client, EmployeeDo obj) throws Exception{
     System.out.println("Create new row in the Employee table");   
    }

     
    public void delete(String client, int employeeId) throws Exception{
        System.out.println("deleted row with employeeId");
    }
     
    public EmployeeDo get(String client, int temployeeId) throws Exception{
        System.out.println("fetching data from DB");
        return new EmployeeDo();
    }
 
}
