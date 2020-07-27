
public class NumerosRojosException extends Exception{
	
	private static final long serialVersionUID = 1L;
	private double excesoRetirada;
	
	public NumerosRojosException(double excesoRetirada) {
		super();
		this.excesoRetirada = excesoRetirada;
	}

	@Override
	public String toString() {
		return "NumerosRojosException [excesoRetirada=" + excesoRetirada + "]";
	}
	
	
}
