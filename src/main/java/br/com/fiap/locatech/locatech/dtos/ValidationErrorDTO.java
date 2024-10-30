package br.com.fiap.locatech.locatech.dtos;

import java.util.List;

public record ValidationErrorDTO(List<String> errors, int status) {
}
