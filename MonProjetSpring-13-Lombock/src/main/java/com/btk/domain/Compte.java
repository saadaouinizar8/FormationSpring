package com.btk.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Comptes")


//@Setter
//@Getter       ===>> trouvé deja dans @Data
//@ToString     

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Compte {

	@Id
	private String numero;
	private String proprietaire;
	private BigDecimal solde;



}
