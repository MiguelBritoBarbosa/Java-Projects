public class Veiculo {


    Veiculo (String marca, String modelo, int ano){
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
    }

    private String marca;
    private String modelo;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void imprimirInformacoes(){
        System.out.println(getAno());
        System.out.println(getMarca());
        System.out.println(getModelo());

    }


}
