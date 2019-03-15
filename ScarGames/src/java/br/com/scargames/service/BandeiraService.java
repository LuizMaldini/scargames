/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scargames.service;

import br.com.scargames.dao.BandeiraDao;
import br.com.scargames.domain.Bandeira;
import br.com.scargames.util.HashMaker;
import java.util.List;
/**
 *
 * @author aluno1
 */
public class BandeiraService {
    
    private final BandeiraDao bandeiraDao = new BandeiraDao();//OBJ CRIADO
    
    public List<Bandeira> listar(){
        return bandeiraDao.listar();
    }
    
    public Bandeira consultar(Integer id){
        return bandeiraDao.consultar(id);
    }
    
    public Boolean inserir(Bandeira bandeira){///ALTERA A SENHA PARA A SENHA CRIPTOGRAFADA, no alterar não se pode fazer isso, caso contrario alterara a senha
     //   bandeira.setSenha(HashMaker.stringHexa(HashMaker.gerarHash(bandeira.getSenha())));
        return bandeiraDao.inserir(bandeira);
    }
    
    public Boolean alterar(Bandeira bandeira){
       // bandeira.setSenha(HashMaker.stringHexa(HashMaker.gerarHash(bandeira.getSenha())));
        return bandeiraDao.alterar(bandeira);
    }
    
    public Boolean excluir(Bandeira bandeira){
        return bandeiraDao.excluir(bandeira);
    }
    
}
