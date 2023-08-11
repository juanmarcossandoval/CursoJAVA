package temas.t10_TryCatch;

import temas.t8_clasesAbstractas.Mascota;

public class AnimalFantastico extends Mascota{

    public AnimalFantastico(String nombre, String comidaFavorita, String esExotica) {
        super(nombre, comidaFavorita, esExotica);
    }

    @Override
    public void hacerTruco() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void moverse() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void hacerSonido() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
