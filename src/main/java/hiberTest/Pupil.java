package hiberTest;

import javax.persistence.*;

@Entity
@Table(name = "pupil")
@NamedQuery(name = "Pupil.getAll", query = "SELECT c from Pupil c")
public class Pupil {
    @Id
    @Column(name = "ID")
    @GeneratedValue
    private Integer Id;

    @Column(name = "role")
    private String role;


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "age")
    private Integer age;

    @Column(name = "gender")
    private String gender;

    @Column(name = "school")
    private String school;

    public Pupil() {

    }
    public Pupil(String role, String login, String password, Integer age, String gender, String school) {
        this.role = role;
        this.login = login;
        this.password = password;
        this.age = age;
        this.gender = gender;
        this.school = school;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
