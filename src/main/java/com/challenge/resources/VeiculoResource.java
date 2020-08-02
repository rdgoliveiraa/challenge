package com.challenge.resources;

import com.challenge.dto.VeiculoDTO;
import com.challenge.models.Veiculo;
import com.challenge.repository.VeiculoRepository;
import com.challenge.util.VeiculoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class VeiculoResource {

    @Autowired
    VeiculoRepository veiculoUtil;

    @GetMapping("/veiculos")
    public List<Veiculo> listaVeiculos() {
        return veiculoUtil.findAll();
    }

    @PostMapping("/veiculo")
    public VeiculoDTO salvarVeiculo(@RequestBody Veiculo veiculo) {
        veiculoUtil.save(veiculo);
        return VeiculoUtil.parse(veiculo);
    }

    @DeleteMapping("/veiculo")
    public void deletarVeiculo(@RequestBody Veiculo veiculo) {
        veiculoUtil.delete(veiculo);
    }

    @PatchMapping("/pessoa")
    public VeiculoDTO atualizarVeiculo(@RequestBody Veiculo veiculo) {
        veiculoUtil.save(veiculo);
        return new VeiculoDTO(veiculo);
    }
}
