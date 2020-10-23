package dal;

import java.util.Date;

public class DatoAtomico {
	private int id=-1;
	private String nombre=null;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DatoAtomico other = (DatoAtomico) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return  nombre;
	}

	public DatoAtomico(int id){
		super();
	}
	
	public DatoAtomico(){
		
	}
	
	
	
	
}
