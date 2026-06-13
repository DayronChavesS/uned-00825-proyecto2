/*
UNIVERSIDAD ESTATAL A DISTANCIA
VICERRECTORIA ACADÉMICA
ESCUELA DE CIENCIAS EXACTAS Y NATURALES
CARRERA DE INGENIERÍA INFORMÁTICA

ASIGNATURA DE ESTRUCTURA DE DATOS
CODIGO: 00825

PROYECTO 2
ARBOLES BINARIOS EN JAVA

GRUPO 03
PROFESORA MIRIAM MORA MORALES

DAYRON ANTONY CHAVES SANDOVAL
305240018

CENTRO UNIVERSITARIO DE TURRIALBA

FECHA DE ENTREGA
09 DE MAYO DEL 2021

PRIMER CUATRIMESTRE, 2021.
*/
package Main;
import Arbol.*;
import GUI.VentanaPrincipal;

//Clase que inicia el programa
public class Main 
{

    public static void main(String[] args) 
    {
        LlenarTodo();
        new VentanaPrincipal().setVisible(true); //se crea una nueva ventana y se hace visible
    }
    
    /*
    Ignorar este metodo.
    Solo sirve para hacer pruebas.
    Llena todo el arbol binario desde el principio.
    No esta activado por defecto.
    
    /!\    ES NECESARIO ESTABLECER EL LIMITE DE NODOS Y EL CONTADOR /!\
    /!\    A UN NUMERO DIFERENTE DE CERO SI QUIERE ACCEDER A TODAS  /!\
    /!\    LAS FUNCIONES DEL PROGRAMA DESDE EL PRINCIPIO.           /!\
    */
    public static void LlenarTodo()
    {
        Nodo N0 = new Nodo();
        Nodo N10 = new Nodo();
        Nodo Nm10 = new Nodo();
        Nodo N5 = new Nodo();
        Nodo Nm5 = new Nodo();
        Nodo N15 = new Nodo();
        Nodo Nm15 = new Nodo();
        Nodo N7 = new Nodo();
        Nodo Nm7 = new Nodo();
        Nodo N13 = new Nodo();
        Nodo Nm13 = new Nodo();
        Nodo N3 = new Nodo();
        Nodo Nm3 = new Nodo();
        Nodo N17 = new Nodo();
        Nodo Nm17 = new Nodo();
        
        N0.Numero = 0;
        N10.Numero = 10;
        Nm10.Numero = -10;
        N5.Numero = 5;
        Nm5.Numero = -5;
        N15.Numero = 15;
        Nm15.Numero = -15;
        N7.Numero = 7;
        Nm7.Numero = -7;
        N13.Numero = 13;
        Nm13.Numero = -13;
        N3.Numero = 3;
        Nm3.Numero = -3;
        N17.Numero = 17;
        Nm17.Numero = -17;
        
        ArbolBinario.Arbol.InsertarNodo(N0);
        ArbolBinario.Arbol.InsertarNodo(N10);
        ArbolBinario.Arbol.InsertarNodo(Nm10);
        ArbolBinario.Arbol.InsertarNodo(N5);
        ArbolBinario.Arbol.InsertarNodo(Nm5);
        ArbolBinario.Arbol.InsertarNodo(N15);
        ArbolBinario.Arbol.InsertarNodo(Nm15);
        ArbolBinario.Arbol.InsertarNodo(N7);
        ArbolBinario.Arbol.InsertarNodo(Nm7);
        ArbolBinario.Arbol.InsertarNodo(N13);
        ArbolBinario.Arbol.InsertarNodo(Nm13);
        ArbolBinario.Arbol.InsertarNodo(N3);
        ArbolBinario.Arbol.InsertarNodo(Nm3);
        ArbolBinario.Arbol.InsertarNodo(N17);
        ArbolBinario.Arbol.InsertarNodo(Nm17);
    }
    
}
