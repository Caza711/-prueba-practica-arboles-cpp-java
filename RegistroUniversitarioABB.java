import java.util.LinkedList;
import java.util.Queue;

public class RegistroUniversitarioABB {

    NodoAcademico nodoRaizSistema;

    // INSERTAR ESTUDIANTE
    public void insertarEstudiante(NodoAcademico nuevoRegistro) {

        nodoRaizSistema = insertarRecursivo(nodoRaizSistema, nuevoRegistro);
    }

    private NodoAcademico insertarRecursivo(NodoAcademico raiz, NodoAcademico nuevoRegistro) {

        if (raiz == null) {
            return nuevoRegistro;
        }

        if (nuevoRegistro.cedulaEstudiantil.compareTo(raiz.cedulaEstudiantil) < 0) {

            raiz.hijoIzquierdo = insertarRecursivo(raiz.hijoIzquierdo, nuevoRegistro);

        } else if (nuevoRegistro.cedulaEstudiantil.compareTo(raiz.cedulaEstudiantil) > 0) {

            raiz.hijoDerecho = insertarRecursivo(raiz.hijoDerecho, nuevoRegistro);
        }

        return raiz;
    }

    // BUSCAR ESTUDIANTE
    public NodoAcademico buscarEstudiante(String cedulaBusqueda) {

        return buscarRecursivo(nodoRaizSistema, cedulaBusqueda);
    }

    private NodoAcademico buscarRecursivo(NodoAcademico raiz, String cedulaBusqueda) {

        if (raiz == null || raiz.cedulaEstudiantil.equals(cedulaBusqueda)) {
            return raiz;
        }

        if (cedulaBusqueda.compareTo(raiz.cedulaEstudiantil) < 0) {

            return buscarRecursivo(raiz.hijoIzquierdo, cedulaBusqueda);
        }

        return buscarRecursivo(raiz.hijoDerecho, cedulaBusqueda);
    }

    // ELIMINAR ESTUDIANTE
    public void eliminarEstudiante(String cedulaEliminar) {

        nodoRaizSistema = eliminarRecursivo(nodoRaizSistema, cedulaEliminar);
    }

    private NodoAcademico eliminarRecursivo(NodoAcademico raiz, String cedulaEliminar) {

        if (raiz == null) {
            return null;
        }

        if (cedulaEliminar.compareTo(raiz.cedulaEstudiantil) < 0) {

            raiz.hijoIzquierdo = eliminarRecursivo(raiz.hijoIzquierdo, cedulaEliminar);

        } else if (cedulaEliminar.compareTo(raiz.cedulaEstudiantil) > 0) {

            raiz.hijoDerecho = eliminarRecursivo(raiz.hijoDerecho, cedulaEliminar);

        } else {

            if (raiz.hijoIzquierdo == null) {
                return raiz.hijoDerecho;
            }

            if (raiz.hijoDerecho == null) {
                return raiz.hijoIzquierdo;
            }

            NodoAcademico sucesor = obtenerMinimo(raiz.hijoDerecho);

            raiz.cedulaEstudiantil = sucesor.cedulaEstudiantil;
            raiz.apellidoCompleto = sucesor.apellidoCompleto;
            raiz.nombreCompleto = sucesor.nombreCompleto;
            raiz.promedioFinal = sucesor.promedioFinal;
            raiz.carreraUniversitaria = sucesor.carreraUniversitaria;
            raiz.nivelActual = sucesor.nivelActual;

            raiz.hijoDerecho = eliminarRecursivo(raiz.hijoDerecho, sucesor.cedulaEstudiantil);
        }

        return raiz;
    }

    private NodoAcademico obtenerMinimo(NodoAcademico nodoActual) {

        while (nodoActual.hijoIzquierdo != null) {
            nodoActual = nodoActual.hijoIzquierdo;
        }

        return nodoActual;
    }

    // INORDEN
    public void recorridoInorden() {

        recorridoInordenRec(nodoRaizSistema);
    }

    private void recorridoInordenRec(NodoAcademico raiz) {

        if (raiz != null) {

            recorridoInordenRec(raiz.hijoIzquierdo);
            raiz.mostrarFicha();
            recorridoInordenRec(raiz.hijoDerecho);
        }
    }

