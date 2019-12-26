package com.target.services.productApi.exception;
import java.util.Date;

import org.springframework.http.HttpStatus;

public class ExceptionResponse {
  private HttpStatus httpStatus;
  private Date timestamp;
  private String message;
  private String details;

  public ExceptionResponse(Date timestamp, String message, String details,HttpStatus httpstatus) {
    super();
    this.httpStatus = httpstatus;
    this.timestamp = timestamp;
    this.message = message;
    this.details = details;
  }

  public Date getTimestamp() {
    return timestamp;
  }

  public String getMessage() {
    return message;
  }

  public String getDetails() {
    return details;
  }

public HttpStatus getHttpStatus() {
	return httpStatus;
}

public void setHttpStatus(HttpStatus httpStatus) {
	this.httpStatus = httpStatus;
}

}