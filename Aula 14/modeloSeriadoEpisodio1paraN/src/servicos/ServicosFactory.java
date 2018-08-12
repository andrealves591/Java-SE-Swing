/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

/**
 * @author Thiago Cury
 * @since 25/04/2014
 * @version 1.0
 */
public class ServicosFactory {
    
    private static final SeriadoServicos seriadoServicos=new SeriadoServicos();
    private static final EpisodioServicos episodioServicos=new EpisodioServicos();
    
    public static SeriadoServicos getSeriadoServicos(){
        return seriadoServicos;
    }//fecha método
    
    public static EpisodioServicos getEpisodioServicos(){
        return episodioServicos;
    }//fecha método

}//fecha classe
