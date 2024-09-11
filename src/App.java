import dominio.Carro;
import dominio.CarroPasseio;
import dominio.CarroUtilitario;
import dominio.Moto;
import dominio.Veiculo;

public class App {


    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Fiat", "Uno", "Vermelho", 30000.0);
        System.out.println(veiculo);
        Carro carro = new Carro("Fiat", "Uno", "Vermelho", 30000.0, 75.0);
        System.out.println(carro);
        CarroUtilitario carroUtilitario = new CarroUtilitario("Fiat", "Toro", "Branco", 70000.0, 150.0, 1000.0, 0.1);
        System.out.println(carroUtilitario);
        CarroPasseio carroPasseio = new CarroPasseio("Chevrolet", "Cruze", "Preto", 100000.0, 150.0, 0);
        System.out.println(carroPasseio);
        Moto moto = new Moto("Honda", "CG 160", "Vermelha", 15000.0, 160.0);
        System.out.println(moto);
    }
}
