package com.mitocode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mitocode.model.Persona;
import com.mitocode.service.IPersonaService;

public class App {
	
	public static void main(String[] args) {
		
		/*IPersonaService service = new PersonaServiceImpl();
		service.crear();*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		IPersonaService service = (IPersonaService) context.getBean("personaService");
		service.crear();
		
		Persona persona = (Persona) context.getBean("persona");
		/*persona.setId(1);
		persona.setNombres("Gerson Antony");
		persona.setApellidos("Sanchez Esparza");*/
		
		System.out.println(persona.getId() + "-" + persona.getNombres() + "-" + persona.getApellidos());
		
		((ConfigurableApplicationContext) context).close();
		
	}

}
