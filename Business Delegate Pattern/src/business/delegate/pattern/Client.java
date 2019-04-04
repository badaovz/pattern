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
public class Client {      BusinessDelegate businessService;     public Client(BusinessDelegate businessService){       this.businessService  = businessService;    }     public void doTask(){         businessService.doTask();    } }
