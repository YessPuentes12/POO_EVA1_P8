/*

 */
package eva1_8_llamada_función;





public class EVA1_8_LLAMADA_FUNCIÓN {


    public static void main(String[] args) {
      System.out.println("Inicia main()");
      A(); //llamada a función
      System.out.println("Termina main()");
    }
    
  public static void A(){
    System.out.println("Inicia A()");
    B();
    System.out.println("Termina A()");   
  }
   public static void B(){
    System.out.println("Inicia B()"); 
    System.out.println("Termina B()");   
  } 

}
