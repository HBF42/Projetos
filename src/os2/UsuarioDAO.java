/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os2;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Heitor
 */
public class UsuarioDAO {
        public void incluir(){
            
        }
        
        public void Alterar(){
            
        }
        
        public void Excluir(){
            
        }
        public void Consultar(){
                Conect  C = new Conect();
                Connection conn = null;
                PreparedStatement pstm = null;
 
      //  try {
              //Cria uma conexão com o banco
       // conn = C.createConnectionToMySQL();          
      //  }
        }
        public boolean verificaNome(String nome){
            return true;
        } 
        public boolean VerificaSenha(String senha){
            return true;
        }    
        
}
