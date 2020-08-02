package com.challenge.util;

import com.challenge.dto.VeiculoDTO;
import com.challenge.models.CalculoDeGasto;
import com.challenge.models.Veiculo;
import com.challenge.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.List;

@Configuration
public class CalculoDeGastoUtil {

    @Autowired
    VeiculoRepository veiculoRepository;

    public List<VeiculoDTO> calculoDeVeiculos(CalculoDeGasto calculoDeGasto) {

        List<Veiculo> veiculos = veiculoRepository.findAll();

        for (Veiculo veiculo : veiculos) {
            veiculo.setValorTotalPercorrido(calculoGasto(veiculo, calculoDeGasto));
            veiculo.setCombustivelUtilizado(calculaKMPercorrido(veiculo, calculoDeGasto));
        }
        List<VeiculoDTO> veiculosDTO = VeiculoUtil.parseList(veiculos);
        Collections.sort(veiculosDTO);
        return veiculosDTO;
    }

    public Double calculoGasto(Veiculo veiculo, CalculoDeGasto calculoDeGasto) {
         double gasto = (calculoDeGasto.getTotalKMCidade() / veiculo.getConsumoMedioCidade() * calculoDeGasto.getPrecoGasolina());
         gasto += (calculoDeGasto.getTotalKMRodovia() / veiculo.getConsumoMedioRodovia() * calculoDeGasto.getPrecoGasolina());
         return gasto;
    }

    public Double calculaKMPercorrido(Veiculo veiculo, CalculoDeGasto calculoDeGasto) {
        double gasto = (calculoDeGasto.getTotalKMCidade() / veiculo.getConsumoMedioCidade());
        gasto += (calculoDeGasto.getTotalKMRodovia() / veiculo.getConsumoMedioCidade());
        return gasto;
    }
}
