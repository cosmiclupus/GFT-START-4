package com.dio.base;
import com.dio.base.Order;
import java.math.BigDecimal;

/**
 * @author Yatherson Lucas
 * @version 1.0.0
 * @see BigDecimal
 * @since Release 1.0.0
 *
 */

public class Order {

    // representa o código do pedido
    private final String code;
    private final BigDecimal totalValue;

    private String[] items;

    /**
     * Construtor da classe
     *
     * @param code Código do pedido
     * @param totalValue Valor total do pedido
     */
    public Order(String code, int totalValue){
        this.code = code;
        this.totalValue = totalValue;
    }

    /**
     * Calcula o valor total de acordo com o valor do pedido.Se o pedido for maior que R$100,00 uma taxa será cobrada.
     *
     * @return Valor total do pedido com as taxas
     * @throws RunTimeException Se o pedido for um valor negativo
     */


    public BigDecimal calculaTaxa() throws RunTimeException{
        if(this.totalValue.signum() < 0){
            throws new RunTimeException("O pedido nao pode ter valor negativo!");
        }
        if(this.totalValue.comparato(new BigDecimal("100.00")) > 100 ){
            return this.totalValue.multiply(new BigDecimal("0.99"));
        }
        return this.totalValue;
    }

    public void printItems(){
        for(String i : items) {
            System.out.println(i);
        }
    }

}

