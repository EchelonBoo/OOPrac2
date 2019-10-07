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
public class Employee extends StaffMember {

    private String socialSecurityNumber;
    private double payRate;

    public Employee() {
    }

    public Employee(String socialSecurityNumber, double payRate) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate = payRate;
    }

    public Employee(String socialSecurityNumber, double payRate, String name, String address, String phone) {
        super(name, address, phone);
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate = payRate;
    }
    

    /**
     * @return the socialSecurityNumber
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    /**
     * @param socialSecurityNumber the socialSecurityNumber to set
     */
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * @return the payRate
     */
    public double getPayRate() {
        return payRate;
    }

    /**
     * @param payRate the payRate to set
     */
    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }
       
    @Override
    public double pay() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String toString() {
        return "[Employee]" + 
               "\nName: " + getName() +
               "\nAddress:" + getAddress() + 
               "\nPhone:" + getPhone() + 
               "\nSocial Security Number: " + getSocialSecurityNumber() + 
               "\n Paid: " + pay();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o); //To change body of generated methods, choose Tools | Templates.
    }
    
    
  
}
