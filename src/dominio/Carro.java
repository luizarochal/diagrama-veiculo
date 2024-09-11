package dominio;

public class Carro extends Veiculo {

    private Double potenciaCV;

    public Carro(String marca, String modelo, String cor, Double preco, Double potenciaCV) {
        super(marca, modelo, cor, preco);
        this.potenciaCV = potenciaCV;
    }

    public Double getPotenciaCV() {
        return potenciaCV;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", preco=" + getPreco() +
                ", potenciaCV=" + potenciaCV +
                '}';
    }
    
}
