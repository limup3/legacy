package com.lkm.web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lkm.web.domains.AccountDTO;
import com.lkm.web.mappers.AccountMapper;
import com.lkm.web.services.AccountService;
//import com.lkm.web.services.AccountServiceImpl;

import lombok.Data;

@CrossOrigin(origins="*", allowedHeaders = "*")
@RestController
@Data
@RequestMapping("/account")
public class AccountController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/join/form")
	public String joinForm() {
		logger.info("이동 화면 진입");
		return "Join";
	}
//	@Autowired AccountDTO account;
//	@Autowired AccountMapper accountMapper;
//	@Autowired AccountService accountService;
//	
//	@PostMapping("/signup")
//	public void signup(@RequestBody String total, String id, String name, String password) {
//		account.setId(id);
//		account.setName(name);
//		account.setPassword(password);
//		accountMapper.insertMember(account);
//	}
//	
//	@PostMapping("/login")
//	public Map<String, Object> login(@RequestBody AccountDTO params) {
//		Map<String, Object> map = new HashMap<String, Object>();
//		account = accountService.login(params);
//		 if(account != null){
//	            System.out.println("�α�������" + account.toString());
//	            map.put("result", true);
//	        }else{
//	            map.put("result", false);
//	        }
//	        System.out.println("���̵�" + account.toString());
//	        System.out.println("��й�ȣ" + params.getPassword());
//
//
//
//	        map.put("account",account);
//	        return map;
//	}
}
