package com.school.vivi;

import java.util.Date;

public class Lead {
	int idLead;
	String nome;
	String telefone;
	Date dataCadastro;
	String status_2;
	Date dataNovoContato;
	String observacao;
	public int getIdLead() {
		return idLead;
	}
	public void setIdLead(int idLead) {
		this.idLead = idLead;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getStatus_2() {
		return status_2;
	}
	public void setStatus_2(String status_2) {
		this.status_2 = status_2;
	}
	public Date getDataNovoContato() {
		return dataNovoContato;
	}
	public void setDataNovoContato(Date dataNovoContato) {
		this.dataNovoContato = dataNovoContato;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

}
