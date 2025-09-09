public class moldesNinjas {
    private String nome;
    private int idade;
    private String vila;

    //Allargs constructor
    public moldesNinjas(String N, int I, String V) {
        setIdade(I);
        setNome(N);
        setVila(V);
    }

    //Getter
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getVila(){
        return vila;
    }

    //Setter
    public void setNome(String N){
        this.nome = N;
    }
    public void setIdade(int I){
        this.idade = I;
    }
    public void setVila(String V){
        this.vila = V;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", Vila: " + getVila();
    }

}
