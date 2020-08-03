package com.challenge.resources;

import com.challenge.dto.VeiculoDTO;
import com.challenge.models.CalculoDeGasto;
import com.challenge.util.CalculoDeGastoUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/api")
public class CalculoGastoResource {

    @Autowired
    CalculoDeGastoUtil calculoDeGastoUtil;

    @PostMapping("/calculogasto")
    //@ApiOperation(value = "Retorna uma lista de carros e seus respectivos consumos")
    public List<VeiculoDTO> listaVeiculos(@RequestBody CalculoDeGasto calculoDeGasto) {
        return calculoDeGastoUtil.calculoDeVeiculos(calculoDeGasto);
    }
}
