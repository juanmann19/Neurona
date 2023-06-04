
////Clase Menu
package com.universidad.neurona;

import java.awt.Color;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import static org.openjdk.nashorn.internal.objects.NativeMath.round;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Menu extends javax.swing.JFrame {
	
	public Menu() {
		initComponents();
		
	}

    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Tabla_D = new javax.swing.JPanel();
        B_TeoriaT3 = new javax.swing.JLabel();
        B_TeoriaT3.setIcon(new ImageIcon("C:\\Users\\Juan Garcia\\eclipse-workspace\\Neurona\\images\\Bteoria.jpeg"));
        teoriaT1 = new javax.swing.JLabel();
        teoriaT1.setHorizontalAlignment(SwingConstants.CENTER);
        teoriaT1.setIcon(new ImageIcon("C:\\Users\\Juan Garcia\\eclipse-workspace\\Neurona\\images\\teoria.jpeg"));
        practicaT1 = new javax.swing.JLabel();
        practicaT1.setIcon(new ImageIcon("C:\\Users\\Juan Garcia\\eclipse-workspace\\Neurona\\images\\practica.jpg"));
        B_PracticaT4 = new javax.swing.JLabel();
        B_PracticaT4.setIcon(new ImageIcon("C:\\Users\\Juan Garcia\\eclipse-workspace\\Neurona\\images\\Bpractica.jpg"));
        teoriaT2 = new javax.swing.JLabel();
        teoriaT2.setIcon(new ImageIcon("C:\\Users\\Juan Garcia\\eclipse-workspace\\Neurona\\images\\teoria.jpeg"));
        B_PracticaT2 = new javax.swing.JLabel();
        B_PracticaT2.setIcon(new ImageIcon("C:\\Users\\Juan Garcia\\eclipse-workspace\\Neurona\\images\\Bpractica.jpg"));
        practicaT3 = new javax.swing.JLabel();
        practicaT3.setIcon(new ImageIcon("C:\\Users\\Juan Garcia\\eclipse-workspace\\Neurona\\images\\practica.jpg"));
        B_TeoriaT4 = new javax.swing.JLabel();
        B_TeoriaT4.setIcon(new ImageIcon("C:\\Users\\Juan Garcia\\eclipse-workspace\\Neurona\\images\\Bteoria.jpeg"));
        T4 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        T2 = new javax.swing.JTextField();
        T1 = new javax.swing.JTextField();
        Neurona_D = new javax.swing.JLabel();
        Pesos = new javax.swing.JPanel();
        LW1 = new javax.swing.JLabel();
        LW2 = new javax.swing.JLabel();
        L0i = new javax.swing.JLabel();
        W2 = new javax.swing.JTextField();
        W1 = new javax.swing.JTextField();
        Oi = new javax.swing.JTextField();
        Titulo1 = new javax.swing.JLabel();
        Factor_aprendizaje = new javax.swing.JPanel();
        Factor_A = new javax.swing.JLabel();
        FA = new javax.swing.JTextField();
        E = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        Calcular = new javax.swing.JButton();
        Limpiar = new javax.swing.JButton();
        Siguiente = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Tabla_D.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        T4.setFont(new java.awt.Font("Impact", 1, 48)); // NOI18N
        T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        T4.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        T4.setEnabled(false);
        T4.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        T3.setFont(new java.awt.Font("Impact", 1, 48)); // NOI18N
        T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        T3.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        T3.setEnabled(false);
        T3.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        T2.setFont(new java.awt.Font("Impact", 1, 48)); // NOI18N
        T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        T2.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        T2.setEnabled(false);
        T2.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        T1.setBackground(new java.awt.Color(240, 240, 240));
        T1.setFont(new java.awt.Font("Impact", 1, 48)); // NOI18N
        T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        T1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        T1.setEnabled(false);
        T1.setSelectedTextColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout Tabla_DLayout = new javax.swing.GroupLayout(Tabla_D);
        Tabla_D.setLayout(Tabla_DLayout);
        Tabla_DLayout.setHorizontalGroup(
            Tabla_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tabla_DLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tabla_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tabla_DLayout.createSequentialGroup()
                        .addComponent(teoriaT1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(practicaT1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T1, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
                    .addGroup(Tabla_DLayout.createSequentialGroup()
                        .addGroup(Tabla_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(Tabla_DLayout.createSequentialGroup()
                                .addComponent(B_TeoriaT3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(practicaT3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Tabla_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(Tabla_DLayout.createSequentialGroup()
                                    .addComponent(B_TeoriaT4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(B_PracticaT4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Tabla_DLayout.createSequentialGroup()
                                    .addComponent(teoriaT2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(B_PracticaT2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Tabla_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(T4)
                            .addComponent(T3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(T2, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))))
                .addContainerGap())
        );
        Tabla_DLayout.setVerticalGroup(
            Tabla_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tabla_DLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tabla_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(teoriaT1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(practicaT1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Tabla_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Tabla_DLayout.createSequentialGroup()
                        .addGroup(Tabla_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(teoriaT2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B_PracticaT2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Tabla_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(Tabla_DLayout.createSequentialGroup()
                                .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Tabla_DLayout.createSequentialGroup()
                                .addGroup(Tabla_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(practicaT3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B_TeoriaT3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Tabla_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(B_TeoriaT4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(B_PracticaT4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Neurona_D.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Neurona_D.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Neurona_D.setText("NEURONA DE BUENAS NOTAS");

        Pesos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        LW1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LW1.setText("W1");

        LW2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        LW2.setText("W2");

        L0i.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        L0i.setText("0i");

        Titulo1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo1.setText("Pesos");

        javax.swing.GroupLayout PesosLayout = new javax.swing.GroupLayout(Pesos);
        PesosLayout.setHorizontalGroup(
        	PesosLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(PesosLayout.createSequentialGroup()
        			.addGroup(PesosLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(PesosLayout.createSequentialGroup()
        					.addGap(25)
        					.addGroup(PesosLayout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(LW1, Alignment.LEADING)
        						.addComponent(LW2, Alignment.LEADING)
        						.addComponent(L0i, Alignment.LEADING))
        					.addGap(29)
        					.addGroup(PesosLayout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(Oi)
        						.addComponent(W2)
        						.addComponent(W1, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
        				.addGroup(PesosLayout.createSequentialGroup()
        					.addGap(97)
        					.addComponent(Titulo1, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(437, Short.MAX_VALUE))
        );
        PesosLayout.setVerticalGroup(
        	PesosLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(PesosLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(Titulo1)
        			.addGap(13)
        			.addGroup(PesosLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(LW1)
        				.addComponent(W1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(PesosLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(LW2)
        				.addComponent(W2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(PesosLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(L0i)
        				.addComponent(Oi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(27, Short.MAX_VALUE))
        );
        Pesos.setLayout(PesosLayout);

        Factor_aprendizaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Factor_A.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Factor_A.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Factor_A.setText("Factor de aprendizaje");

        E.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        E.setText("E");

        javax.swing.GroupLayout Factor_aprendizajeLayout = new javax.swing.GroupLayout(Factor_aprendizaje);
        Factor_aprendizajeLayout.setHorizontalGroup(
        	Factor_aprendizajeLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Factor_aprendizajeLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(Factor_A)
        			.addContainerGap(62, Short.MAX_VALUE))
        		.addGroup(Alignment.TRAILING, Factor_aprendizajeLayout.createSequentialGroup()
        			.addGap(77)
        			.addComponent(E)
        			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(FA, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
        			.addGap(70))
        );
        Factor_aprendizajeLayout.setVerticalGroup(
        	Factor_aprendizajeLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Factor_aprendizajeLayout.createSequentialGroup()
        			.addComponent(Factor_A)
        			.addGap(63)
        			.addGroup(Factor_aprendizajeLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(E)
        				.addComponent(FA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(70, Short.MAX_VALUE))
        );
        Factor_aprendizaje.setLayout(Factor_aprendizajeLayout);

        Salir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Salir.setText("Salir");
        Salir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Salir.setRequestFocusEnabled(false);
        Salir.setRolloverEnabled(false);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        Calcular.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Calcular.setText("Calcular calificacion");
        Calcular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });

        Limpiar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Limpiar.setText("Limpiar");
        Limpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Siguiente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Siguiente.setText("Siguiente");
        Siguiente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Siguiente.setEnabled(false);
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        btnReiniciar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnReiniciar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnReiniciar.setLabel("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(125)
        			.addComponent(Neurona_D, GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
        			.addGap(686))
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(53)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(Siguiente, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(Limpiar, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
        					.addGap(34)
        					.addComponent(Tabla_D, 0, 0, Short.MAX_VALUE))
        				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(Pesos, GroupLayout.PREFERRED_SIZE, 301, GroupLayout.PREFERRED_SIZE)
        					.addGap(32)
        					.addComponent(Factor_aprendizaje, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(Salir, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(btnReiniciar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(Calcular, GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))))
        			.addContainerGap(602, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(Neurona_D)
        			.addGap(42)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(Pesos, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(Calcular, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnReiniciar, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(Salir, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.RELATED))
        				.addComponent(Factor_aprendizaje, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(95)
        					.addComponent(Siguiente, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
        					.addGap(68)
        					.addComponent(Limpiar, GroupLayout.PREFERRED_SIZE, 66, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(18)
        					.addComponent(Tabla_D, GroupLayout.PREFERRED_SIZE, 606, GroupLayout.PREFERRED_SIZE)))
        			.addGap(25))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {                                      
        dispose();
    }                                     

    //////////////////////////////////////////////////////////////////////////////////////////////////
    double y1 = 0;
    double y2 = 0;
    double y3 = 0;
    double y4 = 0;
    
    int[] n1 = {1,1,-1};
    int[] n2 = {1,-1,-1};
    int[] n3 = {-1,1,-1};
    int[] n4 = {-1,-1,-1};
    
    double ccW1 = 0; //peso 1
    double ccW2 = 0; //peso 2
    double ccOi = 0; //Valor de comparacion
    double ccFA = 0; //factor de aprendizaje
    
    int complete = 0;
    
    
    
    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {                                        
        W1.setText("");
        W2.setText("");
        Oi.setText("");
        FA.setText("");
        T1.setText("");
        T2.setText("");
        T3.setText("");
        T4.setText("");
    }                                       
    
    public void calculos (){
        
        y1 = (n1[0]* ccW1) + (n1[1]* ccW2) + (n1[2] * ccOi);
        y2 = (n2[0]* ccW1) + (n2[1]* ccW2) + (n2[2] * ccOi);
        y3 = (n3[0]* ccW1) + (n3[1]* ccW2) + (n3[2] * ccOi);
        y4 = (n4[0]* ccW1) + (n4[1]* ccW2) + (n4[2] * ccOi);

        T1.setText(String.format("%.2f",y1));
        T2.setText(String.format("%.2f",y2));
        T3.setText(String.format("%.2f",y3));
        T4.setText(String.format("%.2f",y4));
    }
    
    public void evaluaprima(){
        
        if (y1 >= Double.parseDouble(Oi.getText())) {
                T1.setBackground(Color.green);
        }else{
                T1.setBackground(Color.red);
        }
        
        if (y2 >= Double.parseDouble(Oi.getText())) {
                T2.setBackground(Color.green);
        }else{
                T2.setBackground(Color.red);                
        }
        
        if (y3 >= Double.parseDouble(Oi.getText())) {
                T3.setBackground(Color.green);
        }else{                
                T3.setBackground(Color.red);
        }
        
        if (y4 >= Double.parseDouble(Oi.getText())) {
                T4.setBackground(Color.red);
        }else{                
                T4.setBackground(Color.green);
        }
        
    }
    
    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {                                         
        if (W1.getText().equals("") || W2.getText().equals("") || Oi.getText().equals("") || FA.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Favor ingresar todos los datos", "Mensaje", JOptionPane.WARNING_MESSAGE);
        }else{            
            Siguiente.setEnabled(true);
            Calcular.setEnabled(false);

            W1.setEnabled(false);
            W2.setEnabled(false);
            Oi.setEnabled(false);
            FA.setEnabled(false);

            ccW1 = Double.parseDouble(W1.getText());
            ccW2 = Double.parseDouble(W2.getText());
            ccOi = Double.parseDouble(Oi.getText());
            ccFA = Double.parseDouble(FA.getText());

            calculos();
            evaluaprima();
        }
    }                                        
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void nuevospesos(double n0, double n1, double n2, double n3){        
        
        DecimalFormat df = new DecimalFormat("#.##");
        
        ccW1 = ccW1 + (2 * (ccFA * n0 * n1));
        ccW2 = ccW2 + (2 * (ccFA * n0 * n2));
        ccOi = ccOi + (2 * (ccFA * n0 * n3));
        
        ccW1 = Double.parseDouble(df.format(ccW1));
        ccW2 = Double.parseDouble(df.format(ccW2));
        ccOi = Double.parseDouble(df.format(ccOi));
    }
    
    public void recalcular(int n){
        
        switch (n) {
        case 1:            
            nuevospesos(1,1,1,-1);            
        break;
        case 2:
            nuevospesos(1,1,-1,-1);
        break;
        case 3:
            nuevospesos(1,-1,1,-1);
        break;
        case 4:
            nuevospesos(-1,-1,-1,-1);
        break;
        default:

        break;
        }
    }
    
    public void validar(){
        complete = 0;

        if (y1 >= Double.parseDouble(Oi.getText()) && complete == 0) {
                T1.setBackground(Color.green);
        }else{
                recalcular(1); 
                complete = 1; 
                T1.setBackground(Color.red);
        }
        
        if (y2 >= Double.parseDouble(Oi.getText()) && complete == 0) {
                T2.setBackground(Color.green);
        }else{
                if (complete == 0){
                    recalcular(2); 
                    complete = 1; 
                    T2.setBackground(Color.red);
                }
        }
        
        if (y3 >= Double.parseDouble(Oi.getText()) && complete == 0) {
                T3.setBackground(Color.green);
        }else{
                if (complete == 0){                    
                    recalcular(3);
                    complete = 1; 
                    T3.setBackground(Color.red);
                }
        }
        
        if (y4 >= Double.parseDouble(Oi.getText()) && complete == 0) {
                recalcular(4); 
                complete = 1;
                T4.setBackground(Color.red);
        }else{
                if (complete == 0){ 
                    T4.setBackground(Color.green);
                }else{
                    T4.setBackground(Color.red);
                }
        }
        
        if (complete == 0){
        	String resultado = String.format("El valor del primer peso es: %s, \n"
        			+ "El valor del segundo peso es: %s\n"
        			+ "El valor del limite es: %s\n",String.valueOf(ccW1),String.valueOf(ccW2),String.valueOf(ccOi));
        	JOptionPane.showMessageDialog(null, resultado, "Mensaje", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showMessageDialog(null, "Buena calificacion calcula da correctamente...!!!", "Mensaje", JOptionPane.WARNING_MESSAGE);
            reiniciar();
        }        
       
    }
    
    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {                                          
        calculos();
        validar();
    }      
    //////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void reiniciar(){
        
        JOptionPane.showMessageDialog(null, "Reiniciado exitoso", "Mensaje", JOptionPane.WARNING_MESSAGE);
        
        ccW1 = 0;
        ccW2 = 0;
        ccOi = 0;
        
        y1 = 0;
        y2 = 0;
        y3 = 0;
        y4 = 0;
        
        T1.setText("");
        T2.setText("");
        T3.setText("");
        T4.setText("");
        
        W1.setText("");
        W2.setText("");
        Oi.setText("");
        FA.setText("");
        
        Siguiente.setEnabled(false);
        Calcular.setEnabled(true);
        
        W1.setEnabled(true);
        W2.setEnabled(true);
        Oi.setEnabled(true);
        FA.setEnabled(true);
        
        T1.setBackground(Color.white);//resultados de iteracion
        T2.setBackground(Color.white);
        T3.setBackground(Color.white);
        T4.setBackground(Color.white);        
    }
    
    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {                                             
        reiniciar();
    }                                            

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
                
            }
        });
    }
    
 // Variables declaration - do not modify                     
    private javax.swing.JLabel B_PracticaT2;
    private javax.swing.JLabel B_PracticaT4;
    private javax.swing.JLabel B_TeoriaT3;
    private javax.swing.JLabel B_TeoriaT4;
    private javax.swing.JButton Calcular;
    private javax.swing.JLabel practicaT1;
    private javax.swing.JLabel practicaT3;
    private javax.swing.JLabel E;
    private javax.swing.JTextField FA;
    private javax.swing.JLabel Factor_A;
    private javax.swing.JPanel Factor_aprendizaje;
    private javax.swing.JLabel L0i;
    private javax.swing.JLabel LW1;
    private javax.swing.JLabel LW2;
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel teoriaT1;
    private javax.swing.JLabel teoriaT2;
    private javax.swing.JLabel Neurona_D;
    private javax.swing.JTextField Oi;
    private javax.swing.JPanel Pesos;
    private javax.swing.JButton Salir;
    private javax.swing.JButton Siguiente;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JPanel Tabla_D;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JTextField W1;
    private javax.swing.JTextField W2;
    private javax.swing.JButton btnReiniciar;
    // End of variables declaration                   
}


