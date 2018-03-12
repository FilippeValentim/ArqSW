package br.usjt.arqsw.service;

import java.io.IOException;
import java.util.ArrayList;

import br.usjt.arqsw.entity.Chamado;

import br.usjt.arqsw.dao.ChamadoDAO;

public class ChamadoService {
	 private ChamadoDAO dao;
	
	public ChamadoService() {
		dao = new ChamadoDAO();
	}
	
	public ArrayList<Chamado> listarFilas() throws IOException{
		return dao.listarFilas();
	}
	public int carregar(int id) throws IOException{
		// TODO Auto-generated method stub
		return id ;
	}
	
	
}