    // PREORDEN
    public void recorridoPreorden() {

        recorridoPreordenRec(nodoRaizSistema);
    }

    private void recorridoPreordenRec(NodoAcademico raiz) {

        if (raiz != null) {

            raiz.mostrarFicha();
            recorridoPreordenRec(raiz.hijoIzquierdo);
            recorridoPreordenRec(raiz.hijoDerecho);
        }
    }

    // POSTORDEN
    public void recorridoPostorden() {

        recorridoPostordenRec(nodoRaizSistema);
    }

    private void recorridoPostordenRec(NodoAcademico raiz) {

        if (raiz != null) {

            recorridoPostordenRec(raiz.hijoIzquierdo);
            recorridoPostordenRec(raiz.hijoDerecho);
            raiz.mostrarFicha();
        }
    }

    // BFS
    public void recorridoPorNiveles() {

        if (nodoRaizSistema == null) {
            return;
        }

        Queue<NodoAcademico> colaNiveles = new LinkedList<>();

        colaNiveles.add(nodoRaizSistema);

        while (!colaNiveles.isEmpty()) {

            NodoAcademico temporal = colaNiveles.poll();

            temporal.mostrarFicha();

            if (temporal.hijoIzquierdo != null) {
                colaNiveles.add(temporal.hijoIzquierdo);
            }

            if (temporal.hijoDerecho != null) {
                colaNiveles.add(temporal.hijoDerecho);
            }
        }
    }

    // CONTAR NODOS
    public int contarNodos() {

        return contarRec(nodoRaizSistema);
    }

    private int contarRec(NodoAcademico raiz) {

        if (raiz == null) {
            return 0;
        }

        return 1 + contarRec(raiz.hijoIzquierdo) + contarRec(raiz.hijoDerecho);
    }

    // ALTURA
    public int calcularAltura() {

        return alturaRec(nodoRaizSistema);
    }

    private int alturaRec(NodoAcademico raiz) {

        if (raiz == null) {
            return 0;
        }

        int izquierda = alturaRec(raiz.hijoIzquierdo);
        int derecha = alturaRec(raiz.hijoDerecho);

        return Math.max(izquierda, derecha) + 1;
    }

    // MAYOR NOTA
    public void buscarNotaMayor() {

        buscarMayor(nodoRaizSistema, new double[]{-1});
    }

    private void buscarMayor(NodoAcademico raiz, double[] mayor) {

        if (raiz != null) {

            buscarMayor(raiz.hijoIzquierdo, mayor);

            if (raiz.promedioFinal > mayor[0]) {

                mayor[0] = raiz.promedioFinal;
                raiz.mostrarFicha();
            }

            buscarMayor(raiz.hijoDerecho, mayor);
        }
    }

    // MENOR NOTA
    public void buscarNotaMenor() {

        buscarMenor(nodoRaizSistema, new double[]{100});
    }

    private void buscarMenor(NodoAcademico raiz, double[] menor) {

        if (raiz != null) {

            buscarMenor(raiz.hijoIzquierdo, menor);

            if (raiz.promedioFinal < menor[0]) {

                menor[0] = raiz.promedioFinal;
                raiz.mostrarFicha();
            }

            buscarMenor(raiz.hijoDerecho, menor);
        }
    }

    // APROBADOS
    public void mostrarAprobados() {

        aprobadosRec(nodoRaizSistema);
    }

    private void aprobadosRec(NodoAcademico raiz) {

        if (raiz != null) {

            aprobadosRec(raiz.hijoIzquierdo);

            if (raiz.promedioFinal >= 7) {
                raiz.mostrarFicha();
            }

            aprobadosRec(raiz.hijoDerecho);
        }
    }

    // REPROBADOS
    public void mostrarReprobados() {

        reprobadosRec(nodoRaizSistema);
    }

    private void reprobadosRec(NodoAcademico raiz) {

        if (raiz != null) {

            reprobadosRec(raiz.hijoIzquierdo);

            if (raiz.promedioFinal < 7) {
                raiz.mostrarFicha();
            }

            reprobadosRec(raiz.hijoDerecho);
        }
    }
}