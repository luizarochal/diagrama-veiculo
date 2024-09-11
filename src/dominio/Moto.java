package dominio;

public class Moto extends Veiculo {

    private Double cilindradas;

    public Moto(String marca, String modelo, String cor, Double preco, Double cilindradas) {
        super(marca, modelo, cor, preco);
        this.cilindradas = cilindradas;
    }

    public Double getCilindradas() {
        return cilindradas;
    }

    @Override
    public String toString() {
        return "Moto{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", preco=" + getPreco() +
                ", cilindradas=" + cilindradas +
                '}';
    }
    
}
