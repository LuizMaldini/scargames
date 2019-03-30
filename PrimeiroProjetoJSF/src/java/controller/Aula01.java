/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;



/**
 *
 * @author aluno1
 */
//@Named(value = "aula01")
@ManagedBean(name="aula01")
@RequestScoped
public class Aula01 implements Serializable {

    /**
     * Creates a new instance of Aula01
     */
    private String mensagem;
    
    public Aula01() {
        mensagem = "1º exemplo de aplicação com JSF";
    }
    
    
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    
    
    
    
    
}
