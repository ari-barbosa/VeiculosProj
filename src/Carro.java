public class Carro extends Veiculos {
    private String tipo;

    public Carro(String marca, String cor, int ano, String modelo) {
        super(marca, cor, ano, modelo);
        this.tipo = tipo;
    }

    public void carroDetails(){
        printDetails();
        System.out.println("Tipo: " + tipo);
        System.out.println(" ");

    }

}
