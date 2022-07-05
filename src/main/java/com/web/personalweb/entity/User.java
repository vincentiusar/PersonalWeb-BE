package com.web.personalweb.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "id")
    Integer id;

    @Column(name = "username", nullable = false)
    String username;

    @Column(name = "full_name", nullable = false)
    String full_name;

    @Column(name = "password", nullable = false)
    String password;

    @Column(name = "skill")
    String skill;

    @Column(name = "about")
    String about;

    @Column(name = "major")
    String major;

    @Column(name = "institution")
    String institution;

    @Column(name = "images")
    String images;
}
