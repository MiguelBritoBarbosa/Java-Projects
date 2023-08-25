public class Centena extends Dezena{
    private String[] centenas = {"1","2","3","4","5","6","7","8","9"};
    private String[] centenasExtenso = {"cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"};
    public String AcharCentena(Caractere caracteres){
        String numero = "";
        if (caracteres.CaractereNaPosicao(0) != '0'){
            if(caracteres.StringsIguais(caracteres.getStrings(),"100")){
                return "cem";
            }
            for (int i=0; i < this.centenas.length; i++){
                if (caracteres.CortarStrig(caracteres.getStrings(),0,1).equals(this.centenas[i])){
                    numero = this.centenasExtenso[i];
                }
            }
            if (caracteres.CaractereNaPosicao(1) != '0'){
                numero += " e " + AcharDezena(new Caractere(caracteres.CortarStrig(caracteres.getStrings(), 1)));
            }
            else if (caracteres.CaractereNaPosicao(2) != '0'){
                numero += " e " + AcharUnidade(new Caractere(caracteres.CortarStrig(caracteres.getStrings(), 2)));
            }

        }
        else {
            numero += AcharDezena(new Caractere(caracteres.CortarStrig(caracteres.getStrings(), 1)));
        }

        return numero;
    }


    public String[] getCentenas() {
        return centenas;
    }

    public void setCentenas(String[] centenas) {
        this.centenas = centenas;
    }

    public String[] getCentenasExtenso() {
        return centenasExtenso;
    }

    public void setCentenasExtenso(String[] centenasExtenso) {
        this.centenasExtenso = centenasExtenso;
    }
}
