/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate_spoke;

import java.io.Serializable;
import javax.persistence.*;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Giovanni
 */
@Entity
@Table(name = "registration")

public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "firstName")
    private String firstName;
    
    @Column(name = "SID")
    private Integer sid;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }


    public String toString() {
        return Integer.toString(id) + " " + firstName +  " " + sid;
    }



    
    
}
