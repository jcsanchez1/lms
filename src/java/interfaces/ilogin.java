/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import Entidades.Usuarios;
import Entidades.TiposDeUsuario;
import Entidades.Maestros;
import Entidades.Alumnos;
import Entidades.PersonalRegisto;
import java.math.BigDecimal;

/**
 *
 * @author juanc
 */
public interface ilogin {

    public int validar(Usuarios user);
    public Usuarios validartipousuario(Usuarios us);
    public Maestros recuperarDatoMaestro(BigDecimal id);
    public PersonalRegisto recuperarDatoPersonalRegistro(BigDecimal id);
    public Alumnos recuperarDatoAlumno(BigDecimal id);
}
