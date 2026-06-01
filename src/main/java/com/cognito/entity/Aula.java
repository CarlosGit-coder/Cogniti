
package com.cognito.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aula {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id_aula;
  private String titulo;
  private String descricao;
  private String nivel;

  public int getId_aula() {
    return id_aula;
  }

  public void setId_aula(int id_aula) {
    this.id_aula = id_aula;
  }

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

  public Aula(String nivel, int id_aula, String titulo, String descricao) {
    this.nivel = nivel;
    this.id_aula = id_aula;
    this.titulo = titulo;
    this.descricao = descricao;
  }

}
