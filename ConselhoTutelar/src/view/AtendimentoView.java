package view;

import MODEL.AcompanhanteM;
import MODEL.AtendimentoM;
import MODEL.ConselheiroM;
import MODEL.CriançaM;
import MODEL.DireitosM;
import MODEL.FatosM;
import MODEL.NucleoM;
import MODEL.RequerenteM;
import dao.AcompanhanteDAO;
import dao.AtendimentoDAO;
import dao.ConselheiroDAO;
import dao.CriançaDAO;
import dao.DireitosDAO;
import dao.FatosDAO;
import dao.NucleoDAO;
import dao.RequerenteDAO;
import java.sql.Date;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;


public class AtendimentoView extends javax.swing.JInternalFrame {

    AtendimentoM atendimento = new AtendimentoM();
    AtendimentoDAO atendimentoDAO = new AtendimentoDAO();
    List<AtendimentoM> listaAtendimento = new ArrayList<>();
    
    CriançaM crianca = new CriançaM();
    CriançaDAO criancaDAO = new CriançaDAO();
    List<CriançaM> listaCrianca = new ArrayList<>();
    
    RequerenteM requerente = new RequerenteM();
    RequerenteDAO requerenteDao = new RequerenteDAO();
    List<RequerenteM> listaRequerente = new ArrayList<>();
    
    ConselheiroM conselheiro = new ConselheiroM();
    ConselheiroDAO conselheiroDao = new ConselheiroDAO();
    List<ConselheiroM> listaConselheiro = new ArrayList<>();
    ConselheiroM c1 = new ConselheiroM();
    ConselheiroM c2 = new ConselheiroM();
    
    DireitosM direitos = new DireitosM();
    DireitosDAO direitosDao = new DireitosDAO();
    List<DireitosM> listaDireitos = new ArrayList<>();
    List<DireitosM> listaDireitosGeral = new ArrayList<>();
    List<DireitosM> listaDireitosSelecionados = new ArrayList<>();
    
    List<FatosM> listaFatos = new ArrayList<>();
    
    NucleoM nucleo = new NucleoM();
    NucleoDAO nucleoDAO = new NucleoDAO();
    List<NucleoM> listaNucleo = new ArrayList<>();
    
    AcompanhanteM acompanhante = new AcompanhanteM();
    AcompanhanteDAO acompanhanteDAO = new AcompanhanteDAO();
    List<AcompanhanteM> listaAcompanhante = new ArrayList<>(); 
    
    FatosDAO fatosdao = new FatosDAO();
    
    public AtendimentoView() {
        initComponents();
        this.setVisible(true);        
        atualizaTabelaAtendimento();
        atualizaTabelaCrianca();
        AtualizaTabelaDireitos();
        AtualizaTabelaDireitosDireita();
        atualizaTabelaNucleo();
        atualizaTabelaAcompanhante();
        
        dlgBuscaRequerente.setSize(941, 508);
        dlgBuscaConselheiro.setSize(941, 508);
        dlgBuscaConselheiro2.setSize(941, 508);
        
       jTabbedPane1.setSelectedIndex(0);
        
        //txtAtendimentoIdRequerente.setVisible(false);
        //txtAtendimentoIdConselheiro1.setVisible(false);
        //txtAtendimentoIdConselheiro2.setVisible(false);
        
        txtIdCrianca.setVisible(false);
        txtIdNucleo.setVisible(false);
        txtIdAcompanhante.setVisible(false);
        
        
        Data();
        AtualizaTabelaBuscaRequerente();
        AtualizaTabelaConselheiro();
        AtualizaTabelaConselheiro2();
        AtualizaTabelaDireitosDireita();
       
        //jTabbedPane1.setEnabled(false);
        listaDireitosGeral = listaDireitos;
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgBuscaRequerente = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBuscaRequerente = new javax.swing.JTable();
        btnBuscaRequerente = new javax.swing.JButton();
        txtBuscaRequerente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSelecionarRequerente = new javax.swing.JButton();
        btnLimparRequerente = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        dlgBuscaConselheiro = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblBuscarConselheiro1 = new javax.swing.JTable();
        btnSelecionarConselheiro1 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        txtBuscaConselheiro = new javax.swing.JTextField();
        btnBuscarConselheiro = new javax.swing.JButton();
        btnLimparConselheiro = new javax.swing.JButton();
        dlgBuscaConselheiro2 = new javax.swing.JDialog();
        btnSelecionarConselheiro2 = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblBuscarConselheiro2 = new javax.swing.JTable();
        jLabel33 = new javax.swing.JLabel();
        txtBuscaConselheiro2 = new javax.swing.JTextField();
        btnBuscarConselheiro2 = new javax.swing.JButton();
        btnLimparConselheiro2 = new javax.swing.JButton();
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
        txtDataAtendimento = new javax.swing.JTextField();
        btnBuscarRequerente = new javax.swing.JButton();
        txtRequerenteAtendimento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtIdAtendimento = new javax.swing.JTextField();
        btnSalvarAtendimento = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        btnBuscarConselheiro1 = new javax.swing.JButton();
        txtConselheiroAtendimento1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        btnBuscarConselheiro3 = new javax.swing.JButton();
        txtConselheiroAtendimento2 = new javax.swing.JTextField();
        btnSalvarAvancar = new javax.swing.JButton();
        txtAtendimentoIdRequerente = new javax.swing.JTextField();
        txtAtendimentoIdConselheiro1 = new javax.swing.JTextField();
        txtAtendimentoIdConselheiro2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtRelatoAtendimento = new javax.swing.JTextPane();
        pnlCrianca = new javax.swing.JPanel();
        txtIdCrianca = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblCrianca = new javax.swing.JTable();
        btnSalvarCrianca = new javax.swing.JButton();
        btnAlterarCrianca = new javax.swing.JButton();
        btnExcluirCrianca = new javax.swing.JButton();
        btnCancelarCrianca = new javax.swing.JButton();
        btnNovoCrianca = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeCrianca = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNascimentoCrianca = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNumeroCrianca = new javax.swing.JTextField();
        txtEnderecoCrianca = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtBairroCrianca = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTelefoneCrianca = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblDireitosGeral = new javax.swing.JTable();
        btnSalvarFato = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblDireitosSelecionados = new javax.swing.JTable();
        btnEsquerdaDireita = new javax.swing.JButton();
        btnDireitaEsquerda = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtBusca = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblNucleo = new javax.swing.JTable();
        btnNovoNucleo = new javax.swing.JButton();
        btnSalvarNucleo = new javax.swing.JButton();
        btnAlterarNucleo = new javax.swing.JButton();
        btnExcluirNucleo = new javax.swing.JButton();
        btnCancelarNucleo = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtNomeNucleo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtParentescoNucleo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtResponsabilidadeNucleo = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtEnderecoNucleo = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtNumeroNucleo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtBairroNucleo = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtTelefoneNucleo = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCelularNucleo = new javax.swing.JFormattedTextField();
        txtIdNucleo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtIdAcompanhante = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblAcompanhante = new javax.swing.JTable();
        btnNovoAcompanhante = new javax.swing.JButton();
        btnSalvarAcompanhante = new javax.swing.JButton();
        btnAlterarAcompanhante = new javax.swing.JButton();
        btnExcluirAcompanhante = new javax.swing.JButton();
        btnCancelarAcompanhante = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        txtCelularAcompanhante = new javax.swing.JFormattedTextField();
        jLabel28 = new javax.swing.JLabel();
        txtTelefoneAcompanhante = new javax.swing.JFormattedTextField();
        jLabel23 = new javax.swing.JLabel();
        txtEstadoAcompanhante = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        txtCidadeAcompanhante = new javax.swing.JTextField();
        txtNumeroAcompanhante = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtBairroAcompanhante = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtEnderecoAcompanhante = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        txtNomeAcompanhante = new javax.swing.JTextField();

        dlgBuscaRequerente.setTitle("Buscar Requerente");

        tblBuscaRequerente.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBuscaRequerente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBuscaRequerenteMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblBuscaRequerente);

