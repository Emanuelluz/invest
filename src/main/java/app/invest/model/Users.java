package app.invest.model;


import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table()
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private String email;
    private String mobile;


}