package com.wallett.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wallett.entity.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Long>{

}
