package com.proint1.udea.administracion.entidades.terceros;

import java.util.Date;



/**
 * Entidad base para todos los tipos de terceros de la aplicacion como {@link Docente}, {@link Estudiante}
 * @author Juan Cardona
 * @since 24/05/2014
 */
public class Persona implements java.io.Serializable {

	/**serialVersionUID* */
	private static final long serialVersionUID = -2728579381310819088L;
	
	/**Identificador unico*/
	private long idn;
	/**Tipo de identificación idn*/
	private long tipoidentificacionIdn;
	/** Tipo identificacion */
	private TipoIdentificacion tipoidentificacion;
	/**Nombres de la persona*/	
	private String nombres;
	/**apellidos de la persona*/
	private String apellidos;
	/**Nombre completo incluye nombre y apellidos*/
	private String nombreCompleto;
	/**Identificaión como cedula, pasaporte otros*/
	private String identificacion;
	/**Dirección de contracto*/
	private String direccion;
	/**Telefono*/
	private String telefono;
	/**Email*/
	private String email;
	/**Usuario que modifica la entidad*/
	private String usuarioActualizacion;
	/**Fecha de modificación de la entidad*/
	private Date fechaActualizacion;
	
	/**
	 * 
	 */
	public Persona() {
		super();
		this.fechaActualizacion = new Date();
		this.usuarioActualizacion = "SYSTEM";
	}
	
	/**
	 * @param tipoidentificacionIdn
	 * @param nombres
	 * @param apellidos
	 * @param identificacion
	 */
	public Persona(long tipoidentificacionIdn, String nombres,String apellidos, String identificacion) {
		super();
		this.tipoidentificacionIdn = tipoidentificacionIdn;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.identificacion = identificacion;
		this.fechaActualizacion = new Date();
		this.usuarioActualizacion = "SYSTEM";
	}
	
	/**
	 * @param tipoidentificacionIdn
	 * @param nombres
	 * @param apellidos
	 * @param identificacion
	 * @param usuarioActualizacion
	 * @param fechaActualizacion
	 */
	public Persona(long tipoidentificacionIdn, String nombres,String apellidos, String identificacion,
			String usuarioActualizacion, Date fechaActualizacion) {
		super();
		this.tipoidentificacionIdn = tipoidentificacionIdn;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.identificacion = identificacion;
		this.usuarioActualizacion = usuarioActualizacion;
		this.fechaActualizacion = fechaActualizacion;
	}

	/**
	 * @return the idn
	 */
	public long getIdn() {
		return idn;
	}
	/**
	 * @param idn the idn to set
	 */
	public void setIdn(long idn) {
		this.idn = idn;
	}
	/**
	 * @return the tipoidentificacionIdn
	 */
	public long getTipoidentificacionIdn() {
		return tipoidentificacionIdn;
	}
	/**
	 * @param tipoidentificacionIdn the tipoidentificacionIdn to set
	 */
	public void setTipoidentificacionIdn(long tipoidentificacionIdn) {
		this.tipoidentificacionIdn = tipoidentificacionIdn;
	}
	/**
	 * @return the tipoidentificacion
	 */
	public TipoIdentificacion getTipoidentificacion() {
		return tipoidentificacion;
	}
	/**
	 * @param tipoidentificacion the tipoidentificacion to set
	 */
	public void setTipoidentificacion(TipoIdentificacion tipoidentificacion) {
		this.tipoidentificacion = tipoidentificacion;
	}
	/**
	 * @return the nombres
	 */
	public String getNombres() {
		return nombres;
	}
	/**
	 * @param nombres the nombres to set
	 */
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the nombreCompleto
	 */
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	/**
	 * @param nombreCompleto the nombreCompleto to set
	 */
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	/**
	 * @return the identificacion
	 */
	public String getIdentificacion() {
		return identificacion;
	}
	/**
	 * @param identificacion the identificacion to set
	 */
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}
	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the usuarioActualizacion
	 */
	public String getUsuarioActualizacion() {
		return usuarioActualizacion;
	}
	/**
	 * @param usuarioActualizacion the usuarioActualizacion to set
	 */
	public void setUsuarioActualizacion(String usuarioActualizacion) {
		this.usuarioActualizacion = usuarioActualizacion;
	}
	/**
	 * @return the fechaActualizacion
	 */
	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}
	/**
	 * @param fechaActualizacion the fechaActualizacion to set
	 */
	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
}
