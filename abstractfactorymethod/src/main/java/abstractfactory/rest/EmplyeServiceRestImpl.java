package abstractfactory.rest;

import abstractfactory.service.IEmployeeService;

public class EmplyeServiceRestImpl implements IEmployeeService {
private static final String[] EMPLOYES= new String[]{"Juan","pedro","Manuel"};

    @Override
    public String[] getEmployee() {
        System.out.println("RestFul");
        return EMPLOYES;
    }
    
}
