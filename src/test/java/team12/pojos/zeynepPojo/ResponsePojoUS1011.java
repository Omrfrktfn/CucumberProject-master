package team12.pojos.zeynepPojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponsePojoUS1011 implements Serializable {
	private ObjectPojoUS1011 object;
	private String message;
	private String httpStatus;

	public ResponsePojoUS1011() {
	}

	public ResponsePojoUS1011(ObjectPojoUS1011 object, String message, String httpStatus) {
		this.object = object;
		this.message = message;
		this.httpStatus = httpStatus;
	}

	public void setObject(ObjectPojoUS1011 object){
		this.object = object;
	}

	public ObjectPojoUS1011 getObject(){
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