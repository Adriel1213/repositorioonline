
package pedeidade;

import javax.swing.JOptionPane;


public class PedeIdade {

    public static void main(String[] args) {
        int idade;
        String nome;
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
        nome = JOptionPane.showInputDialog("Digite seu nome");
        JOptionPane.showMessageDialog(null, "Nome cadastrado: " + nome + "\nIdade cadastrada: " + idade);
    }
    
}
