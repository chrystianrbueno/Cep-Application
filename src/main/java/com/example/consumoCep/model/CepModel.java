package com.example.consumoCep.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class CepModel {
	private String cep;
	private String logradoura;
	private String complemento;
	private String localidade;
	private String uf;
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getLogradoura() {
		return logradoura;
	}
	public void setLogradoura(String logradoura) {
		this.logradoura = logradoura;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getLocalidade() {
		return localidade;
	}
	public void setLocalidade(String localidade) {
		this.localidade = localidade;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	@Override
	public String toString() {
		return "Cep [cep=" + cep + ", logradoura=" + logradoura + ", complemento=" + complemento + ", localidade="
				+ localidade + ", uf=" + uf + "]";
	}
	
}
