public class Iphone {
    public static void main(String[] args) {
        AparelhoTelefonico ap = new AparelhoTelefonico();
        ReprodutorMusical rp = new ReprodutorMusical();

        rp.selecionarMusica("Ela joga no 7 - TZ DA CORONEL");
        rp.tocar();
        rp.pausar();

        ap.ligar("9090-9090");
    }
}