package contra;

import javax.swing.JOptionPane;

public class Contra {

    public void Verificar() {
      
        String var;
        String helper;
        boolean mayu = false;
        boolean carac = false;
        boolean special = false;
        boolean number = false;
        int numberh = 0;
        int numberArray[];
        
        boolean contraBien = true;
        
        var = JOptionPane.showInputDialog("Ingresa la contraseña");
        
        helper = String.valueOf(var.charAt(0));
        if (helper.matches("[A-Z]")) {
            mayu = true;
        }
        
        if (mayu) {
            if (var.length()>=12) {
                carac = true;
            }
            
            if (carac) {
                for (int i = 0; i < var.length(); i++) {
                    int caracesp;
                    helper = String.valueOf(var.charAt(i));
                    if (helper.toLowerCase()==helper.toUpperCase()) {
                        if (helper.matches("[1-9]")) {
                            numberh ++;
                        }else if (" ".equals(helper)) {
                            contraBien = false;
                            break;
                        }else{
                            special = true;
                        }
                    }
                }//fin del for para special, numberh y sin espacios
                
                numberArray = new int [(numberh+1)];
                
                if (special) {
                    numberh = 0;
                    for (int i = 0; i < var.length(); i++) {
                        helper = String.valueOf(var.charAt(i));
                        if (helper.matches("[1-9]")) {
                            numberArray [numberh] = Integer.parseInt(helper);
                                    numberh++;
                        }
                    }
                    numberArray[numberh]= 500;
                    if (numberh >= 3) {
                        number = true;
                        for (int i = 0; i < numberh; i++) {
                            if ((numberArray[i]+1) == numberArray[i+1]||(numberArray[i]-1)==numberArray[i+1]) {
                                number = false;
                            }
                        }
                    }
                    
                }   
            }
        }
         
        
        if (mayu && number && carac && special) {
            contraBien = true;
        }else{
            contraBien = false;
        }
        
        if (contraBien) {
            JOptionPane.showMessageDialog(null, "La contraseña es segura UwU");
        }else{
            JOptionPane.showMessageDialog(null, "La contraseña no es segura :,v");
        }
        
        
    }
    
}


