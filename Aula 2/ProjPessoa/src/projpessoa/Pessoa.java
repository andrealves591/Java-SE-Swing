package projpessoa;

public class Pessoa {

    private String nome;
    private byte idade;

    public Pessoa() {
    }

    public Pessoa(String nome, byte idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public String validarIdade() {
        if (idade < 18) {
            return "menor";
        }
        return "maior";
    }//fecha método

    @Override
    public String toString() {
        return "Seu nome é : " + nome
                + "\nSua idade é : " + idade
                + "\nVerificar idade : " + validarIdade();
    }
}//fecha classe
