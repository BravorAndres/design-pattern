package abstractfactory;

import java.util.Arrays;

import abstractfactory.impl.IServiceStackAbstractFactory;
import abstractfactory.impl.ServiceStackAbstractFactory;
import abstractfactory.service.IEmployeeService;
import abstractfactory.service.IProductsService;


public class App 
{
    
    public static void main( String[] args )
    {
        IServiceStackAbstractFactory factory = ServiceStackAbstractFactory.createServiceFactory();
        IEmployeeService employeeService = factory.getEmployeeService();
        IProductsService productsService = factory.getProductsService();

        System.out.println("EmployeeServiceClass >"+employeeService.getClass().getCanonicalName());
        System.out.println("ProductServiceClass >"+productsService.getClass().getCanonicalName());
        System.out.println("GetEmployee >"+Arrays.toString(employeeService.getEmployee()));
        System.out.println("GetProduct >"+Arrays.toString(productsService.getProducts()));
    }
}
