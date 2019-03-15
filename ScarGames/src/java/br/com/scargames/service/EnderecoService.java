/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scargames.service;

import br.com.scargames.dao.EnderecoDao;
import br.com.scargames.domain.Endereco;
import br.com.scargames.util.HashMaker;
import java.util.List;
/**
 *
 * @author aluno1
 */
public class EnderecoService {
    private final EnderecoDao enderecoDao = new EnderecoDao();//OBJ CRIADO
    
    public List<Endereco> listar(){
        return enderecoDao.listar();
    }
    
    public Endereco consultar(Integer id){
        return enderecoDao.consultar(id);
    }
    
    public Boolean inserir(Endereco endereco){///ALTERA A SENHA PARA A SENHA CRIPTOGRAFADA, no alterar não se pode fazer isso, caso contrario alterara a senha
     //   endereco.setSenha(HashMaker.stringHexa(HashMaker.gerarHash(endereco.getSenha())));
        return enderecoDao.inserir(endereco);
    }
    
    public Boolean alterar(Endereco endereco){
       // endereco.setSenha(HashMaker.stringHexa(HashMaker.gerarHash(endereco.getSenha())));
        return enderecoDao.alterar(endereco);
    }
    
    public Boolean excluir(Endereco endereco){
        return enderecoDao.excluir(endereco);
    }
}
