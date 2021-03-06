/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.disenosoft.universidad.vista.gui;

import co.edu.eam.disenosoft.universidad.vista.controladores.ControladorVentanaVerCalificaciones;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Nota;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.RegistroCurso;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dir_software
 */
public class VentanaVerCalificaciones extends javax.swing.JInternalFrame {

     /**
     * controlador de la ventanavercalificaciones
     */
    private ControladorVentanaVerCalificaciones controlador;

    /**
     * Creates new form VentanaIngresarCalificaciones
     */
    public VentanaVerCalificaciones() {
        controlador = new ControladorVentanaVerCalificaciones();
        initComponents();
        setVisible(true);
        setMaximizable(false);
        setIconifiable(true);
        setResizable(false);
        setClosable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfcodigoasignatura = new javax.swing.JTextField();
        btnBuscarAsignatura = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfnombreasignatura = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        comboCurso = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaNotas = new javax.swing.JTable();

        setTitle("Ver Calificaciones");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom38.png"))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom38.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asignatura"));

        jLabel2.setText("Codigo");

        btnBuscarAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom37.png"))); // NOI18N
        btnBuscarAsignatura.setToolTipText("Buscar Asignatura");
        btnBuscarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAsignaturaActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        tfnombreasignatura.setEditable(false);

        jLabel4.setText("Curso");

        comboCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboCursoItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(37, 37, 37)
                        .addComponent(tfcodigoasignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfnombreasignatura)
                            .addComponent(comboCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarAsignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarAsignatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tfcodigoasignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfnombreasignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(comboCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tablaNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Nota 1", "Nota 2", "..", "...", "Nota N", "Definitiva"
            }
        ));
        jScrollPane1.setViewportView(tablaNotas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 114, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAsignaturaActionPerformed
        // TODO add your handling code here:
        try {
            if (tfcodigoasignatura.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese un c�digo para la b�squeda");
            } else {
                Asignatura asig = controlador.buscarAsignatura(tfcodigoasignatura.getText());
                if (asig != null) {
                    tfnombreasignatura.setText(asig.getNombre());
                    llenarCombo(asig);
                } else {
                    limpiarCampos();
                    JOptionPane.showMessageDialog(null, "No hay una asignatura con el"
                            + " c�digo " + tfcodigoasignatura.getText());
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarAsignaturaActionPerformed

    private void comboCursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboCursoItemStateChanged
        // TODO add your handling code here:
         try {
            if (comboCurso.getSelectedItem() == null) {
                DefaultTableModel tabla = (DefaultTableModel) tablaNotas.getModel();
                tabla.setRowCount(0);
                return;
            }
            if (comboCurso.getSelectedIndex() == 0) {
                DefaultTableModel tabla = (DefaultTableModel) tablaNotas.getModel();
                tabla.setRowCount(0);
            } else {
                nombrarTabla((Curso) comboCurso.getSelectedItem());
                llenarTabla((Curso) comboCurso.getSelectedItem());
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_comboCursoItemStateChanged

      /**
     * M�todo para limpiar campos de la ventana
     */
    private void limpiarCampos(){
        tfcodigoasignatura.setText(null);
        tfnombreasignatura.setText(null);
        comboCurso.removeAllItems();
    }
    
    /**
     * M�todo para nombrar la tabla, seg�n la cantidad de evaluaciones del curso
     * @param curso, el curso al que se le van a ver las evaluaciones
     * @throws Exception 
     */
    private void nombrarTabla(Curso curso) throws Exception {
        List<RegistroCurso> registros = controlador.listarRegistrosPorCurso(curso);
        DefaultTableModel tabla = (DefaultTableModel) tablaNotas.getModel();
       if (registros.size() > 0) {
            List<Evaluacion> evaluaciones = controlador.listarEvaluacionPorCurso(registros.get(0).getCurso());
           // List<Evaluacion> evaluaciones = controlador.listarEvaluacionPorCurso(curso);
            ArrayList<String> nombres = new ArrayList();
            nombres.add("C�dula");
            nombres.add("Nombre");
            for (Evaluacion eval : evaluaciones) {
                nombres.add(eval.getNombre());
            }
            nombres.add("Definitiva");
            tabla.setColumnIdentifiers(nombres.toArray());
      }
    }

    /**
     * M�todo para llenar la tabla con la informaci�n del curso
     * @param curso, elo curso que contiene la informaci�n de la tabla
     * @throws Exception 
     */
    private void llenarTabla(Curso curso) throws Exception {
        List<RegistroCurso> registros = controlador.listarRegistrosPorCurso(curso);
        DefaultTableModel tabla = (DefaultTableModel) tablaNotas.getModel();
        tabla.setRowCount(0);
        ArrayList<String> datos = new ArrayList();
        for (RegistroCurso registro : registros) {
            double notaDef = 0;
            datos.add(registro.getEstudiante().getCedula());
            datos.add(registro.getEstudiante().getNombre());
            List<Evaluacion> evaluaciones = controlador.listarEvaluacionPorCurso(registro.getCurso());
            for (Evaluacion eval : evaluaciones) {
                Nota nota = controlador.buscarNotaEvaluacion(eval);
                if (nota == null) {
                    datos.add("NC");
                } else {
                    datos.add(""+nota.getValor());
                    notaDef += nota.getValor() * (eval.getPorcentaje()/100);
                }
            }
            datos.add(""+notaDef);
            tabla.addRow(datos.toArray());
        }

    }

    /**
     * M�todo para llenar el combo con los cursos de una asignatura
     *
     * @param asignatura, la asignatura a la que se le quieren buscar los cursos
     * @throws Exception
     */
    private void llenarCombo(Asignatura asignatura) throws Exception {
        comboCurso.removeAllItems();
        List<Curso> cursos = controlador.buscarCursoPorAsignatura(asignatura);
        comboCurso.addItem("Seleccione un curso");
        for (Curso curso : cursos) {
            comboCurso.addItem(curso);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarAsignatura;
    private javax.swing.JComboBox comboCurso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaNotas;
    private javax.swing.JTextField tfcodigoasignatura;
    private javax.swing.JTextField tfnombreasignatura;
    // End of variables declaration//GEN-END:variables
}
