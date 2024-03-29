package com.Spring.SpringBootMysql.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity //model 
@Table(name = "users") // menunjukkan model ni drpd table mana (dalam database)
public class User {
    @Id //this is for it automatic know it is an id field
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String username;
    
    @NotBlank
    private String password;

    @NotBlank
    private String email;

    @NotBlank
    private Boolean enabled;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getEnabled() {
        return enabled;
    }
}
