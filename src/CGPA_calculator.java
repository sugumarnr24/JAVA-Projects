import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;

public class CGPA_calculator {
    private JPanel CGPAcalculator;
    private JTextField Englishgrade;
    private JTextField Mathsgrade;
    private JTextField Javagrade;
    private JTextField Pythongrade;
    private JTextField Datagrade;
    private JTextField Englishmark;
    private JTextField Mathsmark;
    private JTextField Javamark;
    private JTextField Pythonmark;
    private JTextField Datamark;
    private JTextField Gpa;
    private JButton Calculate;
    private JTextField sem1;
    private JTextField sem2;
    private JTextField sem3;
    private JTextField sem4;
    private JTextField sem5;
    private JButton calculateButton;
    private JTextField cgpa;

    public Double Grade(String s){
        Double value;
        switch(s){
            case "O" :
                value= 10.0;
                break;
            case "A+":
                value=9.0;
                break;
            case "A":
                value = 8.0;
                break;
            case "B+":
                value = 7.0;
                break;
            case "B":
                value = 6.0;
                break;
            default:
                value=0.0;
                break;
        }
        return value;
    }

    public CGPA_calculator() {

        Calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Emark,Mmark,Jmark,Pmark,Dmark;
                String Egrade,Mgrade,Jgrade,Pgrade,Dgrade;
                Emark=Englishmark.getText();
                Mmark=Mathsmark.getText();
                Jmark=Javamark.getText();
                Pmark= Pythonmark.getText();
                Dmark= Datamark.getText();
                double enmark = Double.parseDouble(Emark);
                double mamark = Double.parseDouble(Mmark);
                double jamark = Double.parseDouble(Jmark);
                double pymark = Double.parseDouble(Pmark);
                double damark = Double.parseDouble(Dmark);
                double totalpoint=enmark+mamark+jamark+pymark+damark;
                Egrade=Englishgrade.getText();
                Mgrade=Mathsgrade.getText();
                Jgrade=Javagrade.getText();
                Pgrade= Pythongrade.getText();
                Dgrade= Datagrade.getText();

                double engrade = Grade(Egrade);
                double magrade = Grade(Mgrade);
                double jagrade = Grade(Jgrade);
                double pygrade = Grade(Pgrade);
                double dagrade = Grade(Dgrade);
                //System.out.println(engrade+magrade+jagrade+pygrade+dagrade);
                //System.out.println(totalpoint);
                double totalgrade = (engrade*enmark)+(magrade*mamark) +(jagrade*jamark) +(pygrade*pymark)+(damark*dagrade);
                double result = totalgrade /totalpoint;
                //System.out.println(totalgrade);

                Gpa.setText(String.valueOf(result));
            }
        });
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double sem1mark=Double.parseDouble(sem1.getText());
                double sem2mark=Double.parseDouble(sem2.getText());
                double sem3mark=Double.parseDouble(sem3.getText());
                double sem4mark=Double.parseDouble(sem4.getText());
                double sem5mark=Double.parseDouble(sem5.getText());

                double totalcgpa = (sem1mark+sem2mark+sem3mark+sem4mark+sem5mark)/5;
                cgpa.setText(String.valueOf(totalcgpa));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CGPA_calculator");
        frame.setContentPane(new CGPA_calculator().CGPAcalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

//    private void createUIComponents() {
//
//    }
}
