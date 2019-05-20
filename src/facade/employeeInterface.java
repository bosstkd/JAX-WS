/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import beans.employee;

/**
 *
 * @author administrateur
 */
public interface employeeInterface {
    public employee getEmployeeById(String id);
}
