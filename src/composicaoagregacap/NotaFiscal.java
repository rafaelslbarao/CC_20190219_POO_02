/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicaoagregacap;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class NotaFiscal {
    private Integer numero;
    private ArrayList<ItemNotaFiscal> itensNota;
    
    public NotaFiscal()
    {
        itensNota = new ArrayList<>();
    }

    public void adicionaItem(String item, Double valor)
    {
        ItemNotaFiscal itemNotaFiscal = new ItemNotaFiscal();
        itemNotaFiscal.setItem(item);
        itemNotaFiscal.setValor(valor);
        itensNota.add(itemNotaFiscal);
    }
    
    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    
}
