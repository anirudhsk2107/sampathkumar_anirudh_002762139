/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Emp_Info;

import java.util.ArrayList;

/**
 *
 * @author Anirudh
 */
public class EmployeeHistory {
    
    private ArrayList<Employee> employeeList;
    
    public EmployeeHistory(){
        this.employeeList  = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    } 
    
    public Employee AddNewEmployee(){
        Employee newEmp = new Employee();
        employeeList.add(newEmp);
        return newEmp;
    }
}

