package br.ufjf.dcc.dcc025.estoque.view;

import br.ufjf.dcc.dcc025.estoque.controller.AtualizaDados;
import br.ufjf.dcc.dcc025.estoque.model.Produto;
import br.ufjf.dcc.dcc025.estoque.repository.Repository;
import java.util.ArrayList;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gabriel Cordeiro Tavares - 202265163A
 */
public class Tela extends javax.swing.JFrame {

    public Tela() {
        initComponents();
        this.addWindowListener(new AtualizaDados(this));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCadastro = new javax.swing.JPanel();
        pnlNome = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        pnlQuantidade = new javax.swing.JPanel();
        edtQuantidade = new javax.swing.JTextField();
        lblQuantidade = new javax.swing.JLabel();
        pnlValor = new javax.swing.JPanel();
        lblValor = new javax.swing.JLabel();
        edtValor = new javax.swing.JTextField();
        pnlDescricao = new javax.swing.JPanel();
        lblDescricao = new javax.swing.JLabel();
        edtDescricao = new javax.swing.JTextField();
        pnlBotoes = new javax.swing.JPanel();
        btnAdicionar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        btnClonar = new javax.swing.JButton();
        pnlGrid = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdItens = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estoque");

        lblNome.setText("Nome");

        javax.swing.GroupLayout pnlNomeLayout = new javax.swing.GroupLayout(pnlNome);
        pnlNome.setLayout(pnlNomeLayout);
        pnlNomeLayout.setHorizontalGroup(
            pnlNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlNomeLayout.setVerticalGroup(
            pnlNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblNome))
        );

        lblQuantidade.setText("Quantidade");

