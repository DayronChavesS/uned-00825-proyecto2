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
Los recorridos a un arbol devuelven toda la informacion
que este contiene en un orden determinado.
*/

public class Recorrido 
{
    public static String InformacionRecorrido;
    
    /*
    Los siguientes metodos utilizan recursion.
    */
    
    //SubArbol Izquierdo >> Raiz >> SubArbol Derecho
    public static String InOrden(Nodo NodoX)
    {
        if(NodoX != null)
        {
            InOrden(NodoX.NodoIzquierdo);
            CrearString(String.valueOf(NodoX.Numero));
            InOrden(NodoX.NodoDerecho);
        }
        
        return InformacionRecorrido;
    }
    
    //SubArbol Izquierdo >> SubArbol Derecho >> Raiz
    public static String PostOrden(Nodo NodoX)
    {
        if(NodoX != null)
        {
            PostOrden(NodoX.NodoIzquierdo);
            PostOrden(NodoX.NodoDerecho);
            CrearString(String.valueOf(NodoX.Numero));
        }
        return InformacionRecorrido;
    }
    
    //Raiz >> SubArbol Izquierdo >> SubArbol Derecho
    public static String PreOrden(Nodo NodoX)
    {
        if(NodoX != null)
        {
            CrearString(String.valueOf(NodoX.Numero));
            PreOrden(NodoX.NodoIzquierdo);
            PreOrden(NodoX.NodoDerecho);
        }
        
        return InformacionRecorrido;
    }
    
    //Metodo que crea un string para imprimir en los TextArea
    //De la ventana principal
    public static void CrearString(String Numero)
    {
        if(InformacionRecorrido != null) //si el string no esta vacio
        {
            //se adjunta la informacion previa, mas el nuevo numero por parametro
            InformacionRecorrido = InformacionRecorrido + "\n" + Numero;
        }
        else //si el string esta vacio
        {
            //simplemente se agrega el numero obtenido por parametro
            InformacionRecorrido = Numero;
        }
    }
    
    //Despues de imprimir en el TextArea la informacion.
    //se limpia el string para poder volver a usar la variable.
    public static void LimpiarString()
    {
        InformacionRecorrido = null;
    }
}
