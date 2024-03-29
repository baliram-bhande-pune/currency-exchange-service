package com.exchangeapi.currencyexchange.controller;

import com.exchangeapi.currencyexchange.dto.ExchangeDto;
import com.exchangeapi.currencyexchange.entity.enums.EnumCurrency;
import com.exchangeapi.currencyexchange.service.ExchangeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/exchange")
@AllArgsConstructor
public class ExchangeController {

    private final ExchangeService exchangeService;

    /**
     * ResponseEntity
     * @param base name
     * @param target name
     * @param amount double
     * @return base
     */
    @GetMapping
    public ResponseEntity<ExchangeDto> getRates(@RequestParam(name = "base", required = false) EnumCurrency base,
                                                @RequestParam(name = "target", required = false) List<EnumCurrency> target,
                                                @RequestParam(name = "amount") Double amount) {
        return ResponseEntity.ok(exchangeService.calculateExchangeRate(amount
                , base, target));
    }
}
