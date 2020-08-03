package com.challenge.resources;

import com.challenge.dto.VeiculoDTO;
import com.challenge.models.Veiculo;
import com.challenge.repository.VeiculoRepository;
import com.challenge.util.VeiculoUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
@Api(value = "API REST de Veiculo")
@CrossOrigin(origins = "*")
public class VeiculoResource {

    @Autowired
    VeiculoRepository veiculoUtil;

    @PostMapping("/veiculo")
    @ApiOperation(value = "Grava um veículo")
    public VeiculoDTO salvarVeiculo(@RequestBody Veiculo veiculo) {
        veiculoUtil.save(veiculo);
        return VeiculoUtil.parse(veiculo);
    }

}
