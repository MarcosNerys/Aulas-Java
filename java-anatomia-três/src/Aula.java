public class Aula {
    public static void main(String[] args) {

            String primeiroNome = "Marcos";
            String segundoNome = "Nerys";
            String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

                System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
