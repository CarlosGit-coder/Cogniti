
package com.cognito.model;

import java.sql.Timestamp;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIO_AULA")
public class UsuarioAula {
  @OneToOne
  @JoinColumn(name = "fk_ua_usuario", nullable = false)
  private int idUsuario;
  @OneToOne
  @JoinColumn(name = "fk_ua_aula", nullable = false)
  private int idAula;
  @DateTimeFormat(pattern = "yyyy-MM-dd HH;mm:ss")
  @Column(name = "data_inicio")
  private Timestamp dataInicio;
  @Column(name = "concluida")
  private boolean concluida;

  public int getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
  }

  public int getIdAula() {
    return idAula;
  }

  public void setIdAula(int idAula) {
    this.idAula = idAula;
  }

  public Timestamp getDataInicio() {
    return dataInicio;
  }

  public void setDataInicio(Timestamp dataInicio) {
    this.dataInicio = dataInicio;
  }

  public boolean isConcluida() {
    return concluida;
  }

  public void setConcluida(boolean concluida) {
    this.concluida = concluida;
  }

  public UsuarioAula(int idUsuario, int idAula, Timestamp dataInicio, boolean concluida) {
    this.idUsuario = idUsuario;
    this.idAula = idAula;
    this.dataInicio = dataInicio;
    this.concluida = concluida;
  }

}
