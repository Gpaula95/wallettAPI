package com.wallett.service.impl;

import com.wallett.entity.UserWallet;
import com.wallett.repository.UserWalletRepository;
import com.wallett.service.UserWalletService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserWalletServiceImpl implements UserWalletService {

    @Autowired
    UserWalletRepository repository;

    @Override
    public UserWallet save(UserWallet uw) {
        return repository.save(uw);
    }
}