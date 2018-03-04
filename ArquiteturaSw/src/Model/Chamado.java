package Model;

public class Chamado {

	
	public int idChamado;
	public String descricao;
	public String status;
	public int dtAbertura;
	public int dtFechamento;
	public int idFila;
	
	
	public int getIdChamado() {
		return idChamado;
	}
	public void setIdChamado(int idChamado) {
		this.idChamado = idChamado;
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
	public int getDtAbertura() {
		return dtAbertura;
	}
	public void setDtAbertura(int dtAbertura) {
		this.dtAbertura = dtAbertura;
	}
	public int getDtFechamento() {
		return dtFechamento;
	}
	public void setDtFechamento(int dtFechamento) {
		this.dtFechamento = dtFechamento;
	}
	public int getIdFila() {
		return idFila;
	}
	public void setIdFila(int idFila) {
		this.idFila = idFila;
	}
	
}
