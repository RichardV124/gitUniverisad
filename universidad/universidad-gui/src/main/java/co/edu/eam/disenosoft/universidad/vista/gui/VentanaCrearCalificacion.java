/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.eam.disenosoft.universidad.vista.gui;

import java.util.List;

import javax.swing.JOptionPane;

import co.edu.eam.disenosoft.universidad.vista.controladores.ControladorVentanaCrearCalificacion;
import co.edu.eam.ingesoft.desarrollo.logica.excepcion.ExcepcionNegocio;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Asignatura;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Curso;
import co.edu.eam.ingesoft.desarrollo.universidad.persistencia.modelo.entidades.Evaluacion;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dir_software
 */
public class VentanaCrearCalificacion extends javax.swing.JInternalFrame {

    /**
     * Instancia de curso global
     */
    private Curso curso;

    private List<Evaluacion> evaluaciones;

    /**
     * Controlador de la ventanaCrearCalificacion
     */
    private ControladorVentanaCrearCalificacion controlador;

    /**
     * Creates new form VentanaCrearCalificacion
     */
    public VentanaCrearCalificacion() {
        controlador = new ControladorVentanaCrearCalificacion();
        curso = null;
        evaluaciones = null;
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfcodigoasignatura = new javax.swing.JTextField();
        btnBuscarAsignatura = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfnombreasignatura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCalificaciones = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        tfnombrecal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tfnombrepor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfporcentajenoasignado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnQuitarCalificacion = new javax.swing.JButton();

        setTitle("Administrar Calificaciones Curso");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a10icono.png"))); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Asignatura"));

        jLabel1.setText("Codigo");

        btnBuscarAsignatura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/zoom37.png"))); // NOI18N
        btnBuscarAsignatura.setToolTipText("Buscar Asignatura");
        btnBuscarAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAsignaturaActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        tfnombreasignatura.setEditable(false);

        jLabel3.setText("Curso");

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
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
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(tfcodigoasignatura, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfnombreasignatura)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                            .addComponent(jLabel1)
                            .addComponent(tfcodigoasignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfnombreasignatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/a10.png"))); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Calificaciones Curso"));

        tablaCalificaciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Porcentaje"
            }
        ));
        jScrollPane1.setViewportView(tablaCalificaciones);

        jLabel5.setText("Nombre");

        jLabel6.setText("Porcentaje");

        jLabel7.setText("No Asignado");

        tfporcentajenoasignado.setEditable(false);
        tfporcentajenoasignado.setToolTipText("Porcentaje faltante por asignar");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculation1.png"))); // NOI18N
        jButton1.setToolTipText("Agregar Calificacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnQuitarCalificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/multiplication.png"))); // NOI18N
        btnQuitarCalificacion.setToolTipText("Quitar Calificacion Seleccionada");
        btnQuitarCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarCalificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQuitarCalificacion)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfporcentajenoasignado, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addComponent(tfnombrepor)
                            .addComponent(tfnombrecal, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfnombrecal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tfnombrepor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(tfporcentajenoasignado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnQuitarCalificacion)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAsignaturaActionPerformed
        // TODO add your handling code here:
        try {
            if (tfcodigoasignatura.getText() == null) {
                JOptionPane.showMessageDialog(null, "Ingrese un c�digo");
            } else {
                Asignatura asignatura = controlador.buscarAsignatura(tfcodigoasignatura.getText());
                if (asignatura != null) {
                    tfnombreasignatura.setText(asignatura.getNombre());
                    llenarCombo(asignatura);
                    curso = controlador.buscarCurso((String) jComboBox1.getSelectedItem());
                    llenarTabla(curso);
                    tfporcentajenoasignado.setText("" + (100 - controlador.sumarPorcentajeEvaluacionCurso(curso)));
                } else {
                    limpiarAsignatura();
                    JOptionPane.showMessageDialog(null, "No hay una asignatura registrada "
                            + "con el c�digo " + tfcodigoasignatura.getText());
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnBuscarAsignaturaActionPerformed

    private void btnQuitarCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarCalificacionActionPerformed
        // TODO add your handling code here:
        try {
            if (tablaCalificaciones.getSelectedRow() == -1) {
                JOptionPane.showMessageDialog(null, "No hay una calificaci�n seleccionada");
            } else {
                controlador.eliminarEvaluacion(evaluaciones.get(tablaCalificaciones.getSelectedRow()));
                btnBuscarAsignaturaActionPerformed(evt);
            }
        } catch (ExcepcionNegocio e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnQuitarCalificacionActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        // TODO add your handling code here:
        try {
            if (jComboBox1.getSelectedItem() == null) {
                return;
            }
            curso = controlador.buscarCurso((String) jComboBox1.getSelectedItem());
            llenarTabla(curso);
            tfporcentajenoasignado.setText("" + (100 - controlador.sumarPorcentajeEvaluacionCurso(curso)));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        try {
            if (tfnombrecal.getText().isEmpty() || tfnombrepor.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ingrese los datos de la calificaci�n");
                return;
            }
            Evaluacion eval = new Evaluacion(curso, tfnombrecal.getText(), Double.parseDouble(tfnombrepor.getText()));
            controlador.crearEvaluacion(eval);
            curso = controlador.buscarCurso((String) jComboBox1.getSelectedItem());
            llenarTabla(curso);
            tfporcentajenoasignado.setText("" + (100 - controlador.sumarPorcentajeEvaluacionCurso(curso)));
        } catch (ExcepcionNegocio e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }// GEN-LAST:event_jButton1ActionPerformed

    /**
     * M�todo para limpiar campos en asignatura
     */
    private void limpiarAsignatura() {
        tfcodigoasignatura.setText(null);
        tfnombreasignatura.setText(null);
        jComboBox1.removeAllItems();
    }

    /**
     * M�todo para llenar el combo con los cursos de una asignatura
     *
     * @param asignatura, la asignatura a la que se le buscar�n los cursos
     * @throws PersistenciaException
     */
    public void llenarCombo(Asignatura asignatura) throws Exception {
        jComboBox1.removeAllItems();
        List<Curso> lista = controlador.listarCursosPorAsignatura(asignatura);
        for (int i = 0; i < lista.size(); i++) {
            jComboBox1.addItem(lista.get(i).getCodigo());
        }
    }

    /**
     * M�todo para llenar la tabla con las evaluaciones de un curso
     *
     * @param curso el curso al que se le buscan las evaluaciones
     * @throws Exception
     */
    public void llenarTabla(Curso curso) throws Exception {
        DefaultTableModel tabla = (DefaultTableModel) tablaCalificaciones.getModel();
        evaluaciones = controlador.listarEvaluacionPorCurso(curso);
        tabla.setRowCount(0);
        for (int i = 0; i < evaluaciones.size(); i++) {
            tabla.addRow(new Object[]{evaluaciones.get(i).getNombre(), evaluaciones.get(i).getPorcentaje()});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarAsignatura;
    private javax.swing.JButton btnQuitarCalificacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCalificaciones;
    private javax.swing.JTextField tfcodigoasignatura;
    private javax.swing.JTextField tfnombreasignatura;
    private javax.swing.JTextField tfnombrecal;
    private javax.swing.JTextField tfnombrepor;
    private javax.swing.JTextField tfporcentajenoasignado;
    // End of variables declaration//GEN-END:variables
}
