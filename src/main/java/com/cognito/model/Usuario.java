
package com.cognito.model;

import java.sql.Timestamp;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuario {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private Long id_usuario;
  @Column(name = "nome")
  private String nome;
  @Column(name = "email")
  private String email;
  @Column(name = "senha")
  private String senha;
  @Column(name = "data_nascimento")
  private Date data_nascimento;
  @Column(name = "data_cadastro")
  private Timestamp data_cadastro;

  public Long getId_usuario() {
    return id_usuario;
  }

  public void setId_usuario(Long id_usuario) {
    this.id_usuario = id_usuario;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
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

  public Date getData_nascimento() {
    return data_nascimento;
  }

  public void setData_nascimento(Date data_nascimento) {
    this.data_nascimento = data_nascimento;
  }

  public Timestamp getData_cadastro() {
    return data_cadastro;
  }

  public void setData_cadastro(Timestamp data_cadastro) {
    this.data_cadastro = data_cadastro;
  }

  public Usuario(Long id_usuario, String nome, String email, String senha, Date data_nascimento,
      Timestamp data_cadastro) {
    this.id_usuario = id_usuario;
    this.nome = nome;
    this.email = email;
    this.senha = senha;
    this.data_nascimento = data_nascimento;
    this.data_cadastro = data_cadastro;
  }
}
