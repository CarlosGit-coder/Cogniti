
package com.cognito.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Configuracao {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int idConfig;

  @OneToOne
  @JoinColumn(name = "fk_config_usuario", nullable = false)
  private int idUsuario;
  @Column(name = "alto_contraste")
  private boolean altoContraste;
  @Column(name = "texto_ampliado")
  private boolean textoAmpliado;
  @Column(name = "sensibilidade_toque")
  private float sensibilidadeToque;
  @Column(name = "modo_voz")
  private boolean modoVoz;

  public int getIdConfig() {
    return idConfig;
  }

  public void setIdConfig(int idConfig) {
    this.idConfig = idConfig;
  }

  public int getIdUsuario() {
    return idUsuario;
  }

  public void setIdUsuario(int idUsuario) {
    this.idUsuario = idUsuario;
  }

  public boolean isAltoContraste() {
    return altoContraste;
  }

  public void setAltoContraste(boolean altoContraste) {
    this.altoContraste = altoContraste;
  }

  public boolean isTextoAmpliado() {
    return textoAmpliado;
  }

  public void setTextoAmpliado(boolean textoAmpliado) {
    this.textoAmpliado = textoAmpliado;
  }

  public float getSensibilidadeToque() {
    return sensibilidadeToque;
  }

  public void setSensibilidadeToque(float sensibilidadeToque) {
    this.sensibilidadeToque = sensibilidadeToque;
  }

  public boolean isModoVoz() {
    return modoVoz;
  }

  public void setModoVoz(boolean modoVoz) {
    this.modoVoz = modoVoz;
  }

  public Configuracao(int idConfig, int idUsuario, boolean altoContraste, boolean textoAmpliado,
      float sensibilidadeToque, boolean modoVoz) {
    this.idConfig = idConfig;
    this.idUsuario = idUsuario;
    this.altoContraste = altoContraste;
    this.textoAmpliado = textoAmpliado;
    this.sensibilidadeToque = sensibilidadeToque;
    this.modoVoz = modoVoz;
  }

}
