package com.mbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import com.model.Avion;
import com.services.IAvionService;

@ManagedBean(name = "avionMB")
@SessionScoped
public class AvionManagedBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2752278168549954578L;

	@ManagedProperty(value = "#{AvionService}")
	IAvionService avionService;

	private Integer id;
	private String imm;
	private String appareil;
	private Integer capacite;
	private Integer id_action;
	private String tuaff;
	private String cowner;
	private Date dentree;
	private Date dsortie;
	private String type;
	private String nowner;
	List<Avion> avionList;
	private String mat_search;
	private String airl_search;

	private Avion selectedAvion;
	
	List<Avion> selectedAvions;

	/**
	 * Get Avion List
	 * 
	 */
	public List<Avion> getAvionList() {
		avionList = new ArrayList<Avion>();
		avionList.addAll(getAvionService().getAvionsSearch(this.mat_search,this.airl_search));
		return avionList;
	}
	
	/**
	 * Save new avion
	 * 
	 */
	public void saveNewAvion(){
		Avion nouveauAvion = new Avion();
		nouveauAvion.setImm(imm);
		nouveauAvion.setAppareil(appareil);
		nouveauAvion.setCapacite(capacite);
		nouveauAvion.setTuaff(tuaff);
		nouveauAvion.setCowner(cowner);
		nouveauAvion.setNowner(nowner);
		nouveauAvion.setDentree(dentree);
		nouveauAvion.setDsortie(dsortie);
		nouveauAvion.setType(type);
		getAvionService().addAvion(nouveauAvion);
	}
	
	/**
	 * Update avion
	 * 
	 */
	public void updateAvion(){
		getAvionService().updateAvion(selectedAvion);
	}
	
	/**
	 * delete Selected Avion
	 */
	public void deleteSelectedAvion(){
		getAvionService().deleteAvion(selectedAvion);
	}

	/**
	 * Set Avion List
	 * 
	 * @param List
	 *            - Avion List
	 */
	public void setAvionList(List<Avion> avionList) {
		this.avionList = avionList;
	}

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

	public Integer getId_action() {
		return id_action;
	}

	public void setId_action(Integer id_action) {
		this.id_action = id_action;
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

	public IAvionService getAvionService() {
		return avionService;
	}

	public void setAvionService(IAvionService avionService) {
		this.avionService = avionService;
	}

	public String getMat_search() {
		return mat_search;
	}

	public void setMat_search(String mat_search) {
		this.mat_search = mat_search;
	}

	public String getAirl_search() {
		return airl_search;
	}

	public void setAirl_search(String airl_search) {
		this.airl_search = airl_search;
	}

	public Avion getSelectedAvion() {
		return selectedAvion;
	}

	public void setSelectedAvion(Avion selectedAvion) {
		this.selectedAvion = selectedAvion;
	}

	public List<Avion> getSelectedAvions() {
		return selectedAvions;
	}

	public void setSelectedAvions(List<Avion> selectedAvions) {
		this.selectedAvions = selectedAvions;
	}


	
	

}
