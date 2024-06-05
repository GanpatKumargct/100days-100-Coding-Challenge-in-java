package com.Ganpat.Challenge79;

public class EmpTest {
    public static void main(String[] args) {
        Employee emp  = new Employee("Ganpat",20,20000);
        System.out.println(emp.getEmpDetails());
        emp.setEmpName("Roy");
        System.out.println(emp.getEmpDetails());
    }
}
