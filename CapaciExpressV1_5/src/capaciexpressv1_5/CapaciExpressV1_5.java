package capaciexpressv1_5;

import Controlador.CtrlLogin;
import Controlador.CtrlUsuario;
import Modelo.ConsultasUsuario;
import Modelo.usuario;
import Vista.login;
import Vista.registro;

public class CapaciExpressV1_5 {

    public static void main(String[] args) {

        usuario usr = new usuario();
        ConsultasUsuario cons = new ConsultasUsuario();
        registro reg = new registro();
        login log = new login();

//        CtrlUsuario ctrlU = new CtrlUsuario(cons, usr, reg);
//        ctrlU.iniciar();
//        reg.setVisible(true);

        CtrlLogin ctrlL = new CtrlLogin(cons, usr, log);
        ctrlL.iniciar();
        log.setVisible(true);

    }

}
