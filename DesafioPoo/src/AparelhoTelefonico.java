public class AparelhoTelefonico implements Telefone{
    @Override
    public void ligar(String numero) {
        if (numero != null) {
            System.out.println("Ligando para o numero " + numero);
        } else {
            System.out.println("Informe um numero!");
        }
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz!");
    }
}
