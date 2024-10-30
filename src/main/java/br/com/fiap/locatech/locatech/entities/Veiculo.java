package br.com.fiap.locatech.locatech.entities;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Veiculo {
    private Long id;
    private String marca;
    private String modelo;
    private String placa;
    private int  ano;
    private String cor;
    private BigDecimal valorDiaria;
}
