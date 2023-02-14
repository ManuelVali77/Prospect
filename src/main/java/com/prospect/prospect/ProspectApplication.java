package com.prospect.prospect;
import com.prospect.prospect.model.Prospect;
import com.prospect.prospect.repository.ConRespo;
import com.prospect.prospect.services.ProspectServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
public class ProspectApplication implements CommandLineRunner {
	
	@Autowired
	private ProspectServices bs;
	
	@Autowired
	private ConRespo cr;

	public static void main(String[] args) {
		SpringApplication.run(ProspectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println(bs.getPs().getList());
		for (Prospect monprospect : cr.findAll()) {
			System.out.println(monprospect);
		}
		//bs.addProspect();
		//bs.deleteProspect(345);
		//bs.updateProspect(789, 9908);
		//System.out.println(bs.getPs().getList());
	}

}
