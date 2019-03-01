/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scargames.dao;

import br.com.scargames.domain.Bandeira;
import br.com.scargames.util.HibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author aluno1
 */
public class BandeiraDao {
    
    public List<Bandeira> listar(){//para importar biblioteca é ctrl shift i
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();//getCurrentSession() = pega sessao com banco ativa, caso contrario cria uma
       session.beginTransaction(); 
       try {
            
            List<Bandeira> lista = session.createQuery("from Bandeira order by descricao asc").list();//retorna uma lista de obj, um obj inteiro, retorna uma lista, aqui linguagem HQL do hibernate, HQL não tem select *
            session.getTransaction().commit();//qdo ocorre tudo certo na transação
            return lista;
            
        }catch(Exception e){    
            
            session.getTransaction().rollback();//qdo ocorre erro na transação
            e.printStackTrace();//da info mais detalhadas do erro
            return null;
        }
       
        
    }
    
    public Bandeira consultar(Integer id){
       Session session = HibernateUtil.getSessionFactory().getCurrentSession();//getCurrentSession() = pega sessao com banco ativa, caso contrario cria uma
       session.beginTransaction(); 
       try {
            
            Bandeira bandeira = (Bandeira)session.createQuery("from Bandeira where id = ").uniqueResult();//uniqueResult é só para id, se for nome usa lista msm
            //unique retorna obj, precisa do casth (Bandeira)session.
            session.getTransaction().commit();//qdo ocorre tudo certo na transação
            return bandeira;
            
        }catch(Exception e){    
            
            session.getTransaction().rollback();//qdo ocorre erro na transação
            e.printStackTrace();//da info mais detalhadas do erro
            return null;
        }
    }
    
    public Boolean inserir(Bandeira bandeira){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();//getCurrentSession() = pega sessao com banco ativa, caso contrario cria uma
        session.beginTransaction();//iniciando transação com banco, (conceito de atomicidade)
        try {
            session.save(bandeira);//ta mandando um objeto pro hibernate
            session.getTransaction().commit();//qdo ocorre tudo certo na transação
            
            return true;
        }catch(Exception e){
            
            session.getTransaction().rollback();//qdo ocorre erro na transação
            e.printStackTrace();//da info mais detalhadas do erro
            return true;
        }
        
        
    }
    
    public Boolean alterar(Bandeira bandeira){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();//getCurrentSession() = pega sessao com banco ativa, caso contrario cria uma
        session.beginTransaction();//iniciando transação com banco, (conceito de atomicidade)
        try {
            session.update(bandeira);//ta mandando um objeto pro hibernate
            session.getTransaction().commit();//qdo ocorre tudo certo na transação
            
            return true;
        }catch(Exception e){
            
            session.getTransaction().rollback();//qdo ocorre erro na transação
            e.printStackTrace();//da info mais detalhadas do erro
            return true;
        }
    }
    
    public Boolean excluir(Bandeira bandeira){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();//getCurrentSession() = pega sessao com banco ativa, caso contrario cria uma
        session.beginTransaction();//iniciando transação com banco, (conceito de atomicidade)
        try {
            session.delete(bandeira);//ta mandando um objeto pro hibernate
            session.getTransaction().commit();//qdo ocorre tudo certo na transação
            
            return true;
        }catch(Exception e){
            
            session.getTransaction().rollback();//qdo ocorre erro na transação
            e.printStackTrace();//da info mais detalhadas do erro
            return true;
        }
    }
}
