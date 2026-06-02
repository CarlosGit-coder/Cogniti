
package com.cognito.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Atividade {
  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  private int idAtividade;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "fk_atividade_aula", nullable = false)
  private int idAula;

  @Column(name = "pergunta")
  private String pergunta;

  @Column(name = "resposta_correta")
  private String respostaCorreta;

  @Column(name = "tipo")
  private String tipo;

  public int getIdAtividade() {
    return idAtividade;
  }

  public void setIdAtividade(int idAtividade) {
    this.idAtividade = idAtividade;
  }

  public int getIdAula() {
    return idAula;
  }

  public void setIdAula(int idAula) {
    this.idAula = idAula;
  }

  public String getPergunta() {
    return pergunta;
  }

  public void setPergunta(String pergunta) {
    this.pergunta = pergunta;
  }

  public String getRespostaCorreta() {
    return respostaCorreta;
  }

  public void setRespostaCorreta(String respostaCorreta) {
    this.respostaCorreta = respostaCorreta;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public Atividade(int idAtividade, int idAula, String pergunta, String respostaCorreta, String tipo) {
    this.idAtividade = idAtividade;
    this.idAula = idAula;
    this.pergunta = pergunta;
    this.respostaCorreta = respostaCorreta;
    this.tipo = tipo;
  }

}
