import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeneradorNumerosAleatorios extends JFrame implements ActionListener {

    private JLabel randomLabel;
    private JButton generateButton;

    public GeneradorNumerosAleatorios() {
        setTitle("Generador de Números Aleatorios");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        randomLabel = new JLabel("Presiona el botón para generar un número aleatorio.");
        generateButton = new JButton("Generar");

        // Agregar el ActionListener para manejar los eventos del botón
        generateButton.addActionListener(this);

        // Configurar el diseño de la interfaz gráfica
        setLayout(new BorderLayout());
        add(randomLabel, BorderLayout.CENTER);
        add(generateButton, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == generateButton) {
            // Generar un número aleatorio entre 1 y 100
            int randomNumber = (int) (Math.random() * 100) + 1;
            randomLabel.setText("Número aleatorio generado: " + randomNumber);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GeneradorNumerosAleatorios gui = new GeneradorNumerosAleatorios();
                gui.setVisible(true);
            }
        });
    }
}
