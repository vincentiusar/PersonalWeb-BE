package com.web.personalweb.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "certifications")

public class Certification {

    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "id")
    Integer id;

    @Column(name = "name", nullable = false)
    String name;

    @Column(name = "images", nullable = false)
    String images;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
