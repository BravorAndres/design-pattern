package abstractfactory.rest;

import abstractfactory.impl.IServiceStackAbstractFactory;
import abstractfactory.service.IEmployeeService;
import abstractfactory.service.IProductsService;

public class RestServiceStackImlp implements IServiceStackAbstractFactory{

    @Override
    public IEmployeeService getEmployeeService() {
        return new EmplyeServiceRestImpl();
    }

    @Override
    public IProductsService getProductsService() {
        return new ProductServiceRestImlp();
    }
    
    
}
