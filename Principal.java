package banco;

public class Principal {

    public static void main(String[] args) {

        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Jubs");
        p1.abrirConta("cp");
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(222);
        p2.setDono("Creusa");
        p2.abrirConta("cc");
        
        p1.ObjectStatus();
        p2.ObjectStatus();
        
        p1.depositar(300);
        p2.depositar(500);
        p2.sacar(100);
        
        p1.ObjectStatus();
        p2.ObjectStatus();
        
        
        
        
        
        
        
       
        
       
    
    }

}
