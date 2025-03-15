package com.workintech.developers;

import java.sql.SQLOutput;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[10];
        this.midDevelopers = new MidDeveloper[5];
        this.seniorDevelopers = new SeniorDeveloper[2];
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
        setSalary(getSalary() + 40000);
    }

    public void addEmployee(JuniorDeveloper employee) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = employee;
                System.out.println(employee.getName() + " has been added to Junior Developers.");
                return;
            }
        }
        System.out.println("No space available in Junior Developers team.");
    }

    public void addEmployee(MidDeveloper employee) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = employee;
                System.out.println(employee.getName() + " has been added to Mid Developers.");
                return;
            }
        }
        System.out.println("No space available in Mid Developers team.");
    }

    public void addEmployee(SeniorDeveloper employee) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = employee;
                System.out.println(employee.getName() + " has been added to Senior Developers.");
                return;
            }
        }
        System.out.println("No space available in Senior Developers team.");
    }
}
