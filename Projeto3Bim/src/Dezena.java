public class Dezena extends Unidade{

    private String[] dezenas = {"1","2","3","4","5","6","7","8","9"};
    private String[] dezenasExtenso = {"dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"};
    private String[] dezenasEspecificas = {"11", "12", "13", "14", "15", "16", "17", "18", "19"};
    private String[] dezenasEspecificasExtenso = {"onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};


    public String AcharDezena(Caractere caracteres){
        String numero = "";
        if (caracteres.CaractereNaPosicao(0) != '0') {
            for (int i = 0; i < this.dezenasEspecificas.length; i++) {
                if (caracteres.StringsIguais(caracteres.getStrings(),this.dezenasEspecificas[i])) {
                    return this.dezenasEspecificasExtenso[i];
                }
            }

            for (int i = 0; i < this.dezenas.length; i++) {
                if (caracteres.CortarStrig(caracteres.getStrings(),0, 1).equals(this.dezenas[i])) {
                    numero = this.dezenasExtenso[i];
                }
            }
            if (caracteres.CaractereNaPosicao(1) != '0'){
                numero += " e " + AcharUnidade(new Caractere(caracteres.CortarStrig(caracteres.getStrings(), 1)));
            }
        }
        else {
            numero += AcharUnidade(new Caractere(caracteres.CortarStrig(caracteres.getStrings(), 1)));
        }
        return numero;
    }


    public String[] getDezenas() {
        return dezenas;
    }

    public void setDezenas(String[] dezenas) {
        this.dezenas = dezenas;
    }

    public String[] getDezenasExtenso() {
        return dezenasExtenso;
    }

    public void setDezenasExtenso(String[] dezenasExtenso) {
        this.dezenasExtenso = dezenasExtenso;
    }

    public String[] getDezenasEspecificas() {
        return dezenasEspecificas;
    }

    public void setDezenasEspecificas(String[] dezenasEspecificas) {
        this.dezenasEspecificas = dezenasEspecificas;
    }

    public String[] getDezenasEspecificasExtenso() {
        return dezenasEspecificasExtenso;
    }

    public void setDezenasEspecificasExtenso(String[] dezenasEspecificasExtenso) {
        this.dezenasEspecificasExtenso = dezenasEspecificasExtenso;
    }
}
