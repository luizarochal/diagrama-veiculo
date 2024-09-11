package dominio;

public class CarroPasseio extends Carro{

    private Integer quilometragem;

    public CarroPasseio(String marca, String modelo, String cor, Double preco, Double potenciaCV, Integer quilometragem) {
        super(marca, modelo, cor, preco, potenciaCV);
        this.quilometragem = quilometragem;
    }

    public Integer getQuilometragem() {
        return quilometragem;
    }

    @Override
    public String toString() {
        return "CarroPasseio{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", preco=" + getPreco() +
                ", potenciaCV=" + getPotenciaCV() +
                ", quilometragem=" + quilometragem +
                '}';
    }
    
}
