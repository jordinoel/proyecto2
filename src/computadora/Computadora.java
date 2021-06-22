// My love is my radio QuQ

package computadora;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;
// import java.util.Scanner;

public class Computadora {
private String marca;
private String modelo;
private CPU CPU;
private Monitor Monitor;
private Teclado Teclado;
private Mouse Mouse;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, CPU CPU, Monitor Monitor, Teclado Teclado, Mouse Mouse) {
        this.marca = marca;
        this.modelo = modelo;
        this.CPU = CPU;
        this.Monitor = Monitor;
        this.Teclado = Teclado;
        this.Mouse = Mouse;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public CPU getCPU() {
        return CPU;
    }

    public void setCPU(CPU CPU) {
        this.CPU = CPU;
    }

    public Monitor getMonitor() {
        return Monitor;
    }

    public void setMonitor(Monitor Monitor) {
        this.Monitor = Monitor;
    }

    public Teclado getTeclado() {
        return Teclado;
    }

    public void setTeclado(Teclado Teclado) {
        this.Teclado = Teclado;
    }

    public Mouse getMouse() {
        return Mouse;
    }

    public void setMouse(Mouse Mouse) {
        this.Mouse = Mouse;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", CPU=" + CPU + ", Monitor=" + Monitor + ", Teclado=" + Teclado + ", Mouse=" + Mouse + '}';
    }
  public static void main(String[] args) {      
    Computadora C1= new Computadora ("Lenovo","Legión Gaming",new CPU ("Intel","Core i9 10850k",5),new Monitor ("Asus","VP228HE",22),
            new Teclado ("Razer","BlackWidow V3 Pro",105,5),new Mouse ("Logitech","G502","Alambrico Mecanico RGB LIGHTSYNC"));
      
    System.out.println("Su Computadora predeterminada:");
    
    System.out.println("Marca de su Computadora: \t"+C1.getMarca()+"\n"+ "Modelo de su Computadora: \t"+C1.getModelo()+ "\n"
            +"Marca del CPU: \t"+ C1.CPU.getMarca()+"\n"+"Modelo del CPU:\t"+C1.CPU.getModelo()+"\n"+ "Velocidad del Procesador:\t"+C1.CPU.getVelocidadDeProcesador()+"GHz"+"\n"+
            "Marca del Monitor: \t"+ C1.Monitor.getMarca()+"\n"+"Modelo del Monitor:\t"+C1.Monitor.getModelo()+"\n"+ "Pulgadas del Monitor:\t"+C1.Monitor.getPulgadas()+"'"+"\n"+
            "Marca del Teclado: \t"+ C1.Teclado.getMarca()+"\n"+"Modelo del Teclado:\t"+C1.Teclado.getModelo()+"\n"+ "Numero de Teclas:\t"+C1.Teclado.getNumeroDeTeclas()+"\n"+"Multimedia:\t"+C1.Teclado.getMultimedia()+"\n"+
            "Marca del Mouse: \t"+ C1.Mouse.getMarca()+"\n"+"Modelo del Mouse:\t"+C1.Mouse.getModelo()+"\n"+ "Tipo de Mouse:\t"+C1.Mouse.getTipo());
    /*  
     CPU X= new CPU ("Intel","Core i9 10850k",5);
   
     System.out.println("CPU predeterminado:");
     
     System.out.println(X.getMarca()+"\n"+ X.getModelo()+ "\n" + X.getVelocidadDeProcesador()+"\tGHz");
     
     Scanner Scanner1= new Scanner (System.in);
     
     CPU XX= new CPU ();
     System.out.println("Ingrese una marca de CPU");
     XX.setMarca(Scanner1.nextLine());
     System.out.println("Ingrese el modelo del CPU");
     XX.setModelo(Scanner1.nextLine());
     System.out.println("Ingrese su velocidad en GHz");
     XX.setVelocidadDeProcesador(Scanner1.nextInt());
     
     
     System.out.println("Los datos de su CPU son:");
     System.out.println("Marca:\t"+XX.getMarca()+"\n"+"Modelo:\t"+XX.getModelo()+ "\n" +"Velocidad del procesador:\t"+ XX.getVelocidadDeProcesador()+"GHz");
      */
    
}

}
