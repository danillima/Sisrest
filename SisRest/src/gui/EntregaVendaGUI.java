/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.ClienteDAO;
import dao.ProdutoDAO;
import dao.ProdutoDaVendaDAO;
import dao.VendaDAO;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Cliente;
import model.Produto;
import model.ProdutoHasVenda;
import model.ProdutoVendaTableModel;
import model.Venda;

/**
 *
 * @author Daniel Lima
 */
public class EntregaVendaGUI extends javax.swing.JFrame {
    Cliente cli;
    ClienteDAO cliDAO;
    Produto prod;
    ProdutoDAO prodDAO;
    Venda vend;
    VendaDAO venDAO;
    ProdutoHasVenda pV;
    ProdutoDaVendaDAO pvDAO;
    private List<Cliente> clientesNome = new ArrayList<>();
    private List<Cliente> clientesConsulta = new ArrayList<>();
    private List<Venda> vendas = new ArrayList<>();
    private List<Produto> produtosTabela = new ArrayList<>();
    private List<ProdutoHasVenda> qtdProdutosVenda = new ArrayList<>();
    /**
     * Creates new form EntregaProduto
     */
    public EntregaVendaGUI() throws Exception {
        initComponents();
        inicializaComboConsultaVenda();
    }
    
    private void defineIdsVenda(){
     int ind = cbVendas.getSelectedIndex();
        if (ind < 1) {
            vend = null;
            return;
        }
        ind--;
        vend = vendas.get(ind);
        //System.out.println(rece.getIdReceita());
    }
    public final void inicializaComboConsultaVenda() throws Exception {
        DefaultComboBoxModel comboConsultaVenda = new DefaultComboBoxModel();
        comboConsultaVenda.addElement("Selecione a Venda");
        venDAO = new VendaDAO();
        vend = new Venda();
        cli = new Cliente();
        cliDAO = new ClienteDAO();
        
        vendas = venDAO.listaTodasVendas(vend);
        clientesConsulta = cliDAO.clientesDeVenda();
        
        for(int i = 0 ; i < vendas.size() ; i++){
               //System.out.println("" + estoque.get(i).getNumeroLoteEstoque());
               for(int y=0 ; y< clientesConsulta.size() ; y++){    
               }
              
               //if(vendas.get(i).getStatusVendas().equals("Andamento")){
                  comboConsultaVenda.addElement("Nome: " + clientesConsulta.get(i).getNomeCliente() + " " + clientesConsulta.get(i).getSobreNomeCliente() + " Data Venda : " + vendas.get(i).getDataVendas());
               //}
        }
            cbVendas.setModel(comboConsultaVenda);
        //decidir se vai setar 0 ou nao
        //cbClientes.setSelectedIndex(0);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblVendas = new javax.swing.JLabel();
        cbVendas = new javax.swing.JComboBox<>();
        btnConsultar = new javax.swing.JButton();
        lblCPF = new javax.swing.JLabel();
        lblDataVenda = new javax.swing.JLabel();
        txtDataVenda = new javax.swing.JFormattedTextField();
        lblMeioPagamento = new javax.swing.JLabel();
        rdbDinheiro = new javax.swing.JRadioButton();
        rdbCredito = new javax.swing.JRadioButton();
        lblStatus = new javax.swing.JLabel();
        rdbAndamento = new javax.swing.JRadioButton();
        lblProdutos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        btnEntregar = new javax.swing.JButton();
        txtCPF = new javax.swing.JFormattedTextField();
        btnAtualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entregar Produto");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consulta"));

        lblVendas.setText("Vendas");

        cbVendas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbVendas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbVendasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cbVendasFocusLost(evt);
            }
        });
        cbVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbVendasMouseEntered(evt);
            }
        });
        cbVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVendasActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        lblCPF.setText("CPF");

        lblDataVenda.setText("Data Venda");

        try {
            txtDataVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataVenda.setEnabled(false);

        lblMeioPagamento.setText("Meio Pagamento");

        buttonGroup1.add(rdbDinheiro);
        rdbDinheiro.setText("D");
        rdbDinheiro.setEnabled(false);

        buttonGroup1.add(rdbCredito);
        rdbCredito.setText("C");
        rdbCredito.setEnabled(false);

        lblStatus.setText("Status");

        rdbAndamento.setText("Andamento");
        rdbAndamento.setEnabled(false);

        lblProdutos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblProdutos.setText("Produtos");

        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ProdutoVendaTableModel modelo = new ProdutoVendaTableModel();
        tabelaProdutos.setModel(modelo);
        jScrollPane1.setViewportView(tabelaProdutos);

        btnEntregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEntregar.setText("Entregar Venda");
        btnEntregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEntregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntregarActionPerformed(evt);
            }
        });

        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setEnabled(false);

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(btnEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMeioPagamento)
                            .addComponent(lblDataVenda)
                            .addComponent(lblStatus)
                            .addComponent(lblVendas)
                            .addComponent(lblCPF))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbVendas, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rdbDinheiro)
                                        .addGap(10, 10, 10)
                                        .addComponent(rdbCredito))
                                    .addComponent(rdbAndamento)
                                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtualizar)
                            .addComponent(btnConsultar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 62, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProdutos)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVendas)
                    .addComponent(cbVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataVenda)
                    .addComponent(txtDataVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMeioPagamento)
                    .addComponent(rdbDinheiro)
                    .addComponent(rdbCredito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(rdbAndamento))
                .addGap(28, 28, 28)
                .addComponent(lblProdutos)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
       if(cbVendas.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null,"Selecione uma venda!");
        }else{
            limparProdTable();
        try {
            populaTable();
            //txtTotal.setText("" + calculaTotal());
            vend = new Venda();
            venDAO = new VendaDAO();
            cliDAO = new ClienteDAO();
           
            defineIdsVenda();
            
            clientesNome = cliDAO.consultaClienteID(vend.getIdCliente());
            
            txtCPF.setText(clientesNome.get(0).getCpfCliente());
            
            venDAO.pesquisar(vend);
            
            SimpleDateFormat formatdata = new SimpleDateFormat("dd/MM/yyyy");     
            txtDataVenda.setText(formatdata.format(vend.getDataVendas()));
            
            switch(vend.getMeioPagamentoVendas()){
            
                case"C":
                    rdbCredito.setSelected(true);
                    break;
                case"D":
                    rdbDinheiro.setSelected(true);
                    break;
            }
            switch(vend.getStatusVendas()){
                case"Andamento":
                    rdbAndamento.setSelected(true);
                    break;
            }
            
        } catch (Exception ex) {
            Logger.getLogger(CadastroVendaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
      }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnEntregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntregarActionPerformed
        if(cbVendas.getSelectedIndex() == 0){
                JOptionPane.showMessageDialog(null,"Escolha uma venda!");
            }else{
            vend = new Venda();  
            defineIdsVenda();
        try {
            
            venDAO = new VendaDAO();
            venDAO.entregarVend(vend);
            
            JOptionPane.showMessageDialog(null,"Venda Entregue com sucesso!");
            inicializaComboConsultaVenda();
            
            limpaCampos();
            limparProdTable();
            }catch (Exception ex) {
                    Logger.getLogger(CadastroVendaGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }//GEN-LAST:event_btnEntregarActionPerformed

    private void cbVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVendasActionPerformed
        
    }//GEN-LAST:event_cbVendasActionPerformed

    private void cbVendasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbVendasFocusGained
        
    }//GEN-LAST:event_cbVendasFocusGained

    private void cbVendasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbVendasFocusLost
       
    }//GEN-LAST:event_cbVendasFocusLost

    private void cbVendasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbVendasMouseEntered
        
    }//GEN-LAST:event_cbVendasMouseEntered

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        try {
            inicializaComboConsultaVenda();
        } catch (Exception ex) {
            Logger.getLogger(EntregaVendaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAtualizarActionPerformed
    private void populaTable() throws Exception{
        
        vend = new Venda();
        
        defineIdsVenda();
        
        ProdutoVendaTableModel modelo = (ProdutoVendaTableModel)tabelaProdutos.getModel();
        
        pvDAO = new ProdutoDaVendaDAO();
        prodDAO = new ProdutoDAO();
        prod = new Produto();
        produtosTabela = prodDAO.listaProdutoAdd(vend.getIdVendas());
        
        pV = new ProdutoHasVenda();
        qtdProdutosVenda = pvDAO.listaQntdProduto(vend.getIdVendas());
        for(int i = 0 ; i < produtosTabela.size() ; i++){
            prod.setIdProduto(produtosTabela.get(i).getIdProduto());
            prod.setNomeProduto(produtosTabela.get(i).getNomeProduto());
            prod.setPrecoProduto(produtosTabela.get(i).getPrecoProduto());
            pV.setQtdPrdVenda(qtdProdutosVenda.get(i).getQtdPrdVenda());
            
           modelo.addRow(new Produto(prod.getIdProduto(),prod.getNomeProduto(),prod.getPrecoProduto()),new ProdutoHasVenda(pV.getQtdPrdVenda()));
        }
//        for(int i =0 ; i < produtosTabela.size() ; i++){
//            System.out.println(produtosTabela.get(i).getNomeProduto() + qtdProdutosVenda.get(i).getQtdPrdVenda());
//        }
        
    }
    public void limparProdTable() {
        ProdutoVendaTableModel modelo = (ProdutoVendaTableModel)tabelaProdutos.getModel();
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
}
}
    public void limpaCampos(){
        txtCPF.setText("");
        txtDataVenda.setText("");
        buttonGroup1.clearSelection();
        rdbAndamento.setSelected(false);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(EntregaVendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntregaVendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntregaVendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntregaVendaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EntregaVenda().setVisible(true);
//            }
//        });
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new EntregaVenda().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEntregar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbVendas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblDataVenda;
    private javax.swing.JLabel lblMeioPagamento;
    private javax.swing.JLabel lblProdutos;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblVendas;
    private javax.swing.JRadioButton rdbAndamento;
    private javax.swing.JRadioButton rdbCredito;
    private javax.swing.JRadioButton rdbDinheiro;
    private javax.swing.JTable tabelaProdutos;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtDataVenda;
    // End of variables declaration//GEN-END:variables
}