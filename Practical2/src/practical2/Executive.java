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
public class Executive extends Employee {
    
    private double bonus;
    
        /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Executive() {
    }

    public Executive(double bonus) {
        this.bonus = bonus;
    }

    public Executive(double bonus, String socialSecurityNumber, double payRate) {
        super(socialSecurityNumber, payRate);
        this.bonus = bonus;
    }

    public Executive(double bonus, String socialSecurityNumber, double payRate, String name, String address, String phone) {
        super(socialSecurityNumber, payRate, name, address, phone);
        this.bonus = bonus;
    }
    
    public void awardBonus(double bonus){
        this.bonus = bonus;
    }
    
    public void resetBonus(){
        this.bonus = 0.0;
    }

       @Override
    public String toString() {
        return "[Executive]" + 
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
    
    @Override
    public double pay(){
        return getPayRate() + getBonus();
    }


}
