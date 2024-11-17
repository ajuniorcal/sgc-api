package br.com.sgc.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "PESSOA")
public class Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PESSOA")
	private Long id;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "ENDERECO")
	private Endereco endereco;

	@NotNull
	@Size(max = 255)
	@Column(name = "NOME_CONSULTOR")
	private String nome_consultor;

	@Size(max = 255)
	@Column(name = "NUMERO_DOCUMENTO", unique=true)
	private String numero_documento;

	@Size(max = 255)
	@Column(name = "VALIDADE_DOCUMENTO")
	private String validade_documento;

	@Size(max = 255)
	@Column(name = "NISS")
	private String niss;

	@Size(max = 255)
	@Column(name = "NIF", unique=true)
	private String nif;

	@Size(max = 255)
	@Column(name = "CPF", unique=true)
	private String cpf;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "EN_ESTADO_CIVIL")
	private EstadoCivilEnum estado_civil;

	@Size(max = 255)
	@Column(name = "DATA_NASCIMENTO")
	private String data_nascimento;
	
	

	public Pessoa(@NotNull Endereco endereco, @NotNull @Size(max = 255) String nome_consultor,
			@Size(max = 255) String numero_documento, @Size(max = 255) String validade_documento,
			@Size(max = 255) String niss, @Size(max = 255) String nif, @Size(max = 255) String cpf,
			@NotNull EstadoCivilEnum estado_civil, @Size(max = 255) String data_nascimento) {
		super();
		this.endereco = endereco;
		this.nome_consultor = nome_consultor;
		this.numero_documento = numero_documento;
		this.validade_documento = validade_documento;
		this.niss = niss;
		this.nif = nif;
		this.cpf = cpf;
		this.estado_civil = estado_civil;
		this.data_nascimento = data_nascimento;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome_consultor() {
		return nome_consultor;
	}

	public void setNome_consultor(String nome_consultor) {
		this.nome_consultor = nome_consultor;
	}

	public String getNumero_documento() {
		return numero_documento;
	}

	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}

	public String getValidade_documento() {
		return validade_documento;
	}

	public void setValidade_documento(String validade_documento) {
		this.validade_documento = validade_documento;
	}

	public String getNiss() {
		return niss;
	}

	public void setNiss(String niss) {
		this.niss = niss;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public EstadoCivilEnum getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(EstadoCivilEnum estado_civil) {
		this.estado_civil = estado_civil;
	}

	public String getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	

}
