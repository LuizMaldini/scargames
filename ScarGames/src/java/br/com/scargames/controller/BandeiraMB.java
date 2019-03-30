/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scargames.controller;





import br.com.scargames.domain.Bandeira;
import br.com.scargames.services.BandeiraService;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "bandeiraMB")
@ViewScoped//só qdo sair dessa pag que o objeto deixa de ser criado


public class BandeiraMB implements Serializable{

    private List<Bandeira> bandeiras;
    private Bandeira bandeira;
    
    
    
    public BandeiraMB() {
        this.listar();
    }
    
    public void listar(){
        BandeiraService service = new BandeiraService();
        bandeiras = service.listar();
    }
    //todo java bean = metodos get e set, construtor, metodos privados
    
    public String novo(){
        return "new.xhtml?faces-redirect=true";
    }
    
    public String inserir(){
        BandeiraService service = new BandeiraService();
        if(service.inserir(bandeira)){
            return "list.xhtml?faces-redirect=true";      
    }else{
            return null;
    }
}
        
    public String cancelar(){
        return "list.xhtml?faces-redirect=true"; 
    }    
    
    public List<Bandeira> getBandeiras() {
        return bandeiras;
    }

    public void setBandeiras(List<Bandeira> bandeiras) {
        this.bandeiras = bandeiras;
    }
    
}
