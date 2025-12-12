package ProxyDesignPattern.Employee;

public class EmployeeDaoProxy implements EmployeeDao {

    EmployeeDao employeeDao;

    EmployeeDaoProxy(EmployeeDao employeeDao){
        this.employeeDao = employeeDao;
    }

    public EmployeeDaoProxy(){
        this.employeeDao = new EmployeeDaoImpl();
    }


    @Override
    public void create(String client, EmployeeModel employeeModel) throws Exception {
        if(client.equals("ADMIN")){
            employeeDao.create(client, employeeModel);
        }else{
            throw new Exception("ACCESS DENIED!");
        }
    }

    @Override
    public void delete(String client, String employeeId) throws Exception {
        if(client.equals("ADMIN")){
            employeeDao.delete(client, employeeId);
        }else{
            throw new Exception("ACCESS DENIED!");
        }
    }

    @Override
    public void get(String client, String employeeId) throws Exception {
        if(client.equals("ADMIN") || client.equals("USER")){
            employeeDao.get(client, employeeId);
        }else{
            throw new Exception("ACCESS DENIED!");
        } 
    }
}
