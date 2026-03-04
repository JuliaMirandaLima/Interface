package exercicio1;
public class Cavalo extends Peca implements Movimento  {
    public Cavalo(String cor, String posicao) {
        super(cor, posicao);
    }

    @Override
    public void movimentarPeca(String posicaoFinal) {
       System.out.println("Movimentando a peça em L");
    }
    
}
