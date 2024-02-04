package com.doccache.core.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "t_profiles")
public class Profile {
    @Id
    private UUID id;
    @Column(length = 45)
    private String name;
    @Column(length = 45)
    private String otherName;
    @Column(length = 15)
    private String phoneNo;
    @Column(length = 45)
    private String email;
    @Column(length = 45)
    private String country;
    @Column(length = 45)
    private String province;
    @Column(length = 45)
    private String city;
    @OneToOne
    @JoinColumn(name = "userId")
    private UserInfo userInfo;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
