/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scargames.service;

import br.com.scargames.dao.GeneroDao;
import br.com.scargames.domain.Genero;
import br.com.scargames.util.HashMaker;
import java.util.List;
/**
 *
 * @author aluno1
 */
public class GeneroService {
    private final GeneroDao generoDao = new GeneroDao();//OBJ CRIADO
    
    public List<Genero> listar(){
        return generoDao.listar();
    }
    
    public Genero consultar(Integer id){
        return generoDao.consultar(id);
    }
    
    public Boolean inserir(Genero genero){///ALTERA A SENHA PARA A SENHA CRIPTOGRAFADA, no alterar não se pode fazer isso, caso contrario alterara a senha
     //   genero.setSenha(HashMaker.stringHexa(HashMaker.gerarHash(genero.getSenha())));
        return generoDao.inserir(genero);
    }
    
    public Boolean alterar(Genero genero){
       // genero.setSenha(HashMaker.stringHexa(HashMaker.gerarHash(genero.getSenha())));
        return generoDao.alterar(genero);
    }
    
    public Boolean excluir(Genero genero){
        return generoDao.excluir(genero);
    }
}
