package com.challenge.util;

import com.challenge.dto.VeiculoDTO;
import com.challenge.models.Veiculo;

import java.util.ArrayList;
import java.util.List;

public class VeiculoUtil {

    public static VeiculoDTO parse(Veiculo veiculo) {
        return new VeiculoDTO(veiculo);
    }

    public static List<VeiculoDTO> parseList(List<Veiculo> veiculos) {
        List<VeiculoDTO> veiculosDTO = new ArrayList<VeiculoDTO>();
        for (Veiculo veiculo: veiculos) {
            VeiculoDTO veiculoDTO = new VeiculoDTO(veiculo);
            veiculosDTO.add(veiculoDTO);
        }
        return veiculosDTO;
    }


}
