import veiculo.Aviao;
import veiculo.Barco;
import veiculo.Carro;
import veiculo.Veiculo;

public class Principal {
    public static void main (String[] args) {
      
        Carro ka = new Carro();
        ka.locomover();

        Veiculo veic = new Carro();
        veic.locomover();

        Barco barc = new Barco();
        barc.locomover();

        Aviao boing = new Aviao();
        boing.locomover();
    }
}
