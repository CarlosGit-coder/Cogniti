package com.cognito.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Atividade {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id_atividade;
  private int id_aula;
  private String pergunta;
  private String resposta_correta;
  private String tipo;
  private int fk_atividade_aula;

  public int getId_atividade() {
    return id_atividade;
  }

  public void setId_atividade(int id_atividade) {
    this.id_atividade = id_atividade;
  }

  public int getId_aula() {
    return id_aula;
  }

  public void setId_aula(int id_aula) {
    this.id_aula = id_aula;
  }

  public String getPergunta() {
    return pergunta;
  }

  public void setPergunta(String pergunta) {
    this.pergunta = pergunta;
  }

  public String getResposta_correta() {
    return resposta_correta;
  }

  public void setResposta_correta(String resposta_correta) {
    this.resposta_correta = resposta_correta;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public int getFk_atividade_aula() {
    return fk_atividade_aula;
  }

  public void setFk_atividade_aula(int fk_atividade_aula) {
    this.fk_atividade_aula = fk_atividade_aula;
  }
}
