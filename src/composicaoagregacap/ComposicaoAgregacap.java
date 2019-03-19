/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicaoagregacap;

/**
 *
 * @author Rafael
 */
public class ComposicaoAgregacap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ComposicaoAgregacap composicaoAgregacap = new ComposicaoAgregacap();
        composicaoAgregacap.criaRelacionamentoAgregacao();
        composicaoAgregacap.criaRelacionamentoComposicao();
    }

    private void criaRelacionamentoAgregacao() {
        Meia meia = new Meia();
        meia.setTamanho(42);
        meia.setCor("BRANCA");
        //
        Gaveta gaveta = new Gaveta();
        gaveta.setMeia(meia);
        //
        // Independente de a gaveta existir ou de a gaveta ter uma referencia
        // para a meia, a meia sempre irá existir
        gaveta.setMeia(null);
        gaveta = null;
    }
    
    private void criaRelacionamentoComposicao()
    {
        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.setNumero(1);
        notaFiscal.adicionaItem("Item 1", 2.5);
        notaFiscal.adicionaItem("Item 2", 3.5);
        notaFiscal.adicionaItem("Item 3", 4.5);
        notaFiscal = null;
    }

}
