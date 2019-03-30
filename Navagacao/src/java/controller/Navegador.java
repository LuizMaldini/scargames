package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="navegador")
@javax.faces.bean.RequestScoped

public class Navegador implements Serializable{
//navegação sai da View vai controller vai Model que tem tudo dentro dele : Service vai DAO vai Domain
/*
  <!Foi implementado navegação estática, tem mais duas ainda
        ação vinculada ao link ou ao botão, aqui a ação manda para o index,
        para ser navegação dinamica precisa de servidor,
    
    Estatica e Dinanmica apenas recebe conteudo do index, nao navega.
    elas pegam o conteudo e exibem,
    O redirecionamento vai para a pagina, no caso o index, mudou o url
    
    
    
   Eos diretorios diferentes precisa separar o mapeamento por pasta, se for na mesma
    pasta pode ser só ex : redirecionamento.index.xhtml
    
    
    último tipo de navegação é o Outcome, utiliza Facesconfig
    <navigation-rule>
        <from-view-id>*</from-view-id> 
        <navigation-case>
            <from-outcome>
                home
            </from-outcome>
            <to-view-id>
                /private/index.xhtml //até aqui Ele só navega
            </to-view-id>
            <redirect>true</redirect> //aqui pra frente vai ser redirecionado
        </navigation-case>
    </navigation-rule>
    
        >  
    */   
    public Navegador() {
    }
    
    public String navegacaoDinamica(){
    if (true){   
        return "/private/index.xhtmal";
    }else{
          return null;
    }
}
    
    public String redirecionamento(){
        return "/private/index.xhtml?faces-redirect=true"; 
        //redirecionou aqui, precisa usar o ? para criar o parametro, e também de um valor que é true
    }

    
    public String outcome(){
        return "home";
    }


}
