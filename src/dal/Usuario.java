package dal;

import com.jfoenix.controls.JFXCheckBox;

import javafx.scene.image.Image;

public class Usuario extends DALPadre{
	private String dni=null;
	private String nomApell=null;
	private String direccion=null;
	private String email=null;
	private String telefono=null;
	private String cargo=null;
	private String clave=null;
	private String comentarios=null;
	private double salario=-1.0;
	private Image foto=null;
	
	
	//privilegios
	private JFXCheckBox seeClientes=new JFXCheckBox("Ver Clientes");
	private JFXCheckBox addClientes=new JFXCheckBox("A�adir Clientes");
	private JFXCheckBox updClientes=new JFXCheckBox("Editar Clientes");
	private JFXCheckBox delClientes=new JFXCheckBox("Eliminar Clientes");
	
	private JFXCheckBox seeUsuarios=new JFXCheckBox("Ver Usuarios");
	private JFXCheckBox addUsuarios=new JFXCheckBox("A�adir Usuarios");
	private JFXCheckBox updUsuarios=new JFXCheckBox("Actualizar Usuarios");
	private JFXCheckBox delUsuarios=new JFXCheckBox("Eliminar Usuarios");
	private JFXCheckBox statePasswordUsuarios=new JFXCheckBox("Estado/Password/Permisos");
	
	
	private JFXCheckBox seeArticulos=new JFXCheckBox("Ver Art�culos");
	private JFXCheckBox addArticulos=new JFXCheckBox("A�adir Art�culos");
	private JFXCheckBox updArticulos=new JFXCheckBox("Actualizar Art�culos");
	private JFXCheckBox delArticulos=new JFXCheckBox("Eliminar Art�culos");
	
	private JFXCheckBox seeProveedor=new JFXCheckBox("Ver Proveedores");
	private JFXCheckBox addProveedor=new JFXCheckBox("A�adir Proveedores");
	private JFXCheckBox updProveedor=new JFXCheckBox("Actualizar Proveedor");
	private JFXCheckBox delProveedor=new JFXCheckBox("Eliminar Proveedores");

	private JFXCheckBox seeImportante=new JFXCheckBox("Ver Importante");
	private JFXCheckBox addImportante=new JFXCheckBox("A�adir Importante");
	private JFXCheckBox updImportante=new JFXCheckBox("Actualizar Importante");
	private JFXCheckBox delImportante=new JFXCheckBox("Eliminar Importante");

	private JFXCheckBox seeAlquiler=new JFXCheckBox("Alquiler y Venta");
	private JFXCheckBox addAlquiler=new JFXCheckBox("A�adir Alquiler");
	private JFXCheckBox updAlquiler=new JFXCheckBox("Actualizar Alquiler");
	private JFXCheckBox delAlquiler=new JFXCheckBox("Eliminar Alquiler");
	private JFXCheckBox configDesCupAlquiler=new JFXCheckBox("Config. % Cupones");
	
	private JFXCheckBox seeDevolucion=new JFXCheckBox("Ver Devoluci�n");
	private JFXCheckBox addDevolucion=new JFXCheckBox("A�adir Devoluci�n");
	private JFXCheckBox updDevolucion=new JFXCheckBox("Actualizar Devoluci�n");
	private JFXCheckBox delDevolucion=new JFXCheckBox("Eliminar Devoluci�n");
	private JFXCheckBox devolDevolucion=new JFXCheckBox("Devolver");
	private JFXCheckBox transEsterDevolucion=new JFXCheckBox("Trans. Externas");
	
	private JFXCheckBox seeContabilidad=new JFXCheckBox("Ver Contabilidad");
	private JFXCheckBox addContabilidad=new JFXCheckBox("A�adir Contabilidad");
	private JFXCheckBox updContabilidad=new JFXCheckBox("Actualizar Contabilidad");
	private JFXCheckBox delContabilidad=new JFXCheckBox("Eliminar Contabilidad");
	
	private JFXCheckBox seeReputacion=new JFXCheckBox("Ver Reputaci�n");
	private JFXCheckBox addReputacion=new JFXCheckBox("A�adir Reputaci�n");
	private JFXCheckBox updReputacion=new JFXCheckBox("Actual.Reput. Cliente");
	private JFXCheckBox delReputacion=new JFXCheckBox("Eliminar Reputaci�n");
	private JFXCheckBox configInterReputacion=new JFXCheckBox("Config. Intervalo");
	
