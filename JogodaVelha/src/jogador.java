class jogador {
    String nome;
    String simbolo="#";
    int pontos=0;
    int vitorias=0;
    

    String getNome(){
        return nome;
    }

    void setNome(String nome){
        this.nome = nome;
    }
    void setSimbulo(String simbolo){
        this.simbolo = simbolo;
    }
    void setPontos(){
        this.pontos += pontos;
    }
    void setVitorias(){
        this.vitorias += vitorias;
    }

}