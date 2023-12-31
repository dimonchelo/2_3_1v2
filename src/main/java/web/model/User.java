package web.model;

import org.springframework.stereotype.Controller;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @NotEmpty(message = "name empty" )
    @Size(min = 2, max = 30, message = "name size [2-30]")
    @Pattern(regexp = "[A-Za-z]+", message = "only A-Z , a-z")
    @Column(name = "name")
    private String name;
    @NotEmpty(message = "lastname empty" )
    @Size(min = 2, max = 30, message = "lastname size [2-30]")
    @Pattern(regexp = "[A-Za-z]+", message = "only A-Z , a-z")
    @Column(name = "lastName")
    private String lastName;
    public User() {
    }
    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
