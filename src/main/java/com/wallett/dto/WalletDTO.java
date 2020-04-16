package com.wallett.dto;

import java.math.BigDecimal;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class WalletDTO {
	
	private Long id;
	@Length(min=3, message="O nome deve conter no minimo 3 caracteres")
	@NotNull(message=" o nome nao pode ser nulo")
	private String name;
	@NotNull(message="insira um valor para a carteira")
	private BigDecimal value;
}
