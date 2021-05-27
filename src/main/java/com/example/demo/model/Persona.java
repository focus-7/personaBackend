package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table (name= "persona")
public class Persona {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private int edad;	
	private long identificacion;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date fecha_nacimiento;
	
	@ManyToOne
	@JoinColumn(name = "id_pais")
	private Pais pais;
	@ManyToOne
	@JoinColumn(name = "id_estado")
	private Estado estado;
	
	
	public Persona(String nombre, int edad, long identificacion, Date fecha_nacimiento, Pais pais, Estado estado) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.identificacion = identificacion;
		this.fecha_nacimiento = fecha_nacimiento;
		this.pais = pais;
		this.estado = estado;
	}
	
	public Persona() {}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public long getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(long identificacion) {
		this.identificacion = identificacion;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
}
