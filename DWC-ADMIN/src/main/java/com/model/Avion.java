package com.model;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "DIM_AVION")
public class Avion implements Serializable {

	private static final long serialVersionUID = 7751572660823042279L;

	@Id
	@Column(name = "id", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DIM_AVION_SEQ")
	@SequenceGenerator(name = "DIM_AVION_SEQ", sequenceName = "DIM_AVION_SEQ", allocationSize = 1, initialValue = 1)
	private Integer id;
	@Column(name = "imm", unique = true, nullable = false)
	private String imm;
	@Column(name = "appareil", unique = false, nullable = false)
	private String appareil;
	@Column(name = "capacite", unique = false, nullable = false)
	private Integer capacite;
	@Column(name = "tuaff", unique = false, nullable = false)
	private String tuaff;
	@Column(name = "cowner", unique = false, nullable = false)
	private String cowner;
	@Column(name = "dentree", unique = false, nullable = false)
	private Date dentree;
	@Column(name = "dsortie", unique = false, nullable = false)
	private Date dsortie;
	@Column(name = "type", unique = false, nullable = false)
	private String type;
	@Column(name = "nowner", unique = false, nullable = false)
	private String nowner;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getImm() {
		return imm;
	}

	public void setImm(String imm) {
		this.imm = imm;
	}

	public String getAppareil() {
		return appareil;
	}

	public void setAppareil(String appareil) {
		this.appareil = appareil;
	}

	public Integer getCapacite() {
		return capacite;
	}

	public void setCapacite(Integer capacite) {
		this.capacite = capacite;
	}

	public String getTuaff() {
		return tuaff;
	}

	public void setTuaff(String tuaff) {
		this.tuaff = tuaff;
	}

	public String getCowner() {
		return cowner;
	}

	public void setCowner(String cowner) {
		this.cowner = cowner;
	}

	public Date getDentree() {
		return dentree;
	}

	public void setDentree(Date dentree) {
		this.dentree = dentree;
	}

	public Date getDsortie() {
		return dsortie;
	}

	public void setDsortie(Date dsortie) {
		this.dsortie = dsortie;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNowner() {
		return nowner;
	}

	public void setNowner(String nowner) {
		this.nowner = nowner;
	}

}
