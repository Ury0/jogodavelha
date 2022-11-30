import java.util.Scanner;
public class JogoDaVelha {
    
    public static void main(String[] args) throws Exception {
        int vet[] = {0,0};
        int count = 2;
        String sym;
        Scanner entrada = new Scanner(System.in);
        jogador P1 = new jogador();
        jogador P2 = new jogador();
        velha matriz = new velha();

        P1.setSimbulo("X");
        P2.setSimbulo("O");
        matriz.resetMatriz("*");
       
        while(true){
            if(count%2 == 0){
                sym = P1.simbolo;
            }else{
                sym = P2.simbolo;
            }       

            System.out.print("\ndigite aposição desejada:");
            String s = entrada.nextLine();
            if(s.equals("sair")){
                break; 
            }else{
               
                    
                try {
                        vet[0] = Integer.parseInt(s.substring(0,1))-1;
                        vet[1] = Integer.parseInt(s.substring(1,2))-1;
                    
                        if(matriz.getMatrizLog(vet[0], vet[1])){
                            matriz.setMatriz(vet[0], vet[1], sym);
                        }else{
                            System.out.println("posicao ocupada");
                            count -= 1;
                        }
                    }
                    catch(NumberFormatException Exception /* || (StringIndexOutOfBoundsException Exception)*/){
                        System.out.println("posicao invalida");
                        count -= 1;
                    }   
           }

            String[][] m = matriz.getMatrizSym();
            for(int i=0;i<3;i++){
                System.out.print("\n");
                for(int j=0;j<3;j++){
                    System.out.print(m[i][j]);
                }
            }
            if(matriz.verifyPonto(matriz.getMatrizSym())){
                System.out.println("\nVITORIA: "+sym);
                break;
            }
            
            if((matriz.verifyVelha(P1.simbolo))&&(matriz.verifyVelha(P2.simbolo))){
                System.out.println("\nVELHA"); 
            }
            count += 1;
        }

        

    }
}
