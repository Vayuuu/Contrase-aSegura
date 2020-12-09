package contra;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Contra obj = new Contra();
        String repetir = "";
        
        boolean rep;
        
        try{
            do{
               obj.Verificar();
               repetir = JOptionPane.showInputDialog("Desea repetir? Ingrese sí");
                if ("si".equalsIgnoreCase(repetir)) {
                    rep = true;
                }else{
                    rep = false;
                }
            } while(rep);
        }catch(Exception e){}
        
    }
    
}
