
//Java Program to Display Text in Different Fonts.

import java.awt.*;

class FontDemoAWT extends Frame {
    public FontDemoAWT() {
        setTitle("Font Demo");
        setSize(400, 300);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Set the font and draw text with different styles
        Font plainFont = new Font("Arial", Font.PLAIN, 20);
        Font boldFont = new Font("Times New Roman", Font.BOLD, 20);
        Font italicFont = new Font("Courier New", Font.ITALIC, 20);

        g.setFont(plainFont);
        drawText(g, "Plain Text", 20, 30);

        g.setFont(boldFont);
        drawText(g, "Bold Text", 20, 60);

        g.setFont(italicFont);
        drawText(g, "Italic Text", 20, 90);

        // Draw underlined and strikethrough text
        drawUnderlineText(g, plainFont, "Underlined Text", 20, 120);

        drawStrikethroughText(g, plainFont, "Strikethrough Text", 20, 150);
    }

    private void drawText(Graphics g, String text, int x, int y) {
        g.drawString(text, x, y);
    }

    private void drawUnderlineText(Graphics g, Font font, String text, int x, int y) {
        FontMetrics metrics = g.getFontMetrics(font);
        int descent = metrics.getDescent();

        g.drawString(text, x, y);
        g.drawLine(x, y + descent + 1, x + metrics.stringWidth(text), y + descent + 1);
    }

    private void drawStrikethroughText(Graphics g, Font font, String text, int x, int y) {
        FontMetrics metrics = g.getFontMetrics(font);
        int ascent = metrics.getAscent();

        g.drawString(text, x, y);
        g.drawLine(x, y - ascent, x + metrics.stringWidth(text), y - ascent);
    }

    public static void main(String[] args) {
        new FontDemoAWT();
    }
}
