package com.prospect.prospect.repository;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

import com.prospect.prospect.model.Prospect;

@Component
public class ProspectData {
	
	private List<Prospect> list = new ArrayList<Prospect>();
	
	public ProspectData() {
		listProspect();
	}

	public void listProspect() {
		Prospect manu = new Prospect("Manuel", 123, "17 rue de l'épeule", 59100, "Roubaix");
	    Prospect sophie = new Prospect("Sophie", 567, "190 rue de rome", 59100, "Roubaix");
	    Prospect julien = new Prospect("Julien", 789, "456 rue d'italie", 59100, "Roubaix");
	    Prospect amine = new Prospect("Amine", 012, "78 rue de l'obscure", 59100, "Roubaix");
	    Prospect ondine = new Prospect("Ondine", 345, "12 rue de l'artois", 59100, "Roubaix");
	    Prospect thomas = new Prospect("Thomas", 678, "80 rue du coq Français", 59100, "Roubaix");
	    
		this.list.add(amine);
        this.list.add(julien);
        this.list.add(manu);
        this.list.add(ondine);
       	this.list.add(sophie);
        this.list.add(thomas);
	}

	public List<Prospect> getList() {
		return list;
	}

	public void setList(Prospect prospect) {
		list.add(prospect);
	}
}

