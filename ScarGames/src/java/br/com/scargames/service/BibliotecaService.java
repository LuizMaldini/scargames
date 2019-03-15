/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scargames.service;

import br.com.scargames.dao.BibliotecaDao;
import br.com.scargames.domain.Biblioteca;
import br.com.scargames.util.HashMaker;
import java.util.List;
/**
 *
 * @author aluno1
 */
public class BibliotecaService {
    private final BibliotecaDao bibliotecaDao = new BibliotecaDao();//OBJ CRIADO
    
    public List<Biblioteca> listar(){
        return bibliotecaDao.listar();
    }
    
    public Biblioteca consultar(Integer id){
        return bibliotecaDao.consultar(id);
    }
    
    public Boolean inserir(Biblioteca biblioteca){///ALTERA A SENHA PARA A SENHA CRIPTOGRAFADA, no alterar não se pode fazer isso, caso contrario alterara a senha
     //   biblioteca.setSenha(HashMaker.stringHexa(HashMaker.gerarHash(biblioteca.getSenha())));
        return bibliotecaDao.inserir(biblioteca);
    }
    
    public Boolean alterar(Biblioteca biblioteca){
       // biblioteca.setSenha(HashMaker.stringHexa(HashMaker.gerarHash(biblioteca.getSenha())));
        return bibliotecaDao.alterar(biblioteca);
    }
    
    public Boolean excluir(Biblioteca biblioteca){
        return bibliotecaDao.excluir(biblioteca);
    }
    
}