        btnBuscaRequerente.setText("Buscar");
        btnBuscaRequerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaRequerenteActionPerformed(evt);
            }
        });

        txtBuscaRequerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaRequerenteActionPerformed(evt);
            }
        });

        jLabel3.setText("Buscar");

        btnSelecionarRequerente.setText("Selecionar");
        btnSelecionarRequerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarRequerenteActionPerformed(evt);
            }
        });

        btnLimparRequerente.setText("Limpar");
        btnLimparRequerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparRequerenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgBuscaRequerenteLayout = new javax.swing.GroupLayout(dlgBuscaRequerente.getContentPane());
        dlgBuscaRequerente.getContentPane().setLayout(dlgBuscaRequerenteLayout);
        dlgBuscaRequerenteLayout.setHorizontalGroup(
            dlgBuscaRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgBuscaRequerenteLayout.createSequentialGroup()
                .addGroup(dlgBuscaRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgBuscaRequerenteLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(dlgBuscaRequerenteLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3)
                        .addGap(10, 10, 10)
                        .addComponent(txtBuscaRequerente, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnBuscaRequerente, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimparRequerente, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 350, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgBuscaRequerenteLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSelecionarRequerente, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(407, 407, 407))
        );
        dlgBuscaRequerenteLayout.setVerticalGroup(
            dlgBuscaRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgBuscaRequerenteLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dlgBuscaRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgBuscaRequerenteLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel3))
                    .addGroup(dlgBuscaRequerenteLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtBuscaRequerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dlgBuscaRequerenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscaRequerente)
                        .addComponent(btnLimparRequerente)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSelecionarRequerente)
                .addContainerGap(18, Short.MAX_VALUE))
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

        dlgBuscaConselheiro.setTitle("Buscar Conselheiro");

        tblBuscarConselheiro1.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBuscarConselheiro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBuscarConselheiro1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblBuscarConselheiro1);

        btnSelecionarConselheiro1.setText("Selecionar");
        btnSelecionarConselheiro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarConselheiro1ActionPerformed(evt);
            }
        });

        jLabel32.setText("Buscar");

        txtBuscaConselheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaConselheiroActionPerformed(evt);
            }
        });

        btnBuscarConselheiro.setText("Buscar");
        btnBuscarConselheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarConselheiroActionPerformed(evt);
            }
        });

        btnLimparConselheiro.setText("Limpar");
        btnLimparConselheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparConselheiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgBuscaConselheiroLayout = new javax.swing.GroupLayout(dlgBuscaConselheiro.getContentPane());
        dlgBuscaConselheiro.getContentPane().setLayout(dlgBuscaConselheiroLayout);
        dlgBuscaConselheiroLayout.setHorizontalGroup(
            dlgBuscaConselheiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgBuscaConselheiroLayout.createSequentialGroup()
                .addGroup(dlgBuscaConselheiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgBuscaConselheiroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5))
                    .addGroup(dlgBuscaConselheiroLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel32)
                        .addGap(10, 10, 10)
                        .addComponent(txtBuscaConselheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnBuscarConselheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimparConselheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 351, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(dlgBuscaConselheiroLayout.createSequentialGroup()
                .addGap(426, 426, 426)
                .addComponent(btnSelecionarConselheiro1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dlgBuscaConselheiroLayout.setVerticalGroup(
            dlgBuscaConselheiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgBuscaConselheiroLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dlgBuscaConselheiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgBuscaConselheiroLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel32))
                    .addGroup(dlgBuscaConselheiroLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtBuscaConselheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dlgBuscaConselheiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscarConselheiro)
                        .addComponent(btnLimparConselheiro)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSelecionarConselheiro1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        dlgBuscaConselheiro2.setTitle("Buscar Conselheiro 2");

        btnSelecionarConselheiro2.setText("Selecionar");
        btnSelecionarConselheiro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarConselheiro2ActionPerformed(evt);
            }
        });

        tblBuscarConselheiro2.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBuscarConselheiro2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBuscarConselheiro2MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(tblBuscarConselheiro2);

        jLabel33.setText("Buscar");

        txtBuscaConselheiro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscaConselheiro2ActionPerformed(evt);
            }
        });

        btnBuscarConselheiro2.setText("Buscar");
        btnBuscarConselheiro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarConselheiro2ActionPerformed(evt);
            }
        });

        btnLimparConselheiro2.setText("Limpar");
        btnLimparConselheiro2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparConselheiro2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dlgBuscaConselheiro2Layout = new javax.swing.GroupLayout(dlgBuscaConselheiro2.getContentPane());
        dlgBuscaConselheiro2.getContentPane().setLayout(dlgBuscaConselheiro2Layout);
        dlgBuscaConselheiro2Layout.setHorizontalGroup(
            dlgBuscaConselheiro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgBuscaConselheiro2Layout.createSequentialGroup()
                .addGroup(dlgBuscaConselheiro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgBuscaConselheiro2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane10))
                    .addGroup(dlgBuscaConselheiro2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel33)
                        .addGap(10, 10, 10)
                        .addComponent(txtBuscaConselheiro2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnBuscarConselheiro2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimparConselheiro2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 336, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(dlgBuscaConselheiro2Layout.createSequentialGroup()
                .addGap(426, 426, 426)
                .addComponent(btnSelecionarConselheiro2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dlgBuscaConselheiro2Layout.setVerticalGroup(
            dlgBuscaConselheiro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgBuscaConselheiro2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dlgBuscaConselheiro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgBuscaConselheiro2Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel33))
                    .addGroup(dlgBuscaConselheiro2Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtBuscaConselheiro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dlgBuscaConselheiro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBuscarConselheiro2)
                        .addComponent(btnLimparConselheiro2)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSelecionarConselheiro2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setTitle("Atendimento");
        setToolTipText("");

        jTabbedPane1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane1StateChanged(evt);
            }
        });

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
        tblAtendimentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAtendimentosMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tblAtendimentos);

        btnNovoAtendimento.setText("Novo Atendimento");
        btnNovoAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoAtendimentoActionPerformed(evt);
            }
        });

        btnEditarAtendimento.setText("Editar Atendimento");
        btnEditarAtendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarAtendimentoActionPerformed(evt);
            }
        });

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
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
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Lista de Atendimentos", jPanel4);

        jLabel6.setText("Data:");

        jLabel7.setText("Requerente:");

        jLabel8.setText("Relato resumido:");

        txtDataAtendimento.setEnabled(false);

        btnBuscarRequerente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/lupa.png"))); // NOI18N
        btnBuscarRequerente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarRequerenteActionPerformed(evt);
            }
        });

        txtRequerenteAtendimento.setDisabledTextColor(new java.awt.Color(0, 0, 0));
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

        txtConselheiroAtendimento1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtConselheiroAtendimento1.setEnabled(false);

        jLabel31.setText("Conselheiro:");

        btnBuscarConselheiro3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/imagem/lupa.png"))); // NOI18N
        btnBuscarConselheiro3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarConselheiro3ActionPerformed(evt);
            }
        });

        txtConselheiroAtendimento2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtConselheiroAtendimento2.setEnabled(false);

        btnSalvarAvancar.setText("Salvar e Avançar");
        btnSalvarAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAvancarActionPerformed(evt);
            }
        });

        txtAtendimentoIdRequerente.setEnabled(false);

        txtAtendimentoIdConselheiro1.setEnabled(false);

        txtAtendimentoIdConselheiro2.setEnabled(false);

        txtRelatoAtendimento.setEnabled(false);
        jScrollPane2.setViewportView(txtRelatoAtendimento);

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
                            .addComponent(txtAtendimentoIdRequerente, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31)
                            .addComponent(txtAtendimentoIdConselheiro1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAtendimentoIdConselheiro2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(btnBuscarConselheiro3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(txtConselheiroAtendimento2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlAtendimentoLayout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(btnSalvarAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAtendimentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalvarAvancar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlAtendimentoLayout.setVerticalGroup(
            pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAtendimentoLayout.createSequentialGroup()
                .addGroup(pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAtendimentoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtDataAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addComponent(txtIdAtendimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAtendimentoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAtendimentoLayout.createSequentialGroup()
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
                            .addComponent(btnBuscarConselheiro3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlAtendimentoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pnlAtendimentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel31)
                                    .addComponent(txtConselheiroAtendimento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(63, 63, 63)
                        .addComponent(txtAtendimentoIdRequerente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAtendimentoIdConselheiro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAtendimentoIdConselheiro2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnSalvarAvancar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnSalvarAtendimento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Atendimento", pnlAtendimento);

        pnlCrianca.setEnabled(false);

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
        tblCrianca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCriancaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblCrianca);

        btnSalvarCrianca.setText("Salvar");
        btnSalvarCrianca.setEnabled(false);
        btnSalvarCrianca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarCriancaActionPerformed(evt);
            }
        });

        btnAlterarCrianca.setText("Alterar");
        btnAlterarCrianca.setEnabled(false);
        btnAlterarCrianca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarCriancaActionPerformed(evt);
            }
        });

        btnExcluirCrianca.setText("Excluir");
        btnExcluirCrianca.setEnabled(false);
        btnExcluirCrianca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCriancaActionPerformed(evt);
            }
        });

        btnCancelarCrianca.setText("Cancelar");
        btnCancelarCrianca.setEnabled(false);
        btnCancelarCrianca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCriancaActionPerformed(evt);
            }
        });

        btnNovoCrianca.setText("Novo");
        btnNovoCrianca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoCriancaActionPerformed(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Criança"));

        jLabel2.setText("Nome:");

        txtNomeCrianca.setEnabled(false);

        jLabel5.setText("Nascimento:");

        txtNascimentoCrianca.setFormatterFactory(setFormatoNascimento());
        txtNascimentoCrianca.setEnabled(false);

        jLabel10.setText("Numero:");

        txtNumeroCrianca.setEnabled(false);

        txtEnderecoCrianca.setEnabled(false);

        jLabel9.setText("Endereço:");

        jLabel12.setText("Bairro:");

        txtBairroCrianca.setEnabled(false);

        jLabel13.setText("Telefone:");

        txtTelefoneCrianca.setFormatterFactory(setFormatoTelefone());
        txtTelefoneCrianca.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtNascimentoCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNomeCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBairroCrianca, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                            .addComponent(txtEnderecoCrianca)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtTelefoneCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel12))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNascimentoCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txtNumeroCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtEnderecoCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBairroCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTelefoneCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCriancaLayout = new javax.swing.GroupLayout(pnlCrianca);
        pnlCrianca.setLayout(pnlCriancaLayout);
        pnlCriancaLayout.setHorizontalGroup(
            pnlCriancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCriancaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCriancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCriancaLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCriancaLayout.createSequentialGroup()
                        .addComponent(txtIdCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)
                        .addComponent(btnNovoCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnSalvarCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnAlterarCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnExcluirCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnCancelarCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlCriancaLayout.setVerticalGroup(
            pnlCriancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCriancaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlCriancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlCriancaLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlCriancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCriancaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdCrianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(pnlCriancaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlCriancaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvarCrianca)
                            .addComponent(btnAlterarCrianca)
                            .addComponent(btnExcluirCrianca)
                            .addComponent(btnCancelarCrianca)
                            .addComponent(btnNovoCrianca))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Criança", pnlCrianca);

        tblDireitosGeral.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane11.setViewportView(tblDireitosGeral);

        btnSalvarFato.setText("Salvar");
        btnSalvarFato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarFatoActionPerformed(evt);
            }
        });

        tblDireitosSelecionados.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane12.setViewportView(tblDireitosSelecionados);

        btnEsquerdaDireita.setText(">>");
        btnEsquerdaDireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEsquerdaDireitaActionPerformed(evt);
            }
        });

        btnDireitaEsquerda.setText("<<");
        btnDireitaEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDireitaEsquerdaActionPerformed(evt);
            }
        });

        jLabel35.setText("Direitos disponíveis");

        jLabel36.setText("Direitos selecionados");

        jLabel15.setText("Nº do artigo:");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEsquerdaDireita, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(btnDireitaEsquerda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnSalvarFato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 473, Short.MAX_VALUE)
                .addComponent(jLabel36)
                .addGap(215, 215, 215))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35)
                    .addComponent(jLabel36))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtBusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimpar))
                .addGap(123, 123, 123)
                .addComponent(btnEsquerdaDireita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDireitaEsquerda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalvarFato)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Fatos", jPanel1);

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
        tblNucleo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNucleoMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblNucleo);

        btnNovoNucleo.setText("Novo");
        btnNovoNucleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoNucleoActionPerformed(evt);
            }
        });

        btnSalvarNucleo.setText("Salvar");
        btnSalvarNucleo.setEnabled(false);
        btnSalvarNucleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarNucleoActionPerformed(evt);
            }
        });

        btnAlterarNucleo.setText("Alterar");
        btnAlterarNucleo.setEnabled(false);
        btnAlterarNucleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarNucleoActionPerformed(evt);
            }
        });

        btnExcluirNucleo.setText("Excluir");
        btnExcluirNucleo.setEnabled(false);
        btnExcluirNucleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirNucleoActionPerformed(evt);
            }
        });

        btnCancelarNucleo.setText("Cancelar");
        btnCancelarNucleo.setEnabled(false);
        btnCancelarNucleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarNucleoActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Núcleo Familiar"));

        jLabel14.setText("Nome:");

        txtNomeNucleo.setEnabled(false);

        jLabel16.setText("Parentesco:");

        txtParentescoNucleo.setEnabled(false);

        jLabel22.setText("Responsabilidade:");

        txtResponsabilidadeNucleo.setEnabled(false);

        jLabel18.setText("Endereço:");

        txtEnderecoNucleo.setEnabled(false);

        jLabel19.setText("Número:");

        txtNumeroNucleo.setEnabled(false);
        txtNumeroNucleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroNucleoActionPerformed(evt);
            }
        });

        jLabel20.setText("Bairro:");

        txtBairroNucleo.setEnabled(false);
        txtBairroNucleo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroNucleoActionPerformed(evt);
            }
        });

        jLabel21.setText("Telefone:");

        txtTelefoneNucleo.setFormatterFactory(setFormatoTelefone());
        txtTelefoneNucleo.setEnabled(false);

        jLabel1.setText("Celular:");

        txtCelularNucleo.setFormatterFactory(setFormatoCelular());
        txtCelularNucleo.setEnabled(false);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEnderecoNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtParentescoNucleo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(txtNomeNucleo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtResponsabilidadeNucleo)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 13, Short.MAX_VALUE)
                        .addComponent(txtNumeroNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBairroNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTelefoneNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCelularNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtNomeNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtParentescoNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtResponsabilidadeNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtEnderecoNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtNumeroNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtBairroNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtTelefoneNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtCelularNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        txtIdNucleo.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel17))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtIdNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(166, 166, 166)
                        .addComponent(btnNovoNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnSalvarNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnAlterarNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnExcluirNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnCancelarNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalvarNucleo)
                            .addComponent(btnAlterarNucleo)
                            .addComponent(btnExcluirNucleo)
                            .addComponent(btnCancelarNucleo)
                            .addComponent(btnNovoNucleo)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(txtIdNucleo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
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
        tblAcompanhante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAcompanhanteMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblAcompanhante);

        btnNovoAcompanhante.setText("Novo");
        btnNovoAcompanhante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoAcompanhanteActionPerformed(evt);
            }
        });

        btnSalvarAcompanhante.setText("Salvar");
        btnSalvarAcompanhante.setEnabled(false);
        btnSalvarAcompanhante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarAcompanhanteActionPerformed(evt);
            }
        });

        btnAlterarAcompanhante.setText("Alterar");
        btnAlterarAcompanhante.setEnabled(false);
        btnAlterarAcompanhante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarAcompanhanteActionPerformed(evt);
            }
        });

        btnExcluirAcompanhante.setText("Excluir");
        btnExcluirAcompanhante.setEnabled(false);
        btnExcluirAcompanhante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirAcompanhanteActionPerformed(evt);
            }
        });

        btnCancelarAcompanhante.setText("Cancelar");
        btnCancelarAcompanhante.setEnabled(false);
        btnCancelarAcompanhante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarAcompanhanteActionPerformed(evt);
            }
        });

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Acompanhante"));

        jLabel34.setText("Celular:");

        txtCelularAcompanhante.setFormatterFactory(setFormatoCelular());
        txtCelularAcompanhante.setEnabled(false);

        jLabel28.setText("Telefone:");

        txtTelefoneAcompanhante.setFormatterFactory(setFormatoTelefone());
        txtTelefoneAcompanhante.setEnabled(false);

        jLabel23.setText("Estado:");

        txtEstadoAcompanhante.setEnabled(false);

        jLabel29.setText("Cidade:");

        txtCidadeAcompanhante.setEnabled(false);

        txtNumeroAcompanhante.setEnabled(false);

        jLabel26.setText("Número:");

        jLabel27.setText("Bairro:");

        txtBairroAcompanhante.setEnabled(false);
        txtBairroAcompanhante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBairroAcompanhanteActionPerformed(evt);
            }
        });

        jLabel25.setText("Endereço:");

        txtEnderecoAcompanhante.setEnabled(false);

        jLabel24.setText("Nome:");

        txtNomeAcompanhante.setEnabled(false);
        txtNomeAcompanhante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAcompanhanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEnderecoAcompanhante)
                            .addComponent(txtNomeAcompanhante)))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTelefoneAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel34)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCelularAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCidadeAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtEstadoAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel26)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGap(51, 51, 51)
                                    .addComponent(txtNumeroAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel27)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtBairroAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(txtNomeAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnderecoAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(txtNumeroAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(txtBairroAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(txtCidadeAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23)
                    .addComponent(txtEstadoAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(txtTelefoneAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel34)
                    .addComponent(txtCelularAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtIdAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNovoAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnSalvarAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btnAlterarAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(btnExcluirAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(btnCancelarAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdAcompanhante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalvarAcompanhante)
                            .addComponent(btnNovoAcompanhante)
                            .addComponent(btnCancelarAcompanhante)
                            .addComponent(btnExcluirAcompanhante)
                            .addComponent(btnAlterarAcompanhante))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
        
        String dados[][] = new String[listaAtendimento.size()][5];
            int i = 0;
            for (AtendimentoM atendimento : listaAtendimento) {
                dados[i][0] = String.valueOf(atendimento.getId());
                dados[i][1] = String.valueOf(atendimento.getRequerente_id().getNome());
                dados[i][2] = atendimento.getData();
                dados[i][3] = String.valueOf(atendimento.getConselheiro1_id().getNome());
                dados[i][4] = String.valueOf(atendimento.getConselheiro2_id().getNome());
                
               
                i++;
            }
            String tituloColuna[] = {"ID", "Requerente", "Data", "Conselheiro 1", "Conselheiro 2"};
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
        
        String dados[][] = new String[listaCrianca.size()][5];
            int i = 0;
            for (CriançaM Crianca : listaCrianca) {
                dados[i][0] = String.valueOf(Crianca.getId());
                dados[i][1] = String.valueOf(Crianca.getAtendimento_Id().getId());
                dados[i][2] = Crianca.getNome();
                dados[i][3] = Crianca.getDataNascimento();
                dados[i][4] = Crianca.getTelefone();
                 
                i++;
            }
            String tituloColuna[] = {"ID","ID Atendimento", "Nome", "Nascimento","Telefone"};
            DefaultTableModel tabelaFuncionario = new DefaultTableModel();
            tabelaFuncionario.setDataVector(dados, tituloColuna);
            tblCrianca.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false,
                };

                
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblCrianca.getColumnModel().getColumn(0).setPreferredWidth(10);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblCrianca.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblCrianca.setRowHeight(25);
            tblCrianca.updateUI();
    }
    
        public void atualizaTabelaCriancaAlterar(){
        crianca = new CriançaM();
        
            String dados[][] = new String[listaCrianca.size()][4];
            int i = 0;
            for (CriançaM Crianca : listaCrianca) {
                dados[i][0] = String.valueOf(Crianca.getId());
                dados[i][1] = Crianca.getNome();
                dados[i][2] = Crianca.getDataNascimento();
                dados[i][3] = Crianca.getTelefone();
                 
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Nascimento","Telefone"};
            DefaultTableModel tabelaFuncionario = new DefaultTableModel();
            tabelaFuncionario.setDataVector(dados, tituloColuna);
            tblCrianca.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false
                };

                
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblCrianca.getColumnModel().getColumn(0).setPreferredWidth(10);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblCrianca.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblCrianca.setRowHeight(25);
            tblCrianca.updateUI();
    }
    
    public void AtualizaTabelaDireitos(){
        direitos = new DireitosM();
        
        try {
            listaDireitos = direitosDao.ListaTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
        
        String dados[][] = new String[listaDireitos.size()][3];
            int i = 0;
            for (DireitosM setor : listaDireitos) {
                dados[i][0] = String.valueOf(setor.getId());
                dados[i][1] = setor.getNumero();
                dados[i][2] = setor.getDescrição();
                
               
                i++;
            }
           String tituloColuna[] = {"ID", "Número", "Descrição"};
            DefaultTableModel tabelaDireitos = new DefaultTableModel();
            tabelaDireitos.setDataVector(dados, tituloColuna);
            tblDireitosGeral.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblDireitosGeral.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblDireitosGeral.getColumnModel().getColumn(1).setPreferredWidth(15);
            tblDireitosGeral.getColumnModel().getColumn(2).setPreferredWidth(15);

            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblDireitosGeral.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblDireitosGeral.setRowHeight(25);
            tblDireitosGeral.updateUI();
    }
    
    public void AtualizaTabelaDireitosEsquerda(){
        direitos = new DireitosM();

        String dados[][] = new String[listaDireitosGeral.size()][3];
            int i = 0;
            for (DireitosM setor : listaDireitosGeral) {
                dados[i][0] = String.valueOf(setor.getId());
                dados[i][1] = setor.getNumero();
                dados[i][2] = setor.getDescrição();
                
               
                i++;
            }
           String tituloColuna[] = {"ID", "Número", "Descrição"};
            DefaultTableModel tabelaDireitos = new DefaultTableModel();
            tabelaDireitos.setDataVector(dados, tituloColuna);
            tblDireitosGeral.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblDireitosGeral.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblDireitosGeral.getColumnModel().getColumn(1).setPreferredWidth(15);
            tblDireitosGeral.getColumnModel().getColumn(2).setPreferredWidth(15);

            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblDireitosGeral.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblDireitosGeral.setRowHeight(25);
            tblDireitosGeral.updateUI();
    }
    
    public void AtualizaTabelaDireitosDireita(){
        direitos = new DireitosM();

        String dados[][] = new String[listaDireitosSelecionados.size()][3];
            int i = 0;
            for (DireitosM setor : listaDireitosSelecionados) {
                dados[i][0] = String.valueOf(setor.getId());
                dados[i][1] = setor.getNumero();
                dados[i][2] = setor.getDescrição();
                
               
                i++;
            }
           String tituloColuna[] = {"ID", "Número", "Descrição"};
            DefaultTableModel tabelaDireitos = new DefaultTableModel();
            tabelaDireitos.setDataVector(dados, tituloColuna);
            tblDireitosSelecionados.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblDireitosSelecionados.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblDireitosSelecionados.getColumnModel().getColumn(1).setPreferredWidth(15);
            tblDireitosSelecionados.getColumnModel().getColumn(2).setPreferredWidth(15);

            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblDireitosSelecionados.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblDireitosSelecionados.setRowHeight(25);
            tblDireitosSelecionados.updateUI();
    }
    
        public void AtualizaTabelaDireitosBusca(){ 
        direitos = new DireitosM();
        
        String dados[][] = new String[listaDireitos.size()][3];
            int i = 0;
            for (DireitosM setor : listaDireitos) {
                dados[i][0] = String.valueOf(setor.getId());
                dados[i][1] = setor.getNumero();
                dados[i][2] = setor.getDescrição();
                
               
                i++;
            }
           String tituloColuna[] = {"ID", "Número", "Descrição"};
            DefaultTableModel tabelaDireitos = new DefaultTableModel();
            tabelaDireitos.setDataVector(dados, tituloColuna);
            tblDireitosGeral.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblDireitosGeral.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblDireitosGeral.getColumnModel().getColumn(1).setPreferredWidth(15);
            tblDireitosGeral.getColumnModel().getColumn(2).setPreferredWidth(15);
      
            

            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblDireitosGeral.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblDireitosGeral.setRowHeight(25);
            tblDireitosGeral.updateUI();
 
    }
       
    public void atualizaTabelaNucleo(){
        nucleo = new NucleoM();
        try {
            listaNucleo = nucleoDAO.ListaTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
        }
        
        String dados[][] = new String[listaNucleo.size()][6];
            int i = 0;
            for (NucleoM Nucleo : listaNucleo) {
                dados[i][0] = String.valueOf(Nucleo.getId());
                dados[i][1] = Nucleo.getNome();
                dados[i][2] = Nucleo.getParentesco();
                dados[i][3] = Nucleo.getResponsabilidade();
                dados[i][4] = Nucleo.getTelefone();
                dados[i][5] = Nucleo.getCelular();
               
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Parentesco","Responsabilidade", "Telefone", "Celular"};
            DefaultTableModel tabelaNucleo = new DefaultTableModel();
            tabelaNucleo.setDataVector(dados, tituloColuna);
            tblNucleo.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false,
                };

                
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblNucleo.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblNucleo.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblNucleo.getColumnModel().getColumn(2).setPreferredWidth(10);
            tblNucleo.getColumnModel().getColumn(3).setPreferredWidth(10);
            tblNucleo.getColumnModel().getColumn(4).setPreferredWidth(10);
            tblNucleo.getColumnModel().getColumn(5).setPreferredWidth(10);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblNucleo.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblNucleo.setRowHeight(25);
            tblNucleo.updateUI();
    }
    
        public void atualizaTabelaNucleoAlterar(){
        nucleo = new NucleoM();
                
        String dados[][] = new String[listaNucleo.size()][6];
            int i = 0;
            for (NucleoM Nucleo : listaNucleo) {
                dados[i][0] = String.valueOf(Nucleo.getId());
                dados[i][1] = Nucleo.getNome();
                dados[i][2] = Nucleo.getParentesco();
                dados[i][3] = Nucleo.getResponsabilidade();
                dados[i][4] = Nucleo.getTelefone();
                dados[i][5] = Nucleo.getCelular();
               
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Parentesco","Responsabilidade", "Telefone", "Celular"};
            DefaultTableModel tabelaNucleo = new DefaultTableModel();
            tabelaNucleo.setDataVector(dados, tituloColuna);
            tblNucleo.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false,
                };

                
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblNucleo.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblNucleo.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblNucleo.getColumnModel().getColumn(2).setPreferredWidth(10);
            tblNucleo.getColumnModel().getColumn(3).setPreferredWidth(10);
            tblNucleo.getColumnModel().getColumn(4).setPreferredWidth(10);
            tblNucleo.getColumnModel().getColumn(5).setPreferredWidth(10);
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblNucleo.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblNucleo.setRowHeight(25);
            tblNucleo.updateUI();
    }
       
        public void atualizaTabelaAcompanhante(){
        acompanhante = new AcompanhanteM();
        try {
            listaAcompanhante = acompanhanteDAO.ListaTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
        }
        
        String dados[][] = new String[listaAcompanhante.size()][4];
            int i = 0;
            for (AcompanhanteM Acompanhante : listaAcompanhante) {
                dados[i][0] = String.valueOf(Acompanhante.getId());
                dados[i][1] = Acompanhante.getNome();
                dados[i][2] = Acompanhante.getTelefone();
                dados[i][3] = Acompanhante.getCelular();
               
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Telefone", "Celular"};
            DefaultTableModel tabelaAcompanhante = new DefaultTableModel();
            tabelaAcompanhante.setDataVector(dados, tituloColuna);
            tblAcompanhante.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false,
                };

                
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblAcompanhante.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblAcompanhante.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblAcompanhante.getColumnModel().getColumn(2).setPreferredWidth(10);
            tblAcompanhante.getColumnModel().getColumn(3).setPreferredWidth(10);
        
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblAcompanhante.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblAcompanhante.setRowHeight(25);
            tblAcompanhante.updateUI();
    }
    
             public void atualizaTabelaAcompanhanteAlterar(){
        acompanhante = new AcompanhanteM();
        
        String dados[][] = new String[listaAcompanhante.size()][4];
            int i = 0;
            for (AcompanhanteM Acompanhante : listaAcompanhante) {
                dados[i][0] = String.valueOf(Acompanhante.getId());
                dados[i][1] = Acompanhante.getNome();
                dados[i][2] = Acompanhante.getTelefone();
                dados[i][3] = Acompanhante.getCelular();
               
                i++;
            }
            String tituloColuna[] = {"ID", "Nome", "Telefone", "Celular"};
            DefaultTableModel tabelaAcompanhante = new DefaultTableModel();
            tabelaAcompanhante.setDataVector(dados, tituloColuna);
            tblAcompanhante.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false,
                };

                
                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblAcompanhante.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblAcompanhante.getColumnModel().getColumn(1).setPreferredWidth(10);
            tblAcompanhante.getColumnModel().getColumn(2).setPreferredWidth(10);
            tblAcompanhante.getColumnModel().getColumn(3).setPreferredWidth(10);
        
            
            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblAcompanhante.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblAcompanhante.setRowHeight(25);
            tblAcompanhante.updateUI();
    }
       
    private void txtBuscaRequerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaRequerenteActionPerformed
       
    }//GEN-LAST:event_txtBuscaRequerenteActionPerformed

    private void btnBuscarRequerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarRequerenteActionPerformed
        dlgBuscaRequerente.setVisible(true);
        
    }//GEN-LAST:event_btnBuscarRequerenteActionPerformed

    private void txtNumeroNucleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroNucleoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroNucleoActionPerformed

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
        limparCamposCriança();
        prepararNovoCriança();
        ativaCamposCriança();
        btnAlterarCrianca.setEnabled(false);
        btnExcluirCrianca.setEnabled(false);
        txtNomeCrianca.requestFocusInWindow();
    }//GEN-LAST:event_btnNovoCriancaActionPerformed

    private void btnSalvarCriancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarCriancaActionPerformed
        crianca = new CriançaM();
        atendimento = new AtendimentoM();
        AtendimentoView atendimentoview = new AtendimentoView();
        
        atendimento.setId(Integer.parseInt(txtIdAtendimento.getText()));
        if(txtNomeCrianca.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os obrigatórios !", "erro", JOptionPane.WARNING_MESSAGE);
        }
        else if(txtIdCrianca.getText().isEmpty()){
            
            crianca.setNome(txtNomeCrianca.getText());
            crianca.setDataNascimento(txtNascimentoCrianca.getText());
            crianca.setEndereco(txtEnderecoCrianca.getText());  
            crianca.setNumero(txtNumeroCrianca.getText());  
            crianca.setBairro(txtBairroCrianca.getText()); 
            crianca.setTelefone(txtTelefoneCrianca.getText());
            crianca.setAtendimento_Id(atendimento);
            
            
            try{
                criancaDAO.Salvar(crianca);
                JOptionPane.showMessageDialog(null, "Gravado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
               
            }
            atualizaTabelaCrianca();
            prepararSalvareCancelarCriança();
            desativaCamposCriança();
            limparCamposCriança();
            jTabbedPane1.setSelectedIndex(3);
            }
              else{
            crianca.setId(Integer.parseInt(txtIdCrianca.getText()));
            crianca.setNome(txtNomeCrianca.getText());
            crianca.setDataNascimento(txtNascimentoCrianca.getText());
            crianca.setEndereco(txtEnderecoCrianca.getText());  
            crianca.setNumero(txtNumeroCrianca.getText());  
            crianca.setBairro(txtBairroCrianca.getText()); 
            crianca.setTelefone(txtTelefoneCrianca.getText()); 
            //crianca.setAtendimento_Id(atendimento); não é viável alterar o id do atendimento mas apenas os dados da criança.
            
            try{
                criancaDAO.Alterar(crianca);
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!");  
                jTabbedPane1.setSelectedIndex(3);
            }
            catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
            }
        }
         prepararSalvareCancelarCriança();
         desativaCamposCriança();
        
        
        
    }//GEN-LAST:event_btnSalvarCriancaActionPerformed

    private void btnNovoAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoAtendimentoActionPerformed
        txtIdAtendimento.setText("");
        txtRequerenteAtendimento.setText("");
        txtConselheiroAtendimento1.setText("");
        txtConselheiroAtendimento2.setText("");
        txtAtendimentoIdRequerente.setText("");
        txtAtendimentoIdConselheiro1.setText("");
        txtAtendimentoIdConselheiro2.setText("");
        txtRelatoAtendimento.setEnabled(true);
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
       dlgBuscaConselheiro.setVisible(true);
    }//GEN-LAST:event_btnBuscarConselheiro1ActionPerformed

    
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
                    atualizaTabelaCrianca();
                    limparCamposCriança();
            }
        }    }//GEN-LAST:event_btnExcluirCriancaActionPerformed

    private void btnBuscaRequerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaRequerenteActionPerformed
        listaRequerente = null;
        if(txtBuscaRequerente.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null, "Preencha o campo corretamente! ", "erro", JOptionPane.WARNING_MESSAGE);
            AtualizaTabelaRequerenteBusca();
        }
        else
        {
            try{
                
                listaRequerente = requerenteDao.FiltroBusca(txtBuscaRequerente.getText());
                if(listaRequerente == null){
                    
                    JOptionPane.showMessageDialog(null, "Nenhum contato encontrado!","", JOptionPane.WARNING_MESSAGE);
                    AtualizaTabelaRequerenteBusca();
                    
                }else{
                    
                AtualizaTabelaRequerenteBusca();
                
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_btnBuscaRequerenteActionPerformed

    private void tblBuscaRequerenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscaRequerenteMouseClicked
       
    }//GEN-LAST:event_tblBuscaRequerenteMouseClicked

    private void tblBuscarConselheiro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscarConselheiro1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBuscarConselheiro1MouseClicked

    private void txtBuscaConselheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaConselheiroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaConselheiroActionPerformed

    private void btnBuscarConselheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarConselheiroActionPerformed
     listaConselheiro = null;
        if(txtBuscaConselheiro.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null, "Preencha o campo corretamente! ", "erro", JOptionPane.WARNING_MESSAGE);
            AtualizaTabelaConselheiro();
        }
        else
        {
            try{
                
                listaConselheiro = conselheiroDao.FiltroBusca(txtBuscaConselheiro.getText());
                if(listaConselheiro == null){
                    
                    JOptionPane.showMessageDialog(null, "Nenhum contato encontrado!","", JOptionPane.WARNING_MESSAGE);
                    AtualizaTabelaConselheiro();
                    
                }else{
                    
                AtualizaTabelaConselheiro();
                
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_btnBuscarConselheiroActionPerformed

    private void btnLimparRequerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparRequerenteActionPerformed
     txtBuscaRequerente.setText("");
    AtualizaTabelaBuscaRequerente();
    txtBuscaRequerente.requestFocusInWindow();
    }//GEN-LAST:event_btnLimparRequerenteActionPerformed

    private void btnLimparConselheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparConselheiroActionPerformed
     txtBuscaConselheiro.setText("");
    AtualizaTabelaConselheiro();
    txtBuscaConselheiro.requestFocusInWindow();
    }//GEN-LAST:event_btnLimparConselheiroActionPerformed

    private void btnSalvarNucleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarNucleoActionPerformed
         nucleo = new NucleoM();
        if(txtNomeNucleo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os obrigatórios !", "erro", JOptionPane.WARNING_MESSAGE);
        }
        else if(txtIdNucleo.getText().isEmpty()){
            nucleo.setNome(txtNomeNucleo.getText());
            nucleo.setParentesco(txtParentescoNucleo.getText());            
            nucleo.setEndereco(txtEnderecoNucleo.getText());
            nucleo.setNumero(txtNumeroNucleo.getText());
            nucleo.setBairro(txtBairroNucleo.getText());           
            nucleo.setTelefone(txtTelefoneNucleo.getText());
            nucleo.setCelular(txtCelularNucleo.getText());      
            nucleo.setResponsabilidade(txtResponsabilidadeNucleo.getText());
            nucleo.setAtendimento_Id(atendimento);
     
            try{
                nucleoDAO.Salvar(nucleo);
                JOptionPane.showMessageDialog(null, "Gravado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
               
            }
             atualizaTabelaNucleo();
             prepararSalvareCancelarNucleo();   
            desativaCamposNucleo();
            limparCamposNucleo();
            jTabbedPane1.setSelectedIndex(5);
        }
        
         else{
            
            nucleo.setId(Integer.parseInt(txtIdNucleo.getText()));
            nucleo.setNome(txtNomeNucleo.getText());
            nucleo.setParentesco(txtParentescoNucleo.getText());            
            nucleo.setEndereco(txtEnderecoNucleo.getText());
            nucleo.setNumero(txtNumeroNucleo.getText());
            nucleo.setBairro(txtBairroNucleo.getText());
            nucleo.setTelefone(txtTelefoneNucleo.getText());
            nucleo.setCelular(txtCelularNucleo.getText());            
            nucleo.setResponsabilidade(txtResponsabilidadeNucleo.getText());
            //nucleo.setAtendimento_Id(atendimento);
       
            try{
                nucleoDAO.Alterar(nucleo);
                 jTabbedPane1.setSelectedIndex(5);
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!");  
            }
            catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
            }
        }
       atualizaTabelaNucleo();
       prepararSalvareCancelarNucleo();
       desativaCamposNucleo();
    }//GEN-LAST:event_btnSalvarNucleoActionPerformed

    private void tblBuscarConselheiro2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBuscarConselheiro2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tblBuscarConselheiro2MouseClicked

    private void txtBuscaConselheiro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscaConselheiro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscaConselheiro2ActionPerformed

    private void btnBuscarConselheiro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarConselheiro2ActionPerformed
       listaConselheiro = null;
        if(txtBuscaConselheiro2.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null, "Preencha o campo corretamente! ", "erro", JOptionPane.WARNING_MESSAGE);
            AtualizaTabelaConselheiro2();
        }
        else
        {
            try{
                
                listaConselheiro = conselheiroDao.FiltroBusca(txtBuscaConselheiro2.getText());
                if(listaConselheiro == null){
                    
                    JOptionPane.showMessageDialog(null, "Nenhum contato encontrado!","", JOptionPane.WARNING_MESSAGE);
                    AtualizaTabelaConselheiro2();
                    
                }else{
                    
                AtualizaTabelaConselheiroBusca2();
                
                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_btnBuscarConselheiro2ActionPerformed

    private void btnLimparConselheiro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparConselheiro2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparConselheiro2ActionPerformed

    private void btnBuscarConselheiro3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarConselheiro3ActionPerformed
    dlgBuscaConselheiro2.setVisible(true);
    }//GEN-LAST:event_btnBuscarConselheiro3ActionPerformed

    private void btnAlterarNucleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarNucleoActionPerformed
             prepararAlterarNucleo();
        ativaCamposNucleo();
        txtNomeNucleo.requestFocusInWindow(); 
    }//GEN-LAST:event_btnAlterarNucleoActionPerformed

    private void btnAlterarCriancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCriancaActionPerformed
     prepararAlterarCriança();
     ativaCamposCriança();
     txtNomeCrianca.requestFocusInWindow();
    }//GEN-LAST:event_btnAlterarCriancaActionPerformed

    private void btnExcluirNucleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirNucleoActionPerformed
        nucleo = new NucleoM();
        if(tblNucleo.getValueAt(tblNucleo.getSelectedRow(),0).toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione uma opção de Núcleo Familiar", "erro", JOptionPane.WARNING_MESSAGE);
            }else{
                nucleo.setId(Integer.parseInt(tblNucleo.getValueAt(tblNucleo.getSelectedRow(),0).toString()));
                int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir: "+ tblNucleo.getValueAt(tblNucleo.getSelectedRow(),1).toString());
                if(confirma ==0){
                    try{
                    nucleoDAO.Excluir(nucleo);
                    tblAtendimentos.clearSelection();
                    }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
                    }
                    limparCamposNucleo();
                    atualizaTabelaNucleo();
                    
                }
        }
    }//GEN-LAST:event_btnExcluirNucleoActionPerformed

    private void btnSalvarAcompanhanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAcompanhanteActionPerformed
         acompanhante = new AcompanhanteM();
        if(txtNomeAcompanhante.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os obrigatórios !", "erro", JOptionPane.WARNING_MESSAGE);
        }
        else if(txtIdAcompanhante.getText().isEmpty()){
            
            acompanhante.setNome(txtNomeAcompanhante.getText());
            acompanhante.setEndereco(txtEnderecoAcompanhante.getText());
            acompanhante.setBairro(txtBairroAcompanhante.getText());
            acompanhante.setNumero(txtNumeroAcompanhante.getText());
            acompanhante.setCidade(txtCidadeAcompanhante.getText());
            acompanhante.setEstado(txtEstadoAcompanhante.getText());
            acompanhante.setTelefone(txtTelefoneAcompanhante.getText());
            acompanhante.setCelular(txtCelularAcompanhante.getText());
            acompanhante.setAtendimento_Id(atendimento);
     
            try{
                acompanhanteDAO.Salvar(acompanhante);
                 jTabbedPane1.setSelectedIndex(0);
                JOptionPane.showMessageDialog(null, "Gravado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
               
            }
              atualizaTabelaAcompanhante();
              prepararSalvareCancelarAcompanhante();
              desativaCamposAcompanhante();
              limparCamposAcompanhante();
        }
               else{
            acompanhante.setId(Integer.parseInt(txtIdAcompanhante.getText()));
            acompanhante.setNome(txtNomeAcompanhante.getText());
            acompanhante.setEndereco(txtEnderecoAcompanhante.getText());
            acompanhante.setBairro(txtBairroAcompanhante.getText());
            acompanhante.setNumero(txtNumeroAcompanhante.getText());
            acompanhante.setCidade(txtCidadeAcompanhante.getText());
            acompanhante.setEstado(txtEstadoAcompanhante.getText());
            acompanhante.setTelefone(txtTelefoneAcompanhante.getText());
            acompanhante.setCelular(txtCelularAcompanhante.getText());
           // acompanhante.setAtendimento_Id(atendimento);
     
       
            try{
                acompanhanteDAO.Alterar(acompanhante);
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!");  
                jTabbedPane1.setSelectedIndex(0);
            }
            catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
            }
        }
       atualizaTabelaAcompanhante();
       prepararSalvareCancelarAcompanhante();
       desativaCamposAcompanhante();
    }//GEN-LAST:event_btnSalvarAcompanhanteActionPerformed

    private void btnExcluirAcompanhanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirAcompanhanteActionPerformed
          acompanhante = new AcompanhanteM();
        if(tblAcompanhante.getValueAt(tblAcompanhante.getSelectedRow(),0).toString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Selecione um Acompanhante", "erro", JOptionPane.WARNING_MESSAGE);
            }else{
                acompanhante.setId(Integer.parseInt(tblAcompanhante.getValueAt(tblAcompanhante.getSelectedRow(),0).toString()));
                int confirma = JOptionPane.showConfirmDialog(null, "Deseja excluir: "+ tblAcompanhante.getValueAt(tblAcompanhante.getSelectedRow(),1).toString());
                if(confirma ==0){
                    try{
                    acompanhanteDAO.Excluir(acompanhante);
                    tblAtendimentos.clearSelection();
                    }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
                    }
                    atualizaTabelaAcompanhante();
            }
        }
    }//GEN-LAST:event_btnExcluirAcompanhanteActionPerformed

    private void btnCancelarCriancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCriancaActionPerformed
         limparCamposCriança();
        prepararSalvareCancelarCriança();
        desativaCamposCriança();
    }//GEN-LAST:event_btnCancelarCriancaActionPerformed

    private void btnNovoNucleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoNucleoActionPerformed
     limparCamposNucleo();
    prepararNovoNucleo();
    ativaCamposNucleo();
    btnAlterarNucleo.setEnabled(false);
    btnExcluirNucleo.setEnabled(false);
    txtNomeNucleo.requestFocusInWindow(); 
    }//GEN-LAST:event_btnNovoNucleoActionPerformed

    private void btnCancelarNucleoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarNucleoActionPerformed
          limparCamposNucleo();
        prepararSalvareCancelarNucleo();
        desativaCamposNucleo();
    }//GEN-LAST:event_btnCancelarNucleoActionPerformed

    private void btnNovoAcompanhanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoAcompanhanteActionPerformed
     limparCamposAcompanhante();
    prepararNovoAcompanhante();
    ativaCamposAcompanhante();
    btnAlterarAcompanhante.setEnabled(false);
    btnExcluirAcompanhante.setEnabled(false);
    txtNomeAcompanhante.requestFocusInWindow(); 
    }//GEN-LAST:event_btnNovoAcompanhanteActionPerformed

    private void btnAlterarAcompanhanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarAcompanhanteActionPerformed
        prepararAlterarAcompanhante();
        ativaCamposAcompanhante();
        txtNomeAcompanhante.requestFocusInWindow(); 
    }//GEN-LAST:event_btnAlterarAcompanhanteActionPerformed

    private void btnCancelarAcompanhanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarAcompanhanteActionPerformed
       limparCamposAcompanhante();
        prepararSalvareCancelarAcompanhante();
        desativaCamposAcompanhante();
    }//GEN-LAST:event_btnCancelarAcompanhanteActionPerformed

    private void btnSelecionarRequerenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarRequerenteActionPerformed
     txtRequerenteAtendimento.setText(tblBuscaRequerente.getValueAt(tblBuscaRequerente.getSelectedRow(),1).toString()); 
     txtAtendimentoIdRequerente.setText(tblBuscaRequerente.getValueAt(tblBuscaRequerente.getSelectedRow(),0).toString()); 
     //requerente.setId(Integer.parseInt(tblBuscaRequerente.getValueAt(tblBuscaRequerente.getSelectedRow(),0).toString()));
     dlgBuscaRequerente.dispose();
    }//GEN-LAST:event_btnSelecionarRequerenteActionPerformed

    private void btnSelecionarConselheiro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarConselheiro1ActionPerformed
    txtConselheiroAtendimento1.setText(tblBuscarConselheiro1.getValueAt(tblBuscarConselheiro1.getSelectedRow(),1).toString()); 
    txtAtendimentoIdConselheiro1.setText(tblBuscarConselheiro1.getValueAt(tblBuscarConselheiro1.getSelectedRow(),0).toString()); 
     //conselheiro.setId(Integer.parseInt(tblBuscarConselheiro1.getValueAt(tblBuscarConselheiro1.getSelectedRow(),0).toString()));
       
    c1.setNome(txtConselheiroAtendimento1.getText());
    c1.setId(Integer.parseInt(txtAtendimentoIdConselheiro1.getText()));
    
     dlgBuscaConselheiro.dispose();
    }//GEN-LAST:event_btnSelecionarConselheiro1ActionPerformed

    private void btnSelecionarConselheiro2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarConselheiro2ActionPerformed
     txtConselheiroAtendimento2.setText(tblBuscarConselheiro2.getValueAt(tblBuscarConselheiro2.getSelectedRow(),1).toString()); 
     txtAtendimentoIdConselheiro2.setText(tblBuscarConselheiro2.getValueAt(tblBuscarConselheiro2.getSelectedRow(),0).toString());
     //conselheiro.setId(Integer.parseInt(tblBuscarConselheiro2.getValueAt(tblBuscarConselheiro2.getSelectedRow(),0).toString()));
     
     c2.setNome(txtConselheiroAtendimento2.getText());
    c2.setId(Integer.parseInt(txtAtendimentoIdConselheiro2.getText()));
    
     dlgBuscaConselheiro2.dispose();
    }//GEN-LAST:event_btnSelecionarConselheiro2ActionPerformed

    private void btnSalvarAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarAvancarActionPerformed
       
        RequerenteM requerente = new RequerenteM();
        atendimento = new AtendimentoM();
        requerente = new RequerenteM();
        ConselheiroM conselheiro = new ConselheiroM();
        if (txtRequerenteAtendimento.getText().isEmpty() || txtRelatoAtendimento.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!"); 
                  
        }
        else if (txtIdAtendimento.getText().isEmpty()){
            atendimento.setData(txtDataAtendimento.getText());
            
            requerente.setId(Integer.parseInt(txtAtendimentoIdRequerente.getText()));
            atendimento.setRequerente_id(requerente);
            
            atendimento.setRelatoResumido(txtRelatoAtendimento.getText());
            
            conselheiro.setId(Integer.parseInt(txtAtendimentoIdConselheiro1.getText()));
            atendimento.setConselheiro1_id(c1);
            
            conselheiro.setId(Integer.parseInt(txtAtendimentoIdConselheiro2.getText()));
            atendimento.setConselheiro2_id(c2);
            
      
            try{
                txtIdAtendimento.setText(String.valueOf(AtendimentoDAO.Salvar(atendimento)));
                JOptionPane.showMessageDialog(null, "Gravado com sucesso!");
                jTabbedPane1.setSelectedIndex(2);
                
            }
            catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
            }
            atualizaTabelaAtendimento();
       }
        
            else{
            
            atendimento.setId(Integer.parseInt(txtIdAtendimento.getText()));
            
           atendimento.setData(txtDataAtendimento.getText());
           
           atendimento.setRelatoResumido(txtRelatoAtendimento.getText());
            
            requerente.setId(Integer.parseInt(txtAtendimentoIdRequerente.getText()));
            atendimento.setRequerente_id(requerente);
            
            conselheiro.setId(Integer.parseInt(txtAtendimentoIdConselheiro1.getText()));
            atendimento.setConselheiro1_id(c1);
            
            conselheiro.setId(Integer.parseInt(txtAtendimentoIdConselheiro2.getText()));
            atendimento.setConselheiro2_id(c2);
       
            try{
                atendimentoDAO.Alterar(atendimento);
                 jTabbedPane1.setSelectedIndex(2);
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!");  
            }
            catch (SQLException ex){
                    JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
            }
             atualizaTabelaAtendimento();
        }
        
    }//GEN-LAST:event_btnSalvarAvancarActionPerformed

    private void btnEditarAtendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAtendimentoActionPerformed
        jTabbedPane1.setSelectedIndex(1);
        txtRelatoAtendimento.setEnabled(true);
        
        try {
            atendimento = atendimentoDAO.Busca(Integer.parseInt(tblAtendimentos.getValueAt(tblAtendimentos.getSelectedRow(),0).toString()));
            listaCrianca = criancaDAO.ListaTodosAlterar(Integer.parseInt(tblAtendimentos.getValueAt(tblAtendimentos.getSelectedRow(),0).toString()));
            listaFatos = fatosdao.ListaTodosAlterar(Integer.parseInt(tblAtendimentos.getValueAt(tblAtendimentos.getSelectedRow(),0).toString()));
            listaNucleo = nucleoDAO.ListaTodosAlterar(Integer.parseInt(tblAtendimentos.getValueAt(tblAtendimentos.getSelectedRow(),0).toString()));
            listaAcompanhante = acompanhanteDAO.ListaTodosAlterar(Integer.parseInt(tblAtendimentos.getValueAt(tblAtendimentos.getSelectedRow(),0).toString()));
            
        } catch (SQLException ex) {
            Logger.getLogger(AtendimentoView.class.getName()).log(Level.SEVERE, null, ex);
        }
        atualizaTabelaCriancaAlterar();
        AtualizaTabelaDireitosDireita();        
        atualizaTabelaNucleoAlterar();
        atualizaTabelaAcompanhanteAlterar();
        
    
    }//GEN-LAST:event_btnEditarAtendimentoActionPerformed

    private void tblAtendimentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAtendimentosMouseClicked
      
        atendimento = new AtendimentoM();

        try{
            atendimento = AtendimentoDAO.Busca(Integer.parseInt(tblAtendimentos.getValueAt(tblAtendimentos.getSelectedRow(),0).toString()));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
   
        tblAtendimentos.getTableHeader().setReorderingAllowed(false);
        txtIdAtendimento.setText(Integer.toString(atendimento.getId()));
        txtDataAtendimento.setText(atendimento.getData());
        txtRequerenteAtendimento.setText(String.valueOf(atendimento.getRequerente_id().getNome()));
        txtConselheiroAtendimento1.setText(String.valueOf(atendimento.getConselheiro1_id().getNome()));
        txtConselheiroAtendimento2.setText(String.valueOf(atendimento.getConselheiro2_id().getNome()));
        txtAtendimentoIdRequerente.setText(String.valueOf(atendimento.getRequerente_id().getId()));
        txtAtendimentoIdConselheiro1.setText(String.valueOf(atendimento.getConselheiro1_id().getId()));
        txtAtendimentoIdConselheiro2.setText(String.valueOf(atendimento.getConselheiro2_id().getId()));
        txtRelatoAtendimento.setText(String.valueOf(atendimento.getRelatoResumido()));
       
    }//GEN-LAST:event_tblAtendimentosMouseClicked

    private void tblCriancaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCriancaMouseClicked
        limparCamposCriança();
        crianca = new CriançaM();
        
        try{
            crianca = CriançaDAO.busca(Integer.parseInt(tblCrianca.getValueAt(tblCrianca.getSelectedRow(),0).toString()));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
   
        tblCrianca.getTableHeader().setReorderingAllowed(false);
        txtIdCrianca.setText(Integer.toString(crianca.getId()));
        txtNomeCrianca.setText(crianca.getNome());
        txtNascimentoCrianca.setText(crianca.getDataNascimento());
        txtTelefoneCrianca.setText(crianca.getTelefone());
        txtEnderecoCrianca.setText(crianca.getEndereco());
        txtNumeroCrianca.setText(crianca.getNumero());
        txtBairroCrianca.setText(crianca.getBairro());
        txtIdAtendimento.setText(String.valueOf(crianca.getAtendimento_Id().getId()));
        
        
        txtRequerenteAtendimento.setText("");
        txtConselheiroAtendimento1.setText("");
        txtConselheiroAtendimento2.setText("");
        txtAtendimentoIdRequerente.setText("");
        txtAtendimentoIdConselheiro1.setText("");
        txtAtendimentoIdConselheiro2.setText("");
        
        btnAlterarCrianca.setEnabled(true);
        btnExcluirCrianca.setEnabled(true);
        
     
    }//GEN-LAST:event_tblCriancaMouseClicked

    private void tblNucleoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNucleoMouseClicked
        limparCamposNucleo();
        nucleo = new NucleoM();

        try{
            nucleo = NucleoDAO.busca(Integer.parseInt(tblNucleo.getValueAt(tblNucleo.getSelectedRow(),0).toString()));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
   
        tblNucleo.getTableHeader().setReorderingAllowed(false);
        txtIdNucleo.setText(Integer.toString(nucleo.getId()));
        txtNomeNucleo.setText(nucleo.getNome());
        txtParentescoNucleo.setText(nucleo.getParentesco());        
        txtEnderecoNucleo.setText(nucleo.getEndereco());
        txtNumeroNucleo.setText(nucleo.getNumero());
        txtBairroNucleo.setText(nucleo.getBairro());
        txtTelefoneNucleo.setText(nucleo.getTelefone());
        txtCelularNucleo.setText(nucleo.getCelular());
        txtResponsabilidadeNucleo.setText(nucleo.getResponsabilidade());
        txtIdAtendimento.setText(String.valueOf(nucleo.getAtendimento_Id().getId()));
        
        txtRequerenteAtendimento.setText("");
        txtConselheiroAtendimento1.setText("");
        txtConselheiroAtendimento2.setText("");
        txtAtendimentoIdRequerente.setText("");
        txtAtendimentoIdConselheiro1.setText("");
        txtAtendimentoIdConselheiro2.setText("");
        
        btnAlterarNucleo.setEnabled(true);
        btnExcluirNucleo.setEnabled(true);
        
    }//GEN-LAST:event_tblNucleoMouseClicked

    private void btnSalvarFatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarFatoActionPerformed
        try{
            fatosdao.Salvar(listaDireitosSelecionados, Integer.valueOf(txtIdAtendimento.getText()));
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!", "Sucesso!!!", JOptionPane.INFORMATION_MESSAGE);
        }
            catch(SQLException ex){
                    Logger.getLogger(PrincipalView.class.getName()).log(Level.SEVERE, null, ex);
                    
            }
        
        
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_btnSalvarFatoActionPerformed

    private void tblAcompanhanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAcompanhanteMouseClicked
        limparCamposAcompanhante();
        acompanhante = new AcompanhanteM();

        try{
            acompanhante = AcompanhanteDAO.busca(Integer.parseInt(tblAcompanhante.getValueAt(tblAcompanhante.getSelectedRow(),0).toString()));
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
   
        tblAcompanhante.getTableHeader().setReorderingAllowed(false);
        txtIdAcompanhante.setText(Integer.toString(acompanhante.getId()));
        txtNomeAcompanhante.setText(acompanhante.getNome());
        txtEnderecoAcompanhante.setText(acompanhante.getEndereco());        
        txtNumeroAcompanhante.setText(acompanhante.getNumero());
        txtBairroAcompanhante.setText(acompanhante.getBairro());
        txtCidadeAcompanhante.setText(acompanhante.getCidade());
        txtEstadoAcompanhante.setText(acompanhante.getEstado());       
        txtTelefoneAcompanhante.setText(acompanhante.getTelefone());
        txtCelularAcompanhante.setText(acompanhante.getCelular());       
        txtIdAtendimento.setText(String.valueOf(acompanhante.getAtendimento_Id().getId()));
        
        txtRequerenteAtendimento.setText("");
        txtConselheiroAtendimento1.setText("");
        txtConselheiroAtendimento2.setText("");
        txtAtendimentoIdRequerente.setText("");
        txtAtendimentoIdConselheiro1.setText("");
        txtAtendimentoIdConselheiro2.setText("");
        
        btnAlterarAcompanhante.setEnabled(true);
        btnExcluirAcompanhante.setEnabled(true);
    }//GEN-LAST:event_tblAcompanhanteMouseClicked

    private void jTabbedPane1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane1StateChanged

    }//GEN-LAST:event_jTabbedPane1StateChanged

    private void btnEsquerdaDireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEsquerdaDireitaActionPerformed

        /*if(tblDireitosGeral.getValueAt(tblAcompanhante.getSelectedRow(),0) == null){
        JOptionPane.showMessageDialog(null, "Selecione a sala destino!");
        }else{*/

            try {
                direitos = direitosDao.busca(Integer.parseInt(tblDireitosGeral.getValueAt(tblDireitosGeral.getSelectedRow(), 0).toString()));
                listaDireitosSelecionados.add(direitos);

                for(int i = 0; i < listaDireitosGeral.size(); i++)
                {
                    DireitosM d = listaDireitosGeral.get(i);

                    if(d.getId() == direitos.getId())
                    {
                        listaDireitosGeral.remove(d);
                        break;
                    }
                }
                btnSalvarFato.setEnabled(true);
                
                AtualizaTabelaDireitosDireita();
                AtualizaTabelaDireitosEsquerda();

            } catch (SQLException ex) {
                Logger.getLogger(AtendimentoView.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        //}
    }//GEN-LAST:event_btnEsquerdaDireitaActionPerformed

    private void btnDireitaEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDireitaEsquerdaActionPerformed
        /*if(tblDireitosSelecionados.getValueAt(tblDireitosSelecionados.getSelectedRow(),0) == null){
        JOptionPane.showMessageDialog(null, "Selecione a sala destino!");
        }else{*/

            try {
                direitos = direitosDao.busca(Integer.parseInt(tblDireitosSelecionados.getValueAt(tblDireitosSelecionados.getSelectedRow(), 0).toString()));
                listaDireitosGeral.add(direitos);
                
                for(int i = 0; i < listaDireitosSelecionados.size(); i++)
                {
                    DireitosM d = listaDireitosSelecionados.get(i);

                    if(d.getId() == direitos.getId())
                    {
                        listaDireitosSelecionados.remove(d);
                        break;
                    }
                }
                if(listaDireitosSelecionados.size() < 1){
                    btnSalvarFato.setEnabled(false);
                    //zera os cbx destino
                    //cbxUnidadeDestino.setSelectedIndex(0);
                }
                AtualizaTabelaDireitosDireita();
                AtualizaTabelaDireitosEsquerda();
            } catch (SQLException ex) {
                Logger.getLogger(AtendimentoView.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        //}
    }//GEN-LAST:event_btnDireitaEsquerdaActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
         listaDireitos = null;
        if(txtBusca.getText().equals("") )
        {
            JOptionPane.showMessageDialog(null, "Preencha o campo corretamente! ", "erro", JOptionPane.WARNING_MESSAGE);
            AtualizaTabelaDireitos();
        }
        else
        {
            try{

                listaDireitos = direitosDao.FiltroBusca(txtBusca.getText());
                if(listaDireitos == null){

                    JOptionPane.showMessageDialog(null, "Nenhum contato encontrado!","", JOptionPane.WARNING_MESSAGE);
                    AtualizaTabelaDireitos();

                }else{

                    AtualizaTabelaDireitosBusca();

                }
            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage(), "erro", JOptionPane.WARNING_MESSAGE);
            }

        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtBusca.setText("");
        AtualizaTabelaDireitos();
        txtBusca.requestFocusInWindow();
    }//GEN-LAST:event_btnLimparActionPerformed

     public void AtualizaTabelaBuscaRequerente(){
        requerente = new RequerenteM();
        
        try {
            listaRequerente = requerenteDao.ListaTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
        
        String dados[][] = new String[listaRequerente.size()][7];
            int i = 0;
            for (RequerenteM setor : listaRequerente) {
                dados[i][0] = String.valueOf(setor.getId());
                dados[i][1] = setor.getNome();
                dados[i][2] = setor.getTelefone1();
                dados[i][3] = setor.getEndereço();
                dados[i][4] = setor.getCidade();
                dados[i][5] = setor.getEstado();
                dados[i][6] = setor.getEstadoCivil();
                i++;
            }
           String tituloColuna[] = {"ID", "Nome", "Telefone 1", "Endereço", "Cidade", "Estado","Estado Civil"};
            DefaultTableModel tabelaRequerente = new DefaultTableModel();
            tabelaRequerente.setDataVector(dados, tituloColuna);
            tblBuscaRequerente.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false,false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblBuscaRequerente.getColumnModel().getColumn(0).setPreferredWidth(10);
            

            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblBuscaRequerente.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblBuscaRequerente.setRowHeight(25);
            tblBuscaRequerente.updateUI();     
    }
     
     public void AtualizaTabelaRequerenteBusca(){
        requerente = new RequerenteM();

        
        String dados[][] = new String[listaRequerente.size()][7];
            int i = 0;
            for (RequerenteM setor : listaRequerente) {
                dados[i][0] = String.valueOf(setor.getId());
                dados[i][1] = setor.getNome();
                dados[i][2] = setor.getTelefone1();
                dados[i][3] = setor.getEndereço();
                dados[i][4] = setor.getCidade();
                dados[i][5] = setor.getEstado();
                dados[i][6] = setor.getEstadoCivil();
                i++;
            }
           String tituloColuna[] = {"ID", "Nome", "Telefone 1", "Endereço", "Cidade", "Estado","Estado Civil"};
            DefaultTableModel tabelaRequerente = new DefaultTableModel();
            tabelaRequerente.setDataVector(dados, tituloColuna);
            tblBuscaRequerente.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false,false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblBuscaRequerente.getColumnModel().getColumn(0).setPreferredWidth(10);
            

            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblBuscaRequerente.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblBuscaRequerente.setRowHeight(25);
            tblBuscaRequerente.updateUI();     
    }
     
     
     public void AtualizaTabelaConselheiro(){
        conselheiro = new ConselheiroM();
        
        try {
            listaConselheiro = conselheiroDao.ListaTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
        
        String dados[][] = new String[listaConselheiro.size()][5];
            int i = 0;
            for (ConselheiroM setor : listaConselheiro) {
                dados[i][0] = String.valueOf(setor.getId());
                dados[i][1] = setor.getNome();
                dados[i][2] = setor.getTelefone();
                dados[i][3] = setor.getCelular();
                dados[i][4] = setor.getLogin();

                i++;
            }
           String tituloColuna[] = {"ID", "Nome", "Telefone", "Celular", "Login"};
            DefaultTableModel tabelaConselheiro = new DefaultTableModel();
            tabelaConselheiro.setDataVector(dados, tituloColuna);
            tblBuscarConselheiro1.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false,false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblBuscarConselheiro1.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblBuscarConselheiro1.getColumnModel().getColumn(1).setPreferredWidth(15);
            tblBuscarConselheiro1.getColumnModel().getColumn(2).setPreferredWidth(15);
      
            

            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblBuscarConselheiro1.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblBuscarConselheiro1.setRowHeight(25);
            tblBuscarConselheiro1.updateUI();
    }
     
      public void AtualizaTabelaConselheiroBusca(){
        conselheiro = new ConselheiroM();

        
        String dados[][] = new String[listaConselheiro.size()][5];
            int i = 0;
            for (ConselheiroM setor : listaConselheiro) {
                dados[i][0] = String.valueOf(setor.getId());
                dados[i][1] = setor.getNome();
                dados[i][2] = setor.getTelefone();
                dados[i][3] = setor.getCelular();
                dados[i][4] = setor.getLogin();

                i++;
            }
           String tituloColuna[] = {"ID", "Nome", "Telefone", "Celular", "Login"};
            DefaultTableModel tabelaConselheiro = new DefaultTableModel();
            tabelaConselheiro.setDataVector(dados, tituloColuna);
            tblBuscarConselheiro1.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false,false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblBuscarConselheiro1.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblBuscarConselheiro1.getColumnModel().getColumn(1).setPreferredWidth(15);
            tblBuscarConselheiro1.getColumnModel().getColumn(2).setPreferredWidth(15);
      
            

            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblBuscarConselheiro1.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblBuscarConselheiro1.setRowHeight(25);
            tblBuscarConselheiro1.updateUI();  
    }
      
      public void AtualizaTabelaConselheiro2(){
        conselheiro = new ConselheiroM();
        
        try {
            listaConselheiro = conselheiroDao.ListaTodos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro: "+ex.getMessage());
        }
        
        String dados[][] = new String[listaConselheiro.size()][5];
            int i = 0;
            for (ConselheiroM setor : listaConselheiro) {
                dados[i][0] = String.valueOf(setor.getId());
                dados[i][1] = setor.getNome();
                dados[i][2] = setor.getTelefone();
                dados[i][3] = setor.getCelular();
                dados[i][4] = setor.getLogin();

                i++;
            }
           String tituloColuna[] = {"ID", "Nome", "Telefone", "Celular", "Login"};
            DefaultTableModel tabelaConselheiro = new DefaultTableModel();
            tabelaConselheiro.setDataVector(dados, tituloColuna);
            tblBuscarConselheiro2.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false,false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblBuscarConselheiro2.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblBuscarConselheiro2.getColumnModel().getColumn(1).setPreferredWidth(15);
            tblBuscarConselheiro2.getColumnModel().getColumn(2).setPreferredWidth(15);
      
            

            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblBuscarConselheiro2.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblBuscarConselheiro2.setRowHeight(25);
            tblBuscarConselheiro2.updateUI();
    }
      
          public void AtualizaTabelaConselheiroBusca2(){
        conselheiro = new ConselheiroM();

        
        String dados[][] = new String[listaConselheiro.size()][5];
            int i = 0;
            for (ConselheiroM setor : listaConselheiro) {
                dados[i][0] = String.valueOf(setor.getId());
                dados[i][1] = setor.getNome();
                dados[i][2] = setor.getTelefone();
                dados[i][3] = setor.getCelular();
                dados[i][4] = setor.getLogin();

                i++;
            }
           String tituloColuna[] = {"ID", "Nome", "Telefone", "Celular", "Login"};
            DefaultTableModel tabelaConselheiro = new DefaultTableModel();
            tabelaConselheiro.setDataVector(dados, tituloColuna);
            tblBuscarConselheiro2.setModel(new DefaultTableModel(dados, tituloColuna) {
                boolean[] canEdit = new boolean[]{
                    false, false, false, false,false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

            tblBuscarConselheiro2.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblBuscarConselheiro2.getColumnModel().getColumn(1).setPreferredWidth(15);
            tblBuscarConselheiro2.getColumnModel().getColumn(2).setPreferredWidth(15);
      
            

            DefaultTableCellRenderer centralizado = new DefaultTableCellRenderer();
            centralizado.setHorizontalAlignment(SwingConstants.CENTER);
            tblBuscarConselheiro2.getColumnModel().getColumn(0).setCellRenderer(centralizado);
            tblBuscarConselheiro2.setRowHeight(25);
            tblBuscarConselheiro2.updateUI();  
    }
          
      public void Data(){
           txtDataAtendimento.setText(new SimpleDateFormat("dd/MM/yyyy").format(new Date(System.currentTimeMillis())));
      }
      
       public void limparCamposCriança(){
        txtNomeCrianca.setText("");
        txtNascimentoCrianca.setText("");
        txtTelefoneCrianca.setText("");
        txtEnderecoCrianca.setText("");
        txtNumeroCrianca.setText("");
        txtBairroCrianca.setText("");
        
    }
    
    public void ativaCamposCriança(){
        //txtIdCrianca.setEnabled(true);
        txtNomeCrianca.setEnabled(true);
        txtNascimentoCrianca.setEnabled(true);
        txtTelefoneCrianca.setEnabled(true);
        txtEnderecoCrianca.setEnabled(true);
        txtNumeroCrianca.setEnabled(true);
        txtBairroCrianca.setEnabled(true);
    }
    
     public void desativaCamposCriança(){
        //txtIdCrianca.setEnabled(false);
        txtNomeCrianca.setEnabled(false);
        txtNascimentoCrianca.setEnabled(false);
        txtTelefoneCrianca.setEnabled(false);
        txtEnderecoCrianca.setEnabled(false);
        txtNumeroCrianca.setEnabled(false);
        txtBairroCrianca.setEnabled(false);
    }
     
       
    public void prepararNovoCriança() {
       btnNovoCrianca.setEnabled(false);
       btnSalvarCrianca.setEnabled(true);
       btnCancelarCrianca.setEnabled(true);
       tblCrianca.setEnabled(false);
       tblCrianca.clearSelection();
    }
   
    public void prepararSalvareCancelarCriança() {
       btnNovoCrianca.setEnabled(true);
       btnSalvarCrianca.setEnabled(false);
       btnCancelarCrianca.setEnabled(false);
       tblCrianca.setEnabled(true);
    }
   
    public void prepararSelecaoTabelaCriança(){
       btnNovoCrianca.setEnabled(true);
       btnExcluirCrianca.setEnabled(true);
       btnAlterarCrianca.setEnabled(true);
    }
   
    public void prepararAlterarCriança(){
       btnNovoCrianca.setEnabled(false);
       btnExcluirCrianca.setEnabled(false);
       btnAlterarCrianca.setEnabled(false);
       btnSalvarCrianca.setEnabled(true);
       btnCancelarCrianca.setEnabled(true);
       tblCrianca.setEnabled(false);
       tblCrianca.clearSelection();
    }
   
    public void prepararExcluirCriança(){
       btnExcluirCrianca.setEnabled(false);
       btnAlterarCrianca.setEnabled(false);
    }
    
    public void limparCamposNucleo(){
        txtIdNucleo.setText("");
        txtNomeNucleo.setText("");
        txtParentescoNucleo.setText("");
        txtResponsabilidadeNucleo.setText("");
        txtEnderecoNucleo.setText("");
        txtNumeroNucleo.setText("");
        txtBairroNucleo.setText("");
        txtTelefoneNucleo.setText("");
        txtCelularNucleo.setText("");
    }
    
    public void ativaCamposNucleo(){
        //txtIdNucleo.setEnabled(true);
        txtNomeNucleo.setEnabled(true);
        txtParentescoNucleo.setEnabled(true);
        txtResponsabilidadeNucleo.setEnabled(true);
        txtEnderecoNucleo.setEnabled(true);
        txtNumeroNucleo.setEnabled(true);
        txtBairroNucleo.setEnabled(true);
        txtTelefoneNucleo.setEnabled(true);
        txtCelularNucleo.setEnabled(true);
    }
    
     public void desativaCamposNucleo(){
        //txtIdNucleo.setEnabled(false);
        txtNomeNucleo.setEnabled(false);
        txtParentescoNucleo.setEnabled(false);
        txtResponsabilidadeNucleo.setEnabled(false);
        txtEnderecoNucleo.setEnabled(false);
        txtNumeroNucleo.setEnabled(false);
        txtBairroNucleo.setEnabled(false);
        txtTelefoneNucleo.setEnabled(false);
        txtCelularNucleo.setEnabled(false);
    }
     
       
    public void prepararNovoNucleo() {
       btnNovoNucleo.setEnabled(false);
       btnSalvarNucleo.setEnabled(true);
       btnCancelarNucleo.setEnabled(true);
       tblNucleo.setEnabled(false);
       tblNucleo.clearSelection();
    }
   
    public void prepararSalvareCancelarNucleo() {
       btnNovoNucleo.setEnabled(true);
       btnSalvarNucleo.setEnabled(false);
       btnCancelarNucleo.setEnabled(false);
       tblNucleo.setEnabled(true);
    }
   
    public void prepararSelecaoTabelaNucleo(){
       btnNovoNucleo.setEnabled(true);
       btnExcluirNucleo.setEnabled(true);
       btnAlterarNucleo.setEnabled(true);
    }
   
    public void prepararAlterarNucleo(){
       btnNovoNucleo.setEnabled(false);
       btnExcluirNucleo.setEnabled(false);
       btnAlterarNucleo.setEnabled(false);
       btnSalvarNucleo.setEnabled(true);
       btnCancelarNucleo.setEnabled(true);
       tblNucleo.setEnabled(false);
       tblNucleo.clearSelection();
    }
   
    public void prepararExcluirNucleo(){
       btnExcluirNucleo.setEnabled(false);
       btnAlterarNucleo.setEnabled(false);
    }
    
    public void limparCamposAcompanhante(){
        txtIdAcompanhante.setText("");
        txtNomeAcompanhante.setText("");
        txtEnderecoAcompanhante.setText("");
        txtNumeroAcompanhante.setText("");
        txtBairroAcompanhante.setText("");
        txtCidadeAcompanhante.setText("");
        txtEstadoAcompanhante.setText("");
        txtTelefoneAcompanhante.setText("");
        txtCelularAcompanhante.setText("");
 
    }
    
    public void ativaCamposAcompanhante(){
        //txtIdAcompanhante.setEnabled(true);
        txtNomeAcompanhante.setEnabled(true);
        txtEnderecoAcompanhante.setEnabled(true);
        txtNumeroAcompanhante.setEnabled(true);
        txtBairroAcompanhante.setEnabled(true);
        txtCidadeAcompanhante.setEnabled(true);
        txtEstadoAcompanhante.setEnabled(true);
        txtTelefoneAcompanhante.setEnabled(true);
        txtCelularAcompanhante.setEnabled(true);
    }
    
     public void desativaCamposAcompanhante(){
        //txtIdAcompanhante.setEnabled(false);
        txtNomeAcompanhante.setEnabled(false);
        txtEnderecoAcompanhante.setEnabled(false);
        txtNumeroAcompanhante.setEnabled(false);
        txtBairroAcompanhante.setEnabled(false);
        txtCidadeAcompanhante.setEnabled(false);
        txtEstadoAcompanhante.setEnabled(false);
        txtTelefoneAcompanhante.setEnabled(false);
        txtCelularAcompanhante.setEnabled(false);
    }
     
       
    public void prepararNovoAcompanhante() {
       btnNovoAcompanhante.setEnabled(false);
       btnSalvarAcompanhante.setEnabled(true);
       btnCancelarAcompanhante.setEnabled(true);
       tblAcompanhante.setEnabled(false);
       tblAcompanhante.clearSelection();
    }
   
    public void prepararSalvareCancelarAcompanhante() {
       btnNovoAcompanhante.setEnabled(true);
       btnSalvarAcompanhante.setEnabled(false);
       btnCancelarAcompanhante.setEnabled(false);
       tblAcompanhante.setEnabled(true);
    }
   
    public void prepararSelecaoTabelaAcompanhante(){
       btnNovoAcompanhante.setEnabled(true);
       btnExcluirAcompanhante.setEnabled(true);
       btnAlterarAcompanhante.setEnabled(true);
    }
   
    public void prepararAlterarAcompanhante(){
       btnNovoAcompanhante.setEnabled(false);
       btnExcluirAcompanhante.setEnabled(false);
       btnAlterarAcompanhante.setEnabled(false);
       btnSalvarAcompanhante.setEnabled(true);
       btnCancelarAcompanhante.setEnabled(true);
       tblAcompanhante.setEnabled(false);
       tblAcompanhante.clearSelection();
    }
   
    public void prepararExcluirAcompanhante(){
       btnExcluirAcompanhante.setEnabled(false);
       btnAlterarAcompanhante.setEnabled(false);
    }
    
    
         //Mascara que formata para regularizar como é inserido o telefone
    public static DefaultFormatterFactory setFormatoTelefone(){  
        MaskFormatter comFoco = null;  
        try   
        {   
            comFoco = new MaskFormatter("(##)####-####"); 
            comFoco.setPlaceholderCharacter('_');
        }   
        catch (Exception pe) { }  
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);  
        return factory;  
    }
    
    //Mascara que formata para regularizar como é inserido o celular
    public static DefaultFormatterFactory setFormatoCelular(){  
        MaskFormatter comFoco = null;  
        try   
        {   
            comFoco = new MaskFormatter("(##)9####-####"); 
            comFoco.setPlaceholderCharacter('_');
        }   
        catch (Exception pe) { }  
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);  
        return factory;  
    } 
    
       public static DefaultFormatterFactory setFormatoNascimento(){  
        MaskFormatter comFoco = null;  
        try   
        {   
            comFoco = new MaskFormatter("##/##/####"); 
            comFoco.setPlaceholderCharacter('_');
        }   
        catch (Exception pe) { }  
        DefaultFormatterFactory factory = new DefaultFormatterFactory(comFoco, comFoco);  
        return factory;  
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarAcompanhante;
    private javax.swing.JButton btnAlterarCrianca;
    private javax.swing.JButton btnAlterarNucleo;
    private javax.swing.JButton btnBuscaRequerente;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarConselheiro;
    private javax.swing.JButton btnBuscarConselheiro1;
    private javax.swing.JButton btnBuscarConselheiro2;
    private javax.swing.JButton btnBuscarConselheiro3;
    private javax.swing.JButton btnBuscarRequerente;
    private javax.swing.JButton btnCancelarAcompanhante;
    private javax.swing.JButton btnCancelarCrianca;
    private javax.swing.JButton btnCancelarNucleo;
    private javax.swing.JButton btnDireitaEsquerda;
    private javax.swing.JButton btnEditarAtendimento;
    private javax.swing.JButton btnEsquerdaDireita;
    private javax.swing.JButton btnExcluirAcompanhante;
    private javax.swing.JButton btnExcluirCrianca;
    private javax.swing.JButton btnExcluirNucleo;
    private javax.swing.JButton btnExlucirAtendimento;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnLimparConselheiro;
    private javax.swing.JButton btnLimparConselheiro2;
    private javax.swing.JButton btnLimparRequerente;
    private javax.swing.JButton btnNovoAcompanhante;
    private javax.swing.JButton btnNovoAtendimento;
    private javax.swing.JButton btnNovoCrianca;
    private javax.swing.JButton btnNovoNucleo;
    private javax.swing.JButton btnSalvarAcompanhante;
    private javax.swing.JButton btnSalvarAtendimento;
    private javax.swing.JButton btnSalvarAvancar;
    private javax.swing.JButton btnSalvarCrianca;
    private javax.swing.JButton btnSalvarFato;
    private javax.swing.JButton btnSalvarNucleo;
    private javax.swing.JButton btnSelecionarConselheiro1;
    private javax.swing.JButton btnSelecionarConselheiro2;
    private javax.swing.JButton btnSelecionarRequerente;
    private javax.swing.JDialog dlgBuscaConselheiro;
    private javax.swing.JDialog dlgBuscaConselheiro2;
    private javax.swing.JDialog dlgBuscaRequerente;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JPanel pnlAtendimento;
    private javax.swing.JPanel pnlCrianca;
    private javax.swing.JTable tblAcompanhante;
    private javax.swing.JTable tblAtendimentos;
    private javax.swing.JTable tblBuscaRequerente;
    private javax.swing.JTable tblBuscarConselheiro1;
    private javax.swing.JTable tblBuscarConselheiro2;
    private javax.swing.JTable tblCrianca;
    private javax.swing.JTable tblDireitosGeral;
    private javax.swing.JTable tblDireitosSelecionados;
    private javax.swing.JTable tblNucleo;
    private javax.swing.JTextField txtAtendimentoIdConselheiro1;
    private javax.swing.JTextField txtAtendimentoIdConselheiro2;
    private javax.swing.JTextField txtAtendimentoIdRequerente;
    private javax.swing.JTextField txtBairroAcompanhante;
    private javax.swing.JTextField txtBairroCrianca;
    private javax.swing.JTextField txtBairroNucleo;
    private javax.swing.JTextField txtBusca;
    private javax.swing.JTextField txtBuscaConselheiro;
    private javax.swing.JTextField txtBuscaConselheiro2;
    private javax.swing.JTextField txtBuscaRequerente;
    private javax.swing.JFormattedTextField txtCelularAcompanhante;
    private javax.swing.JFormattedTextField txtCelularNucleo;
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
    private javax.swing.JFormattedTextField txtNascimentoCrianca;
    private javax.swing.JTextField txtNomeAcompanhante;
    private javax.swing.JTextField txtNomeCrianca;
    private javax.swing.JTextField txtNomeNucleo;
    private javax.swing.JTextField txtNumeroAcompanhante;
    private javax.swing.JTextField txtNumeroCrianca;
    private javax.swing.JTextField txtNumeroNucleo;
    private javax.swing.JTextField txtParentescoNucleo;
    private javax.swing.JTextPane txtRelatoAtendimento;
    private javax.swing.JTextField txtRequerenteAtendimento;
    private javax.swing.JTextField txtResponsabilidadeNucleo;
    private javax.swing.JFormattedTextField txtTelefoneAcompanhante;
    private javax.swing.JFormattedTextField txtTelefoneCrianca;
    private javax.swing.JFormattedTextField txtTelefoneNucleo;
    // End of variables declaration//GEN-END:variables
}
