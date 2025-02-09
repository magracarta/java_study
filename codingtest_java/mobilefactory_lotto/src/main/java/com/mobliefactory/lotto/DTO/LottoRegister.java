package com.mobliefactory.lotto.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LottoRegister {
    private int seq;
    private int lottoseq;
    private String phoneNumber;
    private boolean check;
}
