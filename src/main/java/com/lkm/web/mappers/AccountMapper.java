package com.lkm.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lkm.web.domains.AccountDTO;

@Repository
public interface AccountMapper {

	public void insertMember(AccountDTO account);

	public List<AccountDTO> selectAll();

	public AccountDTO selectone(String searchWord);

	public AccountDTO login(AccountDTO params);
}
