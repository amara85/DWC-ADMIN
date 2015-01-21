package com.dao;

import java.util.List;

import com.model.Avion;

public interface IAvionDAO {
	
	
	/**
     * Add Avion
     *
     * @param  Avion Avion
     */
    public void addAvion(Avion avion);   
 
    /**
     * Update Avion
     *
     * @param  Avion Avion
     */
    public void updateAvion(Avion avion);
 
    /**
     * Delete Avion
     *
     * @param  Avion Avion
     */
    public void deleteAvion(Avion avion);
 
    /**
     * Get Avion
     *
     * @param  String Avion Login
     */   
    public Avion getAvionByMatricule(String matricule) ;
 
    /**
     * Get Avion List
     *
     */
    public List<Avion> getAvions();

	public List<Avion> getAvionsSearch(String mat_search, String airl_search);

	public List<Avion> getAvionsSearchMat(String mat_search);
	
	public List<Avion> getAvionsSearchAirl(String airl_search);
    
}