package com.challenge.resources;

import com.challenge.dto.VeiculoDTO;
import com.challenge.models.CalculoDeGasto;
import com.challenge.util.CalculoDeGastoUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value="/api")
public class CalculoGastoResource {

    @Autowired
    CalculoDeGastoUtil calculoDeGastoUtil;

    @PostMapping("/calculogasto")
    public List<VeiculoDTO> listaVeiculos(@RequestBody CalculoDeGasto calculoDeGasto) {
        return calculoDeGastoUtil.calculoDeVeiculos(calculoDeGasto);
    }
}
