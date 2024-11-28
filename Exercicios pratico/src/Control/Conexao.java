/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author genev
 */
public class Conexao {
 
    public static Connection getConnection(){
    
            Connection connection = null;
            try{
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/escola", "root", "");
            }catch(SQLException ex){
                Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, "Erro na conexao a base de dados", ex);
            }
            
            return connection;
    }
}

    




 
   