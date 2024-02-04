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
}
