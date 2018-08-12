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
public class SeriadoVO {
    
    private long idSeriado;
    private String nome;
    private String temporada;

    public SeriadoVO() {
    }

    public long getIdSeriado() {
        return idSeriado;
    }

    public void setIdSeriado(long idSeriado) {
        this.idSeriado = idSeriado;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getTemporada() {
        return temporada;
    }
    
    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    /* toString() editado para ser mostrado exatamente dessa maneira na JComboBox
    em GuiCadEpisodio */
    @Override
    public String toString() {
        return idSeriado + " - " + nome + ", " + temporada + "temp.";
    }
    
}//fecha classe
