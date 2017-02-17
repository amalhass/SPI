package fr.univbrest.dosi.spi.exception;

public class SPIException extends RuntimeException {
String error;
	
	public SPIException(){
		super();
	}
	
	public SPIException(String error) {
		super(error);
		this.error=error;
	}
	
	public SPIException(Throwable t){
		super(t);
	}
	
	public SPIException(String str,Throwable t){
		super(str,t);
	}

	@Override
	public String toString() {
	
		return error;
	}
}
