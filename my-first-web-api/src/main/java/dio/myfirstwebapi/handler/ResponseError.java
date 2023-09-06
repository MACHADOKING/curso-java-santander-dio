package dio.myfirstwebapi.handler;

import java.util.Date;

public class ResponseError {
	private Date timestamp = new Date();
	private String status = "error";
	private int statusCode = 400;
	private String error;
	
	public Date getTimestamp() {
        return timestamp;
    }

    

    public String getStatus() {
        return status;
    }

    public Integer getStatusCode() {
        return statusCode;
    }

    public String getError() {
        return error;
    }
}
