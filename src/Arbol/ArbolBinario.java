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
import javax.swing.JPanel;


public class ArbolBinario 
{
    //se crea un nuevo arbol binario de tipo estatico para acceso global
    public static ArbolBinario Arbol = new ArbolBinario();
    public Nodo raiz; //declaramos la raiz de nuestro arbol.
    
    //constructor
    public ArbolBinario()
    {
        Nodo raiz = null; //al crear un nuevo arbol binario la raiz sera nula.
    }
    
    //se busca el nodo que se intenta insertar para evitar duplicados
    public boolean EsteNodoExiste(Nodo NuevoNodo)
    {
        boolean existe = false;
        
        //si la raiz esta vacia es imposible que exista
        if(raiz == null)
        {
            existe = false;
        }
        else //de otro modo se recorre el arbol
        {        
            Nodo NodoAuxiliar = raiz;
            while(NodoAuxiliar != null) //en ciclo hasta que el nodo sea nulo
            {          
                if(NodoAuxiliar.Numero == NuevoNodo.Numero) //si el nodo aux y el nodo a insertar tienen el mismo numero...
                {
                    existe = true; //entonces ese numero si existe
                    break; //se rompe el ciclo
                }

                if(NuevoNodo.Numero < NodoAuxiliar.Numero) //si el nuevo numero es menor al del nodo auxiliar...
                {
                    NodoAuxiliar = NodoAuxiliar.NodoIzquierdo; //se continua la busqueda por el subarbol izquierdo
                }
                else //de otro modo...
                {
                    NodoAuxiliar = NodoAuxiliar.NodoDerecho; //se continua la busqueda por el subarbol derecho
                }
            }
            if(NodoAuxiliar == null && existe != true) //si se llego al final del arbol y no existe el nodo...
            {
                existe = false; //entonces el nodo no existe.
            }
        }
                
        return existe;
    }
    
    //segun el concepto del arbol binario de busqueda, se intenta insertar el nodo.
    public void InsertarNodo(Nodo NuevoNodo)
    {
        //si la raiz esta vacia simplemente se inserta en la raiz
        if(raiz == null)
        {
            raiz = NuevoNodo;
        }
        else //de otro modo se recorre el arbol hasta encontrar un espacio vacio
        {
            Nodo NodoAuxiliar = raiz;
            
            //se intenta llegar al final del arbol
            while(NodoAuxiliar != null) //en ciclo hasta que el nodo sea nulo
            {
                NuevoNodo.NodoPadre = NodoAuxiliar;
                
                if(NuevoNodo.Numero >= NodoAuxiliar.Numero) //si el nuevo nodo es mayor al nodo auxiliar...
                {
                    NodoAuxiliar = NodoAuxiliar.NodoDerecho; //se continua la busqueda por el subarbol derecho
                }
                else //de otro modo...
                {
                    NodoAuxiliar = NodoAuxiliar.NodoIzquierdo; //se continua la busqueda por el subarbol izquierdo
                }
            }
            
            //si el numero es menor que el del padre
            if(NuevoNodo.Numero < NuevoNodo.NodoPadre.Numero)
            {
                NuevoNodo.NodoPadre.NodoIzquierdo = NuevoNodo; //se inserta el numero a la izquierda
            }
            else //si el numero es mayor que el del padre
            {
                NuevoNodo.NodoPadre.NodoDerecho = NuevoNodo; //se inserta el numero a la derecha
            }
        }
    }
    
    //metodo para borrar el arbol binario
    public void Borrar()
    {
        raiz = null; //se fija el valor de la raiz en nulo
    }
    
    public JPanel ObtenerDibujoDelArbol() 
    {
        //se crea una representacion grafica del arbol
        GraficarArbolBinario ArbolGrafico = new GraficarArbolBinario();
        
        //se retorna el resultado obtenido
        return ArbolGrafico; 
    }
}
