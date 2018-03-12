package br.usjt.arqsw.entity;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Chamado {
/**
 * 
 * @author Filippe Valentim 
 *         81612333
 *         Si3AN-MCA
 *         ArqSW
 */
	

	@NotNull(message="A fila não pode ser vazia")
	@Min(value=1, message="A fila não pode ser vazia")
	private int id;
	
	@NotNull
	@Size(min=5, max=45, message="O nome da fila deve estar entre 5 e 45 caracteres.")
	private String descricao;
	
	private String status;
	private String dtFechamento;
	private String dtAbertura;
	private int fila;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDtFechamento() {
		return dtFechamento;
	}
	public void setDtFechamento(String dtFechamento) {
		this.dtFechamento = dtFechamento;
	}
	public String getDtAbertura() {
		return dtAbertura;
	}
	public void setDtAbertura(String dtAbertura) {
		this.dtAbertura = dtAbertura;
	}
	
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	@Override
	public String toString() {
		return "Chamado [id=" + id + ", descricao=" + descricao + ", status=" + status + ", dtFechamento="
				+ dtFechamento + ", dtAbertura=" + dtAbertura + ", fila=" + fila + "]";
	}
	public void setIdFila(int int1) {
		// TODO Auto-generated method stub
		
	}
	
}
