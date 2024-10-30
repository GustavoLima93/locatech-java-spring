package br.com.fiap.locatech.locatech.entities;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Pessoa {
    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
    private String email;
}
