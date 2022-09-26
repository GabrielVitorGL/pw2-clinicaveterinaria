// GABRIEL VITOR GROSSI LOURENÇO

package br.com.etechoracio.pw2clinicaveterinaria.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "CLIENTE")
public class Cliente {
	@Id
	@Column(name = "IDTUTOR")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "NOME_TUTOR")
	private String nome;
	@Column(name = "CELULAR_TUTOR")
	private String celular;
	@Column(name = "CPF_TUTOR")
	private String cpf;
}
