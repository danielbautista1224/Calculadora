package com.mycompany.calculadora_3;
import java.awt.Font;
public class interfas extends javax.swing.JFrame {
    double num1=0,num2=0,resultado;
    int j1,op1=0;
    public interfas() {//funciones
        initComponents();
        setSize(580, 500);
        setLocationRelativeTo(this);
        titulo.setFont(new Font("times new roman",Font.ROMAN_BASELINE,20));
        titulo.setLocation(500, 100);
        op(num1, num2, op1);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        receptortexto = new javax.swing.JTextField();
        texto1 = new javax.swing.JLabel();
        n1 = new javax.swing.JButton();
        n2 = new javax.swing.JButton();
        n3 = new javax.swing.JButton();
        n4 = new javax.swing.JButton();
        n5 = new javax.swing.JButton();
        n6 = new javax.swing.JButton();
        n7 = new javax.swing.JButton();
        n8 = new javax.swing.JButton();
        n9 = new javax.swing.JButton();
        bsuma = new javax.swing.JButton();
        bresta = new javax.swing.JButton();
        bmult = new javax.swing.JButton();
        bdiv = new javax.swing.JButton();
        bpot = new javax.swing.JButton();
        braiz = new javax.swing.JButton();
        bsin = new javax.swing.JButton();
        bcos = new javax.swing.JButton();
        btan = new javax.swing.JButton();
        biva = new javax.swing.JButton();
        bigual = new javax.swing.JButton();
        bce = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        aclaraciones = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titulo.setText("                                 calculadora");

        receptortexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receptortextoActionPerformed(evt);
            }
        });

        texto1.setText("digite la operacion:");

        n1.setText("1");
        n1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n1ActionPerformed(evt);
            }
        });

        n2.setText("2");
        n2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n2ActionPerformed(evt);
            }
        });

        n3.setText("3");
        n3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n3ActionPerformed(evt);
            }
        });

        n4.setText("4");
        n4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n4ActionPerformed(evt);
            }
        });

        n5.setText("5");
        n5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n5ActionPerformed(evt);
            }
        });

        n6.setText("6");
        n6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n6ActionPerformed(evt);
            }
        });

        n7.setText("7");
        n7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n7ActionPerformed(evt);
            }
        });

        n8.setText("8");
        n8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n8ActionPerformed(evt);
            }
        });

        n9.setText("9");
        n9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                n9ActionPerformed(evt);
            }
        });

        bsuma.setText("+");
        bsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsumaActionPerformed(evt);
            }
        });

        bresta.setText("-");
        bresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brestaActionPerformed(evt);
            }
        });

        bmult.setText("*");
        bmult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bmultActionPerformed(evt);
            }
        });

        bdiv.setText("/");
        bdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdivActionPerformed(evt);
            }
        });

        bpot.setText("a^x");
        bpot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpotActionPerformed(evt);
            }
        });

        braiz.setText("a√b");
        braiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                braizActionPerformed(evt);
            }
        });

        bsin.setText("sin");
        bsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsinActionPerformed(evt);
            }
        });

        bcos.setText("cos");
        bcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcosActionPerformed(evt);
            }
        });

        btan.setText("tan");
        btan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btanActionPerformed(evt);
            }
        });

        biva.setText("iva");
        biva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bivaActionPerformed(evt);
            }
        });

        bigual.setText("=");
        bigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bigualActionPerformed(evt);
            }
        });

        bce.setText("ce");
        bce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bceActionPerformed(evt);
            }
        });

        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(receptortexto, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(n7)
                                        .addGap(18, 18, 18)
                                        .addComponent(n8)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(n9)
                                            .addComponent(n6)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(n1)
                                            .addComponent(n4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(n5)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(n2)
                                                .addGap(18, 18, 18)
                                                .addComponent(n3))))
                                    .addComponent(b0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(bdiv)
                                            .addComponent(bsuma))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(bpot, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(bresta, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(braiz))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(26, 26, 26)
                                                .addComponent(bmult))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(bcos)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btan)
                                        .addGap(18, 18, 18)
                                        .addComponent(biva))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(aclaraciones, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bigual)
                            .addComponent(bsin)
                            .addComponent(bce))
                        .addGap(52, 52, 52))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texto1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(aclaraciones))
                .addGap(20, 20, 20)
                .addComponent(receptortexto, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bsuma)
                            .addComponent(bresta)
                            .addComponent(bmult)
                            .addComponent(bce))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bpot)
                            .addComponent(braiz)
                            .addComponent(bsin)
                            .addComponent(bdiv))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btan)
                            .addComponent(biva)
                            .addComponent(bigual)
                            .addComponent(bcos)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n1)
                            .addComponent(n2)
                            .addComponent(n3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n5)
                            .addComponent(n4)
                            .addComponent(n6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(n9)
                            .addComponent(n8)
                            .addComponent(n7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b0)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void receptortextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receptortextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_receptortextoActionPerformed

    private void n1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n1ActionPerformed
       String texto;
        texto=receptortexto.getText();
        receptortexto.setText(texto+"1");
    }//GEN-LAST:event_n1ActionPerformed

    private void n2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n2ActionPerformed
        String texto;
        texto=receptortexto.getText();
        receptortexto.setText(texto+"2");
    }//GEN-LAST:event_n2ActionPerformed

    private void n3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n3ActionPerformed
        String texto;
        texto=receptortexto.getText();
        receptortexto.setText(texto+"3");
    }//GEN-LAST:event_n3ActionPerformed

    private void n4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n4ActionPerformed
