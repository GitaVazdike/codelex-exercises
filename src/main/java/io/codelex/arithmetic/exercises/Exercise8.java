package io.codelex.arithmetic.exercises;

public class Exercise8 {
    private final String employeeID;
    private final double basePay;
    private final int hoursWorked;

    public Exercise8(String employee, double basePay, int hoursWorked) {
        this.employeeID = employee;
        this.basePay = basePay;
        this.hoursWorked = hoursWorked;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public double getBasePay() {
        return basePay;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public String calculatePay() {
        int standardWorkHours = 40;
        int hoursWorkedForBasePay;
        int hoursWorkedOvertime;
        double totalPay;

        if (this.getHoursWorked() > 60) {
            return "Error: The number of hours worked for " + this.getEmployeeID() + " is: " + this.getHoursWorked() + ". Not allowed to work more than 60 hours.";
        }
        if (this.getBasePay() < 8.00) {
            return "Error: The base pay for " + this.getEmployeeID() + " is " + this.getBasePay() + ". Base pay must not be less than $8.00 an hour.";
        }

        if (this.getHoursWorked() > standardWorkHours) {
            hoursWorkedForBasePay = standardWorkHours;
            hoursWorkedOvertime = this.getHoursWorked() - standardWorkHours;
            totalPay = hoursWorkedForBasePay * this.getBasePay() + hoursWorkedOvertime * (this.getBasePay() * 1.50);
        } else {
            hoursWorkedForBasePay = this.getHoursWorked();
            totalPay = hoursWorkedForBasePay * this.getBasePay();
        }
        return this.getEmployeeID() + " total pay is: " + totalPay;
    }

    public static void main(String[] args) {
        Exercise8 employee1 = new Exercise8("Employee1", 7.50, 35);
        Exercise8 employee2 = new Exercise8("Employee2", 8.20, 47);
        Exercise8 employee3 = new Exercise8("Employee3", 10.00, 73);

        System.out.println(employee1.calculatePay());
        System.out.println(employee2.calculatePay());
        System.out.println(employee3.calculatePay());
    }

}
