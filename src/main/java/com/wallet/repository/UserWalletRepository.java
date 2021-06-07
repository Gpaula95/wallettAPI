package com.wallet.repository;

import com.wallet.entity.UserWallet;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserWalletRepository extends JpaRepository<UserWallet, Long>{
    Optional<UserWallet> findByUsersIdAndwalletId(Long user, Long wallet);
}