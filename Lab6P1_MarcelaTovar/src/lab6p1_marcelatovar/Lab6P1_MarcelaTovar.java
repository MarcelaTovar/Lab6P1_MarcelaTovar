
package lab6p1_marcelatovar;

import java.util.*;
public class Lab6P1_MarcelaTovar {

    public static void main(String[] args) {
        int opcion = 0;
        Scanner ObiWan = new Scanner (System.in);
        System.out.println("¡Hola Guillermo!");
        System.out.println("Bienvenido a mi ejercicio del lab");
        System.out.println("Ahora si, empezemos");
        System.out.println("----------------------------------------------------");
        System.out.println("¡Hola! Porfavor dime \n¿Como me llamó?: ");
        String miNombre = ObiWan.nextLine();
        System.out.println("¡Me presentó! Yo soy "+miNombre);
        System.out.println("¿Como te gustaría que te llamrá?: ");
        String tuNombre = ObiWan.nextLine();
        System.out.println("Es un gusto "+tuNombre);
        System.out.println("Empecemos con el menú");
        System.out.println("-----------------------------------------------------");
        
        do{
            System.out.println("--Menu--");
            System.out.println("1. El juego de la vida :D");
            System.out.println("2. Pierda, papel o ...");
            System.out.println("3. Blink-182");
            System.out.println("4. Salir");
            System.out.println("Porfavor "+tuNombre +" ¿Qué desearías hacer?");
            opcion = ObiWan.nextInt();
            //Validacion de los numeros
            while(opcion !=1 || opcion !=2 || opcion !=3 || opcion !=4){
                break;
            }
            switch(opcion){
                case 1 -> Ejercicio1();
                case 2 -> Ejercicio2();
                case 3 -> Ejercicio3();
            } 
            }
        while(opcion == 1 || opcion == 2 || opcion == 3 || opcion !=4);
        
    }
            
    
    public static void Ejercicio3(){
        Scanner ObiWan = new Scanner(System.in);
        System.out.println("¡Hola!");
        System.out.println("¿Cuantas rows quieres?");
        int rows = ObiWan.nextInt();
        System.out.println("¿Cuantas filas quiere?");
        int column = ObiWan.nextInt();
        String[][] matriz = new String [rows][column];
        int[][]matriz2 =new int [rows][column];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                char random = (char) (new Random().nextInt((122 - 97) + 1) + 97);
                int aux = random;
                matriz [i][j] = (random)+" - ";
                matriz2[i][j] = (aux);
                
            }
        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] +" ");
            }
            System.out.println("");
        }
        
        ImprimirMatriz(matriz);
        
    }
    public static void ImprimirMatriz(String [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void Ejercicio2(){
        Scanner ObiWan = new Scanner (System.in);
        System.out.println("¡Hola!");
        System.out.println("Este programa juega piedra, papel o...");
        System.out.println("0. Rock");
        System.out.println("1. Paper");
        System.out.println("2. Scissors");
        System.out.println("3. Lizard");
        System.out.println("4. Spock");

        
        int[][] matriz ={
            {5,1,0,0,4},
            {1,5,2,3,1},
            {0,2,5,2,4},
            {0,3,2,5,3},
            {4,1,4,3,5},
        };
        
        System.out.println("Matriz: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("{ "+ matriz[i][j] + " }");
            }
            System.out.println("");
        }
    
        System.out.println("Ingrese numero: ");
        int numeroUsuario = ObiWan.nextInt();
        
        
        int NumeroMaquina = new Random().nextInt((4 - 0) + 1) + 0;
        Maquina(NumeroMaquina);
        
        int result = matriz[numeroUsuario][NumeroMaquina];
        
        if (result == NumeroMaquina){
            System.out.println("¡Lo siento Penny! Mejor suerte la próxima");    
        }else if (result == numeroUsuario){
            System.out.println("¡Bazinga! Live long and prosper winner");
        }else{
            System.out.println("Fue un empate");
        }
        
    }
    
    public static void Ejercicio1(){
        Scanner ObiWan = new Scanner (System.in);
        int dado = new Random().nextInt((6-1)+1)+1;
        int row = 0;
        int column = 0;
        char posicion = 0;
        System.out.println("¡Hola!");
        System.out.println("Bienvenido al juego de la vida");
        
        char[][] matriz = new char [9][9];
        
        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = '-';
                matriz[0][0] = 'P';
            }
            
        }
        System.out.println("Tablero Incial ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
        do{
            System.out.println("Presione enter para tirar dado");
            String espacio = ObiWan.nextLine();
            column = dado;
            
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = '-'; 
                    matriz[row][column] = 'p';
                    posicion = matriz[row][column];
            }
           
        }
          if (posicion == matriz[0][2] || posicion == matriz[0][4] || posicion == matriz[0][6] || posicion == matriz[2][0] || posicion == matriz[2][4] || posicion == matriz[2][6] || posicion == matriz[4][0] || posicion == matriz[4][2] || posicion == matriz[4][6] || posicion == matriz[6][0] || posicion == matriz[6][2] || posicion == matriz[6][4] ){
            
            System.out.println("¡Has perdido 5 años de vida!");
            
        } 
          if(posicion == matriz [0][3] || posicion == matriz [1][1] || posicion == matriz [1][4] || posicion == matriz [2][2] || posicion == matriz[2][5] || posicion == matriz[3][0] || posicion == matriz[3][2] || posicion == matriz[3][6] || posicion == matriz[4][1] || posicion== matriz[4][4] || posicion == matriz[4][7] || posicion == matriz[5][2] || posicion == matriz[5][5] || posicion == matriz[5][5] || posicion == matriz[6][3] || posicion == matriz[6][6]|| posicion == matriz[7][4]){
              System.out.println("¡Has ganado 125,000 lempiras!");
          }
          
          if(posicion == matriz[7][7]){
              System.out.println("¡Felicidades llegaste a la meta!");
          }
          
            row++;
           dado = new Random().nextInt((6-1)+1)+1;
           column = dado;
      
            
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        
        
        
        }while(row <= 8 && column <=8);
        System.out.println("Llegaste lejos ¡Que bueno!");
    }
        
  
    
    
    public static void Maquina(int maquina){
        if(maquina == 0){
            System.out.println("La maquina escogió: Rock");
        }else if (maquina == 1){
            System.out.println("La maquina escogió: Paper");
        }else if (maquina == 2){
            System.out.println("La maquina escogió: Scissors");
        }else if (maquina == 3){
            System.out.println("La maquina escogió: Lizard");
        }else{
            System.out.println("La maquina escogió: Spock");
        }       
    }
    
    }
    
    

