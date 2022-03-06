package modules;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Listings {@Column
    private int id;
	@Column
    private String Company_Name;
	@Column
    private String lastName;
	@Column
    private String location;
	@Column
    private String city;
	@Column
    private Integer number;
	@Column
    private String aplicants;
	@Column
    private Integer availbleslots;
	
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//generating an primary key for each values
    public int getId() {
        return id;
    }//getting value for each column

    public void setId(int id) {
        this.id = id;
    }//setting each value in the column

    public String getCompany_Name() {
        return Company_Name;
    }

    public void setCompany_Name(String Company_Name) {
        this.Company_Name = Company_Name;
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

    public String getaplicants() {
        return aplicants;
    }

    public void setaplicants(String aplicants) {
        this.aplicants = aplicants;
    }
    
    public void setnumber(Integer number) {
        this.number = number;
        
    }
}

