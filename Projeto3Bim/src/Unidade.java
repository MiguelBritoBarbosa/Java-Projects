public class Unidade {
    private String[] unidades = {"0","1","2","3","4","5","6","7","8","9"};
    private String[] unidadesExtenso = {"zero","um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"};

    public String AcharUnidade(Caractere caracteres){

        for (int i=0; i < this.unidades.length; i++){
            if (caracteres.StringsIguais(caracteres.getStrings(),this.unidades[i])){
                return this.unidadesExtenso[i];
            }
        }
        return caracteres.getStrings();
    }


    public String[] getUnidades() {
        return unidades;
    }

    public void setUnidades(String[] unidades) {
        this.unidades = unidades;
    }

    public String[] getUnidadesExtenso() {
        return unidadesExtenso;
    }

    public void setUnidadesExtenso(String[] unidadesExtenso) {
        this.unidadesExtenso = unidadesExtenso;
    }




}
