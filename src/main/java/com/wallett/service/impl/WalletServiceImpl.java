package com.wallett.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wallett.entity.Wallet;
import com.wallett.repository.WalletRepository;
import com.wallett.service.WalletService;

@Service
public class WalletServiceImpl implements WalletService{

	@Autowired
	private WalletRepository repository;
	
	@Override
	public Wallet save(Wallet w) {
		// TODO Auto-generated method stub
		return repository.save(w);
	}
}
