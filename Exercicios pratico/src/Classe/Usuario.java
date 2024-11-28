/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe;
import Control.Usuario_control;
import java.sql.PreparedStatement;
import java.sql.SQLDataException;
import Control.Conexao;

/**

/**
 *
 * @author genev
 */
public class Usuario {
    public void cadastrarUsuario(Usuario_control usuario) {
        String sql ="INSERT INTO USUARIO (NOME,SENHA,EMAIL,ENDEREÇO)";
        PreparredStatement ps = null;
        try{
            
        ps = Conexao.getConnection().prepareStatement(sql);
        ps.setString(1,usuario.getNome());
        
    }
    }
}
