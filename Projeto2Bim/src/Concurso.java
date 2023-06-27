import java.util.Scanner;

public class Concurso extends ArrayCandidatas{

    Scanner entrada = new Scanner(System.in);


    public boolean TestarId(int id){
        boolean existe = false;
        for (int i=0; i < this.getQuantidadeCandidatas(); i++){
            if (this.getCandidatas()[i].getId() == id){
                existe = true;
                break;
            }
        }
        return  existe;
    }


    public void IncluirCandidata(){
        System.out.print("ID:");
        int id = Integer.parseInt(entrada.nextLine());
        while (this.TestarId(id)){
            System.out.print("ID ja existe, digite outro:");
            id = Integer.parseInt(entrada.nextLine());
        }
        System.out.print("Nome:");
        String nome = entrada.nextLine();
        System.out.print("Simpatia:");
        int simpatia = Integer.parseInt(entrada.nextLine());
        System.out.print("Elegancia:");
        int elegancia = Integer.parseInt(entrada.nextLine());
        System.out.print("Beleza:");
        int beleza = Integer.parseInt(entrada.nextLine());

        Incluir incluir = new Incluir();
        incluir.adicionarCandidatas(this, id, nome, simpatia, elegancia, beleza);
    }

    public void ConsultarCandidata(){
        System.out.println("Deseja consultar apenas 1 ou todas as candidatas? (1)apenas 1 | (0)Todos:");
        int resp = Integer.parseInt(entrada.nextLine());
        if (resp == 0 ){
            Consultar consultar = new Consultar();
            consultar.ConsultarTodos(this);
        }
        else{
            System.out.print("Digite o Id da candidata:");
            int id = Integer.parseInt(entrada.nextLine());
            if (this.TestarId(id)){
                Consultar consultar = new Consultar();
                consultar.consultarDados(this, id);
            }
            else{
                System.out.println("Id nao existe, deseja cadastrar nova candidata?(1)Sim | (2)Nao:");
                resp = Integer.parseInt(entrada.nextLine());
                if (resp == 1){
                    this.IncluirCandidata();
                }
            }
        }

    }

    public void AlterarCandidata(){

        System.out.print("Digite o Id da candidata:");
        int id = Integer.parseInt(entrada.nextLine());
        if (this.TestarId(id)){
            Alterar alterar = new Alterar();
            alterar.alterarCandidata(this, id);
        }
        else{
            System.out.println("Id nao existe, deseja cadastrar nova candidata?(1)Sim | (2)Nao");
            int resp = Integer.parseInt(entrada.nextLine());
            if (resp == 1){
                this.IncluirCandidata();
            }
        }

    }
    public void ExcluirCandidata(){

        System.out.print("Digite o Id da candidata:");
        int id = Integer.parseInt(entrada.nextLine());
        if (this.TestarId(id)){
            Excluir excluir = new Excluir();
            excluir.exluirCandidata(this, id);
        }
        else{
            System.out.println("Id nao existe, deseja cadastrar nova candidata?(1)Sim | (2)Nao");
            int resp = Integer.parseInt(entrada.nextLine());
            if (resp == 1){
                this.IncluirCandidata();
            }
        }

    }

    public Candidata[] CopiarCandidatas(){
        Candidata[] novasCandidatas = new Candidata[this.getQuantidadeCandidatas()];
        for (int i=0; i < this.getQuantidadeCandidatas(); i++){
            novasCandidatas[i] = this.getCandidatas()[i];
        }
        return novasCandidatas;
    }


    public void Relatar(){
        Candidata[] melhoresNotas = CopiarCandidatas();
        Candidata aux;
        for(int i=0; i < melhoresNotas.length; i++){
            for (int j=0; j < melhoresNotas.length-1; j++){
                if (melhoresNotas[j].getNota() < melhoresNotas[j+1].getNota()){
                    aux = melhoresNotas[j];
                    melhoresNotas[j] = melhoresNotas[j+1];
                    melhoresNotas[j+1] = aux;
                }
            }
        }
        int i = 0;
        int posicao = 1;
        while (i < melhoresNotas.length){
            int pessoasNaPosicao = 1;
            for (int j=1; j < melhoresNotas.length - i; j++){
                if (melhoresNotas[i].getNota() == melhoresNotas[i+j].getNota()){
                    pessoasNaPosicao++;
                }
            }
            for (int j=0; j < pessoasNaPosicao; j++){
                System.out.printf("%do.Lugar: %s com nota: %.2f\n", posicao, melhoresNotas[i+j].getNome(), melhoresNotas[i+j].getNota());
            }
            posicao++;
            i = i + pessoasNaPosicao;
        }

    }

}
