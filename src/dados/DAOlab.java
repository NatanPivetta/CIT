package dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dominio.Laboratorio;

public class DAOlab implements IDAO<Laboratorio> {
    private Connection conexao;

    public DAOlab (Connection conexao){
        this.conexao = conexao;
    }

    @Override
    public void inserir(Laboratorio lab){

    }

    @Override
    public void remover(Laboratorio lab){
        
    }

    @Override
    public void atualizar(Laboratorio lab){
        
    }

    public Laboratorio pesquisarPorID(int id){
        Laboratorio lab = new Laboratorio("");
        return lab;
    }

    @Override
    public List<Laboratorio> listarTodos(){
        List<Laboratorio> lista = null;
        
        return lista;
    }
}
