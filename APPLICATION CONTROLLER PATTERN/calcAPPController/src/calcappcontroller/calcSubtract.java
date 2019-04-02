/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcappcontroller;

/**
 *
 * @author Giovanni
 */
public class calcSubtract implements calcInterface{

    @Override
    public Double execute(Double firstNumber, Double secondNumber) {
        Double calcAnswer = firstNumber - secondNumber;
        return (calcAnswer);    
    }    
}