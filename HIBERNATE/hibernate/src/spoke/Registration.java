package spoke;
// Generated Mar 21, 2019 1:58:20 PM by Hibernate Tools 4.3.1



/**
 * Registration generated by hbm2java
 */
public class Registration  implements java.io.Serializable {


     private String email;
     private String firstName;
     private String lastName;
     private Integer phoneNumber;

    public Registration() {
    }

	
    public Registration(String email) {
        this.email = email;
    }
    public Registration(String email, String firstName, String lastName, Integer phoneNumber) {
       this.email = email;
       this.firstName = firstName;
       this.lastName = lastName;
       this.phoneNumber = phoneNumber;
    }
   
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Integer getPhoneNumber() {
        return this.phoneNumber;
    }
    
    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




}


