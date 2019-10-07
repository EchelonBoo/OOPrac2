/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical2;

/**
 *
 * @author K00230399
 */
public class Hourly extends Employee{
    
    private double hoursWorked;
    
        /**
     * @return the hoursWorked
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Hourly() {
    }

    public Hourly(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Hourly(double hoursWorked, String socialSecurityNumber, double payRate) {
        super(socialSecurityNumber, payRate);
        this.hoursWorked = hoursWorked;
    }

    public Hourly(double hoursWorked, String socialSecurityNumber, double payRate, String name, String address, String phone) {
        super(socialSecurityNumber, payRate, name, address, phone);
        this.hoursWorked = hoursWorked;
    }
    
    public void addHours(double hours){
        this.hoursWorked += hours;
    }
    
    public void subtractHours(double hours){
        this.hoursWorked -= hours;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "[Hourly]" + 
               "\nName: " + getName() +
               "\nAddress:" + getAddress() + 
               "\nPhone:" + getPhone() + 
               "\nSocial Security Number: " + getSocialSecurityNumber() + 
               "\nCurrent Hours: " + getHoursWorked() +
               "\n Paid: " + pay();
    }
    @Override
    public double pay(){
        return getPayRate() * getHoursWorked();
    }


}
