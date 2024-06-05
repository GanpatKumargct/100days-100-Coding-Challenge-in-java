package com.Ganpat.Challenge79;

public class Employee {
    private String empName;
    private  int empAge;
    private double salarly;

    public Employee(String empName, int empAge, double salarly) {
        this.empName = empName;
        this.empAge = empAge;
        this.salarly = salarly;
    }

    String getEmpDetails(){
        return  "Employee Detail :\n Name : " +empName+
                ", Age "+empAge+", Salarly : "+salarly;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public double getSalarly() {
        return salarly;
    }

    public void setSalarly(double salarly) {
        this.salarly = salarly;
    }
}
