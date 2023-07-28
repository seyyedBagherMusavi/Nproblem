package com.bagher.spring.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "B")
@Data
public class B {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "B1")
    private String b1;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "a_id", nullable = false)
    private A a;

}
