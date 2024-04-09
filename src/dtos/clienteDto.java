package dtos;

public class clienteDto {

	long id;
	String nombreCompletoCl = "aaaaa";
	int telCL = 11111;
	String correoCL = "aaaaa";
	
	
	
	
	@Override
	public String toString() {
		return "id cliente: " + id + ", nombreCompletoCl: " + nombreCompletoCl + ", telefono cliente: " + telCL + ", correo cliente: "
				+ correoCL + "]";
	}

	/**
	 * 
	 */
	public clienteDto() {
		super();
	}

	/**
	 * @param id
	 * @param nombreCompletoCl
	 * @param telCL
	 * @param correoCL
	 */
	public clienteDto(long id, String nombreCompletoCl, int telCL, String correoCL) {
		super();
		this.id = id;
		this.nombreCompletoCl = nombreCompletoCl;
		this.telCL = telCL;
		this.correoCL = correoCL;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the nombreCompletoCl
	 */
	public String getNombreCompletoCl() {
		return nombreCompletoCl;
	}
	/**
	 * @param nombreCompletoCl the nombreCompletoCl to set
	 */
	public void setNombreCompletoCl(String nombreCompletoCl) {
		this.nombreCompletoCl = nombreCompletoCl;
	}
	/**
	 * @return the telCL
	 */
	public int getTelCL() {
		return telCL;
	}
	/**
	 * @param telCL the telCL to set
	 */
	public void setTelCL(int telCL) {
		this.telCL = telCL;
	}
	/**
	 * @return the correoCL
	 */
	public String getCorreoCL() {
		return correoCL;
	}
	/**
	 * @param correoCL the correoCL to set
	 */
	public void setCorreoCL(String correoCL) {
		this.correoCL = correoCL;
	}
	
	

	
	
}
