/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scargames.service;

import br.com.scargames.dao.ProdutoraDao;
import br.com.scargames.domain.Produtora;
import br.com.scargames.util.HashMaker;
import java.util.List;
/**
 *
 * @author aluno1
 */
public class ProdutoraService {
    private final ProdutoraDao produtoraDao = new ProdutoraDao();//OBJ CRIADO
    
    public List<Produtora> listar(){
        return produtoraDao.listar();
    }
    
    public Produtora consultar(Integer id){
        return produtoraDao.consultar(id);
    }
    
    public Boolean inserir(Produtora produtora){///ALTERA A SENHA PARA A SENHA CRIPTOGRAFADA, no alterar não se pode fazer isso, caso contrario alterara a senha
     //   produtora.setSenha(HashMaker.stringHexa(HashMaker.gerarHash(produtora.getSenha())));
        return produtoraDao.inserir(produtora);
    }
    
    public Boolean alterar(Produtora produtora){
       // produtora.setSenha(HashMaker.stringHexa(HashMaker.gerarHash(produtora.getSenha())));
        return produtoraDao.alterar(produtora);
    }
    
    public Boolean excluir(Produtora produtora){
        return produtoraDao.excluir(produtora);
    }
}
