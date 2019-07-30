
package experienciasapp;


public class OperacionExperiencia {
    
    public boolean numeroDeCaracteres(String s)
    {
        if (s.length()>0 || s.length()<100) {
            return true;
        } else {
            return false;
        }
    }
}
