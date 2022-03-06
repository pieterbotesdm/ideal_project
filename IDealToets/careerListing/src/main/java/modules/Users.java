
package modules;

import javax.persistence.*;

@Entity
public class Users {
	@Column
    private int id;
	@Column
    private String firstName;
	@Column
    private String lastName;
	@Column
    private String location;
	@Column
    private String city;
	@Column
    private Integer number;
	
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//generating an primary key for each values
    public int getId() {
        return id;
    }//getting value for each column

    public void setId(int id) {
        this.id = id;
    }//setting each value in the column

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
 
    public String getcity() {
        return city;
    }

    public void setcity(String city) {
        this.city = city;
    }
    
    public Integer getnumber() {
        return number;
    }

    public void setnumber(Integer number) {
        this.number = number;
        
    }
}
