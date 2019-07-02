/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import javax.swing.JOptionPane;
import modelo.Ciclistas;
import modelo.Pedal;

/**
 *
 * @author jonas
 */
public class GuiPedal extends javax.swing.JInternalFrame {

    /**
     * Creates new form GuiPedal
     */
    public GuiPedal() {
        initComponents();
        setTitle("Inserindo novo Pedalante");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgPlano = new javax.swing.ButtonGroup();
        jPanelOpcoes = new javax.swing.JPanel();
        jRadioPOP = new javax.swing.JRadioButton();
        jRadioPREMIUM = new javax.swing.JRadioButton();
        jPanelDados = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelNumConta = new javax.swing.JLabel();
        jTextFieldNumConta = new javax.swing.JTextField();
        jPanelValor = new javax.swing.JPanel();
        jLabelValor = new javax.swing.JLabel();
        jTextFieldValor = new javax.swing.JTextField();
        jPanelAcoes = new javax.swing.JPanel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();

        setClosable(true);

        jPanelOpcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Escolha o seu Plano"));

        bgPlano.add(jRadioPOP);
        jRadioPOP.setSelected(true);
        jRadioPOP.setText("Pedal POP");

        bgPlano.add(jRadioPREMIUM);
        jRadioPREMIUM.setText("Pedal PREMIUM");

        javax.swing.GroupLayout jPanelOpcoesLayout = new javax.swing.GroupLayout(jPanelOpcoes);
        jPanelOpcoes.setLayout(jPanelOpcoesLayout);
        jPanelOpcoesLayout.setHorizontalGroup(
            jPanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioPOP)
                .addGap(74, 74, 74)
                .addComponent(jRadioPREMIUM)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanelOpcoesLayout.setVerticalGroup(
            jPanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOpcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOpcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jRadioPREMIUM)
                    .addComponent(jRadioPOP))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelDados.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Informe seus Dados")));

        jLabelNome.setText("Nome:");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabelNumConta.setText("Número Conta:");

        jTextFieldNumConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumContaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabelNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNome))
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jLabelNumConta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNumConta)))
                .addContainerGap())
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNome)
                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNumConta)
                    .addComponent(jTextFieldNumConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jPanelValor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelValor.setText("Valor Inicial:");

        jTextFieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldValorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelValorLayout = new javax.swing.GroupLayout(jPanelValor);
        jPanelValor.setLayout(jPanelValorLayout);
        jPanelValorLayout.setHorizontalGroup(
            jPanelValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelValorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelValorLayout.setVerticalGroup(
            jPanelValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelValorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelValorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelValor)
                    .addComponent(jTextFieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelAcoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        jButtonSalvar.setBackground(new java.awt.Color(61, 119, 167));
        jButtonSalvar.setForeground(new java.awt.Color(254, 254, 254));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonLimpar.setText("Limpar");
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAcoesLayout = new javax.swing.GroupLayout(jPanelAcoes);
        jPanelAcoes.setLayout(jPanelAcoesLayout);
        jPanelAcoesLayout.setHorizontalGroup(
            jPanelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAcoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelAcoesLayout.setVerticalGroup(
            jPanelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAcoesLayout.createSequentialGroup()
                .addGroup(jPanelAcoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonLimpar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jButtonSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAcoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelValor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelOpcoes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelDados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelOpcoes, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanelAcoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        reset();
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if(save()){
            reset();
        }
        
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        if(save()){
            reset();
        }
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldNumContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumContaActionPerformed
        if(save()){
            reset();
        }
    }//GEN-LAST:event_jTextFieldNumContaActionPerformed

    private void jTextFieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldValorActionPerformed
        if(save()){
            reset();
        }
    }//GEN-LAST:event_jTextFieldValorActionPerformed

    private boolean save(){
        //variaveis
        Ciclistas ciclista = new Ciclistas();
        double valor = 0;
        String msg = "";
        String nome = jTextFieldNome.getText();
        String numConta = jTextFieldNumConta.getText();
        boolean validacao = true;
        
        
        if(!jTextFieldValor.getText().equals("")){
            valor = Double.parseDouble(jTextFieldValor.getText().replace(",", "."));
        }
        
        if(nome.equals("")){
            msg = "O Nome deve ser preenchido.\n";
            validacao = false;
        }
        
        if(numConta.equals("")){
            msg = msg + "O Número da conta deve ser preenchido.";
            validacao = false;
        }
        
        if(!validacao){
            JOptionPane.showMessageDialog(null,
                    msg,
                    "Preencha os campos obrigatórios",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(ciclista.getPosicaoPedalByConta(numConta) >= 0){
            JOptionPane.showMessageDialog(null,
                    "Já existe um cliente cadastrado com o mesmo número de conta",
                    "Conta já existe",
                    JOptionPane.PLAIN_MESSAGE);
            return false;
        }
        if(valor > 100){
            jRadioPREMIUM.setSelected(true);
            msg = "\nO Pedal foi cadastro como PREMIUM pois depositou o valor de " + valor;
        }
        
        if(jRadioPREMIUM.isSelected()){
            if(valor < 100){
                JOptionPane.showMessageDialog(null,
                    "Valor mínimo para Assinantes Premium: R$ 100,00",
                    "Valor insuficiente",
                    JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
            Pedal premium = new Pedal();
            premium.setNome(nome);
            premium.setNumeroConta(numConta);
            premium.creditar(valor);
            premium.setIsPremium(true);
            premium.setLimite(100);
            
            ciclista.inserir(premium);
        }else{
            Pedal pop = new Pedal();
            pop.setNome(nome);
            pop.setNumeroConta(numConta);
            pop.creditar(valor);
            pop.setIsPremium(false);
            
            ciclista.inserir(pop);
        }
        JOptionPane.showMessageDialog(null,
                    "Pedal Cadastrado com Sucesso!" + msg,
                    "Sucesso",
                    JOptionPane.PLAIN_MESSAGE);
        return true;
    }
    
    private void reset(){
        this.jTextFieldNome.setText("");
        this.jTextFieldNumConta.setText("");
        this.jTextFieldValor.setText("0.00");
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgPlano;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumConta;
    private javax.swing.JLabel jLabelValor;
    private javax.swing.JPanel jPanelAcoes;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelOpcoes;
    private javax.swing.JPanel jPanelValor;
    private javax.swing.JRadioButton jRadioPOP;
    private javax.swing.JRadioButton jRadioPREMIUM;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldNumConta;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}