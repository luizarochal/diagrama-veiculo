package dominio;

public class CarroUtilitario extends Carro{

    private Double cargaKg;
    private Double descontoPJ;

    public CarroUtilitario(String marca, String modelo, String cor, Double preco, Double potenciaCV, Double cargaKg, Double descontoPJ) {
        super(marca, modelo, cor, preco, potenciaCV);
        this.cargaKg = cargaKg;
        this.descontoPJ = descontoPJ;
    }

    public Double getCargaKg() {
        return cargaKg;
    }

    public Double getDescontoPJ() {
        return descontoPJ;
    }

    public void setDescontoPJ(Double descontoPJ) {
        this.descontoPJ = descontoPJ;
    }

    public Double calcularPrecoComDesconto(){
        return getPreco() * (1 - descontoPJ);
    }

    @Override
    public String toString() {
        return "CarroUtilitario{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", cor='" + getCor() + '\'' +
                ", preco=" + getPreco() +
                ", potenciaCV=" + getPotenciaCV() +
                ", cargaKg=" + cargaKg +
                ", descontoPJ=" + descontoPJ +
                '}';
    }
    
}
