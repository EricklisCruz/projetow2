package br.edu.ifsertaope.sistemas_entregas.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class ProdutoDto {

    @NotBlank
    @Size(max = 14)
    private String number;
    @NotBlank
    private String nome;

    @NotBlank
    private String preco;


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
}
