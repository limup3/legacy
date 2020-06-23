package com.lkm.web.domains;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Component
public class AccountDTO {
	
	private String id,name,password;

	
	

}
