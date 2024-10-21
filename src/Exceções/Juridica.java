import java.util.Calendar;

public class Juridica extends Pessoa {
    public Juridica(String razao_social, Calendar data_criacao, String CNPJ, Endereco endereco, String nacionalidade,
            String sede) {
        super(razao_social.data_criacao, CNPJ, endereco, nacionalidade, sede);
    }

    @Override
    public boolean atualizarID(String CNPJ) throws ErroValidacaoCNPJ {
        if (validaCNPJ(CNPJ)) {
            this.identificador = CNPJ;
            return true;
        }

        else {
            System.out.println("ERRO: CNPJ inválido!");
        }
    }

    private boolean validaCNPJ(String CNPJ) throws ErroValidacaoCNPJ {
        char DV13, DV14;
        int soma, num, peso, i, resto;
        // Verifica sequência de dígitos iguais e tamanho (14 dígitos)
        if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") || CNPJ.equals("22222222222222")
                || CNPJ.equals("33333333333333") || CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555")
                || CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") || CNPJ.equals("88888888888888")
                || CNPJ.equals("99999999999999") || (CNPJ.length() != 14)) {
            throw new ErroValidacaoCNPJ("Entrada invalida!");
            // return(false);
        }
        try {
            // 1º Dígito Verificador
            soma = 0;
            peso = 2;
            for (i = 11; i >= 0; i--) {
                num = (int) (CNPJ.charAt(i) - 48);
                soma = soma + (num * peso);
                peso++;
                if (peso == 10)
                    peso = 2;
            }
            resto = soma % 11;
            if ((resto == 0) || (resto == 1))
                DV13 = '0';
            else
                DV13 = (char) ((11 - resto) + 48);
            // 2º Dígito Verificador
            soma = 0;
            peso = 2;
            for (i = 12; i >= 0; i--) {
                num = (int) (CNPJ.charAt(i) - 48);
                soma = soma + (num * peso);
                peso++;
                if (peso == 10)
                    peso = 2;
            }
            resto = soma % 11;
            if ((resto == 0) || (resto == 1))
                DV14 = '0';
            else
                DV14 = (char) ((11 - resto) + 48);
            // Verifica se os DV informados coincidem com os calculados
            if ((DV13 == CNPJ.charAt(12)) && (DV14 == CNPJ.charAt(13)))
                return true;
            else {
                throw new ErroValidacaoCNPJ("DV inválido.");
                // return false;
            }
        } catch (InputMismatchException erro) {
            return false;
        }
    }

    public String retornaTipo() {
        return "Juridica";
    }
}