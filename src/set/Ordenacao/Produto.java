package set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable <Produto>{

    private long codigo;
    private String nome;
    private double preco;
    private int quantida;

    public Produto(long codigo, String nome, double preco, int quantida) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantida = quantida;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantida() {
        return quantida;
    }

    public long getCodigo() {
        return codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantida=" + quantida +
                '}';
    }
}

class ComparatorPorPreco implements Comparator<Produto>{

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
