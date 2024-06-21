package com.eleodoro.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.eleodoro.conexao.Conexao;
import com.eleodoro.modelo.Turma;

public class TurmaDao {
    

    private Turma turma;
    private final String SQLINCLUIR = "INSERT INTO TURMA VALUES (?, ?, ?)";
    private final String SQLALTERAR = "UPDATE TURMA SET CAPACIDADE = ?, HORARIO = ? WHERE ID = ?";
    private final String SQLEXCLUIR = "DELETE FROM TURMA WHERE ID = ?";
    private final String SQLCONSULTAR = "SELECT * FROM TURMA WHERE ID = ?";

    public TurmaDao (Turma turma) {
        this.turma = turma;
    }

    public boolean incluir(){
         try {
            PreparedStatement ps = Conexao.getConexao () .prepareStatement(SQLINCLUIR);
            ps.setInt(1, turma.getId());
            ps.setInt(2, turma.getCapacidade());
            ps.setInt(3, turma.getHorario());
            ps.executeUpdate();
            return true;
         } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Não foi possivel incluir a turma");
            return false;
         }
    }

    public boolean alterar(){
        try {
           final PreparedStatement ps = Conexao.getConexao () .prepareStatement(SQLALTERAR);
           ps.setInt(1, turma.getCapacidade());
           ps.setInt(2, turma.getHorario());
           ps.setInt(3, turma.getId());
           ps.executeUpdate();
           return true;
        } catch (SQLException e) {
           e.printStackTrace();
           System.out.println("Não foi possivel alterar a turma");
           return false;
        }
   }

   public boolean excluir(){
    try {
       PreparedStatement ps = Conexao.getConexao () .prepareStatement(SQLEXCLUIR);
       ps.setInt(1, turma.getId());
       ps.executeUpdate();
       return true;
    } catch (SQLException e) {
       e.printStackTrace();
       System.out.println("Não foi possivel excluir a turma");
       return false;
    }
}

public boolean consultar(){
    try {
       PreparedStatement ps = Conexao.getConexao () .prepareStatement(SQLCONSULTAR);
       ps.setInt(1, turma.getId());
       ResultSet rs = ps.executeQuery();
       if (rs.next()) {
        turma.setCapacidade(rs.getInt(2));
        turma.setHorario(rs.getInt(3));
       }
       ps.executeUpdate();
       return true;
    } catch (SQLException e) {
       e.printStackTrace();
       System.out.println("Não foi possivel consultar a turma");
       return false;
    }
}
}

    
