public class Condicoes {
    String stringRetorno;
    Condicoes(Caractere numeros){
        switch (numeros.getLength()){
            case(1):
                Unidade unidade = new Unidade();
                setStringRetorno(unidade.AcharUnidade(numeros));
                break;
            case(2):
                Dezena dezena = new Dezena();
                setStringRetorno(dezena.AcharDezena(numeros));
                break;
            case(3):
                Centena centena = new Centena();
                setStringRetorno(centena.AcharCentena(numeros));
                break;
            case(4):
                Milhar milhar = new Milhar();
                setStringRetorno(milhar.AcharMilhar(numeros));
                break;
        }
    }

    public String getStringRetorno() {
        return stringRetorno;
    }

    public void setStringRetorno(String stringRetorno) {
        this.stringRetorno = stringRetorno;
    }
}
