public abstract class Calculadora {
    private int Numb1;
    private int Numb2;
    private int resultado = 0;

      // método somar
      public double somar( int n1, int n2 ){
          this.Numb1 = n1;
          this.Numb2 = n2;
          resultado = n1 + n2;
          return resultado;
      }
      // método subtrair
      public double subtrair( int n1, int n2 ){
            this.Numb1 = n1;
            this.Numb2 = n2;
            resultado = n1 - n2;
            return resultado;
      }
      // método multiplicar
      public double multiplicar( int n1, int n2 ){
        this.Numb1 = n1;
        this.Numb2 = n2;
        resultado = n1 * n2;
        return resultado;
      }
      // método dividir
      public double dividir( int n1, int n2 ){
        this.Numb1 = n1;
        this.Numb2 = n2;
        resultado = n1 / n2;
        return resultado;
      }
     
     public double getNumb1(){
         return Numb1;
     }
     public void setNumb1(double Numb1){
         this.Numb1 = Numb1;
     }
      public double getNumb2(){
         return Numb2;
     }
     public void setNumb2(double Numb2){
         this.Numb2 = Numb2;
     }
     
}