package com.proint1.udea.administracion.ctl;

import java.util.List;

import org.apache.log4j.Logger;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Textbox;

import com.proint1.udea.administracion.dao.CursoDTO;
import com.proint1.udea.administracion.dao.GrupoDTO;
import com.proint1.udea.administracion.entidades.dependencias.DependenciaAcademica;
import com.proint1.udea.administracion.ngc.CursoOperacionesIntDAO;

public class EditarCursoCtl extends GenericForwardComposer {
	Textbox txtIdCurso;
	Textbox txtNombreCurso;
	Combobox cmbDep;
	Textbox txtIdn;
	
	private static Logger logger=Logger.getLogger(AdministrarCursosCtl.class);
	
	CursoDTO cursoDTO; 
	CursoOperacionesIntDAO cursoOpInt;
	
	public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp);
        logger.info("cargando ventana de editar cursos");         
        cursoDTO = (CursoDTO) Executions.getCurrent().getArg().get("dtoCurso");
         
        if (cursoDTO==null)
        {
    		Messagebox.show("No selecciono un curso", "Informacion", Messagebox.OK, Messagebox.INFORMATION);
    		self.detach();
        }
        else
        {
        	txtNombreCurso.setValue(cursoDTO.getNombreCurso());
    		txtIdCurso.setValue(cursoDTO.getIdCurso());
    		txtIdn.setValue(Long.toString(cursoDTO.getIdn()));		
    		cmbDep.setValue(cursoDTO.getNombreDependencia());    
        }
        
            
   }
	
	public void onCreate() {
		List<DependenciaAcademica> listaDependencia = cursoOpInt.getDependenciaList();		
		ListModel model = new ListModelList(listaDependencia);
		cmbDep.setModel(model);
		
	}
	
	public void onClick$btnAceptar(Event ev) {	
		
		if (txtIdCurso.getValue()!="" && txtNombreCurso.getValue()!="" && cmbDep.getSelectedItem()!=null)
		{

			
			CursoDTO cursoDTO = new CursoDTO();
			cursoDTO.setIdCurso(txtIdCurso.getValue());
			cursoDTO.setNombreCurso(txtNombreCurso.getValue());
			
			DependenciaAcademica dtodep =cmbDep.getSelectedItem().getValue();
			
			cursoDTO.setIdnDependencia(dtodep.getIdn());
			cursoDTO.setIdn(Long.parseLong(txtIdn.getValue()));
			cursoOpInt.editarCurso(cursoDTO);
			Messagebox.show("Curso editado", "Informacion", Messagebox.OK, Messagebox.INFORMATION);
			
			self.detach();
		}
		else
		{
			Messagebox.show("Debe ingresar todos los datos", "Informacion", Messagebox.OK,Messagebox.INFORMATION);
		}
		
		
	}
	
	public void onClick$btnCancelar(Event ev) {
		self.detach();
	}

	/**
	 * @return the cursoDTO
	 */
	public CursoDTO getCursoDTO() {
		return cursoDTO;
	}

	/**
	 * @param cursoDTO the cursoDTO to set
	 */
	public void setCursoDTO(CursoDTO cursoDTO) {
		this.cursoDTO = cursoDTO;
	}

	/**
	 * @return the cursoOpInt
	 */
	public CursoOperacionesIntDAO getCursoOpInt() {
		return cursoOpInt;
	}

	/**
	 * @param cursoOpInt the cursoOpInt to set
	 */
	public void setCursoOpInt(CursoOperacionesIntDAO cursoOpInt) {
		this.cursoOpInt = cursoOpInt;
	}

	
	

}
