public class Caractere {

    Caractere(String s) {
        setStrings(s);
        setLength(s.length());
    }
    private String strings;
    private int length;

    public void NumerosPorExtenso(){
            Condicoes condicoes = new Condicoes(this);
            setStrings(condicoes.getStringRetorno());
    }


    public void Case(){
        this.strings = this.strings.substring(0,1).toUpperCase() + this.strings.substring(1);
    }

    public void ImprimirNumerosExtenso(){
        this.Case();
        System.out.println(this.strings);
    }

    public boolean StringsIguais(String S1, String S2){
        return S1.equals(S2);
    }

    public char CaractereNaPosicao(int posicao){
        return this.strings.charAt(posicao);
    }

    public String CortarStrig(String s, int CaracteresExcluir, int CaracteresSalvar){
        return s.substring(CaracteresExcluir, CaracteresSalvar);

    }

    public String CortarStrig(String s, int CaracteresExcluir){
        return s.substring(CaracteresExcluir, this.length);
    }

    public String getStrings() {
        return strings;
    }

    public void setStrings(String strings) {
        this.strings = strings;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }




}
