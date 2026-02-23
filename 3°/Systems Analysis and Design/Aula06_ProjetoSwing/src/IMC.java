import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarOutputStream;

public class IMC extends JFrame{
    private JPanel Principal;
    private JTextField TF_Peso;
    private JTextField TF_Altura;
    private JButton calcularButton;
    private JButton limparCamposButton;
    private JTextField TF_IMC;
    private JTextField TF_Classificacao;

    public IMC(){
        setContentPane(Principal);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 550);
        setTitle("Calculadora de IMC");
        setLocationRelativeTo(null);
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //inplementar um try catch com NumberFormatException ex

                try{    //parte verdadeira
                    double peso = Double.parseDouble(TF_Peso.getText());
                    double altura = Double.parseDouble(TF_Altura.getText());
                    double imc = 0;

                    if(peso > 0 && altura > 0){

                        if(altura>30)
                            altura = altura /100;

                        imc = peso / (altura * altura);


                        //TF_IMC.setText(String.valueOf(imc));
                        TF_IMC.setText(String.valueOf(String.format("%.2f", imc)));
                    }else{
                        JOptionPane.showMessageDialog(null,"Peso e Altura devem ser maiores que Zero");
                    }

                    classificacao(imc);

                }catch (NumberFormatException ex){  //parta falsa, onde ocorre o erro
                    JOptionPane.showMessageDialog(null, "peso e Altura devem ser números");
                }
            }
        });
        limparCamposButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TF_Altura.setText("");
                TF_Peso.setText("");
                TF_IMC.setText("");
                TF_Classificacao.setText("");
            }
        });
    }
    public void classificacao(Double imc){
        if (imc < 18.5) TF_Classificacao.setText("Abaixo do peso");
        else if (imc < 24.9) TF_Classificacao.setText("Peso normal");
        else if (imc < 29.9) TF_Classificacao.setText("Sobrepeso");
        else if (imc < 34.9) TF_Classificacao.setText("Obesidade grau 1");
        else if (imc < 39.9) TF_Classificacao.setText("Obesidade grau 2");
        else TF_Classificacao.setText("Obesidade grau 3 (severa)");
    }
}

