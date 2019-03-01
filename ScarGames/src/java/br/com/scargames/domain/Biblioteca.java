/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scargames.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author aluno1
 */
@Entity
@Table(name="biblioteca")
public class Biblioteca implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)   
    private Integer id;
    
    
    @JoinColumn(name="usuario_biblioteca_id",referencedColumnName="id")
    @OneToOne(optional=false)
    private Usuario usuario;
    
    
    @JoinColumn(name="usuario_biblioteca_id",referencedColumnName="id")
    @OneToOne(optional=false)//é obrigatório
    private Jogo jogo;

    public Biblioteca() {
    }

    public Biblioteca(Integer id, Usuario usuario, Jogo jogo) {
        this.id = id;
        this.usuario = usuario;
        this.jogo = jogo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Biblioteca other = (Biblioteca) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
    
    
}