String texto;
        texto=receptortexto.getText();
        receptortexto.setText(texto+"4");      
    }//GEN-LAST:event_n4ActionPerformed

    private void n5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n5ActionPerformed
String texto;
        texto=receptortexto.getText();
        receptortexto.setText(texto+"5");        
    }//GEN-LAST:event_n5ActionPerformed

    private void n6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n6ActionPerformed
String texto;
        texto=receptortexto.getText();
        receptortexto.setText(texto+"6");
    }//GEN-LAST:event_n6ActionPerformed

    private void n7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n7ActionPerformed
String texto;
        texto=receptortexto.getText();
        receptortexto.setText(texto+"7");     
    }//GEN-LAST:event_n7ActionPerformed

    private void n8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n8ActionPerformed
String texto;
        texto=receptortexto.getText();
        receptortexto.setText(texto+"8"); 
    }//GEN-LAST:event_n8ActionPerformed

    private void n9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_n9ActionPerformed
String texto;
        texto=receptortexto.getText();
        receptortexto.setText(texto+"9"); 
    }//GEN-LAST:event_n9ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
String texto;
        texto=receptortexto.getText();
        receptortexto.setText(texto+"0");       
    }//GEN-LAST:event_b0ActionPerformed

    private void bsumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsumaActionPerformed
        operaciones op=new operaciones();
        String texto;
        texto=receptortexto.getText();
        num2=Double.parseDouble(texto);
        aclaraciones.setText(texto+"+");
        receptortexto.setText("");
        op(num1, num2, op1);
        op1=1;        
    }//GEN-LAST:event_bsumaActionPerformed

    private void brestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brestaActionPerformed
        operaciones op=new operaciones();
        String texto;
        texto=receptortexto.getText();
        num2=Double.parseDouble(texto);
        aclaraciones.setText(texto+"-");
        receptortexto.setText("");
        op(num1, num2, op1);
        op1=2;
    }//GEN-LAST:event_brestaActionPerformed

    private void bmultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bmultActionPerformed
        operaciones op=new operaciones();
        String texto;
        texto=receptortexto.getText();
        num2=Double.parseDouble(texto);
        aclaraciones.setText(texto+"*");
        receptortexto.setText("");
        op(num1, num2, op1);
        op1=3;
    }//GEN-LAST:event_bmultActionPerformed

    private void bdivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdivActionPerformed
        operaciones op=new operaciones();
        String texto;
        texto=receptortexto.getText();
        num2=Double.parseDouble(texto);
        aclaraciones.setText(texto+"/");
        receptortexto.setText("");
        op(num1, num2, op1);
        op1=4;
        
      
    }//GEN-LAST:event_bdivActionPerformed

    private void bpotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpotActionPerformed
        operaciones op=new operaciones();
        String texto;
        texto=receptortexto.getText();
        num2=Double.parseDouble(texto);
        aclaraciones.setText(texto+"^");
        receptortexto.setText("");
        op(num1, num2, op1);
        op1=5;
    }//GEN-LAST:event_bpotActionPerformed

    private void braizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_braizActionPerformed
        operaciones op=new operaciones();
        String texto;
        texto=receptortexto.getText();
        num1=Double.parseDouble(texto);
        aclaraciones.setText(num1+"√"+"(");
        receptortexto.setText("");
        op1=6;
        
    }//GEN-LAST:event_braizActionPerformed

    private void bsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsinActionPerformed
        operaciones op=new operaciones();
        aclaraciones.setText("sin(");
        receptortexto.setText("");
        op1=7;
    }//GEN-LAST:event_bsinActionPerformed

    private void bcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcosActionPerformed
        operaciones op=new operaciones();
        aclaraciones.setText("cos(");
        receptortexto.setText("");
        op1=8;
    }//GEN-LAST:event_bcosActionPerformed

    private void btanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btanActionPerformed
        operaciones op=new operaciones();
        aclaraciones.setText("tan(");
        receptortexto.setText("");
        op1=9;
    }//GEN-LAST:event_btanActionPerformed

    private void bivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bivaActionPerformed
        operaciones op=new operaciones();
        aclaraciones.setText("iva(");
        receptortexto.setText("");
        op1=10;
    }//GEN-LAST:event_bivaActionPerformed

    private void bceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bceActionPerformed
        receptortexto.setText("");
        aclaraciones.setText("");
        num1=0;
        num2=0;
        op1=0;
    }//GEN-LAST:event_bceActionPerformed

    private void bigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bigualActionPerformed
        String line;
        line=receptortexto.getText();
        num2=Double.parseDouble(line);
        receptortexto.setText("");
        op(num1, num2, op1);
        op1=0;
        num1=resultado;
        receptortexto.setText(String.valueOf(num1));
        aclaraciones.setText("");
    }//GEN-LAST:event_bigualActionPerformed
    public void op(double n1,double num2,int op1)
   {
       operaciones op=new operaciones();
       String line; 
       switch(op1)
        {
            case 0:
                num1=num2;
                num2=0;
                break;
            case 1://suma
                resultado=op.suma(num1, num2);
                aclaraciones.setText(String.valueOf(resultado));
                receptortexto.setText("");
                num1=resultado;
                break;
            case 2://resta
                resultado=op.resta(num1, num2);
                aclaraciones.setText(String.valueOf(resultado));
                receptortexto.setText("");
                num1=resultado;
                break;
            case 3://mult
                resultado=op.multiplicacion(num1, num2);
                aclaraciones.setText(String.valueOf(resultado));
                receptortexto.setText("");
                num1=resultado;
                break;
            case 4://division
                if(num2==0)
                {
                aclaraciones.setText("no se puede dividir por cero");
                receptortexto.setText("no se puede dividir por cero");  
                }else{
                resultado=op.division(num1, num2);
                aclaraciones.setText(String.valueOf(resultado));
                receptortexto.setText("");
                num1=resultado;
                num2=0;
                }
                break;
            case 5://potencia
                resultado=op.potencia(num1, num2);
                aclaraciones.setText(String.valueOf(resultado));
                receptortexto.setText("");
                num1=resultado;
                break;
            case 6://raiz
                resultado=op.potencia(num1, num2);
                aclaraciones.setText(String.valueOf(resultado));
                receptortexto.setText("");
                num1=resultado;
            case 7://sin
              resultado=op.sin(num2);
              aclaraciones.setText(String.valueOf(resultado));
              receptortexto.setText("");
              num1=resultado;
              break; 
            case 8://cos
              resultado=op.cos(num2);
              aclaraciones.setText(String.valueOf(resultado));
              receptortexto.setText("");
              num1=resultado;
              break; 
            case 9://tan
              resultado=op.tan(num2);
              aclaraciones.setText(String.valueOf(resultado));
              receptortexto.setText("");
              num1=resultado;
              break; 
            case 10://iva
              resultado=op.iva(num2);
              aclaraciones.setText(String.valueOf(resultado));
              receptortexto.setText("");
              num1=resultado;
              break; 
        }
   }
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfas().setVisible(true);
            }
        });
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aclaraciones;
    private javax.swing.JButton b0;
    private javax.swing.JButton bce;
    private javax.swing.JButton bcos;
    private javax.swing.JButton bdiv;
    private javax.swing.JButton bigual;
    private javax.swing.JButton biva;
    private javax.swing.JButton bmult;
    private javax.swing.JButton bpot;
    private javax.swing.JButton braiz;
    private javax.swing.JButton bresta;
    private javax.swing.JButton bsin;
    private javax.swing.JButton bsuma;
    private javax.swing.JButton btan;
    private javax.swing.JButton n1;
    private javax.swing.JButton n2;
    private javax.swing.JButton n3;
    private javax.swing.JButton n4;
    private javax.swing.JButton n5;
    private javax.swing.JButton n6;
    private javax.swing.JButton n7;
    private javax.swing.JButton n8;
    private javax.swing.JButton n9;
    private javax.swing.JTextField receptortexto;
    private javax.swing.JLabel texto1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
