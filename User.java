
package Banking;

import java.io.*;
 
public class User implements Serializable{
private static final long serialVersionUID = -3238877699423376751L;

  public String name, gender, email;
  private String password;
  Account account;
  
    // creates new admin user
    public User(){
        name = "Njeke Mbai";
        gender = "Female";
        email = "admin";
        password = "12345";
    }
    //creates new general user
    public User(String na, String ge, String em, String pass) {
      this.name = na;
      this.gender = ge;
      this.email = em;
      this.password = pass;
    }
  
    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
  
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String getName(){
        return name;
    }
  
    public void setName(String name){
        this.name = name;
    }
  
    public String getGender(){
        return gender;
    }
  
    public void setGender(String gender){
        this.gender = gender;
    }
  
    public String toString(User user){
        String str = String.valueOf(user); 
        System.out.println(str);
        return str;

    }
}
