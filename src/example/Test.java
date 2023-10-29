package example;

import example.client.CalTaxServiceLocator;
import example.client.CalTax_PortType;

public class Test {
    public static void main(String[] argv) {
        try {
            CalTaxServiceLocator locator = new CalTaxServiceLocator();
            CalTax_PortType service = locator.getCalTax();
            System.out.println(service.calTax("20000"));
        } catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
    }
}