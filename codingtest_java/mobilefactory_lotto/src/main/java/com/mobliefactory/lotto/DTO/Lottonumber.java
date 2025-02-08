package com.mobliefactory.lotto.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lottonumber {
    private int seq;
    private int rank;
    private String number;
    private boolean use = false;

}
