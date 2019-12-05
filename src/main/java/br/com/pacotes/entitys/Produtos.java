package br.com.pacotes.entitys;

import br.com.pacotes.enums.StatusProdutoEnum;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PRODUTOS")
public class Produtos {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private Long id;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "REF_AUXILIAR")
    private String refAuxiliar;
    @Column(name = "REF_FABRICANTE")
    private String refFabricante;
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "DATA_ENTRADA")
    private Date dataEntrada = new Date();
    @Temporal(value = TemporalType.TIMESTAMP)
    @Column(name = "DATA_VALIDADE")
    private Date dataValidade;
    @Column(name = "QT_ENTRADA")
    private Double qtdadeEntrada;
    @Column(name = "QT_DISPONIVEL")
    private Double qtdadeDisponivel;
    @Column(name = "STATUS")
    private StatusProdutoEnum anEnum;

    public Produtos(String descricao, String refAuxiliar, String refFabricante, Date dataEntrada,
                    Date dataValidade, Double qtdadeEntrada, Double qtdadeDisponivel,
                    StatusProdutoEnum anEnum) {
        this.descricao = descricao;
        this.refAuxiliar = refAuxiliar;
        this.refFabricante = refFabricante;
        this.dataEntrada = dataEntrada;
        this.dataValidade = dataValidade;
        this.qtdadeEntrada = qtdadeEntrada;
        this.qtdadeDisponivel = qtdadeDisponivel;
        this.anEnum = anEnum;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRefAuxiliar() {
        return refAuxiliar;
    }

    public void setRefAuxiliar(String refAuxiliar) {
        this.refAuxiliar = refAuxiliar;
    }

    public String getRefFabricante() {
        return refFabricante;
    }

    public void setRefFabricante(String refFabricante) {
        this.refFabricante = refFabricante;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Double getQtdadeEntrada() {
        return qtdadeEntrada;
    }

    public void setQtdadeEntrada(Double qtdadeEntrada) {
        this.qtdadeEntrada = qtdadeEntrada;
    }

    public Double getQtdadeDisponivel() {
        return qtdadeDisponivel;
    }

    public void setQtdadeDisponivel(Double qtdadeDisponivel) {
        this.qtdadeDisponivel = qtdadeDisponivel;
    }

    public StatusProdutoEnum getAnEnum() {
        return anEnum;
    }

    public void setAnEnum(StatusProdutoEnum anEnum) {
        this.anEnum = anEnum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produtos)) return false;

        Produtos produtos = (Produtos) o;

        if (!getId().equals(produtos.getId())) return false;
        if (!getDescricao().equals(produtos.getDescricao())) return false;
        if (!getRefAuxiliar().equals(produtos.getRefAuxiliar())) return false;
        if (!getRefFabricante().equals(produtos.getRefFabricante())) return false;
        if (!getDataEntrada().equals(produtos.getDataEntrada())) return false;
        if (!getDataValidade().equals(produtos.getDataValidade())) return false;
        if (!getQtdadeEntrada().equals(produtos.getQtdadeEntrada())) return false;
        if (!getQtdadeDisponivel().equals(produtos.getQtdadeDisponivel())) return false;
        return getAnEnum() == produtos.getAnEnum();
    }

    @Override
    public int hashCode() {
        int result = getId().hashCode();
        result = 31 * result + getDescricao().hashCode();
        result = 31 * result + getRefAuxiliar().hashCode();
        result = 31 * result + getRefFabricante().hashCode();
        result = 31 * result + getDataEntrada().hashCode();
        result = 31 * result + getDataValidade().hashCode();
        result = 31 * result + getQtdadeEntrada().hashCode();
        result = 31 * result + getQtdadeDisponivel().hashCode();
        result = 31 * result + getAnEnum().hashCode();
        return result;
    }


}
