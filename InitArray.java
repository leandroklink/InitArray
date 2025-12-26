/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InitArray3;

/**
 *
 * @author Leandro
 */
public class InitArray {
    public static void main(String[] args) {
        if (args.length != 3){
            System.out.println("""
                               Error: Please re\u00adenter the entire command, including
                               an array size, initial value and increment.""");
        }else{
            //obtem o tamanho do array pelo primeiro argumento
            int arrayLength = Integer.parseInt(args[0]);
            
            int[] array = new int[arrayLength];//cria o array
            //obtem o valor inicial e incrementa na variavel
            int initialValue = Integer.parseInt(args[1]);
            //ontem o segundo valor e incrementa na variavel    
            int increment = Integer.parseInt( args[2]);
            
            for (int c = 0; c < array.length; c++) 
                array[c] = initialValue + increment * c;
            
            System.out.printf("%s%8s\n", "Index", "Value");
                
                //exibe o valor em índice no array
                for (int c = 0; c < array.length; c++) {
                    System.out.printf("%5d%8d\n", c, array[c]);
                }
        }
    }
}
