package com.proint1.udea.testmail;

import java.util.ArrayList;
import java.util.List;

import com.proint1.udea.notificaciones.UdeAEmailSenderException;
import com.proint1.udea.notificaciones.UdeaEmailService;

public class TestMail {

	public static void main(String[] args) {
	
		
		try {
			List<String> emailsTo = new ArrayList<>();
			//emailsTo.add("danilomejia127@gmail.com");
			//emailsTo.add("jkcardona@gmail.com");
			//emailsTo.add("cursosuniversidadantioquia@gmail.com");
			UdeaEmailService.sendEmail("Test Registro Actividades de sus cursos", "Se�or Docente, recuerde que debe reportar las actividades" +
					"de sus cursos a m�s tardar el d�a 18 del presente mes", emailsTo, null, null, null);
		} catch (UdeAEmailSenderException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
