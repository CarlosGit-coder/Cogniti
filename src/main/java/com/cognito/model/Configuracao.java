
package com.cognito.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Configuracao {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int id_config;
  @Column(name = "id_usuario")
  private int id_usuario;
  @Column(name = "alto_contraste")
  private boolean alto_contraste;
  @Column(name = "texto_ampliado")
  private boolean texto_ampliado;
  @Column(name = "sensibilidade_toque")
  private float sensibilidade_toque;
  @Column(name = "modo_voz")
  private boolean modo_voz;

  public Configuracao(int id_config, int id_usuario, boolean alto_contraste, boolean texto_ampliado,
      float sensibilidade_toque, boolean modo_voz) {
    this.id_config = id_config;
    this.id_usuario = id_usuario;
    this.alto_contraste = alto_contraste;
    this.texto_ampliado = texto_ampliado;
    this.sensibilidade_toque = sensibilidade_toque;
    this.modo_voz = modo_voz;
  }

  public int getId_config() {
    return id_config;
  }

  public void setId_config(int id_config) {
    this.id_config = id_config;
  }

  public int getId_usuario() {
    return id_usuario;
  }

  public void setId_usuario(int id_usuario) {
    this.id_usuario = id_usuario;
  }

  public boolean isAlto_contraste() {
    return alto_contraste;
  }

  public void setAlto_contraste(boolean alto_contraste) {
    this.alto_contraste = alto_contraste;
  }

  public boolean isTexto_ampliado() {
    return texto_ampliado;
  }

  public void setTexto_ampliado(boolean texto_ampliado) {
    this.texto_ampliado = texto_ampliado;
  }

  public float getSensibilidade_toque() {
    return sensibilidade_toque;
  }

  public void setSensibilidade_toque(float sensibilidade_toque) {
    this.sensibilidade_toque = sensibilidade_toque;
  }

  public boolean isModo_voz() {
    return modo_voz;
  }

  public void setModo_voz(boolean modo_voz) {
    this.modo_voz = modo_voz;
  }
}
