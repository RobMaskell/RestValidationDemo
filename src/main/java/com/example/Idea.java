package com.example;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document
//@Entity
@Getter
@Setter
@ToString(includeFieldNames=true)
//@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Idea implements Serializable {

	@Transient
	private static final long serialVersionUID = 3430100961796691437L;

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	private BigInteger id;
	
	@NotEmpty
	private final String title = null;
	
	@NotEmpty
	private final String text = null;
	
	@CreatedDate
    private Date created;
	
	@Version
	private long version;
	
}
