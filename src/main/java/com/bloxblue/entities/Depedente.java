package com.bloxblue.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Depedente")
public class Depedente {


	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY )
		private Long id;
		
		private String cpf;
		
		private String nome;
		
		private String telefone; 
		
		@ManyToOne
		@JoinColumn(name = "id_funcionario")
		private Funcionario funcionario;


}


