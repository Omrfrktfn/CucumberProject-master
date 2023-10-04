package team12.pojos.zeynepPojo;

import java.io.Serializable;

public class Response11DeletePojo implements Serializable {
	private String message;
	private String httpStatus;

	public Response11DeletePojo() {
	}

	public Response11DeletePojo(String message, String httpStatus) {
		this.message = message;
		this.httpStatus = httpStatus;
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
			"Response11DeletePojo{" + 
			"message = '" + message + '\'' + 
			",httpStatus = '" + httpStatus + '\'' + 
			"}";
		}
}