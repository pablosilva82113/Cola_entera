package colas;

/**
 *
 * @author acer
 */
public class ColaNumEntero {
private int Esquina [];
private int Frente; 
private int Siguiente; 
    public ColaNumEntero(int N){
        Esquina=new int [N];
        //Pocicion inicial de el siguiente
        Siguiente=0;
        //Pocicion inicial  de frente
        Frente=-1;
    }
    public boolean colaLLena(){
        if(Siguiente==Esquina.length){
            return true;
        }else{
            return false;
        }
    }
    public void encolar(int Num)throws ExcepcionColaLLena {
        if(colaVacia()){
            System.out.println("Reset");
             Frente=-1;
            Siguiente=0;
        }
        if(colaLLena()){
            throw new ExcepcionColaLLena();
        }
      Esquina [Siguiente] = Num; 
      Siguiente++;
      //Cuando apenas agregue un elemento
      if(Siguiente==1){
          Frente=0;
      }
    }
    public boolean colaVacia(){
        if(Frente==Siguiente){
            return true;
        }else if(Frente==-1){
             return true;
        }else{
            return false;    
           }
    }
    public int sacar()throws ExcepcionColaVacia{
        if(colaVacia()){
            throw new ExcepcionColaVacia();
        }
        int valor=Esquina[Frente];
        Frente++;
        return valor;
    }
}
