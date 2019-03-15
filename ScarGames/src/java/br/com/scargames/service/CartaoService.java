/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scargames.service;

import br.com.scargames.dao.CartaoDao;
import br.com.scargames.domain.Cartao;
import br.com.scargames.util.HashMaker;
import java.util.List;
/**
 *
 * @author aluno1
 */
public class CartaoService {
    private final CartaoDao cartaoDao = new CartaoDao();//OBJ CRIADO
    
    public List<Cartao> listar(){
        return cartaoDao.listar();
    }
    
    public Cartao consultar(Integer id){
        return cartaoDao.consultar(id);
    }
    
    public Boolean inserir(Cartao cartao){///ALTERA A SENHA PARA A SENHA CRIPTOGRAFADA, no alterar não se pode fazer isso, caso contrario alterara a senha
     //   cartao.setSenha(HashMaker.stringHexa(HashMaker.gerarHash(cartao.getSenha())));
        return cartaoDao.inserir(cartao);
    }
    
    public Boolean alterar(Cartao cartao){
       // cartao.setSenha(HashMaker.stringHexa(HashMaker.gerarHash(cartao.getSenha())));
        return cartaoDao.alterar(cartao);
    }
    
    public Boolean excluir(Cartao cartao){
        return cartaoDao.excluir(cartao);
    }
    
}
