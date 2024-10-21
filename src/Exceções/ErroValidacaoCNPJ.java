public class ErroValidacaoCNPJ extends Throwable {
    private String msg_erro;

    ErroValidacaoCNPJ(String msg_erro){
        this.msg_erro = msg_erro;
    }

    @Override
    public String toString(){
        return "ErroValidarCNPJ" + msg_erro;
    }
}