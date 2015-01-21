package com.services;

import java.util.Collection;
import java.util.List;

import com.model.Avion;

public interface IAvionService {
    /**
     * Add Avion
     *
     * @param  Avion Avion
     */
    public void addAvion(Avion Avion);
 
    /**
     * Update Avion
     *
     * @param  Avion Avion
     */
    public void updateAvion(Avion Avion);
 
    /**
     * Delete Avion
     *
     * @param  Avion Avion
     */
    public void deleteAvion(Avion Avion);
 
    /**
     * Get Avion
     *
     * @param  String Avion Login
     */   
    public Avion getAvionByMatricule(String matricule) ;
    
    /**
     * Get Avion List
     *
     * @return List - Avion list
     */
    public List<Avion> getAvions();

	public List<Avion>getAvionsSearch(String mat_search,
			String airl_search);
    
}
