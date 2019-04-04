/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ntercepting.filter.pattern;

/**
 *
 * @author datvl
 */
public class DebugFilter implements Filter {    public void execute(String request){       System.out.println("request log: " + request);    } }
