package com.lkm.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Component
public class PlDTO {
	
	private String thisyear, lastyear, changess, pl, rating, changerating;

	
}
