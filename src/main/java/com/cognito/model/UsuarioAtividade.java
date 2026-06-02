
package com.cognito.model;

import java.sql.Timestamp;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIO_ATIVIDADE")
public class UsuarioAtividade {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id_usuario;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id_atividade;
  @Column(name = "resposta_dada")
  private String resposta_dada;
  @Column(name = "acertou")
  private String acertou;
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @Column(name = "data_realizacao")
  private Timestamp data_realizacao;

  public int getId_usuario() {
    return id_usuario;
  }

  public void setId_usuario(int id_usuario) {
    this.id_usuario = id_usuario;
  }

  public int getId_atividade() {
    return id_atividade;
  }

  public void setId_atividade(int id_atividade) {
    this.id_atividade = id_atividade;
  }

  public String getResposta_dada() {
    return resposta_dada;
  }

  public void setResposta_dada(String resposta_dada) {
    this.resposta_dada = resposta_dada;
  }

  public String getAcertou() {
    return acertou;
  }

  public void setAcertou(String acertou) {
    this.acertou = acertou;
  }

  public Timestamp getData_realizacao() {
    return data_realizacao;
  }

  public void setData_realizacao(Timestamp data_realizacao) {
    this.data_realizacao = data_realizacao;
  }

  public UsuarioAtividade(int id_usuario, int id_atividade, String resposta_dada, String acertou,
      Timestamp data_realizacao) {
    this.id_usuario = id_usuario;
    this.id_atividade = id_atividade;
    this.resposta_dada = resposta_dada;
    this.acertou = acertou;
    this.data_realizacao = data_realizacao;
  }

}
