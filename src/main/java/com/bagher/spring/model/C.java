package com.bagher.spring.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "C")
@Data
public class C {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "C1")
    private String c1;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "a_id", nullable = false)
    private A a;

}
