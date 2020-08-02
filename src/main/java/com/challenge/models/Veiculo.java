package com.challenge.models;

import javax.persistence.*;

@Entity
@Table(name = "VEICULO")
public class Veiculo {

    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
    public Integer id;
    String nome;
    String marca;
    String modelo;
    String anoFabricacao;
    private Double consumoMedioCidade;
    private Double consumoMedioRodovia;
    Double valorTotalPercorrido;
    Double combustivelUtilizado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(String anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public Double getConsumoMedioCidade() {
        return consumoMedioCidade;
    }

    public void setConsumoMedioCidade(Double consumoMedioCidade) {
        this.consumoMedioCidade = consumoMedioCidade;
    }

    public Double getConsumoMedioRodovia() {
        return consumoMedioRodovia;
    }

    public void setConsumoMedioRodovia(Double consumoMedioRodovia) {
        this.consumoMedioRodovia = consumoMedioRodovia;
    }

    public Double getValorTotalPercorrido() { return valorTotalPercorrido;}

    public void setValorTotalPercorrido(Double valorTotalPercorrido) { this.valorTotalPercorrido = valorTotalPercorrido;}

    public Double getCombustivelUtilizado() { return combustivelUtilizado; }

    public void setCombustivelUtilizado(Double quantidadeDeCombustivelUtilizado) { this.combustivelUtilizado = quantidadeDeCombustivelUtilizado; }
}