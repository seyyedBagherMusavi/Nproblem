package com.bagher.spring.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Objects;

@Entity
@Table(name = "D")
@Data
public class D {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "D1")
    private String d1;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "a_id", nullable = false)
    private A a;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        D d = (D) o;
        return id == d.id && Objects.equals(d1, d.d1);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, d1);
    }
}
