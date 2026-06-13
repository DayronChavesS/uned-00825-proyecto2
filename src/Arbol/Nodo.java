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

package Arbol;

/*
Los nodos en este arbol estan compuestos por
un numero entero y punteros a otros nodos.
*/

public class Nodo 
{
    //atributos
    public int Numero; 
    public Nodo NodoPadre;
    public Nodo NodoDerecho;
    public Nodo NodoIzquierdo;
    
    //constructor
    public Nodo()
    {
        //los datos no se asignan hasta que se
        //intente insertar en el arbol binario
        Numero = 0;
        NodoPadre = null;
        NodoDerecho = null;
        NodoIzquierdo = null;
    }
}
