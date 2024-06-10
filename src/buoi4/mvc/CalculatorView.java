package buoi4.mvc;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import buoi4.mvc.observer.Subcriber;

public class CalculatorView extends JFrame implements Subcriber {

    // field
    private String title;
    private JPanel jPanelRemote;
    private JLabel jLabelInput1Remote, jLabelInput2Remote,
            jLabelOutputRemote;
    private JTextField jTextFieldInput1Remote, jTextFieldInput2Remote;
    private JButton addButtonRemote, subButtonRemote, mulButtonRemote, divButtonRemote;
    private CalculatorModel calculatorModelRemote;
    private CalculatorControl calculatorControlRemote = new CalculatorControl();

    public CalculatorControl getCalculatorControlRemote() {
        return calculatorControlRemote;
    }
   
    // function , method
    CalculatorView() {
        calculatorModelRemote = new CalculatorModel();
        calculatorModelRemote.subcribe(this);//dang ky subcriber voi publisher

        buildPanel();
        add(jPanelRemote);
        title = "Frame Viewer";
        setTitle(title);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

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
        addButtonRemote.addActionListener(calculatorControlRemote);// Remote của CalculatorWindow
        jPanelRemote.add(addButtonRemote);
        subButtonRemote = new JButton("SUB");
        jPanelRemote.add(subButtonRemote);
        //subButtonRemote.addActionListener(this);

        // jPanelRemote.setBackground(Color.BLUE);

    }

    class CalculatorControl implements ActionListener {
        //private CalculatorModel calculatorEntityRemote =null;
        public CalculatorControl() {
        }
       
        @Override
        public void actionPerformed(ActionEvent e) {
    
            String command = e.getActionCommand();
            double num1 = Double.parseDouble(jTextFieldInput1Remote.getText());
            double num2 = Double.parseDouble(jTextFieldInput2Remote.getText());
            
            if (command.equals("ADD")) {
                calculatorModelRemote.add(num1, num2);
    
            }else if(command.equals("SUB")){
                calculatorModelRemote.sub(num1, num2);
    
            }
    
        }
    
    }

    @Override
    public void update() {
        jLabelOutputRemote.setText(""+calculatorModelRemote.getResult());
    }

}