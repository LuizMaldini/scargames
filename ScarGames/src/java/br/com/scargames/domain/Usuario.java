/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scargames.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.constraints.Email;

/**
 *
 * @author aluno1
 */

@Entity
@Table(name="usuario")
public class Usuario  implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)   
    private Integer id;
    @NotNull
    @Column(name="nome")
    @Size(min=1,max=100)
    private String nome;
    @NotNull
    @Column(name="cpf")
    @Size(min=1,max=11)
    
    private String cpf;
    @NotNull
    @Column(name="dataNascimento")
    @Temporal(TemporalType.DATE)
    private LocalDate dataNascimento;
    @NotNull
    @Column(name="sexo")
    @Size(min=1,max=1)
    private String sexo;
    @NotNull
    @Column(name="telefone")
    @Size(min=1,max=45)
    private String telefone;
    @NotNull
    @Column(name="email", unique=true)//unique nao deixa dois email iguais
    @Size(min=1,max=50) 
    @Email //valida se é email
    private String email;
    @NotNull
    @Column(name="senha")
    @Size(min=6,max=100)
    //expressao temporal para senha com caractecere
    private String senha;
    
    @OneToMany(mappedBy="id")
    private List<Endereco> enderecos;
    
    @OneToMany(mappedBy="id")
    private List<Cartao> cartoes;
    
    @OneToOne(mappedBy="id")
    private Biblioteca biblioteca;
    
    
    public Usuario() {
    }

    public Usuario(Integer id, String nome, String cpf, LocalDate dataNascimento, String sexo, String telefone, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
       
       
    
    
    
    
}
