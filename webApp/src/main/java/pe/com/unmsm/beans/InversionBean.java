package pe.com.unmsm.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class InversionBean implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nombre;
	private String nombreInvertido;
	private int cantPalabra;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombreInvertido() {
		return nombreInvertido;
	}
	public void setNombreInvertido(String nombreInvertido) {
		this.nombreInvertido = nombreInvertido;
	}
	public int getCantPalabra() {
		return cantPalabra;
	}
	public void setCantPalabra(int cantPalabra) {
		this.cantPalabra = cantPalabra;
	}
	
	public void invertirPalabra(){
		this.nombreInvertido="";
		this.cantPalabra=0;
		if (this.nombre!=null && !this.nombre.isEmpty()) {
			this.cantPalabra = 1;
			for (int i = 0; i < this.nombre.length(); i++) {
				this.nombreInvertido += this.nombre.charAt(this.nombre.length()-1-i);
				if (this.nombre.charAt(this.nombre.length()-1-i)==' ') {
					this.cantPalabra++;
				}
			}
			
		}
		System.out.println(nombreInvertido);
	}
	
}
