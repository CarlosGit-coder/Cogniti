
package com.cognito.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class TesteNivelamento {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  @Column(name = "id_teste")
  private int idTeste;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fk_teste_usuario", nullable = false)
  private int idUsuario;

  @Column(name = "nivel_detectado")
  private String nivelDetectado;

  @Column(name = "data_realizacao")
  private Timestamp dataRealizacao;

  public int getIdTeste() {
    return idTeste;
  }

  public void setIdTeste(int idTeste) {
    this.idTeste = idTeste;
  }

  public int getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
  }

  public String getNivelDetectado() {
    return nivelDetectado;
  }

  public void setNivelDetectado(String nivelDetectado) {
    this.nivelDetectado = nivelDetectado;
  }

  public Timestamp getDataRealizacao() {
    return dataRealizacao;
  }

  public void setDataRealizacao(Timestamp dataRealizacao) {
    this.dataRealizacao = dataRealizacao;
  }

  public TesteNivelamento(int idTeste, int idUsuario, String nivelDetectado, Timestamp dataRealizacao) {
    this.idTeste = idTeste;
    this.idUsuario = idUsuario;
    this.nivelDetectado = nivelDetectado;
    this.dataRealizacao = dataRealizacao;
  }

}
