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

package GUI;

import Arbol.*;
import java.awt.Rectangle;
import javax.swing.JInternalFrame;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame 
{

    int LimiteDeNodos = 1; //variable que limita la cantidad de nodos que se permite insertar en el arbol
    int ContadorNodos = 1; //varible que cuenta la cantidad de nodos insertados en el arbol (depende del numero de clicks de BTN_RegistrarNodo)
    
    //constructor de la clase
    public VentanaPrincipal() 
    {
        //inicia todos los componentes
        initComponents();
        //se desactivan todas las tabs menos el de ingresar cantidad de nodos
        CambiarTabs(0);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TABS = new javax.swing.JTabbedPane();
        TAB_CantidadNodos = new javax.swing.JPanel();
        TXTFLD_CantidadNodos = new javax.swing.JTextField();
        BTN_RegistrarCantidadNodos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TAB_IngresarNodos = new javax.swing.JPanel();
        TXTFLD_DatoDelNodo = new javax.swing.JTextField();
        BTN_RegistrarNodo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TAB_Arbol = new javax.swing.JPanel();
        VIRTUAL_DESKTOP = new javax.swing.JDesktopPane();
        CANVAS = new javax.swing.JInternalFrame();
        TAB_PreOrden = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AREA_PreOrden = new javax.swing.JTextArea();
        TAB_InOrden = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        AREA_InOrden = new javax.swing.JTextArea();
        TAB_PosOrden = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        AREA_PostOrden = new javax.swing.JTextArea();
        MENU_PRINCIPAL = new javax.swing.JMenuBar();
        MENU = new javax.swing.JMenu();
        MENUITM_CantidadNodos = new javax.swing.JMenuItem();
        MENUITM_IngresarNodos = new javax.swing.JMenuItem();
        MENUITM_MostrarArbol = new javax.swing.JMenuItem();
        MENUITM_Recorridos = new javax.swing.JMenu();
        MENUITM_PreOrden = new javax.swing.JMenuItem();
        MENUITM_InOrden = new javax.swing.JMenuItem();
        MENUITM_PostOrden = new javax.swing.JMenuItem();
        MENUITM_Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BTN_RegistrarCantidadNodos.setText("REGISTRAR");
        BTN_RegistrarCantidadNodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RegistrarCantidadNodosActionPerformed(evt);
            }
        });

        jLabel1.setText("Ingrese la cantidad de nodos del arbol:");

        javax.swing.GroupLayout TAB_CantidadNodosLayout = new javax.swing.GroupLayout(TAB_CantidadNodos);
        TAB_CantidadNodos.setLayout(TAB_CantidadNodosLayout);
        TAB_CantidadNodosLayout.setHorizontalGroup(
            TAB_CantidadNodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_CantidadNodosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TAB_CantidadNodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTN_RegistrarCantidadNodos)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TXTFLD_CantidadNodos))
                .addContainerGap(470, Short.MAX_VALUE))
        );
        TAB_CantidadNodosLayout.setVerticalGroup(
            TAB_CantidadNodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_CantidadNodosLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTFLD_CantidadNodos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_RegistrarCantidadNodos)
                .addContainerGap(360, Short.MAX_VALUE))
        );

        TABS.addTab("Cantidad Nodos", TAB_CantidadNodos);

        BTN_RegistrarNodo.setText("REGISTRAR");
        BTN_RegistrarNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RegistrarNodoActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese un numero para ingresar en el arbol binario:");

        javax.swing.GroupLayout TAB_IngresarNodosLayout = new javax.swing.GroupLayout(TAB_IngresarNodos);
        TAB_IngresarNodos.setLayout(TAB_IngresarNodosLayout);
        TAB_IngresarNodosLayout.setHorizontalGroup(
            TAB_IngresarNodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_IngresarNodosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TAB_IngresarNodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BTN_RegistrarNodo)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TXTFLD_DatoDelNodo))
                .addContainerGap(375, Short.MAX_VALUE))
        );
        TAB_IngresarNodosLayout.setVerticalGroup(
            TAB_IngresarNodosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_IngresarNodosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TXTFLD_DatoDelNodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTN_RegistrarNodo)
                .addContainerGap(359, Short.MAX_VALUE))
        );

        TABS.addTab("Ingresar Nodos", TAB_IngresarNodos);

        TAB_Arbol.setBackground(new java.awt.Color(255, 255, 255));
        TAB_Arbol.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TAB_Arbol.setOpaque(false);

        VIRTUAL_DESKTOP.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);
        VIRTUAL_DESKTOP.setOpaque(false);

        CANVAS.setBorder(null);
        CANVAS.setEnabled(false);
        CANVAS.setFocusCycleRoot(false);
        CANVAS.setVerifyInputWhenFocusTarget(false);
        CANVAS.setVisible(true);

        javax.swing.GroupLayout CANVASLayout = new javax.swing.GroupLayout(CANVAS.getContentPane());
        CANVAS.getContentPane().setLayout(CANVASLayout);
        CANVASLayout.setHorizontalGroup(
            CANVASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
        );
        CANVASLayout.setVerticalGroup(
            CANVASLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );

        VIRTUAL_DESKTOP.setLayer(CANVAS, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout VIRTUAL_DESKTOPLayout = new javax.swing.GroupLayout(VIRTUAL_DESKTOP);
        VIRTUAL_DESKTOP.setLayout(VIRTUAL_DESKTOPLayout);
        VIRTUAL_DESKTOPLayout.setHorizontalGroup(
            VIRTUAL_DESKTOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CANVAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        VIRTUAL_DESKTOPLayout.setVerticalGroup(
            VIRTUAL_DESKTOPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CANVAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout TAB_ArbolLayout = new javax.swing.GroupLayout(TAB_Arbol);
        TAB_Arbol.setLayout(TAB_ArbolLayout);
        TAB_ArbolLayout.setHorizontalGroup(
            TAB_ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_ArbolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VIRTUAL_DESKTOP)
                .addContainerGap())
        );
        TAB_ArbolLayout.setVerticalGroup(
            TAB_ArbolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_ArbolLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VIRTUAL_DESKTOP)
                .addContainerGap())
        );

        TABS.addTab("Arbol", TAB_Arbol);

        AREA_PreOrden.setColumns(20);
        AREA_PreOrden.setRows(5);
        jScrollPane1.setViewportView(AREA_PreOrden);

        javax.swing.GroupLayout TAB_PreOrdenLayout = new javax.swing.GroupLayout(TAB_PreOrden);
        TAB_PreOrden.setLayout(TAB_PreOrdenLayout);
        TAB_PreOrdenLayout.setHorizontalGroup(
            TAB_PreOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_PreOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
                .addContainerGap())
        );
        TAB_PreOrdenLayout.setVerticalGroup(
            TAB_PreOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_PreOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );

        TABS.addTab("PreOrden", TAB_PreOrden);

        AREA_InOrden.setColumns(20);
        AREA_InOrden.setRows(5);
        jScrollPane2.setViewportView(AREA_InOrden);

        javax.swing.GroupLayout TAB_InOrdenLayout = new javax.swing.GroupLayout(TAB_InOrden);
        TAB_InOrden.setLayout(TAB_InOrdenLayout);
        TAB_InOrdenLayout.setHorizontalGroup(
            TAB_InOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_InOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
                .addContainerGap())
        );
        TAB_InOrdenLayout.setVerticalGroup(
            TAB_InOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_InOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );

        TABS.addTab("InOrden", TAB_InOrden);

        AREA_PostOrden.setColumns(20);
        AREA_PostOrden.setRows(5);
        jScrollPane3.setViewportView(AREA_PostOrden);

        javax.swing.GroupLayout TAB_PosOrdenLayout = new javax.swing.GroupLayout(TAB_PosOrden);
        TAB_PosOrden.setLayout(TAB_PosOrdenLayout);
        TAB_PosOrdenLayout.setHorizontalGroup(
            TAB_PosOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_PosOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
                .addContainerGap())
        );
        TAB_PosOrdenLayout.setVerticalGroup(
            TAB_PosOrdenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TAB_PosOrdenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );

        TABS.addTab("PostOrden", TAB_PosOrden);

        MENU.setText("Arboles Binarios");

        MENUITM_CantidadNodos.setText("Ingresar Cantidad Nodos");
        MENUITM_CantidadNodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_CantidadNodosActionPerformed(evt);
            }
        });
        MENU.add(MENUITM_CantidadNodos);

        MENUITM_IngresarNodos.setText("Ingresar Nodos");
        MENUITM_IngresarNodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_IngresarNodosActionPerformed(evt);
            }
        });
        MENU.add(MENUITM_IngresarNodos);

        MENUITM_MostrarArbol.setText("Mostrar Arbol");
        MENUITM_MostrarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_MostrarArbolActionPerformed(evt);
            }
        });
        MENU.add(MENUITM_MostrarArbol);

        MENUITM_Recorridos.setText("Recorrer...");

        MENUITM_PreOrden.setText("PreOrden");
        MENUITM_PreOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_PreOrdenActionPerformed(evt);
            }
        });
        MENUITM_Recorridos.add(MENUITM_PreOrden);

        MENUITM_InOrden.setText("InOrden");
        MENUITM_InOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_InOrdenActionPerformed(evt);
            }
        });
        MENUITM_Recorridos.add(MENUITM_InOrden);

        MENUITM_PostOrden.setText("PostOrden");
        MENUITM_PostOrden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_PostOrdenActionPerformed(evt);
            }
        });
        MENUITM_Recorridos.add(MENUITM_PostOrden);

        MENU.add(MENUITM_Recorridos);

        MENUITM_Salir.setText("Salir");
        MENUITM_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUITM_SalirActionPerformed(evt);
            }
        });
        MENU.add(MENUITM_Salir);

        MENU_PRINCIPAL.add(MENU);

        setJMenuBar(MENU_PRINCIPAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TABS)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(TABS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //al hacer click en "ingresar cantidad de nodos" del menu...
    private void MENUITM_CantidadNodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_CantidadNodosActionPerformed
        CambiarTabs(0); //se cambia la disposicion de las pestañas
    }//GEN-LAST:event_MENUITM_CantidadNodosActionPerformed
    
    //al hacer click en "ingresar nodos" del menu...
    private void MENUITM_IngresarNodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_IngresarNodosActionPerformed
        if(LimiteDeNodos != 0) //no se permite el ingreso hasta que haya limitado la cantidad de nodos del arbol
        {
            CambiarTabs(1); //se cambia la disposicion de las pestañas
        }
        else //si el limite de nodos era 0...
        {
            MostrarMensaje(7, 0); //se muestra un mensaje al usuario
        }
    }//GEN-LAST:event_MENUITM_IngresarNodosActionPerformed

    //al hacer click en "Mostrar Arbol" del menu...
    private void MENUITM_MostrarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_MostrarArbolActionPerformed
        if(LimiteDeNodos != 0 && ContadorNodos != 0) //no se permite el ingreso hasta que se haya insertado un nodo en el arbol
        {
            CambiarTabs(2); //se cambia la disposicion de las pestañas
            PintarArbol(); //se envia el arbol a pintar en CANVAS
        }
        else if(LimiteDeNodos == 0) //si no se habia limitado los nodos...
        {
            MostrarMensaje(7, 0); //se muestra un mensaje al usuario
        }
        else if(ContadorNodos == 0) //si aun no se habia ingresado nodos...
        {
            MostrarMensaje(8, 0); //se muestra un mensaje al usuario
        } 
    }//GEN-LAST:event_MENUITM_MostrarArbolActionPerformed

    //al hacer click en "PreOrden" del menu...
    private void MENUITM_PreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_PreOrdenActionPerformed
        if(LimiteDeNodos != 0 && ContadorNodos != 0) //no se permite el ingreso hasta que se haya insertado un nodo en el arbol
        {   
            CambiarTabs(3); //se cambia la disposicion de las pestañas
            LlenarPreOrden(); //se llama al metodo que llena el TextArea
        }
        else if(LimiteDeNodos == 0) //si no se habia limitado los nodos...
        {
            MostrarMensaje(7, 0); //se muestra un mensaje al usuario
        }
        else if(ContadorNodos == 0) //si aun no se habia ingresado nodos...
        {
            MostrarMensaje(8, 0); //se muestra un mensaje al usuario
        } 
    }//GEN-LAST:event_MENUITM_PreOrdenActionPerformed

    //al hacer click en "InOrden" del menu...
    private void MENUITM_InOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_InOrdenActionPerformed
        if(LimiteDeNodos != 0 && ContadorNodos != 0) //no se permite el ingreso hasta que se haya insertado un nodo en el arbol
        { 
            CambiarTabs(4); //se cambia la disposicion de las pestañas
            LlenarInOrden(); //se llama al metodo que llena el TextArea
        }
        else if(LimiteDeNodos == 0) //si no se habia limitado los nodos...
        {
            MostrarMensaje(7, 0); //se muestra un mensaje al usuario
        }
        else if(ContadorNodos == 0) //si aun no se habia ingresado nodos...
        {
            MostrarMensaje(8, 0); //se muestra un mensaje al usuario
        }
    }//GEN-LAST:event_MENUITM_InOrdenActionPerformed

    //al hacer click en "PostOrden" del menu...
    private void MENUITM_PostOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_PostOrdenActionPerformed
        if(LimiteDeNodos != 0 && ContadorNodos != 0) //no se permite el ingreso hasta que se haya insertado un nodo en el arbol
        { 
            CambiarTabs(5); //se cambia la disposicion de las pestañas
            LlenarPostOrden(); //se llama al metodo que llena el TextArea
        }
        else if(LimiteDeNodos == 0) //si no se habia limitado los nodos...
        {
            MostrarMensaje(7, 0); //se muestra un mensaje al usuario
        }
        else if(ContadorNodos == 0) //si aun no se habia ingresado nodos...
        {
            MostrarMensaje(8, 0); //se muestra un mensaje al usuario
        }
    }//GEN-LAST:event_MENUITM_PostOrdenActionPerformed

    //al hacer click en "Salir" del menu...
    private void MENUITM_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUITM_SalirActionPerformed
        System.exit(0); //se cierra la aplicacion
    }//GEN-LAST:event_MENUITM_SalirActionPerformed

    private void BTN_RegistrarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RegistrarNodoActionPerformed
        if(ContadorNodos == LimiteDeNodos) //si el contador es igual al limite...
        {
            MostrarMensaje(4, 0); //se muestra un mensaje al usuario
        }
        else //si aun se pueden insertar mas nodos en el arbol...
        {
            Nodo NuevoNodo = CrearNuevoNodo(); //se intenta crear un nuevo nodo
            if (NuevoNodo != null) //si la creacion fue exitosa...
            {
                if(ArbolBinario.Arbol.EsteNodoExiste(NuevoNodo) == false) //si ese nodo no existe en el arbol binario...
                {
                    ArbolBinario.Arbol.InsertarNodo(NuevoNodo); //se inserta el nodo
                    MostrarMensaje(5, NuevoNodo.Numero); //se muestra un mensaje al usuario
                    ContadorNodos = ContadorNodos + 1; //se hace un incremento en el contador
                }
                else //si el nodo ya existia en el arbol binario...
                {
                    MostrarMensaje(6, NuevoNodo.Numero); //se muestra un mensaje al usuario
                }
            }
        }
    }//GEN-LAST:event_BTN_RegistrarNodoActionPerformed

    private void BTN_RegistrarCantidadNodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RegistrarCantidadNodosActionPerformed
        if(ArbolBinario.Arbol.raiz != null) //Si ya existe un arbol binario...
        {
            int Confirmacion = MostrarMensaje(3, 0); //se muestra un mensaje al usuario y se guarda su eleccion
            if (Confirmacion == JOptionPane.YES_OPTION) //si el usuario selecciona si...
            {
                ArbolBinario.Arbol.Borrar(); //se borra el arbol ya que se asume que quiere crear uno nuevo.
                CrearLimiteDeNodos(); 
            }
        }
        else //si no existia un arbol...
        {
            CrearLimiteDeNodos();
        } 
    }//GEN-LAST:event_BTN_RegistrarCantidadNodosActionPerformed

    //este metodo cambia la disposicion de las Tabs con un switch a voluntad del parametro
    public void CambiarTabs(int TabActivada)
    {
        switch (TabActivada) 
        {
            case 0:
                TABS.setSelectedIndex(0);
                TABS.setEnabledAt(0, true);
                TABS.setEnabledAt(1, false);
                TABS.setEnabledAt(2, false);
                TABS.setEnabledAt(3, false);
                TABS.setEnabledAt(4, false);
                TABS.setEnabledAt(5, false);
                break;
            case 1:
                TABS.setSelectedIndex(1);
                TABS.setEnabledAt(0, false);
                TABS.setEnabledAt(1, true);
                TABS.setEnabledAt(2, false);
                TABS.setEnabledAt(3, false);
                TABS.setEnabledAt(4, false);
                TABS.setEnabledAt(5, false);
                break;
            case 2:
                TABS.setSelectedIndex(2);
                TABS.setEnabledAt(0, false);
                TABS.setEnabledAt(1, false);
                TABS.setEnabledAt(2, true);
                TABS.setEnabledAt(3, false);
                TABS.setEnabledAt(4, false);
                TABS.setEnabledAt(5, false);
                break;
            case 3:
                TABS.setSelectedIndex(3);
                TABS.setEnabledAt(0, false);
                TABS.setEnabledAt(1, false);
                TABS.setEnabledAt(2, false);
                TABS.setEnabledAt(3, true);
                TABS.setEnabledAt(4, false);
                TABS.setEnabledAt(5, false);
                break;
            case 4:
                TABS.setSelectedIndex(4);
                TABS.setEnabledAt(0, false);
                TABS.setEnabledAt(1, false);
                TABS.setEnabledAt(2, false);
                TABS.setEnabledAt(3, false);
                TABS.setEnabledAt(4, true);
                TABS.setEnabledAt(5, false);
                break;
            case 5:
                TABS.setSelectedIndex(5);
                TABS.setEnabledAt(0, false);
                TABS.setEnabledAt(1, false);
                TABS.setEnabledAt(2, false);
                TABS.setEnabledAt(3, false);
                TABS.setEnabledAt(4, false);
                TABS.setEnabledAt(5, true);
                break;
            default:
                break;
        }
    }
    
    //este metodo muestra un mensaje al usuario con un switch a voluntad del parametro
    public int MostrarMensaje(int NumeroMensaje, int NumeroNodo)
    {
        int Confirmacion = 0;
        
        switch (NumeroMensaje) 
        {
            case 1:
                JOptionPane.showMessageDialog(this, "Se ha limitado la cantidad de nodos a " + LimiteDeNodos, "EXITO.", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(this, "Ingrese un numero valido.", "ERROR.", JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                Confirmacion = JOptionPane.showConfirmDialog(this, "Se ha detectado que ya existe un arbol binario. ¿Desea borrarlo?", "AVISO", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                JOptionPane.showMessageDialog(this, "Ya no puede ingresar mas nodos. \nLimite = " + LimiteDeNodos, "ERROR.", JOptionPane.ERROR_MESSAGE);
                break;
            case 5:
                JOptionPane.showMessageDialog(this, "Se ha insertado el nodo " + NumeroNodo + " en el arbol binario.", "EXITO.", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 6:
                JOptionPane.showMessageDialog(this, "El nodo " + NumeroNodo + " ya existe, inserte un numero distinto.", "ERROR.", JOptionPane.ERROR_MESSAGE);
                break;
            case 7:
                JOptionPane.showMessageDialog(this, "Aun no puede ingresar aqui. \nDefina la cantidad de nodos del arbol.", "ERROR.", JOptionPane.ERROR_MESSAGE);
                break;
            case 8:
                JOptionPane.showMessageDialog(this, "Aun no puede ingresar aqui. \nIngrese al menos un nodo en el arbol.", "ERROR.", JOptionPane.ERROR_MESSAGE);
                break;
            default:
                break;
        }
        
        return Confirmacion;
    }
    
    //este metodo crea el limite de nodos en el arbol
    public void CrearLimiteDeNodos()
    {   
        try //se intenta...
        {   
            //obtener el numero que ingreso el usuario (lanza excepcion)
            LimiteDeNodos = parseInt(TXTFLD_CantidadNodos.getText());
            
            if(LimiteDeNodos > 0) //si el limite era mayor que 0...
            {
                ContadorNodos = 0; //se restablece el contador
                MostrarMensaje(1, 0); //se muestra un mensaje al usuario 
            }
            else //si el limite era menor que 0...
            {
                LimiteDeNodos = 0; //se restablece el limite
                MostrarMensaje(2, 0); //se muestra un mensaje al usuario 
            }
        }
        catch(Exception e) //si el intento de obtener el numero fracasa...
        {
            MostrarMensaje(2, 0); //se muestra un mensaje al usuario 
        }
    }
    
    //este metodo crea un nuevo nodo para el arbol binario
    public Nodo CrearNuevoNodo()
    {
        Nodo NuevoNodo = new Nodo(); //se crea un nuevo objeto de tipo nodo (no contiene nada)
        
        try //se intenta...
        {
            NuevoNodo.Numero = parseInt(TXTFLD_DatoDelNodo.getText()); //obtener el numero que ingreso el usuario (lanza excepcion)
            return NuevoNodo; //se devuelve el nodo con el numero insertado en el
        }
        catch(Exception e) //si el intento de obtener el numero fracasa...
        {
            MostrarMensaje(2, 0); //se muestra un mensaje al usuario
            return null; //se retorna nulo (no se crea ningun objeto)
        }
    }
    
    //este metodo llena AREA_PreOrden con el recorrido del arbol en PreOrden
    public void LlenarPreOrden()
    {
        String Informacion = Recorrido.PreOrden(ArbolBinario.Arbol.raiz); //se obtiene la informacion del arbol
        AREA_PreOrden.setText(Informacion); //se ingresa la informacion en el JTextArea.
        Recorrido.LimpiarString(); //se limpia la variable para poder usarla luego
    }
    
    
    //este metodo llena AREA_InOrden con el recorrido del arbol en InOrden
    public void LlenarInOrden()
    {
        String Informacion = Recorrido.InOrden(ArbolBinario.Arbol.raiz); //se obtiene la informacion del arbol
        AREA_InOrden.setText(Informacion); //se ingresa la informacion en el JTextArea.
        Recorrido.LimpiarString(); //se limpia la variable para poder usarla luego
    }
    
    //este metodo llena AREA_PostOrden con el recorrido del arbol en PostOrden
    public void LlenarPostOrden()
    {
        String Informacion = Recorrido.PostOrden(ArbolBinario.Arbol.raiz); //se obtiene la informacion del arbol
        AREA_PostOrden.setText(Informacion); //se ingresa la informacion en el JTextArea.
        Recorrido.LimpiarString(); //se limpia la variable para poder usarla luego
    }
    
    //este metodo es el que permite mostrar graficamente el arbol binario en VentanaPrincipal
    private void PintarArbol() 
    {
        VIRTUAL_DESKTOP.removeAll(); //se remueve todo del escritorio virtual
        Rectangle LimitesDelCanvas = CANVAS.getBounds(); //se obtiene el tamaño del canvas definido por el programador en NetBeans
        CANVAS = new JInternalFrame(); //se crea un nuevo canvas (tipo JInternalFrame)
        VIRTUAL_DESKTOP.add(CANVAS); //se añade el canvas al escritorio virtual
        CANVAS.setVisible(true); //se vuelve visible el canvas
        CANVAS.setBounds(LimitesDelCanvas); //se establece el tamaño del canvas
        CANVAS.add(ArbolBinario.Arbol.ObtenerDibujoDelArbol()); //se añade al canvas el dibujo del arbol binario
    }

    public static void main(String args[]) 
    {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AREA_InOrden;
    private javax.swing.JTextArea AREA_PostOrden;
    private javax.swing.JTextArea AREA_PreOrden;
    private javax.swing.JButton BTN_RegistrarCantidadNodos;
    private javax.swing.JButton BTN_RegistrarNodo;
    private javax.swing.JInternalFrame CANVAS;
    private javax.swing.JMenu MENU;
    private javax.swing.JMenuItem MENUITM_CantidadNodos;
    private javax.swing.JMenuItem MENUITM_InOrden;
    private javax.swing.JMenuItem MENUITM_IngresarNodos;
    private javax.swing.JMenuItem MENUITM_MostrarArbol;
    private javax.swing.JMenuItem MENUITM_PostOrden;
    private javax.swing.JMenuItem MENUITM_PreOrden;
    private javax.swing.JMenu MENUITM_Recorridos;
    private javax.swing.JMenuItem MENUITM_Salir;
    private javax.swing.JMenuBar MENU_PRINCIPAL;
    private javax.swing.JTabbedPane TABS;
    private javax.swing.JPanel TAB_Arbol;
    private javax.swing.JPanel TAB_CantidadNodos;
    private javax.swing.JPanel TAB_InOrden;
    private javax.swing.JPanel TAB_IngresarNodos;
    private javax.swing.JPanel TAB_PosOrden;
    private javax.swing.JPanel TAB_PreOrden;
    private javax.swing.JTextField TXTFLD_CantidadNodos;
    private javax.swing.JTextField TXTFLD_DatoDelNodo;
    private javax.swing.JDesktopPane VIRTUAL_DESKTOP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
