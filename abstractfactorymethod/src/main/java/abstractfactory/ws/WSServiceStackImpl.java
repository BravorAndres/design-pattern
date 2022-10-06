package abstractfactory.ws;

import abstractfactory.impl.IServiceStackAbstractFactory;
import abstractfactory.service.IEmployeeService;
import abstractfactory.service.IProductsService;

public class WSServiceStackImpl implements IServiceStackAbstractFactory {

    @Override
    public IEmployeeService getEmployeeService() {
        return new EmployeServiceWSlmpl();
    }

    @Override
    public IProductsService getProductsService() {
        return new ProductServiceWSImpl();
    }
    
}
