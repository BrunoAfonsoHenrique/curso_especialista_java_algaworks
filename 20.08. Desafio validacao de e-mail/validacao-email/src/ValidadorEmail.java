public class ValidadorEmail {

    public static boolean validar(String email) {

        boolean verificacao =  false;
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
        TODO -Aceita dois oou três caracteres
        TODO -Aceita somente letras
        TODO -Somente letras minusculas
        TODO -Não aceita caracteres especiais
         */

        int posicaoDoArroba= email.indexOf("@");
        String nomeDoUsuario = email.substring(0, posicaoDoArroba);
        if (nomeDoUsuario.isBlank()) {
            return false;
        } else {
            char[] caracteresSeparados = nomeDoUsuario.toCharArray();
            for (char caracteresSeparado : caracteresSeparados) {
                
            }
        }


        return false;
    }

}