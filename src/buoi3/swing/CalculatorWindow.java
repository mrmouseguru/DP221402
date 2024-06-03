package buoi3.swing;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorWindow extends JFrame implements ActionListener{

    //field
    private String title;
    private JPanel jPanelRemote;
    private JLabel jLabelInput1Remote, jLabelInput2Remote, 
    jLabelOutputRemote;
    private JTextField jTextFieldInput1Remote, jTextFieldInput2Remote;
    private JButton addButtonRemote, subButtonRemote, mulButtonRemote, divButtonRemote;


    //function , method
    CalculatorWindow(){
        buildPanel();
        add(jPanelRemote);
        title = "Frame Viewer";
        setTitle(title);
        setSize(400, 400);
        setVisible(true);

    }

    public void buildPanel() {
        jPanelRemote = new JPanel();
        jLabelInput1Remote = new JLabel("input1");
        jPanelRemote.add(jLabelInput1Remote);
        jTextFieldInput1Remote = new JTextField(10);
        jPanelRemote.add(jTextFieldInput1Remote);
        jLabelInput2Remote = new JLabel("input2");
        jTextFieldInput2Remote = new JTextField(10);
        jLabelOutputRemote = new JLabel("Output");
        jPanelRemote.add(jLabelInput2Remote);
        jPanelRemote.add(jTextFieldInput2Remote);
        jPanelRemote.add(jLabelOutputRemote);
        addButtonRemote = new JButton("ADD");
        addButtonRemote.addActionListener(this);//Remote của CalculatorWindow
        jPanelRemote.add(addButtonRemote);
        
        //jPanelRemote.setBackground(Color.BLUE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(jTextFieldInput1Remote.getText());
        double num2 = Double.parseDouble(jTextFieldInput2Remote.getText());
        double result = num1 + num2;

        jLabelOutputRemote.setText("" + result);
    }





}
