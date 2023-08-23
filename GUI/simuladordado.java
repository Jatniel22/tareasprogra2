import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimuladorDado extends JFrame implements ActionListener {

    private JButton rollButton;
    private JLabel resultLabel;

    public SimuladorDado() {
        setTitle("Simulador de Dado");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 150);
        setLocationRelativeTo(null);

        rollButton = new JButton("Lanzar Dado");
        resultLabel = new JLabel("Presiona el botón para lanzar el dado.");

        // Agregar el ActionListener para manejar los eventos del botón
        rollButton.addActionListener(this);

        // Configurar el diseño de la interfaz gráfica
        setLayout(new BorderLayout());
        add(resultLabel, BorderLayout.CENTER);
        add(rollButton, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rollButton) {
            // Generar un número aleatorio entre 1 y 6 (simulando el lanzamiento del dado)
            int randomNumber = (int) (Math.random() * 6) + 1;
            resultLabel.setText("Resultado del dado: " + randomNumber);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SimuladorDado gui = new SimuladorDado();
                gui.setVisible(true);
            }
        });
    }
}
