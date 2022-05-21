package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RCB_2002 {
    private JTextField txtStname;
    private JTextField txtDBMS1;
    private JTextField txtCG2;
    private JTextField txtSE3;
    private JTextField txtTotal;
    private JTextField txtAvg;
    private JTextField txtGrade;
    private JButton calButton;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new RCB_2002().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public RCB_2002() {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int m1,m2,m3,tot;
                double avg;


                m1=Integer.parseInt(txtDBMS1.getText());
                m2=Integer.parseInt(txtCG2.getText());
                m3=Integer.parseInt(txtSE3.getText());

                tot = m1 + m2 + m3;

                txtTotal.setText(String.valueOf(tot));
                avg = tot/3;
                txtAvg.setText(String.valueOf(avg));
                if(avg>50)
                {
                    txtGrade.setText("Pass");
                }
                else
                {
                    txtGrade.setText("Fail");
                }}
        });
}
}


