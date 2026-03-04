package exercicio1;
public class Bispo extends Peca implements Movimento {

    public Bispo(String cor, String posicao) {
        super(cor, posicao);
       
    }

    @Override
    public void movimentarPeca(String posicaoFinal) {
        System.out.println("Movimentando a peça em diagonal");
    }

    
}