        javax.swing.GroupLayout pnlQuantidadeLayout = new javax.swing.GroupLayout(pnlQuantidade);
        pnlQuantidade.setLayout(pnlQuantidadeLayout);
        pnlQuantidadeLayout.setHorizontalGroup(
            pnlQuantidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQuantidadeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQuantidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(edtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlQuantidadeLayout.setVerticalGroup(
            pnlQuantidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQuantidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(edtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblQuantidade))
        );

        lblValor.setText("Valor");

        javax.swing.GroupLayout pnlValorLayout = new javax.swing.GroupLayout(pnlValor);
        pnlValor.setLayout(pnlValorLayout);
        pnlValorLayout.setHorizontalGroup(
            pnlValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlValorLayout.setVerticalGroup(
            pnlValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(edtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblValor))
        );

        lblDescricao.setText("Descrição");

        javax.swing.GroupLayout pnlDescricaoLayout = new javax.swing.GroupLayout(pnlDescricao);
        pnlDescricao.setLayout(pnlDescricaoLayout);
        pnlDescricaoLayout.setHorizontalGroup(
            pnlDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescricaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDescricao)
                .addGap(18, 18, 18)
                .addComponent(edtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlDescricaoLayout.setVerticalGroup(
            pnlDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDescricaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblDescricao)
                .addComponent(edtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        btnClonar.setText("Clonar");
        btnClonar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClonarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBotoesLayout = new javax.swing.GroupLayout(pnlBotoes);
        pnlBotoes.setLayout(pnlBotoesLayout);
        pnlBotoesLayout.setHorizontalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBotoesLayout.createSequentialGroup()
                        .addComponent(btnAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRemover)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnClonar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlBotoesLayout.setVerticalGroup(
            pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBotoesLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(btnClonar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdicionar)
                    .addComponent(btnRemover))
                .addContainerGap())
        );

        pnlCadastro.setBorder(BorderFactory.createTitledBorder("Produto"));

        javax.swing.GroupLayout pnlCadastroLayout = new javax.swing.GroupLayout(pnlCadastro);
        pnlCadastro.setLayout(pnlCadastroLayout);
        pnlCadastroLayout.setHorizontalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlQuantidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlCadastroLayout.setVerticalGroup(
            pnlCadastroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCadastroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pnlNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(pnlBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        grdItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Valor", "Quantidade", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grdItens.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(grdItens);

        javax.swing.GroupLayout pnlGridLayout = new javax.swing.GroupLayout(pnlGrid);
        pnlGrid.setLayout(pnlGridLayout);
        pnlGridLayout.setHorizontalGroup(
            pnlGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGridLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlGridLayout.setVerticalGroup(
            pnlGridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlGrid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlGrid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        adicionar();
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        remover();
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnClonarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClonarActionPerformed
        clonar();
    }//GEN-LAST:event_btnClonarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnClonar;
    private javax.swing.JButton btnRemover;
    private javax.swing.JTextField edtDescricao;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtQuantidade;
    private javax.swing.JTextField edtValor;
    private javax.swing.JTable grdItens;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDescricao;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblValor;
    private javax.swing.JPanel pnlBotoes;
    private javax.swing.JPanel pnlCadastro;
    private javax.swing.JPanel pnlDescricao;
    private javax.swing.JPanel pnlGrid;
    private javax.swing.JPanel pnlNome;
    private javax.swing.JPanel pnlQuantidade;
    private javax.swing.JPanel pnlValor;
    // End of variables declaration//GEN-END:variables

    public void carregar() {
        Repository repository = new Repository();        
        List<Produto> lista = repository.getAll();
        
        
        for (Produto produto: lista) {
            addRow(produto);
        }
    }

    public void salvar() {
        List<Produto> lista = new ArrayList<>();
        for (int row = 0; row < grdItens.getRowCount(); row++) {
            lista.add(getRow(row));            
        }
        
        
        Repository repository = new Repository();        
        repository.salvar(lista);
    }
    
    private void adicionar(){
        String nome = edtNome.getText();
        if(nome.isBlank()){
            JOptionPane.showMessageDialog(this, "Nome inválido!");
            return;
        }
        
        Double valor;
        try{
            valor = Double.valueOf(edtValor.getText());
        }
        catch(NumberFormatException e){
           JOptionPane.showMessageDialog(this, "Valor inválido!");
           edtValor.setText("");
           return; 
        }
           
        int quantidade;
        try{
            quantidade = Integer.parseInt(edtQuantidade.getText());
        }
        catch(NumberFormatException e){
           JOptionPane.showMessageDialog(this, "Quantidade inválida!");
           edtQuantidade.setText("");
           return; 
        }
        
        String descricao = edtDescricao.getText();
        if(descricao.isBlank()){
            JOptionPane.showMessageDialog(this, "Descrição inválida!");
            return;
        }
        
        Produto produto = new Produto(nome, valor, quantidade, descricao);        
        addRow(produto);
        edtNome.setText("");
        edtValor.setText("");
        edtQuantidade.setText("");
        edtDescricao.setText("");
    }
    private void remover(){
        int row = grdItens.getSelectedRow();
        
        if(row != -1){
            DefaultTableModel model = (DefaultTableModel) grdItens.getModel();
            model.removeRow(row);
        }
        else
          JOptionPane.showMessageDialog(this, "Selecione um produto para remover!");          
    }
    private void clonar(){
        int row = grdItens.getSelectedRow();
        if(row != -1){
            Produto produto = getRow(row);
            edtNome.setText(produto.getNome());
            edtValor.setText(String.valueOf(produto.getValor()));
            edtQuantidade.setText(String.valueOf(produto.getQuantidade()));
            edtDescricao.setText(produto.getDescricao());
        }
        else
          JOptionPane.showMessageDialog(this, "Selecione um produto para clonar!");  
    }  
    
    private void addRow(Produto produto){        
        DefaultTableModel model = (DefaultTableModel) grdItens.getModel();
        model.addRow(new Object[]{produto.getNome(), produto.getValor(), produto.getQuantidade(), produto.getDescricao()});
    }
    private Produto getRow(int row){
        String nome = (String) grdItens.getValueAt(row, 0);
        double valor = (double) grdItens.getValueAt(row, 1);
        int quantidade = (int) grdItens.getValueAt(row, 2);
        String descricao = (String) grdItens.getValueAt(row, 3);    
        return new Produto(nome, valor, quantidade, descricao);
    }
}
