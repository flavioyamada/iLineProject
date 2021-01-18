package Telas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cliente {
    
   private String nome,prontuario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }
    
    public String salvar (){    
       try {
           
           FileWriter fw = new FileWriter("cliente.txt", true);
           PrintWriter pw = new PrintWriter(fw);
           pw.println(this.nome);
           pw.println(this.prontuario);
           pw.flush();
           pw.close();
           fw.close();
           
       } catch (IOException ex) {
           Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
       }
    return "Cadastrado com sucesso";
  }   
}
