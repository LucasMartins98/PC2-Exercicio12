package br.com.etechoracio.jpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_CATEGORIA")
public class Categoria {
	
	@Column(name="ID_CATEGORIA")
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name="TX_DESCRICAO")
	private String descricao;
}
