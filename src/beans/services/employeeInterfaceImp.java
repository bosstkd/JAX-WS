/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.services;

import beans.employee;
import facade.employeeInterface;
import javax.jws.WebService;

/**
 *
 * @author administrateur
 */
@WebService
public class employeeInterfaceImp implements employeeInterface{

    @Override
    public employee getEmployeeById(String id) {
        return new employee("1", "Mahmoudi", "Java developper");
    }
    
}
