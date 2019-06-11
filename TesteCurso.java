import java.util.Scanner;
public class TesteCurso {
    public static void main (String[]args){
        Scanner ler = new Scanner (System.in);
        Curso C1 = new Curso();
        
        System.out.println("informe o curso do aluno");
        String nomecurso = ler.nextLine();
        
        double notas[] = new double[10];
       for (int x=0;x<=9;x ++){
           System.out.println("informe as notas do aluno");
           notas[x] = ler.nextDouble();
       }
       Curso C2 = new Curso (nomecurso,notas);
        
       C1.Media(); 
       C1.Maior(); 
    
    }    
    }
