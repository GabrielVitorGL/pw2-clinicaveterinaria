// GABRIEL VITOR GROSSI LOURENÇO

package br.com.etechoracio.pw2clinicaveterinaria.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.com.etechoracio.pw2clinicaveterinaria.enums.TipoAnimalEnum;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "ANIMAL")
public class Animal {
	@Id
	@Column(name = "IDANIMAL")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "NOME_ANIMAL")
	private String nome;
	@Enumerated (EnumType.STRING)
	@Column(name = "TIPO")
	private TipoAnimalEnum tipo;
	@Column(name = "RACA_ANIMAL")
	private String raca;
	@Column(name = "PESO")
	private BigDecimal peso;
	@JoinColumn(name = "DONO")
	@ManyToOne
	private Cliente dono;
	
}
