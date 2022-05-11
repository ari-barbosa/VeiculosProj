public class Moto extends Veiculos {
    private int cilindradas;

    public Moto(String marca, String cor, int ano, String modelo) {
        super(marca, cor, ano, modelo);
        this.cilindradas = cilindradas;
    }

    public void motoDetails(){
        printDetails();
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println(" ");
    }
}
