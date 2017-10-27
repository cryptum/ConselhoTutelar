package view;

import MODEL.AtendimentoM;
import MODEL.CriançaM;
import MODEL.RequerenteM;
import dao.AtendimentoDAO;
import dao.CriançaDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class AtendimentoView extends javax.swing.JInternalFrame {

    AtendimentoM atendimento = new AtendimentoM();
    AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
    List<AtendimentoM> listaAtendimento = new ArrayList<>();
    
    CriançaM crianca = new CriançaM();
    CriançaDAO criancaDAO = new CriançaDAO();
    List<CriançaM> listaCrianca = new ArrayList<>();
    
    RequerenteM requerente = new RequerenteM();
    public AtendimentoView() {
        initComponents();
        this.setVisible(true);
        dlgBusca.setSize(941, 508);
        //jTabbedPane1.setEnabled(false);
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgBusca = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBusca = new javax.swing.JTable();
        btnBusca = new javax.swing.JButton();
        txtBusca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblAtendimentos = new javax.swing.JTable();
        btnNovoAtendimento = new javax.swing.JButton();
        btnEditarAtendimento = new javax.swing.JButton();
        btnExlucirAtendimento = new javax.swing.JButton();
        pnlAtendimento = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRelatoAtendimento = new javax.swing.JTextArea();
        txtDataAtendimento = new javax.swing.JTextField();
        btnBuscarRequerente = new javax.swing.JButton();
        txtRequerenteAtendimento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdAtendimento = new javax.swing.JTextField();
        btnSalvarAtendimento = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        btnBuscarConselheiro1 = new javax.swing.JButton();
        txtConselheiroAtendimento1 = new javax.swing.JTextField();
        txtConselheiroAtendimento2 = new javax.swing.JTextField();
        btnBuscarConselheiro2 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        pnlBusca = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNomeCrianca = new javax.swing.JTextField();
        txtIdCrianca = new javax.swing.JTextField();
        txtNascimentoCrianca = new javax.swing.JTextField();
        txtEnderecoCrianca = new javax.swing.JTextField();
        txtNumeroCrianca = new javax.swing.JTextField();
        txtBairroCrianca = new javax.swing.JTextField();
        txtTelefoneCrianca = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCrianca = new javax.swing.JTable();
        btnSalvarCrianca = new javax.swing.JButton();
        btnAlterarCrianca = new javax.swing.JButton();
        btnExcluirCrianca = new javax.swing.JButton();
        btnCancelarCrianca = new javax.swing.JButton();
        btnNovoCrianca = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtBuscarDireitos = new javax.swing.JTextField();
        btnBuscarDireitos = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblDireitos1 = new javax.swing.JTable();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblDireitos2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtIdNucleo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtNomeNucleo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtParentescoNucleo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtEnderecoNucleo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtNumeroNucleo = new javax.swing.JTextField();
        txtBairroNucleo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtTelefoneNucleo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtResponsabilidadeNucleo = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblNucleo = new javax.swing.JTable();
        btnNovoNucleo = new javax.swing.JButton();
        btnSalvarNucleo = new javax.swing.JButton();
        btnAlterarNucleo = new javax.swing.JButton();
        btnExcluirNucleo = new javax.swing.JButton();
        btnCancelarNucleo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtCelularNucleo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtIdAcompanhante = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtNomeAcompanhante = new javax.swing.JTextField();
        txtEnderecoAcompanhante = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtNumeroAcompanhante = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtBairroAcompanhante = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtTelefoneAcompanhante = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtCidadeAcompanhante = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtEstadoAcompanhante = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAcompanhante = new javax.swing.JTable();
        btnNovoAcompanhante = new javax.swing.JButton();
        btnSalvarAcompanhante = new javax.swing.JButton();
        btnAlterarAcompanhante = new javax.swing.JButton();
        btnExcluirAcompanhante = new javax.swing.JButton();
        btnCancelarAcompanhante = new javax.swing.JButton();

        dlgBusca.setTitle("Buscar Requerente");

        tblBusca.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblBusca);

        btnBusca.setText("Buscar");

        txtBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaActionPerformed(evt);
            }
        });

        jLabel3.setText("Buscar");

        jButton4.setText("Selecionar");

        javax.swing.GroupLayout dlgBuscaLayout = new javax.swing.GroupLayout(dlgBusca.getContentPane());
        dlgBusca.getContentPane().setLayout(dlgBuscaLayout);
        dlgBuscaLayout.setHorizontalGroup(
            dlgBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgBuscaLayout.createSequentialGroup()
                .addGroup(dlgBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgBuscaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(dlgBuscaLayout.createSequentialGroup()
                        .addGroup(dlgBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dlgBuscaLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10)
                                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(btnBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dlgBuscaLayout.createSequentialGroup()
                                .addGap(403, 403, 403)
                                .addComponent(jButton4)))
                        .addGap(0, 447, Short.MAX_VALUE)))
                .addContainerGap())
        );
        dlgBuscaLayout.setVerticalGroup(
            dlgBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgBuscaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dlgBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgBuscaLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addGroup(dlgBuscaLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBusca))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(31, 31, 31))
        );

        jLabel11.setText("jLabel11");

        jButton2.setText("jButton2");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane9.setViewportView(jTable2);

        setClosable(true);
        setTitle("Atendimento");
        setToolTipText("");

        tblAtendimentos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane8.setViewportView(tblAtendimentos);

        btnNovoAtendimento.setText("Novo Atendimento");
        btnNovoAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoAtendimentoActionPerformed(evt);
            }
        });

        btnEditarAtendimento.setText("Editar Atendimento");

        btnExlucirAtendimento.setText("Excluir Atendimento");
        btnExlucirAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExlucirAtendimentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnNovoAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEditarAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExlucirAtendimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(btnNovoAtendimento)
                .addGap(32, 32, 32)
                .addComponent(btnEditarAtendimento)
                .addGap(32, 32, 32)
                .addComponent(btnExlucirAtendimento)
                .addContainerGap(200, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lista de Atendimentos", jPanel4);

        jLabel6.setText("Data:");

        jLabel7.setText("Requerente:");

        jLabel8.setText("Relato resumido:");

        txtRelatoAtendimento.setColumns(20);
        txtRelatoAtendimento.setRows(5);
        jScrollPane1.setViewportView(txtRelatoAtendimento);

        btnBuscarRequerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/lupa.png"))); // NOI18N
        btnBuscarRequerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRequerenteActionPerformed(evt);
            }
        });

        txtRequerenteAtendimento.setEnabled(false);

        jLabel4.setText("ID:");

        txtIdAtendimento.setEnabled(false);

        btnSalvarAtendimento.setText("Salvar e Continuar");
        btnSalvarAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAtendimentoActionPerformed(evt);
            }
        });

        jLabel30.setText("Conselheiro:");

        btnBuscarConselheiro1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/lupa.png"))); // NOI18N
        btnBuscarConselheiro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarConselheiro1ActionPerformed(evt);
            }
        });

        txtConselheiroAtendimento1.setEnabled(false);

        txtConselheiroAtendimento2.setEnabled(false);

        btnBuscarConselheiro2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/lupa.png"))); // NOI18N
        btnBuscarConselheiro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarConselheiro2ActionPerformed(evt);
            }
        });

        jLabel31.setText("Conselheiro:");

        javax.swing.GroupLayout pnlAtendimentoLayout = new javax.swing.GroupLayout(pnlAtendimento);
        pnlAtendimento.setLayout(pnlAtendimentoLayout);
        pnlAtendimentoLayout.setHorizontalGroup(
            pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAtendimentoLayout.createSequentialGroup()
                .addGroup(pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAtendimentoLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDataAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(txtIdAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAtendimentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addGap(9, 9, 9)
                        .addComponent(btnBuscarRequerente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtRequerenteAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAtendimentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel30)
                        .addGap(9, 9, 9)
                        .addComponent(btnBuscarConselheiro1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtConselheiroAtendimento1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAtendimentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSalvarAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAtendimentoLayout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(9, 9, 9)
                                .addComponent(btnBuscarConselheiro2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(txtConselheiroAtendimento2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap())
        );
        pnlAtendimentoLayout.setVerticalGroup(
            pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAtendimentoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(txtDataAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(txtIdAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGroup(pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAtendimentoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarRequerente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlAtendimentoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(txtRequerenteAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarConselheiro1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlAtendimentoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(txtConselheiroAtendimento1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarConselheiro2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlAtendimentoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(txtConselheiroAtendimento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(191, 191, 191)
                        .addComponent(btnSalvarAtendimento)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlAtendimentoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );

        jTabbedPane1.addTab("Atendimento", pnlAtendimento);

        jLabel2.setText("Nome:");

        jLabel5.setText("Nascimento:");

        jLabel9.setText("Endereço:");

        jLabel10.setText("Numero:");

        jLabel12.setText("Bairro:");

        jLabel13.setText("Telefone:");

        txtIdCrianca.setEnabled(false);

        tblCrianca.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane4.setViewportView(tblCrianca);

        btnSalvarCrianca.setText("Salvar");
        btnSalvarCrianca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCriancaActionPerformed(evt);
            }
        });

        btnAlterarCrianca.setText("Alterar");

        btnExcluirCrianca.setText("Excluir");
        btnExcluirCrianca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCriancaActionPerformed(evt);
            }
        });

        btnCancelarCrianca.setText("Cancelar");

        btnNovoCrianca.setText("Novo");
        btnNovoCrianca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCriancaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBuscaLayout = new javax.swing.GroupLayout(pnlBusca);
        pnlBusca.setLayout(pnlBuscaLayout);
        pnlBuscaLayout.setHorizontalGroup(
            pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscaLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(txtIdCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBuscaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addComponent(txtNomeCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNascimentoCrianca))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlBuscaLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEnderecoCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNumeroCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlBuscaLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBairroCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBuscaLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefoneCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlBuscaLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(btnNovoCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnSalvarCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnAlterarCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnExcluirCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(btnCancelarCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBuscaLayout.setVerticalGroup(
            pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomeCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(txtNascimentoCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13)
                        .addComponent(txtTelefoneCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEnderecoCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtNumeroCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtBairroCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlBuscaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarCrianca)
                    .addComponent(btnAlterarCrianca)
                    .addComponent(btnExcluirCrianca)
                    .addComponent(btnCancelarCrianca)
                    .addComponent(btnNovoCrianca))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Criança", pnlBusca);

        jLabel15.setText("Buscar:");

        btnBuscarDireitos.setText("Buscar");

        tblDireitos1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane11.setViewportView(tblDireitos1);

        tblDireitos2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane12.setViewportView(tblDireitos2);

        jButton1.setText(">");

        jButton3.setText("<");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscarDireitos, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscarDireitos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 250, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtBuscarDireitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarDireitos))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 321, Short.MAX_VALUE)
                            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton1)
                        .addGap(43, 43, 43)
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Fatos", jPanel1);

        txtIdNucleo.setEnabled(false);

        jLabel14.setText("Nome:");

        jLabel16.setText("Parentesco:");

        jLabel18.setText("Endereço:");

        jLabel19.setText("Número:");

        txtNumeroNucleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroNucleoActionPerformed(evt);
            }
        });

        txtBairroNucleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroNucleoActionPerformed(evt);
            }
        });

        jLabel20.setText("Bairro:");

        jLabel21.setText("Telefone:");

        txtTelefoneNucleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneNucleoActionPerformed(evt);
            }
        });

        jLabel22.setText("Responsabilidade:");

        tblNucleo.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tblNucleo);

        btnNovoNucleo.setText("Novo");

        btnSalvarNucleo.setText("Salvar");

        btnAlterarNucleo.setText("Alterar");

        btnExcluirNucleo.setText("Excluir");

        btnCancelarNucleo.setText("Cancelar");

        jLabel1.setText("Celular:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtIdNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNomeNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEnderecoNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBairroNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefoneNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCelularNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtParentescoNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtResponsabilidadeNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))))
                .addGap(41, 41, 41))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel17))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btnNovoNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnSalvarNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnAlterarNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnExcluirNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnCancelarNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtNomeNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtParentescoNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(txtResponsabilidadeNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtEnderecoNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(txtNumeroNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtBairroNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(txtTelefoneNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtCelularNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarNucleo)
                    .addComponent(btnAlterarNucleo)
                    .addComponent(btnExcluirNucleo)
                    .addComponent(btnCancelarNucleo)
                    .addComponent(btnNovoNucleo))
                .addGap(59, 59, 59)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Núcleo Familiar", jPanel2);

        txtIdAcompanhante.setEnabled(false);
        txtIdAcompanhante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdAcompanhanteActionPerformed(evt);
            }
        });

        jLabel24.setText("Nome:");

        txtNomeAcompanhante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAcompanhanteActionPerformed(evt);
            }
        });

        jLabel25.setText("Endereço:");

        jLabel26.setText("Número:");

        txtBairroAcompanhante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroAcompanhanteActionPerformed(evt);
            }
        });

        jLabel27.setText("Bairro:");

        jLabel28.setText("Telefone:");

        jLabel29.setText("Cidade:");

        jLabel23.setText("Estado:");

        tblAcompanhante.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(tblAcompanhante);

        btnNovoAcompanhante.setText("Novo");

        btnSalvarAcompanhante.setText("Salvar");

        btnAlterarAcompanhante.setText("Alterar");

        btnExcluirAcompanhante.setText("Excluir");

        btnCancelarAcompanhante.setText("Cancelar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEnderecoAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNomeAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtIdAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstadoAcompanhante))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCidadeAcompanhante))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBairroAcompanhante))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefoneAcompanhante)))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane7)
                .addGap(22, 22, 22))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(btnNovoAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnSalvarAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnAlterarAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnExcluirAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnCancelarAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtNomeAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(txtEnderecoAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(txtNumeroAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(txtBairroAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(txtCidadeAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(txtEstadoAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(txtTelefoneAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvarAcompanhante)
                    .addComponent(btnNovoAcompanhante)
                    .addComponent(btnCancelarAcompanhante)
                    .addComponent(btnExcluirAcompanhante)
                    .addComponent(btnAlterarAcompanhante))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Acompanhante", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void atualizaTabelaAtendimento(){
        atendimento = new AtendimentoM();
        try {
            listaAtendimento = atendimentoDAO.ListaTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
        }
        
        String dados[][] = new String[listaAtendimento.size()][4];
            int i = 0;
            for (AtendimentoM atendimento : listaAtendimento) {
                dados[i][0] = String.valueOf(atendimento.getId());
                dados[i][1] = String.valueOf(atendimento.getRequerente_id());
                dados[i][2] = atendimento.getData();
                dados[i][3] = atendimento.getRelatoResumido();
               
                i++;
            }
            String tituloColuna[] = {"ID", "Requerente", "Data","Relato"};
            DefaultTableModel tabelaFuncionario = new DefaultTableModel();
            tabelaFuncionario.setDataVector(dados, tituloColuna);
            tblAtendimentos.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false,
                };

                
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblAtendimentos.getColumnModel().getColumn(0).setPreferredWidth(10);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblAtendimentos.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblAtendimentos.setRowHeight(25);
            tblAtendimentos.updateUI();
    }
    
    public void atualizaTabelaCrianca(){
        crianca = new CriançaM();
        try {
            listaCrianca = criancaDAO.ListaTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
        }
        
        String dados[][] = new String[listaCrianca.size()][4];
            int i = 0;
            for (CriançaM Crianca : listaCrianca) {
                dados[i][0] = String.valueOf(Crianca.getId());
                dados[i][1] = Crianca.getNome();
                dados[i][2] = Crianca.getDataNascimento();
                dados[i][3] = Crianca.getTelefone();
               
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Data","Telefone"};
            DefaultTableModel tabelaFuncionario = new DefaultTableModel();
            tabelaFuncionario.setDataVector(dados, tituloColuna);
            tblAtendimentos.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false,
                };

                
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblAtendimentos.getColumnModel().getColumn(0).setPreferredWidth(10);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblAtendimentos.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblAtendimentos.setRowHeight(25);
            tblAtendimentos.updateUI();
    }
    
    private void txtBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaActionPerformed
       
    }//GEN-LAST:event_txtBuscaActionPerformed

    private void btnBuscarRequerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRequerenteActionPerformed
        dlgBusca.setVisible(true);
        
    }//GEN-LAST:event_btnBuscarRequerenteActionPerformed

    private void txtNumeroNucleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroNucleoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroNucleoActionPerformed

    private void txtTelefoneNucleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneNucleoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneNucleoActionPerformed

    private void txtBairroNucleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroNucleoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroNucleoActionPerformed

    private void txtBairroAcompanhanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBairroAcompanhanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBairroAcompanhanteActionPerformed

    private void txtNomeAcompanhanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAcompanhanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAcompanhanteActionPerformed

    private void txtIdAcompanhanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdAcompanhanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdAcompanhanteActionPerformed

    private void btnNovoCriancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoCriancaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNovoCriancaActionPerformed

    private void btnSalvarCriancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCriancaActionPerformed
        crianca = new CriançaM();
        if(txtNomeCrianca.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os obrigatórios !", "erro", JOptionPane.WARNING_MESSAGE);
        }
        else if(txtIdCrianca.getText().isEmpty()){
            crianca.setId(Integer.parseInt(txtIdCrianca.getText()));
            crianca.setNome(txtNomeCrianca.getText());
            crianca.setDataNascimento(txtNascimentoCrianca.getText());
            crianca.setTelefone(txtTelefoneCrianca.getText()); 
            crianca.setEndereco(txtEnderecoCrianca.getText());  
            crianca.setNumero(txtNumeroCrianca.getText());  
            crianca.setBairro(txtBairroCrianca.getText()); 
            crianca.setAtendimento_Id(atendimento);
            try{
                criancaDAO.Salvar(crianca);
                JOptionPane.showMessageDialog(null, "Gravado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
               
            }
            // atualiza tabela crianço
        }
    }//GEN-LAST:event_btnSalvarCriancaActionPerformed

    private void btnNovoAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoAtendimentoActionPerformed
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_btnNovoAtendimentoActionPerformed

    private void btnExlucirAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExlucirAtendimentoActionPerformed
        atendimento = new AtendimentoM();
        if(tblAtendimentos.getValueAt(tblAtendimentos.getSelectedRow(),0).toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um Atendimento", "erro", JOptionPane.WARNING_MESSAGE);
            }else{
                atendimento.setId(Integer.parseInt(tblAtendimentos.getValueAt(tblAtendimentos.getSelectedRow(),0).toString()));
                int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir: "+ tblAtendimentos.getValueAt(tblAtendimentos.getSelectedRow(),1).toString());
                if(confirma ==0){
                    try{
                    atendimentoDAO.Excluir(atendimento);
                    tblAtendimentos.clearSelection();
                    }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
                    }
                    atualizaTabelaAtendimento();
            }
        }
    }//GEN-LAST:event_btnExlucirAtendimentoActionPerformed

    private void btnSalvarAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAtendimentoActionPerformed
        
        if(txtRequerenteAtendimento.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os obrigatórios !", "erro", JOptionPane.WARNING_MESSAGE);
        }
        else if(txtIdAtendimento.getText().isEmpty()){
            atendimento.setId(Integer.parseInt(txtIdAtendimento.getText()));
            atendimento.setRequerente_id(requerente);
            atendimento.setData(txtDataAtendimento.getText());
            atendimento.setRelatoResumido(txtRelatoAtendimento.getText());            
            try{
                atendimentoDAO.Salvar(atendimento);
                JOptionPane.showMessageDialog(null, "Gravado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
               
            }

            jTabbedPane1.setSelectedIndex(2);
        }
    }//GEN-LAST:event_btnSalvarAtendimentoActionPerformed

    private void btnBuscarConselheiro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarConselheiro1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarConselheiro1ActionPerformed

    private void btnBuscarConselheiro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarConselheiro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarConselheiro2ActionPerformed

    private void btnExcluirCriancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCriancaActionPerformed
        crianca = new CriançaM();
        if(tblCrianca.getValueAt(tblCrianca.getSelectedRow(),0).toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione uma Criança", "erro", JOptionPane.WARNING_MESSAGE);
            }else{
                crianca.setId(Integer.parseInt(tblCrianca.getValueAt(tblCrianca.getSelectedRow(),0).toString()));
                int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir: "+ tblCrianca.getValueAt(tblCrianca.getSelectedRow(),1).toString());
                if(confirma ==0){
                    try{
                    criancaDAO.Excluir(crianca);
                    tblAtendimentos.clearSelection();
                    }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
                    }
                    //atualizaTabelaAtendimento();
            }
        }    }//GEN-LAST:event_btnExcluirCriancaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarAcompanhante;
    private javax.swing.JButton btnAlterarCrianca;
    private javax.swing.JButton btnAlterarNucleo;
    private javax.swing.JButton btnBusca;
    private javax.swing.JButton btnBuscarConselheiro1;
    private javax.swing.JButton btnBuscarConselheiro2;
    private javax.swing.JButton btnBuscarDireitos;
    private javax.swing.JButton btnBuscarRequerente;
    private javax.swing.JButton btnCancelarAcompanhante;
    private javax.swing.JButton btnCancelarCrianca;
    private javax.swing.JButton btnCancelarNucleo;
    private javax.swing.JButton btnEditarAtendimento;
    private javax.swing.JButton btnExcluirAcompanhante;
    private javax.swing.JButton btnExcluirCrianca;
    private javax.swing.JButton btnExcluirNucleo;
    private javax.swing.JButton btnExlucirAtendimento;
    private javax.swing.JButton btnNovoAcompanhante;
    private javax.swing.JButton btnNovoAtendimento;
    private javax.swing.JButton btnNovoCrianca;
    private javax.swing.JButton btnNovoNucleo;
    private javax.swing.JButton btnSalvarAcompanhante;
    private javax.swing.JButton btnSalvarAtendimento;
    private javax.swing.JButton btnSalvarCrianca;
    private javax.swing.JButton btnSalvarNucleo;
    private javax.swing.JDialog dlgBusca;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel pnlAtendimento;
    private javax.swing.JPanel pnlBusca;
    private javax.swing.JTable tblAcompanhante;
    private javax.swing.JTable tblAtendimentos;
    private javax.swing.JTable tblBusca;
    private javax.swing.JTable tblCrianca;
    private javax.swing.JTable tblDireitos1;
    private javax.swing.JTable tblDireitos2;
    private javax.swing.JTable tblNucleo;
    private javax.swing.JTextField txtBairroAcompanhante;
    private javax.swing.JTextField txtBairroCrianca;
    private javax.swing.JTextField txtBairroNucleo;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtBuscarDireitos;
    private javax.swing.JTextField txtCelularNucleo;
    private javax.swing.JTextField txtCidadeAcompanhante;
    private javax.swing.JTextField txtConselheiroAtendimento1;
    private javax.swing.JTextField txtConselheiroAtendimento2;
    private javax.swing.JTextField txtDataAtendimento;
    private javax.swing.JTextField txtEnderecoAcompanhante;
    private javax.swing.JTextField txtEnderecoCrianca;
    private javax.swing.JTextField txtEnderecoNucleo;
    private javax.swing.JTextField txtEstadoAcompanhante;
    private javax.swing.JTextField txtIdAcompanhante;
    private javax.swing.JTextField txtIdAtendimento;
    private javax.swing.JTextField txtIdCrianca;
    private javax.swing.JTextField txtIdNucleo;
    private javax.swing.JTextField txtNascimentoCrianca;
    private javax.swing.JTextField txtNomeAcompanhante;
    private javax.swing.JTextField txtNomeCrianca;
    private javax.swing.JTextField txtNomeNucleo;
    private javax.swing.JTextField txtNumeroAcompanhante;
    private javax.swing.JTextField txtNumeroCrianca;
    private javax.swing.JTextField txtNumeroNucleo;
    private javax.swing.JTextField txtParentescoNucleo;
    private javax.swing.JTextArea txtRelatoAtendimento;
    private javax.swing.JTextField txtRequerenteAtendimento;
    private javax.swing.JTextField txtResponsabilidadeNucleo;
    private javax.swing.JTextField txtTelefoneAcompanhante;
    private javax.swing.JTextField txtTelefoneCrianca;
    private javax.swing.JTextField txtTelefoneNucleo;
    // End of variables declaration//GEN-END:variables
}
