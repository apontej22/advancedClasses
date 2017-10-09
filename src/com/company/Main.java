package com.company;

public class Main {

    public static void main(String[] args) {


    Employee employee1 = new Employee("Isabel Flores", PositionTitle.SECRETARIAL,
                                      true, 19.50, 1, "07/05/2015");
    Employee employee2 = new Employee("Maria Martinez", PositionTitle.PRODUCTION,
                                      false, 14.50, 3, "04/28/2012");
    Employee employee3 = new Employee("Joshua Smith", PositionTitle.TECHNICAL,
                                      true, 28.50, 2, "06/10/2011");



    employee1.displayInfo();
    employee1.calculateSalary(40);
    employee2.displayInfo();
    employee1.calculateSalary(35);
    employee3.displayInfo();
    employee1.calculateSalary(50);
    }
}

