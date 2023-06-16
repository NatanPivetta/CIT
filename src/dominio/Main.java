package dominio;

import dados.*;
import telas.*;
import testes.Teclado;
import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
      //Cria uma Connection.
      Connection con = DriverManager.getConnection("jdbc:mysql://localhost/CIT", "natan", "1123");
      //Cria um DAOFuncionario.
      DAOlab daoLab = new DAOlab(con);
      //Cria um Funcionario.
      
      //Insere Funcionario no banco de dados.
      
        
      //Consulta todos os funcionarios do banco.
      List<Laboratorio> lista = daoLab.listarTodos();
        
      //Mostra todos os funcionarios na tela.
      for(Laboratorio lab: lista) {
        System.out.printf("%d %15s %10.2f\n", lab.getNome());
      }//for
    }//try
    catch (SQLException e) {
      e.printStackTrace();
    }

    }

}
