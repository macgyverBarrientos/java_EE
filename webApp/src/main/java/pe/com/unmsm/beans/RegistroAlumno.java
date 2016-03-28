package pe.com.unmsm.beans;

import java.io.Serializable;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped//mantiene el valor de las variables mientras estee en la pantalla
public class RegistroAlumno implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nombre;
	private String apellido;
	private String mail;
	private Date fechIni;
	private Date fechFin;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public Date getFechIni() {
		return fechIni;
	}
	public void setFechIni(Date fechIni) {
		this.fechIni = fechIni;
	}
	public Date getFechFin() {
		return fechFin;
	}
	public void setFechFin(Date fechFin) {
		this.fechFin = fechFin;
	}
	
	
	@Override
	public String toString() {
		return "RegistroAlumno [nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", fechIni=" + fechIni
				+ ", fechFin=" + fechFin + "]";
	}
	public void registrar(){
		System.out.println(toString());
	}
	
}
