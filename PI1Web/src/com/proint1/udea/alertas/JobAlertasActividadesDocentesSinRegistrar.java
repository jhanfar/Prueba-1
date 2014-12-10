package com.proint1.udea.alertas;

import java.util.ArrayList;
import java.util.List;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import com.proint1.udea.actividad.dao.DocenteGrupoDAO;
import com.proint1.udea.actividad.entidades.DocenteGrupo;
import com.proint1.udea.notificaciones.UdeAEmailSenderException;
import com.proint1.udea.notificaciones.UdeaEmailService;

/**
 * Job para notificar a todos los docentes
 * @author Juan Cardona
 * @since 05/12/2014
 */
public class JobAlertasActividadesDocentesSinRegistrar implements Job {

	
	@Autowired
	private DocenteGrupoDAO docenteGrupoDAO;
	

	public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		System.out.println("�Job, Notificaci�n docentes! :D");
		List<String> emailsTo = new ArrayList<>();
		try {
			if(docenteGrupoDAO!=null){
				List<DocenteGrupo> listaDocentes = docenteGrupoDAO.getDocenteGrupoList();
				for (DocenteGrupo docenteGrupo : listaDocentes) {
					emailsTo.add(docenteGrupo.getDocente().getEmail());
				}
			}
			//emailsTo.add("danilomejia127@gmail.com");
			//emailsTo.add("jkcardona@gmail.com");
			emailsTo.add("pmontoya206@gmail.com");
			UdeaEmailService.sendEmail("Registro Actividades de sus cursos", "Se�or Docente, recuerde que debe reportar las actividades" +
					"de sus cursos a m�s tardar el d�a 18 del presente mes", emailsTo, null, null, null);
		} catch (UdeAEmailSenderException e) {
			e.printStackTrace();
		}
	}

}