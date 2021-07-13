
public class CuentaBancaria {
	
	//atributos
	private String beneficiario = "";
	private float saldo = 0;
	private long cuenta = 0;
	private String producto = "";
	private String direccion = "";
	private String RFC = "";
	private String institucion = "";
	
	CuentaBancaria(){
		
	}
	
	CuentaBancaria(String beneficiario, float saldo){
		this.beneficiario = beneficiario;
		this.saldo = saldo;
	}
	
	//getter y los setter
	//get: obtengo el valor
	//set: escribo el varlo
	
	public String getInstitucion() {
		return this.institucion;
	}
	
	public void setInstitucion (String institucion) {
		this.institucion = institucion;
	}
	
	
	
	public String getBeneficiario() {
		return beneficiario;
	}

	public void setBeneficiario(String beneficiario) {
		this.beneficiario = beneficiario;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
			
		}else {
		  throw new IllegalArgumentException("El saldo ingresado es invalido");		}
	}

	public long getCuenta() {
		return cuenta;
	}

	public void setCuenta(long cuenta) {
		this.cuenta = cuenta;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getRFC() {
		return RFC;
	}

	public void setRFC(String rFC) {
		RFC = rFC;
	}

	//metodo de la clase
	public void depositos(float monto){
		this.saldo = this.saldo + monto;
	}
	
	public void retiros(float monto) {
		if(monto <= this.saldo && monto > 0) {
			this.saldo = this.saldo - monto;	
		}
			
		
	}
	
	public float consultarSaldo() {
		return this.saldo;
	}
	
	public String estadoDeCuenta() {
		return "";
	}

}
