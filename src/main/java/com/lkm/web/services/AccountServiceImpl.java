//package com.lkm.web.services;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.lkm.web.domains.AccountDTO;
//import com.lkm.web.mappers.AccountMapper;
//
//@Service
//public class AccountServiceImpl implements AccountService {
//	
//	@Autowired AccountMapper accountMapper;
//
//	@Override
//	public List<AccountDTO> retrieveAll() {
//		
//		return accountMapper.selectAll();
//	}
//
//	@Override
//	public AccountDTO findOne(String searchWord) {
//		return accountMapper.selectone(searchWord);
//	}
//
//	@Override
//	public AccountDTO login(AccountDTO params) {
//		return accountMapper.login(params);
//	}
//
//	@Override
//	public void insert(AccountDTO account) {
//		
//		
//	}
//
//}
