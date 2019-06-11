public class Curso {

    private String nomecurso;
    private double [] notas = new double[10];
    private double media;
    
    
    public Curso(){}
    
  public Curso(String nomecurso,double notas[]){
      this.nomecurso = nomecurso;
      this.notas = notas;
 
  }
    public void setnomecurso(String nome){
        nomecurso = nome;
    }
    public String getnomecurso(){
        return nomecurso;
    }
    public void setnotas(double []num){
       notas = num;
    }
    
    public void Media(){
        media = (notas[1] + notas[2] + notas[3]+ notas[4]+ notas[5]+ notas[6]+notas[7]+notas[8]+notas[9]+notas[10]/10);
        System.out.println("A sua media é"+media);
    }
    double maior;
    public void Maior(){
        for (int i=0; i<=9 ; i = i+1){
        maior = notas[0];
            if (notas[i]>notas[0]){
                maior = notas[i];
            }
        }
}
}
