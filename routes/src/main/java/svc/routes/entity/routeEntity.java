package svc.routes.entity;

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
import svc.routes.constants.routeConstant;

@NoArgsConstructor
@AllArgsConstructor
@Generated
@Getter
@Setter
@Data
@Document(collection= routeConstant.ROUTE_TABLE)
public class routeEntity implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Digits(integer = 5,fraction = 0)
	private int routeId;

	@NotBlank(message ="Required")
	@Size(min=3,max=1000)
	@Indexed(unique=true)
	private String stationName;

	@NotBlank(message ="Required")
	@Pattern(regexp="(^[1-9]|[12]\\d)/(0\\d|1[0-2])/(\\d{4}$)",message="Date of the Train should be in DD/MM/YYYY")
	private String dayMonYear;

	@NotBlank(message ="Required")
	@Pattern(regexp="^[0-1]\\d|2[0-3]:[0-5]\\d:[0-5]\\d$",message="start time of the Train in this route should be of hh:mm:ss")
	private String timeOfArrival;

	@NotBlank(message ="Required")
	@Pattern(regexp="^[0-1]\\d|2[0-4]:[0-5]\\d:[0-5]\\d$",message="reach time of the Train in this route should be of hh:mm:ss")
	private String timeOfDeparture;

	@NotNull
	@Digits(integer = 4,fraction = 2)
	private double totalDistance;

	@NotBlank(message ="Required")
	@Size(min=3,max=1000)
	@Indexed(unique=true)
	private String trainId;

}