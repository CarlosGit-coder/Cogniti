
package com.cognito.model;

import java.sql.Timestamp;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIO_ATIVIDADE")
public class UsuarioAtividade {
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fk_uatv_usuario", nullable = false)
  private int idUsuario;
  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fk_uatv_atividade", nullable = false)
  private int idAtividade;
  @Column(name = "resposta_dada")
  private String respostaDada;
  @Column(name = "acertou")
  private String acertou;
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @Column(name = "data_realizacao")
  private Timestamp dataRealizacao;

  public int getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
  }

  public int getIdAtividade() {
    return idAtividade;
  }

  public void setIdAtividade(int idAtividade) {
    this.idAtividade = idAtividade;
  }

  public String getRespostaDada() {
    return respostaDada;
  }

  public void setRespostaDada(String respostaDada) {
    this.respostaDada = respostaDada;
  }

  public String getAcertou() {
    return acertou;
  }

  public void setAcertou(String acertou) {
    this.acertou = acertou;
  }

  public Timestamp getDataRealizacao() {
    return dataRealizacao;
  }

  public void setDataRealizacao(Timestamp dataRealizacao) {
    this.dataRealizacao = dataRealizacao;
  }

  public UsuarioAtividade(int idUsuario, int idAtividade, String respostaDada, String acertou,
      Timestamp dataRealizacao) {
    this.idUsuario = idUsuario;
    this.idAtividade = idAtividade;
    this.respostaDada = respostaDada;
    this.acertou = acertou;
    this.dataRealizacao = dataRealizacao;
  }

}
