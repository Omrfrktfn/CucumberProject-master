package team12.pojos.omerPojo;

import java.io.Serializable;

public class RegisterResponsePojo implements Serializable {
	private RegisterObjectPojo object;
	private String message;
	private String httpStatus;

	public RegisterResponsePojo() {
	}

	public RegisterResponsePojo(RegisterObjectPojo object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(RegisterObjectPojo object){
		this.object = object;
	}

	public RegisterObjectPojo getObject(){
		return object;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setHttpStatus(String httpStatus){
		this.httpStatus = httpStatus;
	}

	public String getHttpStatus(){
		return httpStatus;
	}

	@Override
 	public String toString(){
		return 
			"ResponsePojo{" + 
			"object = '" + object + '\'' + 
			",message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}