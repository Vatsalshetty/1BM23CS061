import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivisionApp extends JFrame implements ActionListener
{
    private JTextField num1Field, num2Field, resultField; 
    private JButton DivisionAppdeButton;

    public DivisionApp()
    {
        setTitle("Integer DivisionAppsion App");
        setLayout(new FlowLayout());
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      
        JLabel nameLabel = new JLabel("B VATSAL");
        JLabel usnLabel = new JLabel("1BM23CS061");

        JLabel num1Label = new JLabel("Num1:");
        num1Field = new JTextField(10);
        JLabel num2Label = new JLabel("Num2:");
        num2Field = new JTextField(10);
        JLabel resultLabel = new JLabel("Result:");
        resultField = new JTextField(10);
        resultField.setEditable(false);
        DivisionAppdeButton = new JButton("Divide");

       
        add(nameLabel);
        add(usnLabel);
        add(num1Label);
        add(num1Field);
        add(num2Label);
        add(num2Field);
        add(DivisionAppdeButton);
        add(resultLabel);
        add(resultField);

        DivisionAppdeButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        try
        {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());
            int result = num1 / num2;
            resultField.setText(String.valueOf(result));
        }
        catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(
                this,
                "Please enter valid integers.",
                "Input Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
        catch (ArithmeticException ex)
        {
            JOptionPane.showMessageDialog(
                this,
                "DivisionAppsion by zero is not allowed.",
                "Arithmetic Error",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public static void main(String[] args)
    {
        DivisionApp app = new DivisionApp();
        app.setVisible(true);
    }
}