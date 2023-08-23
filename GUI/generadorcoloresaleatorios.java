import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeneradorColoresAleatorios extends JFrame implements ActionListener {

    private JButton generateButton;
    private JPanel colorPanel;

    public GeneradorColoresAleatorios() {
        setTitle("Generador de Colores Aleatorios");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);

        generateButton = new JButton("Generar Color");
        colorPanel = new JPanel();

        // Agregar el ActionListener para manejar los eventos del botón
        generateButton.addActionListener(this);

        // Configurar el diseño de la interfaz gráfica
        setLayout(new BorderLayout());
        add(generateButton, BorderLayout.NORTH);
        add(colorPanel, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == generateButton) {
            // Generar valores aleatorios para los componentes de color (rojo, verde y azul)
            int red = (int) (Math.random() * 256);
            int green = (int) (Math.random() * 256);
            int blue = (int) (Math.random() * 256);

            // Crear un objeto Color con los valores generados
            Color randomColor = new Color(red, green, blue);

            // Establecer el color de fondo del panel con el color generado
            colorPanel.setBackground(randomColor);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GeneradorColoresAleatorios gui = new GeneradorColoresAleatorios();
                gui.setVisible(true);
            }
        });
    }
}
