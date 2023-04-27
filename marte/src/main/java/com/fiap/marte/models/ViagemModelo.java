package com.fiap.marte.models;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

@Entity
public class ViagemModelo {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private LocalDate dataDecolagem;
	
	@Positive
	private int diasEmMarte;
	
	@Positive
	private int qntdAssentos;
	
	@Pattern(regexp = "[A-Z]{4}-\\d{4}")
	private String modelo;
	
	@NotNull(message="O nome do comandante é obrigatório")
	@NotBlank(message="O nome do comandante é obrigatório")
	private String nomeComandante;
	
	@Pattern(regexp = "[A-Z]{3}-\\d{4}-[A-Z]\\d[A-Z]")
	private String matriculaPComandante;
	
	@NotNull(message="O nome do segundo comandante é obrigatório")
	@NotBlank(message="O nome do segundo comandante é obrigatório")
	private String nomeSegundoCom;

	@Pattern(regexp = "[A-Z]{3}-\\d{4}-[A-Z]\\d[A-Z]")
	private String matriculaSComandante;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getDataDecolagem() {
		return dataDecolagem;
	}

	public void setDataDecolagem(LocalDate dataDecolagem) {
		this.dataDecolagem = dataDecolagem;
	}

	public int getDiasEmMarte() {
		return diasEmMarte;
	}

	public void setDiasEmMarte(int diasEmMarte) {
		this.diasEmMarte = diasEmMarte;
	}

	public int getQntdAssentos() {
		return qntdAssentos;
	}

	public void setQntdAssentos(int qntdAssentos) {
		this.qntdAssentos = qntdAssentos;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNomeComandante() {
		return nomeComandante;
	}

	public void setNomeComandante(String nomeComandante) {
		this.nomeComandante = nomeComandante;
	}

	public String getMatriculaPComandante() {
		return matriculaPComandante;
	}

	public void setMatriculaPComandante(String matriculaPComandante) {
		this.matriculaPComandante = matriculaPComandante;
	}

	public String getNomeSegundoCom() {
		return nomeSegundoCom;
	}

	public void setNomeSegundoCom(String nomeSegundoCom) {
		this.nomeSegundoCom = nomeSegundoCom;
	}

	public String getMatriculaSComandante() {
		return matriculaSComandante;
	}

	public void setMatriculaSComandante(String matriculaSComandante) {
		this.matriculaSComandante = matriculaSComandante;
	}
	
	
	
}
