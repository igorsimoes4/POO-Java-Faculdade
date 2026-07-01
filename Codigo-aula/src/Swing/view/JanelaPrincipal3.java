/*
 * Created by JFormDesigner on Tue Jun 30 19:28:29 BRT 2026
 */

package Swing.view;

import Swing.dao.TarefaDAO;
import Swing.dao.TarefaSQLiteDAO;
import Swing.model.Tarefa;

import java.awt.*;
import java.sql.SQLException;
import javax.swing.*;

/**
 * @author igor0
 */
public class JanelaPrincipal3 extends JPanel {
    private DefaultListModel<String> modeloLista = new DefaultListModel<>();
    private TarefaDAO dao;
    public JanelaPrincipal3() {
        initComponents();

        try{
            dao = new TarefaSQLiteDAO();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        btnIncluir.addActionListener(e -> {
            dao.salvar(txtItem.getText());
            atualizarLista();
            txtItem.setText("");
        });


    }

    public void atualizarLista(){
        modeloLista.clear();
        for (Tarefa t : dao.listarTodas()){
            modeloLista.addElement(t.getDescricao());
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Igor
        txtItem = new JTextField();
        scrollPane1 = new JScrollPane();
        lstLista = new JList<>(modeloLista);
        btnIncluir = new JButton();

        //======== this ========
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax .
        swing. border .EmptyBorder ( 0, 0 ,0 , 0) ,  "JF\u006frmDes\u0069gner \u0045valua\u0074ion" , javax. swing .border
        . TitledBorder. CENTER ,javax . swing. border .TitledBorder . BOTTOM, new java. awt .Font ( "D\u0069alog"
        , java .awt . Font. BOLD ,12 ) ,java . awt. Color .red ) , getBorder
        () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void propertyChange (java
        . beans. PropertyChangeEvent e) { if( "\u0062order" .equals ( e. getPropertyName () ) )throw new RuntimeException
        ( ) ;} } );
        setLayout(new BorderLayout());
        add(txtItem, BorderLayout.NORTH);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(lstLista);
        }
        add(scrollPane1, BorderLayout.CENTER);

        //---- btnIncluir ----
        btnIncluir.setText("Incluir Item");
        add(btnIncluir, BorderLayout.SOUTH);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Igor
    private JTextField txtItem;
    private JScrollPane scrollPane1;
    private JList lstLista;
    private JButton btnIncluir;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JanelaPrincipal3().setVisible(true));
    }

}
