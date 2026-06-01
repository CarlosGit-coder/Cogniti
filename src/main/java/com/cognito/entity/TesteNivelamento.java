package com.cognito.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TesteNivelamento {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "id_teste")
  private int id_teste;
  @Column(name = "id_usuario")
  private int id_usuario;
  @Column(name = "nivel_detectado")
  private String nivel_detectado;
  @Column(name = "data_realizacao")
  private Timestamp data_realizacao;

  public TesteNivelamento(int id_teste, int id_usuario, String nivel_detectado, Timestamp data_realizacao) {
    this.id_teste = id_teste;
    this.id_usuario = id_usuario;
    this.nivel_detectado = nivel_detectado;
    this.data_realizacao = data_realizacao;
  }

  public int getId_teste() {
    return id_teste;
  }

  public void setId_teste(int id_teste) {
    this.id_teste = id_teste;
  }

  public int getId_usuario() {
    return id_usuario;
  }

  public void setId_usuario(int id_usuario) {
    this.id_usuario = id_usuario;
  }

  public String getNivel_detectado() {
    return nivel_detectado;
  }

  public void setNivel_detectado(String nivel_detectado) {
    this.nivel_detectado = nivel_detectado;
  }

  public Timestamp getData_realizacao() {
    return data_realizacao;
  }

  public void setData_realizacao(Timestamp data_realizacao) {
    this.data_realizacao = data_realizacao;
  }
}
