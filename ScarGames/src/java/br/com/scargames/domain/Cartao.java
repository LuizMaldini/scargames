/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scargames.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author aluno1
 */
@Entity
@Table(name="cartao")
public class Cartao implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private Integer id;
   
    @NotNull//garante que a info vai ser preenchida
    @Column(name="numero")
    @Size(min=16,max=16)
    private String numero;
    
    @NotNull
    @Column(name="vencimento")
    @Temporal(TemporalType.DATE)
    private LocalDate vencimento;
    
    
    @JoinColumn(name="bandeira_cartao_id", referencedColumnName="id")
    @ManyToOne(optional=false)
    private Bandeira bandeira;

    public Cartao() {
    }

    public Cartao(Integer id, String numero, LocalDate vencimento, Bandeira bandeira) {
        this.id = id;
        this.numero = numero;
        this.vencimento = vencimento;
       this.bandeira = bandeira;
}
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.id);
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
        final Cartao other = (Cartao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public void setBandeira(Bandeira bandeira) {
        this.bandeira = bandeira;
    }

    public Bandeira getBandeira() {
        return bandeira;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
