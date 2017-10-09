package com.company;

import javafx.geometry.Pos;

public class Employee {
    double totalPay;

   //private variables.
   private String employeeName;
   private PositionTitle  employeePosition;
   private boolean employeeSalary;
   private double payRate;
   private int employeeShift;
   private String startDate;

   //constructor method
    public Employee(String employeeName, PositionTitle employeePosition, boolean employeeSalary, double payRate, int employeeShift, String startDate) {
        this.employeeName = employeeName;
        this.employeePosition = employeePosition;
        this.employeeSalary = employeeSalary;
        this.payRate = payRate;
        this.employeeShift = employeeShift;
        this.startDate = startDate;
    }

    //setters and getters
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public PositionTitle getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(PositionTitle employeePosition) {
        this.employeePosition = employeePosition;
    }

    public boolean isEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(boolean employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
    public int getEmployeeShift() {
        return employeeShift;
    }

    public void setEmployeeShift(int employeeShift) {
        this.employeeShift = employeeShift;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    //method to display the information


    public double calculateSalary(int hours){





            if(hours > 40){
                int overTime = hours - 40;
                totalPay = (40 *  payRate) + (overTime * (payRate * 1.5));

            }else {
                totalPay = hours * payRate;
            }


        return totalPay;
    }



    public void displayInfo(){
        System.out.println("Employee name: " + employeeName + "\nEmployee position: " + employeePosition +
                "\nEmployee shift: " + employeeShift +
                "\nEmployee pay rate: " + payRate + " per hour\n" +
                employeeName + " earned "  + totalPay + " this week.\n" +
                "Employee starting date: " + startDate + "\n");
    }
}