	private JFXCheckBox seeRecomendacion=new JFXCheckBox("Ver Recomendaci�n");
	private JFXCheckBox addRecomendacion=new JFXCheckBox("A�adir Recomendaci�n");
	private JFXCheckBox updRecomendacion=new JFXCheckBox("Actualizar Recomendaci�n");
	private JFXCheckBox delRecomendacion=new JFXCheckBox("Eliminar Recomendaci�n");
	private JFXCheckBox configPorRecomendacion=new JFXCheckBox("Config. % Recomendaci�n");
	
	private JFXCheckBox seeEstadistica=new JFXCheckBox("Ver Estad�stica");
	private JFXCheckBox addEstadistica=new JFXCheckBox("A�adir Estad�stica");
	private JFXCheckBox updEstadistica=new JFXCheckBox("Actualizar Estad�stica");
	private JFXCheckBox delEstadistica=new JFXCheckBox("Eliminar Estad�stica");
	
	private JFXCheckBox seeRestoreBackup=new JFXCheckBox("Restaurar Backup");
	private JFXCheckBox seeBackup=new JFXCheckBox("Hacer Backup");


	
	private int estado=-1;
	private String estado_s=null; 
	
	public Usuario(){
	
	}
	

	
	
	
	public Usuario(String dni, String nomApell, String direccion, String email, String telefono, String cargo,
			String clave, String comentarios, double salario, Image foto, int estado) {
		super();
		this.dni = dni;
		this.nomApell = nomApell;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;
		this.cargo = cargo;
		this.clave = clave;
		this.comentarios = comentarios;
		this.salario = salario;
		this.foto = foto;
		this.estado = estado;
		this.estado_s=(estado==1)?"Activo":"Inactivo";
	}

	
	public String getEstado_s() {
		return estado_s;
	}





	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNomApell() {
		return nomApell;
	}
	public void setNomApell(String nomApell) {
		this.nomApell = nomApell;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Image getFoto() {
		return foto;
	}
	public void setFoto(Image foto) {
		this.foto = foto;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
		
		this.estado_s=(estado==1)?"Activo":"Inactivo";

	}





	public JFXCheckBox getSeeClientes() {
		return seeClientes;
	}





	public JFXCheckBox getAddClientes() {
		return addClientes;
	}





	public JFXCheckBox getUpdClientes() {
		return updClientes;
	}





	public JFXCheckBox getDelClientes() {
		return delClientes;
	}





	public JFXCheckBox getSeeUsuarios() {
		return seeUsuarios;
	}





	public JFXCheckBox getAddUsuarios() {
		return addUsuarios;
	}





	public JFXCheckBox getUpdUsuarios() {
		return updUsuarios;
	}





	public JFXCheckBox getDelUsuarios() {
		return delUsuarios;
	}





	public JFXCheckBox getSeeArticulos() {
		return seeArticulos;
	}





	public JFXCheckBox getAddArticulos() {
		return addArticulos;
	}





	public JFXCheckBox getUpdArticulos() {
		return updArticulos;
	}





	public JFXCheckBox getDelArticulos() {
		return delArticulos;
	}





	public JFXCheckBox getSeeProveedor() {
		return seeProveedor;
	}





	public JFXCheckBox getAddProveedor() {
		return addProveedor;
	}





	public JFXCheckBox getUpdProveedor() {
		return updProveedor;
	}





	public JFXCheckBox getDelProveedor() {
		return delProveedor;
	}



	

	public JFXCheckBox getSeeImportante() {
		return seeImportante;
	}





	public JFXCheckBox getAddImportante() {
		return addImportante;
	}





	public JFXCheckBox getUpdImportante() {
		return updImportante;
	}





	public JFXCheckBox getDelImportante() {
		return delImportante;
	}





	public JFXCheckBox getSeeAlquiler() {
		return seeAlquiler;
	}





	public JFXCheckBox getAddAlquiler() {
		return addAlquiler;
	}





	public JFXCheckBox getUpdAlquiler() {
		return updAlquiler;
	}





	public JFXCheckBox getDelAlquiler() {
		return delAlquiler;
	}





	public JFXCheckBox getSeeDevolucion() {
		return seeDevolucion;
	}





	public JFXCheckBox getAddDevolucion() {
		return addDevolucion;
	}





	public JFXCheckBox getUpdDevolucion() {
		return updDevolucion;
	}





	public JFXCheckBox getDelDevolucion() {
		return delDevolucion;
	}



	

	public JFXCheckBox getSeeContabilidad() {
		return seeContabilidad;
	}





	public void setSeeContabilidad(JFXCheckBox seeContabilidad) {
		this.seeContabilidad = seeContabilidad;
	}





	public JFXCheckBox getAddContabilidad() {
		return addContabilidad;
	}





	public void setAddContabilidad(JFXCheckBox addContabilidad) {
		this.addContabilidad = addContabilidad;
	}





	public JFXCheckBox getUpdContabilidad() {
		return updContabilidad;
	}





	public void setUpdContabilidad(JFXCheckBox updContabilidad) {
		this.updContabilidad = updContabilidad;
	}





	public JFXCheckBox getDelContabilidad() {
		return delContabilidad;
	}





	public void setDelContabilidad(JFXCheckBox delContabilidad) {
		this.delContabilidad = delContabilidad;
	}



	public JFXCheckBox getSeeReputacion() {
		return seeReputacion;
	}





	public void setSeeReputacion(JFXCheckBox seeReputacion) {
		this.seeReputacion = seeReputacion;
	}





	public JFXCheckBox getAddReputacion() {
		return addReputacion;
	}





	public void setAddReputacion(JFXCheckBox addReputacion) {
		this.addReputacion = addReputacion;
	}





	public JFXCheckBox getUpdReputacion() {
		return updReputacion;
	}





	public void setUpdReputacion(JFXCheckBox updReputacion) {
		this.updReputacion = updReputacion;
	}





	public JFXCheckBox getDelReputacion() {
		return delReputacion;
	}





	public void setDelReputacion(JFXCheckBox delReputacion) {
		this.delReputacion = delReputacion;
	}


	


	public JFXCheckBox getSeeRecomendacion() {
		return seeRecomendacion;
	}





	public void setSeeRecomendacion(JFXCheckBox seeRecomendacion) {
		this.seeRecomendacion = seeRecomendacion;
	}





	public JFXCheckBox getAddRecomendacion() {
		return addRecomendacion;
	}





	public void setAddRecomendacion(JFXCheckBox addRecomendacion) {
		this.addRecomendacion = addRecomendacion;
	}





	public JFXCheckBox getUpdRecomendacion() {
		return updRecomendacion;
	}





	public void setUpdRecomendacion(JFXCheckBox updRecomendacion) {
		this.updRecomendacion = updRecomendacion;
	}





	public JFXCheckBox getDelRecomendacion() {
		return delRecomendacion;
	}





	public void setDelRecomendacion(JFXCheckBox delRecomendacion) {
		this.delRecomendacion = delRecomendacion;
	}




	public JFXCheckBox getSeeEstadistica() {
		return seeEstadistica;
	}





	public void setSeeEstadistica(JFXCheckBox seeEstadistica) {
		this.seeEstadistica = seeEstadistica;
	}





	public JFXCheckBox getAddEstadistica() {
		return addEstadistica;
	}





	public void setAddEstadistica(JFXCheckBox addEstadistica) {
		this.addEstadistica = addEstadistica;
	}





	public JFXCheckBox getDevolDevolucion() {
		return devolDevolucion;
	}





	public JFXCheckBox getUpdEstadistica() {
		return updEstadistica;
	}





	public void setUpdEstadistica(JFXCheckBox updEstadistica) {
		this.updEstadistica = updEstadistica;
	}





	public JFXCheckBox getDelEstadistica() {
		return delEstadistica;
	}





	public void setDelEstadistica(JFXCheckBox delEstadistica) {
		this.delEstadistica = delEstadistica;
	}





	public JFXCheckBox getSeeRestoreBackup() {
		return seeRestoreBackup;
	}





	public JFXCheckBox getSeeBackup() {
		return seeBackup;
	}





	public JFXCheckBox getConfigInterReputacion() {
		return configInterReputacion;
	}





	public JFXCheckBox getConfigPorRecomendacion() {
		return configPorRecomendacion;
	}





	public JFXCheckBox getTransEsterDevolucion() {
		return transEsterDevolucion;
	}





	public JFXCheckBox getConfigDesCupAlquiler() {
		return configDesCupAlquiler;
	}





	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
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
		Usuario other = (Usuario) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}





	public JFXCheckBox getStatePasswordUsuarios() {
		return statePasswordUsuarios;
	}
	
	
	/**/
	
	
}
