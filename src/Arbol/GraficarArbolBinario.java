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

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.HashMap;
import javax.swing.JPanel;

/*
Esta clase es la que permite graficar el arbol binario
Desde la raiz hasta las hojas.
*/

public class GraficarArbolBinario extends JPanel 
{
    //Atributos
    public HashMap PosicionNodos = new HashMap();   //arreglo de tipo clave/valor para almacenar las posiciones de los nodos
    public HashMap TamañoSubArboles = new HashMap();//arreglo de tipo clave/valor para almacenar el temaño de los subarboles
    public boolean CanvasSucio = true;              //variable que indica si es necesario refrescar el grafico del arbol
    public int DistanciaPadreAHijo = 10;            //dato de tipo entero que contiene la distancia padre a hijo
    public int DistanciaHijoAHijo = 20;             //dato de tipo entero que contiene la distancia hijo a hijo
    public Dimension Dimension_Null = new Dimension(0,0); //objeto de tipo dimension usado para definir dimensiones vacias y evitar errores tipo null
    public FontMetrics Fuente = null;               //objeto con informacion necesaria para renderizar fuentes en pantalla
    
    //constructor
    public GraficarArbolBinario() 
    {
        //al crear un nuevo objeto...
        this.setBackground(Color.WHITE); //se establece que el color del canvas sera blanco
        repaint();                      //se pinta el arbol
    }

    //metodo que llama los metodos de calculo
    //calcula tanto posiciones de subarboles como de nodos
    private void CalcularTodo() 
    {
        //se limpian los hashmaps para obtener nueva informacion
         PosicionNodos.clear();
         TamañoSubArboles.clear();
        
         //se obtiene la raiz de nuestro arbol
         Nodo raiz = ArbolBinario.Arbol.raiz;
         
        //si la raiz no es nula...
         if (raiz != null) 
         {
             CalcularTamañoSubArbol(raiz); //se calcula el tamaño de los subarboles
             CalcularPosicionNodos(raiz, Integer.MAX_VALUE, Integer.MAX_VALUE, 0); //se calcula la posicion donde deben estar los nodos
         }
    }
    
    //metodo que calcula el tamaño de los subarboles de cada nodo
    //(esto deberia evitar que los nodos se dibujen unos sobre otros)
    private Dimension CalcularTamañoSubArbol(Nodo Nodo) 
    {
        //en esta primera ocasion el Nodo es raiz
        //si raiz es nula se retorna un ancho y alto de 0.
        //(tambien puede ocurrir si cualquier otro nodo es nulo)
        if (Nodo == null) 
        {
            return Dimension_Null;
        }
        
        //se procede a calcular el ancho y el alto de los subarboles izquierdos y derechos
        //de un nodo padre en particular, con recursion.
        Dimension Izquierda = CalcularTamañoSubArbol(Nodo.NodoIzquierdo);
        Dimension Derecha = CalcularTamañoSubArbol(Nodo.NodoDerecho);
                
        //para calcular el tamaño del subarbol de cualquier nodo se hace lo siguiente:
        //alto = AltoDeLaFuente + DistanciaPadreHijo + "el mas grande entre"(el alto del nodo izquierdo, el alto del nodo derecho)
        int Alto = Fuente.getHeight() + DistanciaPadreAHijo + Math.max(Izquierda.height, Derecha.height);
        //ancho = el ancho del sub arbol izquierdo + distancia hijo a hijo + el ancho del subarbol derecho
        int Ancho = Izquierda.width + DistanciaHijoAHijo + Derecha.width;
        
        //se crea un nuevo objeto de tipo dimension con los valores calculados en la operacion anterior
        Dimension TamañoSubArbol = new Dimension(Ancho, Alto);
        //en el hashmap de tamaño de subarboles se incluye el nodo y el tamaño de su respectivo subarbol
        TamañoSubArboles.put(Nodo, TamañoSubArbol);
        
        return TamañoSubArbol;
    }
    
