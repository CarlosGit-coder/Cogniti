
package com.cognito.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aula {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int idAula;
  @Column(name = "titulo")
  private String titulo;
  @Column(name = "descricao")
  private String descricao;
  @Column(name = "nivel")
  private String nivel;

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getNivel() {
    return nivel;
  }

  public void setNivel(String nivel) {
    this.nivel = nivel;
  }

  public int getIdAula() {
    return idAula;
  }

  public void setIdAula(int idAula) {
    this.idAula = idAula;
  }

  public Aula(int idAula, String titulo, String descricao, String nivel) {
    this.idAula = idAula;
    this.titulo = titulo;
    this.descricao = descricao;
    this.nivel = nivel;
  }

}
