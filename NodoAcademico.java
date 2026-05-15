public class NodoAcademico {

    String cedulaEstudiantil;
    String apellidoCompleto;
    String nombreCompleto;
    double promedioFinal;
    String carreraUniversitaria;
    int nivelActual;

    NodoAcademico hijoIzquierdo;
    NodoAcademico hijoDerecho;

    public NodoAcademico(String cedulaEstudiantil,
                         String apellidoCompleto,
                         String nombreCompleto,
                         double promedioFinal,
                         String carreraUniversitaria,
                         int nivelActual) {

        this.cedulaEstudiantil = cedulaEstudiantil;
        this.apellidoCompleto = apellidoCompleto;
        this.nombreCompleto = nombreCompleto;
        this.promedioFinal = promedioFinal;
        this.carreraUniversitaria = carreraUniversitaria;
        this.nivelActual = nivelActual;

        hijoIzquierdo = null;
        hijoDerecho = null;
    }

    public void mostrarFicha() {

        System.out.println("--------------------------------");
        System.out.println("Cedula: " + cedulaEstudiantil);
        System.out.println("Apellidos: " + apellidoCompleto);
        System.out.println("Nombres: " + nombreCompleto);
        System.out.println("Nota Final: " + promedioFinal);
        System.out.println("Carrera: " + carreraUniversitaria);
        System.out.println("Nivel: " + nivelActual);
    }
}
