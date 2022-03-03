package io.codelex.currencyConverter;

import java.math.BigDecimal;

public class CurrencyRate {

    private String code;

    public void setCode(String code) {
        this.code = code;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getCode() {
        return code;
    }

    public BigDecimal getRate() {
        return rate;
    }

    private BigDecimal rate;

    public CurrencyRate(String code, BigDecimal rate) {
        this.code = code;
        this.rate = rate;
    }
}
