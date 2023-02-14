package com.prospect.prospect.services;
import com.prospect.prospect.repository.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.prospect.prospect.model.*;
import java.util.Scanner;


@Service
public class ProspectServices {
	
	@Autowired 
	private ProspectData ps;

	public List<Prospect> addProspect() {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object

		System.out.println("Entrer votre nom:");
		String nom = myObj.nextLine();
		
		System.out.println("Entrer votre adresse:");
		String adresse = myObj.nextLine();
		
		System.out.println("Entrer votre ville:");
		String ville = myObj.nextLine();
		
		System.out.println("Entrer votre siret:");
		int siret = myObj.nextInt();
		
		System.out.println("Entrer votre code Postal:");
		int codePostal = myObj.nextInt();
		
        Prospect nouveauprospect = new Prospect(nom, siret, adresse, codePostal, ville);
        ps.setList(nouveauprospect);
        return ps.getList();
    }
	
	public void deleteProspect(int siret){
		List<Prospect> listDel = new ArrayList<Prospect>();
		listDel = ps.getList();
		for(int i = 0; i < listDel.size(); i++) {
			if(listDel.get(i).getSiret() == siret) {
				ps.getList().remove(i);
				break;
			}
		}
	}
	
	public void updateProspect(int siret1, int siret2){
		List<Prospect> listDel = new ArrayList<Prospect>();
		listDel = ps.getList();
		for(int i = 0; i < listDel.size(); i++) {
			if(listDel.get(i).getSiret() == siret1) {
				ps.getList().get(i).setSiret(siret2);
				break;
			}
		}
	}
	
	public ProspectData getPs() {
		return ps;
	}

	public void setPs(ProspectData ps) {
		this.ps = ps;
	}
}
