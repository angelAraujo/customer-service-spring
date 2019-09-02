
package com.test.microservices.users.model;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

/**
 * Model class of controller
 * @author Angel
 *
 */
@Document(collection = "users")
@JsonPropertyOrder({"userId", "name", "birthdate", "sex"})
public class User implements Serializable{

	private static final long serialVersionUID = -7788619177798333712L;

    @Id
    @NotNull  
    private String userId;
    @NotNull    
    private String name;
	@NotNull
	private String birthdate;
	@NotNull
	private String sex;

    
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
