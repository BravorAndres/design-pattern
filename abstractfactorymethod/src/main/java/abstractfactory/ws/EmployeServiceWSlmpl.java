package abstractfactory.ws;

import abstractfactory.service.IEmployeeService;

public class EmployeServiceWSlmpl implements IEmployeeService {

    private static final String[] EMPLOYEES= new String[]{"Maria","Rebeca","Liliana"};

    @Override
    public String[] getEmployee() {
        System.out.println("WebService");
        return EMPLOYEES;
    }
    
}