    //calcula la posicion de cada nodo con base en la informacion de los subarboles
    private void CalcularPosicionNodos(Nodo Nodo, int Izquierda, int Derecha, int Padre) 
    {
        //en esta primera ocasion el Nodo es raiz
        //si raiz es nula no se calcula nada
        //(tambien puede ocurrir si cualquier otro nodo es nulo)
        if (Nodo == null) 
        {
            return;
        }
        
        //se obtiene el tamaño de los subarboles de cada nodo
        //si alguno es nulo se establece su valor en 0, 0.
        Dimension TamañoSubArbol_Izq = (Dimension) TamañoSubArboles.get(Nodo.NodoIzquierdo);
        if (TamañoSubArbol_Izq == null)
        {
            TamañoSubArbol_Izq = Dimension_Null;
        }

        Dimension TamañoSubArbol_Der = (Dimension) TamañoSubArboles.get(Nodo.NodoDerecho);
        if (TamañoSubArbol_Der == null) 
        {
            TamañoSubArbol_Der = Dimension_Null;
        }
        
        //a continuacion se intenta calcular el centro del subarbol...
        int Centro = 0;

        //Integer.MAX_Value es un valor usado como validacion solamente
        //solo aparece durante la primera llamada del metodo
        if (Derecha != Integer.MAX_VALUE)
        {
            //centro subarbol = derecha - el ancho del tamaño del subarbol derecho - distancia hijo a hijo / 2
            Centro = Derecha - TamañoSubArbol_Der.width - DistanciaHijoAHijo/2;
        }
        else if (Izquierda != Integer.MAX_VALUE)
        {
            //centro subarbol = izquierda + el ancho del tamaño del subarbol izquierdo + distancia hijo a hijo / 2
            Centro = Izquierda + TamañoSubArbol_Izq.width + DistanciaHijoAHijo/2;
        }
        
        //tambien es necesario calcular el tamaño del string
        //por lo tanto obtenemos el ancho del numero del nodo
        int AnchoFuente = Fuente.stringWidth(Nodo.Numero+"");
        
        //se creara un rectangulo que esta asociado a cada nodo del arbol, con la intencion de dibujarlo mas tarde
        PosicionNodos.put(Nodo,new Rectangle(Centro - AnchoFuente/2 - 3, Padre, AnchoFuente + 6, Fuente.getHeight()));

        //se vuelve a realizar todas las operaciones con los nodos hijos a la izquierda y a la derecha
        CalcularPosicionNodos(Nodo.NodoIzquierdo, Integer.MAX_VALUE, Centro - DistanciaHijoAHijo/2, Padre + Fuente.getHeight() + DistanciaPadreAHijo);
        CalcularPosicionNodos(Nodo.NodoDerecho, Centro + DistanciaHijoAHijo/2, Integer.MAX_VALUE, Padre + Fuente.getHeight() + DistanciaPadreAHijo);
    }
    
    //metodo que dibuja todo el arbol binario con la informacion de las posiciones de cada nodo en los hashmaps
    private void DibujarArbol(Graphics2D g, Nodo Nodo, int X_linea, int Y_linea, int Y_Desface) 
    {
        //si durante la recursividad se hizo referencia a un nodo nulo
        //se retorna
        if (Nodo == null) 
        {
            return;
        }
        
        //a continuacion se obtienen los rectangulos que hay en el hashmap de posiciones de nodos
        Rectangle Cuadro = (Rectangle) PosicionNodos.get(Nodo);
        //con la cordenada x, y, ancho y alto del rectangulo se dibuja un ovalo.
        g.drawOval(Cuadro.x, Cuadro.y, Cuadro.width, Cuadro.height);
        //con base en la coordenada x y y del rectangulo mas un desface de altura, se inserta el numero del nodo.
        g.drawString(Nodo.Numero +"", Cuadro.x + 3, Cuadro.y + Y_Desface);
        
        //Integer.MAX_Value es un valor usado como validacion solamente
        //solo aparece durante la primera llamada del metodo
        if (X_linea != Integer.MAX_VALUE)
        {
            //se procede a dibujar la linea que conecta el nodo padre con sus hijos
            g.drawLine(X_linea, Y_linea, (int)(Cuadro.x + Cuadro.width/2), Cuadro.y);
        }
        
        //se vuelve a realizar todas las operaciones con los nodos hijos a la izquierda y a la derecha
        DibujarArbol(g, Nodo.NodoIzquierdo, (int)(Cuadro.x + Cuadro.width/2), Cuadro.y + Cuadro.height, Y_Desface);
        DibujarArbol(g, Nodo.NodoDerecho, (int)(Cuadro.x + Cuadro.width/2), Cuadro.y + Cuadro.height, Y_Desface);
    }
    
    //se sobreescribe el metodo paint para programar que dibuje el arbol binario
    @Override
    public void paint(Graphics g) 
    {
        //se invoca el metodo paint de la clase superior, no sobreescrito.
        super.paint(g);
        //se obtiene la informacion necesaria para renderizar la fuente.
        Fuente = g.getFontMetrics();

        //si el canvas esta sucio se vuelve a hacer todos los calculos
        if (CanvasSucio) 
        {
            CalcularTodo();
            CanvasSucio = false;
        }
        
        //creamos un nuevo objeto de tipo Graphics2D
        Graphics2D Graficos = (Graphics2D) g;
        //se le indica a paint las cordenadas donde debe comenzar a dibujar el arbol
        //todo lo que se dibuje sera relativo a estas coordenadas
        Graficos.translate(getWidth() / 2, DistanciaPadreAHijo);
        //se llama al metodo que dibuja el arbol binario
        DibujarArbol(Graficos, ArbolBinario.Arbol.raiz, Integer.MAX_VALUE, Integer.MAX_VALUE, Fuente.getLeading() + Fuente.getAscent());
    }
   
 }




