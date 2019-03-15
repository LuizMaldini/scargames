/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scargames.service;

import br.com.scargames.dao.CidadeDao;
import br.com.scargames.domain.Cidade;
import br.com.scargames.util.HashMaker;
import java.util.List;
/**
 *
 * @author aluno1
 */
public class CidadeService {
    private final CidadeDao cidadeDao = new CidadeDao();//OBJ CRIADO
    
    public List<Cidade> listar(){
        return cidadeDao.listar();
    }
    
    public Cidade consultar(Integer id){
        return cidadeDao.consultar(id);
    }
    
    public Boolean inserir(Cidade cidade){///ALTERA A SENHA PARA A SENHA CRIPTOGRAFADA, no alterar não se pode fazer isso, caso contrario alterara a senha
     //   cidade.setSenha(HashMaker.stringHexa(HashMaker.gerarHash(cidade.getSenha())));
        return cidadeDao.inserir(cidade);
    }
    
    public Boolean alterar(Cidade cidade){
       // cidade.setSenha(HashMaker.stringHexa(HashMaker.gerarHash(cidade.getSenha())));
        return cidadeDao.alterar(cidade);
    }
    
    public Boolean excluir(Cidade cidade){
        return cidadeDao.excluir(cidade);
    }
    
}
