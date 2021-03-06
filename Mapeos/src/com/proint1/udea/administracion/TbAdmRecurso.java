package com.proint1.udea.administracion;

// default package
// Generated 24/11/2014 10:29:53 PM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * TbAdmRecurso generated by hbm2java
 */
public class TbAdmRecurso implements java.io.Serializable {

	private long nbRecIdn;
	private TbAdmRecurso tbAdmRecurso;
	private String vrRecNombre;
	private String vrRecTipo;
	private Set tbAdmRecursos = new HashSet(0);
	private Set tbAdmPermisosxrols = new HashSet(0);

	public TbAdmRecurso() {
	}

	public TbAdmRecurso(long nbRecIdn, TbAdmRecurso tbAdmRecurso,
			String vrRecNombre, String vrRecTipo) {
		this.nbRecIdn = nbRecIdn;
		this.tbAdmRecurso = tbAdmRecurso;
		this.vrRecNombre = vrRecNombre;
		this.vrRecTipo = vrRecTipo;
	}

	public TbAdmRecurso(long nbRecIdn, TbAdmRecurso tbAdmRecurso,
			String vrRecNombre, String vrRecTipo, Set tbAdmRecursos,
			Set tbAdmPermisosxrols) {
		this.nbRecIdn = nbRecIdn;
		this.tbAdmRecurso = tbAdmRecurso;
		this.vrRecNombre = vrRecNombre;
		this.vrRecTipo = vrRecTipo;
		this.tbAdmRecursos = tbAdmRecursos;
		this.tbAdmPermisosxrols = tbAdmPermisosxrols;
	}

	public long getNbRecIdn() {
		return this.nbRecIdn;
	}

	public void setNbRecIdn(long nbRecIdn) {
		this.nbRecIdn = nbRecIdn;
	}

	public TbAdmRecurso getTbAdmRecurso() {
		return this.tbAdmRecurso;
	}

	public void setTbAdmRecurso(TbAdmRecurso tbAdmRecurso) {
		this.tbAdmRecurso = tbAdmRecurso;
	}

	public String getVrRecNombre() {
		return this.vrRecNombre;
	}

	public void setVrRecNombre(String vrRecNombre) {
		this.vrRecNombre = vrRecNombre;
	}

	public String getVrRecTipo() {
		return this.vrRecTipo;
	}

	public void setVrRecTipo(String vrRecTipo) {
		this.vrRecTipo = vrRecTipo;
	}

	public Set getTbAdmRecursos() {
		return this.tbAdmRecursos;
	}

	public void setTbAdmRecursos(Set tbAdmRecursos) {
		this.tbAdmRecursos = tbAdmRecursos;
	}

	public Set getTbAdmPermisosxrols() {
		return this.tbAdmPermisosxrols;
	}

	public void setTbAdmPermisosxrols(Set tbAdmPermisosxrols) {
		this.tbAdmPermisosxrols = tbAdmPermisosxrols;
	}

}
