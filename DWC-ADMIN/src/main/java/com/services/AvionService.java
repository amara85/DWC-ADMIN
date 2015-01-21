package com.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.dao.IAvionDAO;
import com.model.Avion;

@Transactional(readOnly = true)
public class AvionService implements IAvionService {

	IAvionDAO AvionDAO;

	@Transactional(readOnly = false)
	public void addAvion(Avion Avion) {
		// TODO Auto-generated method stub
		getAvionDAO().addAvion(Avion);
	}

	@Transactional(readOnly = false)
	public void updateAvion(Avion avion) {
		// TODO Auto-generated method stub
		getAvionDAO().updateAvion(avion);
	}

	@Transactional(readOnly = false)
	public void deleteAvion(Avion avion) {
		// TODO Auto-generated method stub
		getAvionDAO().deleteAvion(avion);
	}

	public List<Avion> getAvions() {
		// TODO Auto-generated method stub
		return getAvionDAO().getAvions();
	}

	public IAvionDAO getAvionDAO() {
		return AvionDAO;
	}

	public void setAvionDAO(IAvionDAO AvionDAO) {
		this.AvionDAO = AvionDAO;
	}

	public Avion getAvionByMatricule(String matricule) {
		// TODO Auto-generated method stub
		return getAvionDAO().getAvionByMatricule(matricule);
	}

	@Override
	public List<Avion> getAvionsSearch(String mat_search, String airl_search) {
		// TODO Auto-generated method stub
		if (mat_search != null ) {
			mat_search = mat_search.trim();
			if (mat_search.matches("")){
				mat_search = null;
			}
		} 
		if (airl_search != null ) {
			airl_search = airl_search.trim();
			if (airl_search.matches("")){
				airl_search = null;
			}
		} 
		
		if (mat_search != null  && airl_search != null) {
			return getAvionDAO().getAvionsSearch(mat_search, airl_search);
		} else if (mat_search != null  && airl_search == null) {
			return getAvionDAO().getAvionsSearchMat(mat_search);
		} else if (mat_search == null  && airl_search != null) {
			return getAvionDAO().getAvionsSearchAirl(airl_search);
		} else {
			return getAvionDAO().getAvions();
		}

	}
}
