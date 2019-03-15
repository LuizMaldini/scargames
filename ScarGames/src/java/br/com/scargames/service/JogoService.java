/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scargames.service;

import br.com.scargames.dao.JogoDao;
import br.com.scargames.domain.Jogo;
import br.com.scargames.util.HashMaker;
import java.util.List;
/**
 *
 * @author aluno1
 */
public class JogoService {
    private final JogoDao jogoDao = new JogoDao();//OBJ CRIADO
    
    public List<Jogo> listar(){
        return jogoDao.listar();
    }
    
    public Jogo consultar(Integer id){
        return jogoDao.consultar(id);
    }
    
    public Boolean inserir(Jogo jogo){///ALTERA A SENHA PARA A SENHA CRIPTOGRAFADA, no alterar não se pode fazer isso, caso contrario alterara a senha
     //   jogo.setSenha(HashMaker.stringHexa(HashMaker.gerarHash(jogo.getSenha())));
        return jogoDao.inserir(jogo);
    }
    
    public Boolean alterar(Jogo jogo){
       // jogo.setSenha(HashMaker.stringHexa(HashMaker.gerarHash(jogo.getSenha())));
        return jogoDao.alterar(jogo);
    }
    
    public Boolean excluir(Jogo jogo){
        return jogoDao.excluir(jogo);
    }
}
