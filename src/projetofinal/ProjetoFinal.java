package projetofinal;

public class ProjetoFinal {

    public static void main(String[] args) {
     
        Video v[] = new Video[3];
        
        v[0] = new Video("Aula 1 POO");
        v[1] = new Video("Aula 2 POO");
        v[2] = new Video("Aula 3 POO");
        
        Inscrito i[] = new Inscrito[2];
        i[0] = new Inscrito ("Gabriel", 23, "M", "Gabriel4312");
        i[1] = new Inscrito ("Maria", 17, "F", "Mariazinha");
        
        
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao (i[0], v[0]);//Gabriel assisti POO1
        vis[0].Avaliar(90f);
        System.out.println(vis[0].toString());
        
        vis[1] = new Visualizacao (i[0], v[1]);//Gabriel assisti POO2
        vis[1].Avaliar();
        System.out.println(vis[1].toString());
        
        System.out.println("Videos\n---------------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("\nInscritos\n--------------------");
        System.out.println(i[0].toString());
        System.out.println(i[1].toString());
    }
    
}
