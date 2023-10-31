public class ValidadorEmail {

    static boolean emailValido = false;

    public static boolean validar(String email) {


        emailValido = validarNomeDeUsuario(email);

        /*
        TODO email valido para esse exercicio
        TODO nome_do_usuario@dominio.sufixo_do_dominio

        TODO nome_do_usuario:
        TODO -Não pode ser vazio,
        TODO -Aceita letras e digitos,
        TODO -Aceita underscores,ifem e ponto
        TODO -Aceita também nome com letra maiuscula

        TODO Dominio:
        TODO -Não pode ser vazio
        TODO -Aceita letras e digitos
        TODO -Aceita ifen e também ponto
        TODO -Tudo em minusculo

        TODO Sufixo:
        TODO -Aceita dois ou três caracteres
        TODO -Aceita somente letras
        TODO -Somente letras minusculas
        TODO -Não aceita caracteres especiais
         */
        return emailValido;
    }

    private static boolean validarNomeDeUsuario(String email) {
        boolean emailValido = false;
        int posicaoDoArroba= email.indexOf("@");
        if (posicaoDoArroba < 0) {
            return emailValido;
        }
        String nomeDoUsuario = email.substring(0, posicaoDoArroba);
        if (nomeDoUsuario.isBlank()) {
            return emailValido = false;
        } else {
            char[] caracteresSeparados = nomeDoUsuario.toCharArray();
            for (char caracteresSeparado : caracteresSeparados) {
                if (caracteresSeparado == ' ') {
                    return emailValido = false;
                } else if (Character.isLetterOrDigit(caracteresSeparado)
                        || caracteresSeparado == '_' || caracteresSeparado == '-' || caracteresSeparado == '.'
                        || Character.isUpperCase(caracteresSeparado)) {
                    emailValido = true;
                }
            }
            if (emailValido) {
                emailValido = validarDominioDoEmail(email);
            }
        }
        return emailValido;
    }

    private static boolean validarDominioDoEmail(String email) {
        int posicaoDoPonto= email.lastIndexOf(".");
        if (posicaoDoPonto < 0) {
            return emailValido = false;
        }
        int posicaoDoArroba= email.indexOf("@") + 1;
        String nomeDominio = email.substring(posicaoDoArroba, posicaoDoPonto);
        if (nomeDominio.isBlank()) {
            return emailValido = false;
        } else {
            char[] caracteresSeparados = nomeDominio.toCharArray();
            for (char caracteresSeparado : caracteresSeparados) {
                if (caracteresSeparado == ' ') {
                    return emailValido = false;
                } else if (Character.isLetterOrDigit(caracteresSeparado) // V || F || F || F
                        || caracteresSeparado == '-' || caracteresSeparado == '.'
                        || Character.isLowerCase(caracteresSeparado)) {
                    emailValido = true;
                }
            }
            if (emailValido) {
                emailValido = validarSufixoDoEmail(email);
            }
        }
        return emailValido;
    }

    private static boolean validarSufixoDoEmail(String email) {
        int posicaoDoPonto= email.lastIndexOf(".");
        int ultimoElemento = email.length();
        String sufixo = email.substring(posicaoDoPonto + 1, ultimoElemento);
        if (sufixo.isBlank()) {
            return emailValido;
       } else {
            int quantidadeDeCaracteres = sufixo.length();
            if (quantidadeDeCaracteres > 3) {
                return emailValido = false;
            }
            char[] caracteresSeparados = sufixo.toCharArray();
            for (char caracteresSeparado : caracteresSeparados) {
                if (caracteresSeparado == ' ') {
                    return emailValido = false;
                } else if (Character.isLetter(caracteresSeparado)
                        || Character.isLowerCase(caracteresSeparado)) {
                    emailValido = true;
                }
            }
        }
        return emailValido;
    }

}