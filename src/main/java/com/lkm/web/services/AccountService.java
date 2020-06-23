package com.lkm.web.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lkm.web.domains.AccountDTO;

@Component
public interface AccountService {
	
	public void insert(AccountDTO member);
	
	public List<AccountDTO> retrieveAll();
	
    public AccountDTO findOne(String searchWord);

    public AccountDTO login(AccountDTO params);

}
