package com.challenge.dto;

import com.challenge.models.Veiculo;

public class VeiculoDTO implements  Comparable<VeiculoDTO> {

    String nome;
    String marca;
    String modelo;
    String anoFabricacao;
    Double valorTotalPercorrido;
    Double combustivelUtilizado;

    public VeiculoDTO(Veiculo veiculo) {
        this.nome = veiculo.getNome();
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.anoFabricacao = veiculo.getModelo();
        this.valorTotalPercorrido = veiculo.getValorTotalPercorrido();
        this.combustivelUtilizado = veiculo.getCombustivelUtilizado();
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

    public Double getValorTotalPercorrido() { return valorTotalPercorrido;}

    public void setValorTotalPercorrido(Double valorTotalPercorrido) { this.valorTotalPercorrido = valorTotalPercorrido;}

    public Double getCombustivelUtilizado() { return combustivelUtilizado; }

    public void setCombustivelUtilizado(Double quantidadeDeCombustivelUtilizado) { this.combustivelUtilizado = quantidadeDeCombustivelUtilizado; }

    @Override
    public int compareTo(VeiculoDTO veiculoDTO) {
        if (this.valorTotalPercorrido != null && this.valorTotalPercorrido > veiculoDTO.getValorTotalPercorrido()) {
            return -1;
        } if(this.valorTotalPercorrido != null && this.valorTotalPercorrido < veiculoDTO.getValorTotalPercorrido()) {
            return 1;
        }
        return 0;
    }
}