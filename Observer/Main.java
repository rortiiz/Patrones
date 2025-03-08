public class Main {

    public static void main (String[] args) {

        Sujeto chismosa = new Sujeto ();

        Usuario miguel = new Usuario ("Miguel,");
        Usuario nelson = new Usuario ("Nelson,");
        Usuario yuri = new Usuario ("Yuri,");

        chismosa.agregarObservador(yuri);
        chismosa.agregarObservador(nelson);

        chismosa.notificarObservadores("llegó la Policia porque donde Martita se escuchaban gritos!");

        chismosa.agregarObservador(miguel);

        chismosa.notificarObservadores("Se pelearon los Niños en el Parque!");

        chismosa.eliminarObservador(yuri);

        chismosa.notificarObservadores("Lorenita le fue infiel al Marido!");

        // Comentarios de Prueba!


    }

}
