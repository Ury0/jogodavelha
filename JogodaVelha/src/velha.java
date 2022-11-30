public class velha {
    String sym;
    String matrizSym[][]={{"","",""}
                          ,{"","",""},
                           {"","",""}};
    Boolean matrizLog[][]={{true,true,true}
                           ,{true,true,true},
                            {true,true,true}};

    void resetMatriz(String sym){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                this.matrizSym[i][j] = sym;
                this.matrizLog[i][j] = true;
                this.sym = sym;
            }
        }
    } 
    void setMatriz(int i, int j, String sym){
        matrizSym[i][j] = sym;
        matrizLog[i][j] = false;
    }
    String[][] getMatrizSym(){
        return this.matrizSym;
    }
    Boolean getMatrizLog(int i, int j){
        return this.matrizLog[i][j];
    }
    Boolean verifyPonto(String[][] matrizSym){
        Boolean ponto = false;
       for(int i=0;i<3;i++){
            if(!(matrizSym[i][0].equals(sym)) && !(matrizSym[i][1].equals(sym)) && !(matrizSym[i][2].equals(sym))){
                if((matrizSym[i][0].equals(matrizSym[i][1])) && (matrizSym[i][0].equals(matrizSym[i][2]))){
                    ponto = true;
                }
            }
            if(!(matrizSym[0][i].equals(sym) ) && !(matrizSym[1][i].equals(sym)) && !(matrizSym[2][i].equals(sym))){
                if((matrizSym[0][i].equals(matrizSym[1][i])) && (matrizSym[0][i].equals(matrizSym[2][i]))){
                    ponto = true;
                }

            }
       }
       if(!(matrizSym[0][0].equals(sym)) && !(matrizSym[1][1].equals(sym)) && !(matrizSym[2][2].equals(sym))){
            if((matrizSym[0][0].equals(matrizSym[1][1])) && (matrizSym[1][1].equals(matrizSym[2][2]))){
                ponto = true;
            }
        }
        if(!(matrizSym[0][2].equals(sym)) && !(matrizSym[1][1].equals(sym)) && !(matrizSym[2][0].equals(sym))){
            if((matrizSym[0][2].equals(matrizSym[1][1]) ) && (matrizSym[1][1].equals(matrizSym[2][0]))){
                ponto = true;
            }
        }
       return ponto;
    }
    boolean verifyVelha(String sym){
        Boolean velha;
        String matriz[][]={{"","",""}
                          ,{"","",""},
                           {"","",""}};
        for(int i = 0 ;i<3;i++){
            for(int j=0;j<3;j++){
                if(this.matrizSym[i][j].equals(this.sym)){
                    matriz[i][j] = sym;
                }else{
                    matriz[i][j] = this.matrizSym[i][j];
                }
            }
        }
        if(verifyPonto(matriz)){
            velha = false;
        }else{
            velha = true;
        }
        return velha;
    }

    
    

}



