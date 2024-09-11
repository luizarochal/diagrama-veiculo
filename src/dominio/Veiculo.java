package dominio;

public class Veiculo{

    private String marca;
    private String modelo;
    private String cor;
    private Double preco;

    public Veiculo(String marca, String modelo, String cor, Double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", preco=" + preco +
                '}';
    }

}