package eHerencia.animals;

public class Tigre extends Felino {	//clase tigre extiende clase felino

    public void hacerRuido() {	//modifica comportamiento hacerRuido en esta clase
        System.out.println("rugido de batalla");
    }
    public void comer() {	//modifica comportamiento comer en esta clase
        System.out.println("Como bufalos y venados");
    }
}
