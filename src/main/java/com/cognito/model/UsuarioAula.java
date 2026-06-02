
package com.cognito.model;

import java.sql.Timestamp;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIO_AULA")
public class UsuarioAula {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id_usuario;
  @OneToOne
  @JoinColumn(name = "id_aula")
  private int id_aula;
  @DateTimeFormat(pattern = "yyyy-MM-dd HH;mm:ss")
  @Column(name = "data_inicio")
  private Timestamp data_inicio;
  @Column(name = "concluida")
  private boolean concluida;

  public int getId_usuario() {
    return id_usuario;
  }

  public void setId_usuario(int id_usuario) {
    this.id_usuario = id_usuario;
  }

  public int getId_aula() {
    return id_aula;
  }

  public void setId_aula(int id_aula) {
    this.id_aula = id_aula;
  }

  public Timestamp getData_inicio() {
    return data_inicio;
  }

  public void setData_inicio(Timestamp data_inicio) {
    this.data_inicio = data_inicio;
  }

  public boolean isConcluida() {
    return concluida;
  }

  public void setConcluida(boolean concluida) {
    this.concluida = concluida;
  }

  public UsuarioAula(int id_usuario, int id_aula, Timestamp data_inicio, boolean concluida) {
    this.id_usuario = id_usuario;
    this.id_aula = id_aula;
    this.data_inicio = data_inicio;
    this.concluida = concluida;
  }

}
