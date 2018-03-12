package br.usjt.arqsw.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.usjt.arqsw.entity.Chamado;


/**
* 
* @author Filippe Valentim 
*         81612333
*         Si3AN-MCA
*         ArqSW
*/


public class ChamadoDAO {

	public ArrayList<Chamado> listarFilas() throws IOException {
		String query = "select c.id_fila, f.id_fila from chamado c, fila f"
				+ "where c.id_fila = f.id_fila;";
		ArrayList<Chamado> lista = new ArrayList<>();
		try(Connection conn = ConnectionFactory.getConnection();
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();){
			
			while(rs.next()) {
				Chamado fila = new Chamado();
				fila.setId(rs.getInt("c.id_fila"));
				fila.setIdFila(rs.getInt("f.id_fila"));
				lista.add(fila);
			}
			
		} catch (SQLException e) {
			throw new IOException(e);
		}
		return lista;
	}
	
	
}
