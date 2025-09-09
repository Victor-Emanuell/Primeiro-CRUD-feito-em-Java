import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Objetos pré-programados
        moldesNinjas Ninja1 = new moldesNinjas("Naruto", 18, "Konoha");
        moldesNinjas Ninja2 = new moldesNinjas("Sakura", 18, "Konoha");
        moldesNinjas Ninja3 = new moldesNinjas("Sasuke", 18, "Konoha");
        moldesNinjas Ninja4 = new moldesNinjas("Kakashi", 35, "Konoha");
        moldesNinjas Ninja5 = new moldesNinjas("Itachi", 24, "Exilado");
        moldesNinjas Ninja6 = new moldesNinjas("Gaara", 24, "Areia");
        moldesNinjas Ninja7 = new moldesNinjas("Maito Guy", 35, "Konoha");
        //Lista
        List<moldesNinjas> listaNinja = new ArrayList<>();
        listaNinja.add(Ninja1);
        listaNinja.add(Ninja2);
        listaNinja.add(Ninja3);
        listaNinja.add(Ninja4);
        listaNinja.add(Ninja5);
        listaNinja.add(Ninja6);
        listaNinja.add(Ninja7);

        int sla = 0;
        while (sla != 1){
            System.out.println("--------------- Lista de Ninjas --------------- ");
            System.out.println("Oque você deseja fazer?");
            System.out.println("1-Adicionar");
            System.out.println("2-Remover");
            System.out.println("3-Exibir lista");
            System.out.println("4-Procurar Ninja");
            System.out.println("5-Sair");

            int decisao = Integer.parseInt(teclado.nextLine());
            switch (decisao) {
                case 1:
                    System.out.println("Informações do ninja:");

                    System.out.println("Coloque apenas o primeiro nome, com a primeira letra em maiusculo!");
                    System.out.println("Nome: ");
                    String nomeNovo = teclado.nextLine();

                    System.out.println("Idade: ");
                    int idadeNovo = Integer.parseInt(teclado.nextLine());

                    System.out.println("Vila: ");
                    String vilaNovo = teclado.nextLine();

                    moldesNinjas Ninjaa = new moldesNinjas(nomeNovo, idadeNovo, vilaNovo);
                    listaNinja.addFirst(Ninjaa);
                    break;
                case 2:
                    System.out.println("Qual pessoa da lista você quer remover?");
                    int ni = 1;
                    for(moldesNinjas Ninja : listaNinja){
                        System.out.println(ni + " - " + Ninja);
                        ni++;
                    }
                    int esco = Integer.parseInt(teclado.nextLine());
                    if (esco != 0){
                        listaNinja.remove(esco-1);
                        } else{
                        System.out.println("Erro");
                    }
                    break;
                case 3:
                    System.out.println("Todos os Ninjas da lista:");
                    ni = 1;
                    for(moldesNinjas Ninja : listaNinja){
                        System.out.println(ni + " - " + Ninja);
                        ni++;
                    }
                    break;
                case 4:
                    System.out.println("Quem você está procurando?");
                    System.out.println("Coloque apenas o primeiro nome, com a primeira letra em maiusculo!");
                    String nomeP = teclado.nextLine();
                    boolean encontrado = false;
                    for(moldesNinjas Ninja : listaNinja){
                        if(Ninja.getNome().equals(nomeP)){
                            System.out.println(Ninja);
                            encontrado = true;
                            break;
                        }
                    }
                    if(!encontrado){
                        System.out.println("Ninja não encontrado");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    sla = 1;
                    break;
                default:
                    System.out.println("Erro, escolha uma opção valida.");
            }
        }
    }
}
