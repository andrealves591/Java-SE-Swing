/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 * @author Thiago Cury
 * @since 25/04/2014
 * @version 1.0
 */
public class EpisodioVO {
    
    private long idEpisodio;
    private String nome;
    private double duracao;
    private SeriadoVO seriado;

    public EpisodioVO() {
    }
    /**
     * 
     * @param idEpisodio recebe o id do episodio
     * @param nome recebe um nome
     * @param duracao recebe a duracao
     * @param seriado recebe o seriado
     */
    public EpisodioVO(long idEpisodio, String nome, double duracao, SeriadoVO seriado) {
        this.idEpisodio = idEpisodio;
        this.nome = nome;
        this.duracao = duracao;
        this.seriado = seriado;
    }

    public SeriadoVO getSeriado() {
        return seriado;
    }

    public void setSeriado(SeriadoVO seriado) {
        this.seriado = seriado;
    }

    public long getIdEpisodio() {
        return idEpisodio;
    }

    public void setIdEpisodio(long idEpisodio) {
        this.idEpisodio = idEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "EpisodioVO{" + "idEpisodio=" + idEpisodio + ", nome=" + nome + ", duracao=" + duracao + ", seriado=" + seriado + '}';
    }
}//fecha classe