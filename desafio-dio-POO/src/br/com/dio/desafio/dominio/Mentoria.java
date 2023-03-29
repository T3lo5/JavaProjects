package br.com.dio.desafio.dominio;
import java.time.LocalDate;
public class Mentoria extends Conteudo{
    @Override
    public double calcularXp() {
        return XP_PADRAO + 200;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    LocalDate data;

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

}
