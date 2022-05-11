public class Veiculos {

    private String marca;
    private String cor;
    private int ano;
    private String modelo;

    // Método Construtor

    public Veiculos(String marca, String cor, int ano, String modelo) {
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
        this.modelo = modelo;
    }

    // Metodo para imprimir os detalhes/atributos da clase Veiculos

    public void printDetails(){

        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Modelo: " + modelo);
    }

}
