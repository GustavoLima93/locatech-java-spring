package br.com.fiap.locatech.locatech.entities;

import br.com.fiap.locatech.locatech.dtos.AluguelRequestDTO;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Aluguel {
    private Long id;
    private Long pessoaId; //pessoa_id
    private Long veiculoId; //veiculo_id
    private String veiculoModelo; //veiculo_modelo -> modelo
    private String pessoaCpf;
    private String pessoaNome;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private BigDecimal valorTotal;

    public Aluguel(AluguelRequestDTO aluguelDTO, BigDecimal valor) {
        this.pessoaId  = aluguelDTO.pessoaId();
        this.veiculoId = aluguelDTO.veiculoId();
        this.dataInicio = aluguelDTO.dataInicio();
        this.dataFim = aluguelDTO.dataFim();
        this.valorTotal = valor;
    }
}

