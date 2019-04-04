package business.delegate.pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author datvl
 */
public class BusinessDelegatePatternDemo {

    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");
        Client client = new Client(businessDelegate);
        client.doTask();
        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
