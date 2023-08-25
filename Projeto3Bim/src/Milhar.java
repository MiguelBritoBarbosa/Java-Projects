public class Milhar extends Dezena{

    public String AcharMilhar (Caractere caracteres){
        String numero = "";
        if (caracteres.CaractereNaPosicao(0) != '0'){
            for (int i=0; i < this.getUnidades().length; i++){
                if (caracteres.CortarStrig(caracteres.getStrings(),0,1).equals(this.getUnidades()[i])){
                    numero = this.getUnidadesExtenso()[i] + " mil";
                }
            }

            if (caracteres.CaractereNaPosicao(1) != '0'){
                Centena centena = new Centena();
                numero += " " + centena.AcharCentena(new Caractere(caracteres.CortarStrig(caracteres.getStrings(),1)));
            }
            else{
                if (caracteres.CaractereNaPosicao(2) != '0'){
                    numero += " e " + AcharDezena(new Caractere(caracteres.CortarStrig(caracteres.getStrings(),2)));
                }
                else if (caracteres.CaractereNaPosicao(3) != '0'){
                    numero += " e " + AcharUnidade(new Caractere(caracteres.CortarStrig(caracteres.getStrings(),(3))));
                }
            }

        }
        else {
            Centena centena = new Centena();
            numero += centena.AcharCentena(new Caractere(caracteres.CortarStrig(caracteres.getStrings(),1)));
        }

        return numero;
    }

}
