package com.tts.TechTalentTwitter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Long id;
    private String role;
    

    public String getRole() {
    return role;
    }

    public void setRole(String role) {
    this.role = role;
    }

    public Long getId() {
    return id;
    }

    @Override
    public String toString() {
    return "Role [id=" + id + ", role=" + role + "]";
    }
    
    
}
