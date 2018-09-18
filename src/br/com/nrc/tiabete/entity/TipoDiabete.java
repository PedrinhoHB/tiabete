package br.com.nrc.tiabete.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@SuppressWarnings("serial")

@Entity(name = "TipoDiabete")
@Table(name = "T_NRC_TIPO_DIABETE")
@SequenceGenerator(name = "tipoDiabete", sequenceName = "SQ_T_NRC_TIPO_DIABETE")
public class TipoDiabete implements Serializable {
	@Id
	@Column(name = "cd_tipo_diabete")
	@GeneratedValue(generator = "tipoDiabete", strategy = GenerationType.SEQUENCE)
	private int codigo;

	@Column(name = "ds_tipo_diabete", length = 300)
	private String descricao;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
