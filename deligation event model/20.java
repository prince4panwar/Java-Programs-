
//Java Program to Validate the TextField for only entering email id using KeyAdapter
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 class EmailValidator {
    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
            + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    private static Pattern pattern = Pattern.compile(EMAIL_PATTERN);

    public static void main(String[] args) {
        final Frame frame = new Frame("Email Validator");
        final TextField textField = new TextField(20);
        textField.addKeyListener(new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                String text = textField.getText();
                Matcher matcher = pattern.matcher(text);
                if (matcher.matches()) {
                    textField.setBackground(Color.GREEN);
                } else {
                    textField.setBackground(Color.RED);
                }
            }
        });

        frame.add(textField);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
        frame.addWindowListener(new java.awt.event.WindowAdapter(){
            public void windowClosing( java.awt.event.WindowEvent e)
            {
                frame.dispose();
            }
        });
    }
}
