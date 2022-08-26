package br.edu.ifsertaope.sistemas_entregas.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_PRODUTOS")
public class ProdutoModel implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id; //IDENTIFICADORES ÚNICOS, NÃO VÃO CAUSAR ERROS POR CONSEQUÊNCIA DE ID
    @Column(nullable = false, unique = true, length = 10)
    private String number;
    @Column(nullable = false, length = 50)
    private String nome;
    @Column(nullable = false, length = 50)
    private String preco;
    @Column(nullable = false)
    private LocalDateTime dataderegistro;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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

    public LocalDateTime getDataderegistro() {
        return dataderegistro;
    }

    public void setDataderegistro(LocalDateTime dataderegistro) {
        this.dataderegistro = dataderegistro;
    }

}
