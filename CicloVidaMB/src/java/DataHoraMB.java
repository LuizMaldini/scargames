/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author aluno1
 */


@ManagedBean(name="dataHoraMB")
//@RequestScoped
//@SessionScoped
//@ViewScoped //igual ao pag scop
@ApplicationScoped //só deixa de exitir qdo parar o servidor(glassfish), escopo mais extenso
//3 vezes que sessão expira, padrão 30 minutos no arq webxml,Qdo tempo expira, ou usar o comando invalidate, fechar navegador, 
public class DataHoraMB implements Serializable{

    private LocalDateTime dataHora;
    
    
    public DataHoraMB() {
        dataHora = LocalDateTime.now();
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    
}
