public class Caminhao extends Veiculos{
    private int tara;
    private int lotacao;

    public Caminhao(String marca, String cor, int ano, String modelo) {
        super(marca, cor, ano, modelo);
        this.tara = tara;
        this.lotacao = lotacao;
    }

    public void caminhaoDetails(){
        printDetails();
        System.out.println("Tara: " + tara);
        System.out.println("Lotação: " + lotacao);
        System.out.println(" ");
    }
}
