public class Motocicleta extends Veiculo{
    Motocicleta(String marca, String modelo, int ano, boolean possuiPartidaEletrica) {
        super(marca, modelo, ano);
        setPossuiPartidaEletrica(possuiPartidaEletrica);

        System.out.println("Marca:" + marca);
        System.out.println("Modelo:" + modelo);
        System.out.println("Ano:" + ano);
        System.out.println("Possui partida Eletrica:" + possuiPartidaEletrica);
    }

    private boolean possuiPartidaEletrica;

    public boolean getPossuiPartidaEletrica() {
        return possuiPartidaEletrica;
    }

    public void setPossuiPartidaEletrica(boolean possuiPartidaEletrica) {
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }

    public void imprimirInformacoes(){
        System.out.println(getAno());
        System.out.println(getMarca());
        System.out.println(getModelo());
        System.out.println(getPossuiPartidaEletrica());
    }
}
