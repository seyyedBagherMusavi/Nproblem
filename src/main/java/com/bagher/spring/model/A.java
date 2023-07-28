package com.bagher.spring.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "A")
@Data
public class A {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "A1")
	private String a1;

	@Column(name = "A2")
	private String a2;

	@Column(name = "A3")
	private String a3;

	@Column(name = "A4")
	private String a4;

	@Column(name = "A5")
	private String a5;

	@Column(name = "A6")
	private String a6;

	@Column(name = "A7")
	private String a7;

	@Column(name = "A8")
	private String a8;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "a")
//	@Fetch(FetchMode.SUBSELECT)
	private Set<B> bSet;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "a")
//	@Fetch(FetchMode.SUBSELECT)
	private Set<C> cSet;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "a")
//	@Fetch(FetchMode.SUBSELECT)
	private Set<D> dSet;

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		A a = (A) o;
		return id == a.id && Objects.equals(a1, a.a1) && Objects.equals(a2, a.a2) && Objects.equals(a3, a.a3) && Objects.equals(a4, a.a4) && Objects.equals(a5, a.a5) && Objects.equals(a6, a.a6) && Objects.equals(a7, a.a7) && Objects.equals(a8, a.a8);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, a1, a2, a3, a4, a5, a6, a7, a8);
	}
}
