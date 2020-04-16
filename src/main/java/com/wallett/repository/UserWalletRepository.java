package com.wallett.repository;

import com.wallett.entity.UserWallet;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserWalletRepository extends JpaRepository<UserWallet, Long>{

}