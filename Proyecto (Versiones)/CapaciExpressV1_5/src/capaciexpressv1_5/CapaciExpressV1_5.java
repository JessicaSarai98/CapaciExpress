package capaciexpressv1_5;

import Controlador.CtrlUsuario;
import Modelo.ConsultasUsuario;
import Modelo.usuario;
import Vista.registro;

public class CapaciExpressV1_5 {
    
    public static void main(String[] args) {
        
        usuario usr = new usuario();
        ConsultasUsuario cons = new ConsultasUsuario();
        registro reg = new registro();
        
        CtrlUsuario ctrl = new CtrlUsuario(cons, usr, reg);
        ctrl.iniciar();
        reg.setVisible(true);
        
    }
    
}
