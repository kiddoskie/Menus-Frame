
package za.ac.tut.ui;

/**
 *
 * @author Mercy
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class TipCalculatorLibrary extends JFrame {

    // --- Panels ---
    private JPanel mainContentPanel; 
    private JPanel headingPanel;     
    private JPanel billAmountPanel;  
    private JPanel tipSliderPanel;   
    private JPanel tipToLeavePanel;  

    // --- Labels ---
    private JLabel headingLabel;
    private JLabel billAmountLabel;
    private JLabel tipPercentageLabel;
    private JLabel tipToLeaveLabel;

    // --- Text Fields ---
    private JTextField billAmountTxtFld;
    private JTextField tipToLeaveTxtFld;

    // --- Slider ---
    private JSlider tipSlider;

    // --- Variables for Calculation ---
    private double billAmount = 0.0;
    private int tipPercentage = 25; 

    public TipCalculatorLibrary() {
        // --- Frame Configuration ---
        setTitle("Tip Calculator");
        setSize(550, 350); 
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

        // --- Main Content Panel  ---
        mainContentPanel = new JPanel(new BorderLayout(0, 15)); 
        mainContentPanel.setBackground(Color.WHITE);
        
        // --- Heading Panel ---
        headingPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headingPanel.setBackground(Color.WHITE);
        headingLabel = new JLabel("Javascript Slider Calculator");
        headingLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        headingLabel.setForeground(Color.BLACK);
        headingPanel.add(headingLabel);

        // --- Bill Amount Panel ---
        billAmountPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0)); // Horizontal gap, no vertical gap
        billAmountPanel.setBackground(Color.WHITE);
        billAmountLabel = new JLabel("Enter The Bill Amount For Your Meal: $");
        billAmountLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        billAmountTxtFld = new JTextField(10); 
        billAmountTxtFld.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        billAmountTxtFld.setText("0.00"); 
        
        billAmountPanel.add(billAmountLabel);
        billAmountPanel.add(billAmountTxtFld);

        // --- Tip Slider Panel ---
        tipSliderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 0));
        tipSliderPanel.setBackground(Color.WHITE);
        tipPercentageLabel = new JLabel("Tip Amount: " + tipPercentage + "%");
        tipPercentageLabel.setFont(new Font("Segoe UI", Font.PLAIN, 14));

        tipSlider = new JSlider(SwingConstants.HORIZONTAL, 0, 100, tipPercentage); 
        tipSlider.setPreferredSize(new Dimension(200, tipSlider.getPreferredSize().height)); 
        tipSlider.setBackground(Color.WHITE);
        tipSlider.setMajorTickSpacing(25);
        tipSlider.setMinorTickSpacing(5);
        tipSlider.setPaintTicks(true);
        tipSlider.setPaintLabels(true);


        tipSliderPanel.add(tipPercentageLabel);
        tipSliderPanel.add(tipSlider);

        // --- Tip To Leave Panel ---
        tipToLeavePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        tipToLeavePanel.setBackground(Color.WHITE);
        tipToLeaveLabel = new JLabel("Tip To Leave: ");
        tipToLeaveLabel.setFont(new Font("Segoe UI", Font.BOLD, 18)); 
        tipToLeaveTxtFld = new JTextField(10); 
        tipToLeaveTxtFld.setPreferredSize(new Dimension(tipToLeaveTxtFld.getPreferredSize().width, 30));
        tipToLeaveTxtFld.setEditable(false); 
        tipToLeaveTxtFld.setBackground(Color.WHITE); 
        tipToLeaveTxtFld.setFont(new Font("Segoe UI", Font.BOLD, 18));
        tipToLeaveTxtFld.setForeground(Color.BLACK);

        tipToLeavePanel.add(tipToLeaveLabel);
        tipToLeavePanel.add(tipToLeaveTxtFld);

        // --- Assemble Main Content Panel ---
        mainContentPanel.add(headingPanel, BorderLayout.NORTH);
        
        
        JPanel centralPanel = new JPanel(new GridLayout(3, 1, 0, 15)); 
        centralPanel.setBackground(Color.WHITE);
        centralPanel.add(billAmountPanel);
        centralPanel.add(tipSliderPanel);
        centralPanel.add(tipToLeavePanel);
        
        mainContentPanel.add(centralPanel, BorderLayout.CENTER);

        // --- Add Main Content Panel to Frame ---
        JPanel frameContentPane = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 30)); 
        frameContentPane.setBackground(new Color(240, 240, 240));
        frameContentPane.add(mainContentPanel);
        add(frameContentPane);

        //pack
        pack();
        
        // --- Final Frame Visibility ---
        setVisible(true);
    }
    
}
