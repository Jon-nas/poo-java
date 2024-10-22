import java.io.IOException;

import javax.imageio.IIOException;

public class EncadeamentoExcecao {
    public static void main(String[] args){
        try{
            abrirArquivo();
        } catch(AbrirArquivoExcecao e){
            System.out.println("Uum erro ocorreu na tentativa de abrir o arquivo: " + e.getMessage());
            System.out.println("Causa raiz: " + e.getCause().getMessage());
        }
    }
    public static void abrirArquivo() throws AbrirArquivoExcecao{
        try{
            // simulando uma exceção ao abrir um arquivo.
            throw new IIOException("Incapaz de abrir o arquivo.");
        } catch(IOException e){
            // envolvendo a exceção capturada em uma exceção personalizada.
            throw new AbrirArquivoExcecao("Ocorreu um erro ao abrir o arquivo.", e);
        }
    }
}
class AbrirArquivoExcecao extends Exception{
    public AbrirArquivoExcecao(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
}