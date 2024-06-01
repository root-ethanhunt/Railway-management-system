package svc.user.entity;

import java.io.Serializable;

import jakarta.validation.constraints.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import svc.user.constants.userConstant;

@NoArgsConstructor
@AllArgsConstructor
@Generated
@Getter
@Setter
@Data
@Document(collection= userConstant.USER_TABLE)
public class userEntity implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Size(min=3,max=1000)
	private int userId;

	@NotBlank(message ="Required")
	@Size(min=3,max=1000)
	@Indexed(unique=true)
	private String username;;

	@NotBlank
	@Size(max = 50)
	@Email
	private String email;
	@NotBlank
	@Size(max = 120)
	private String password;
	private String name;
	private String role ;
}