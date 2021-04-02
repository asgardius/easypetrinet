package easypetrinet;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author carol
 */
public class Petrinet {
    public int TransitorActivo(int places_tokens[][]){
        
        int transitor_activo;
        ArrayList<Integer> transitores_disponibles = new ArrayList<>();
        int[][] transitores_estados = new int [5][2];

        //Transitor 1
        if (places_tokens[0][1] >= 1 && places_tokens[2][1] >= 1) {
            transitores_estados[0][0] = 1;
            transitores_estados[0][1] = 1;
        }else{
            transitores_estados[0][0] = 1;
            transitores_estados[0][1] = 0; 
        }
        
        //Transitor 2
        if (places_tokens[1][1] >= 1) {
            transitores_estados[1][0] = 2;
            transitores_estados[1][1] = 1;
        }else{
            transitores_estados[1][0] = 2;
            transitores_estados[1][1] = 0;            
        }
        
        //Transitor 3        
        if (places_tokens[0][1] >= 1) {
            transitores_estados[2][0] = 3;
            transitores_estados[2][1] = 1;
        }else{
            transitores_estados[2][0] = 3;
            transitores_estados[2][1] = 0;             
        }
        
        //Transitor 4        
        if (places_tokens[0][1] >= 1 && places_tokens[4][1] >= 1) {
            transitores_estados[3][0] = 4;
            transitores_estados[3][1] = 1;
        }else{
            transitores_estados[3][0] = 4;
            transitores_estados[3][1] = 0;             
        }
        
        //Transitor 5        
        if (places_tokens[3][1] >= 1) {
            transitores_estados[4][0] = 5;
            transitores_estados[4][1] = 1;              
        }else{
            transitores_estados[4][0] = 5;
            transitores_estados[4][1] = 0;              
        }
        //Si hay más de un transitor disponible (si el 1 se repite) se debe elegir uno al azar
        int número_disponibles = 0;
        int posible_transitor = 0;
        for(int i = 0; i < 5; i++){
            if (transitores_estados[i][1] == 1) {
                número_disponibles ++ ;
                transitores_disponibles.add(transitores_estados[i][0]);
                posible_transitor = transitores_estados[i][0];
            }            
        }
        
        /*
        //muestra el arreglo
        for (int i = 0; i < número_disponibles; i++) {
            System.out.println("Disponibles: "+ transitores_disponibles.get(i));            
        }
        */        
        
        //Si hay más de una transición disponible se elige al azar
        if (número_disponibles > 1) {
            int transitor_aleatorio;
            Random random = new Random();
            int posición = random.nextInt(número_disponibles);//(3)
            transitor_aleatorio = transitores_disponibles.get(posición);
            transitor_activo = transitor_aleatorio;
        }else{
            transitor_activo = posible_transitor;
        }          
        System.out.println("transitor activo: "+transitor_activo);
        return transitor_activo;
    }
    
    public int[][] Transitor_1(int places_tokens[][]){
       //Se destruye token p1 y p3
       places_tokens[0][1] = places_tokens[0][1]-1;
       places_tokens[2][1] = places_tokens[2][1]-1;
       //Se crea un token en p2
       places_tokens[1][1] = places_tokens[1][1]+1;
       //imprimir estado de tokens
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(+places_tokens[i][j]);
            }
            System.out.println("");
        }
       return places_tokens;
    }  
    
    public int[][] Transitor_2(int places_tokens[][]){
       //Se destruye token p2
       places_tokens[1][1] = places_tokens[1][1]-1;
       // Se crea un token en p3 y p1
       places_tokens[2][1] = places_tokens[2][1]+1;
       places_tokens[0][1] = places_tokens[0][1]+1;
       //imprimir estado de tokens
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(+places_tokens[i][j]);
            }
            System.out.println("");
        }
       return places_tokens;
       
    }
    
    public int[][] Transitor_3(int places_tokens[][]){
       //Se destruye token p1
       places_tokens[0][1] = places_tokens[0][1]-1;
       // Se crea un token en p4
       places_tokens[3][1] = places_tokens[3][1]+1;
       //imprimir estado de tokens
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(+places_tokens[i][j]);
            }
            System.out.println("");
        }    
       return places_tokens;
    }
    
    public int[][] Transitor_4(int places_tokens[][]){
       //Se destruye token p1 y p5
       places_tokens[0][1] = places_tokens[0][1]-1;
       places_tokens[4][1] = places_tokens[4][1]-1;
       // Se crea un token en p4
       places_tokens[3][1] = places_tokens[3][1]+1;
       //imprimir estado de tokens
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(+places_tokens[i][j]);
            }
            System.out.println("");
        }       
       return places_tokens;
    }
    
    public int[][] Transitor_5(int places_tokens[][]){
       //Se destruye token p4
       places_tokens[3][1] = places_tokens[3][1]-1;
       // Se crea un token en p1 y p5
       places_tokens[0][1] = places_tokens[0][1]+1;
       places_tokens[4][1] = places_tokens[4][1]+1;
       //imprimir estado de tokens
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(+places_tokens[i][j]);
            }
            System.out.println("");
        }      
       return places_tokens;
    }    
}
