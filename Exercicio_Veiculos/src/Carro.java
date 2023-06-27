public class Carro extends Veiculo{
    Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        setNumPortas(numPortas);
        System.out.println("Marca:" + marca);
        System.out.println("Modelo:" + modelo);
        System.out.println("Ano:" + ano);
        System.out.println("Numero de Portas:" + numPortas);
    }
    private int numPortas;

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public void imprimirInformacoes(){
        System.out.println(getAno());
        System.out.println(getMarca());
        System.out.println(getModelo());
        System.out.println(getNumPortas());
    }

}
