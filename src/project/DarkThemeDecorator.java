package project;

import static project.NewJFrame.textArea;

/**
 *

 */
public class DarkThemeDecorator extends ThemeDecorator {
    // Karanlık tema için görsel düzenlemeleri yapan class
    public DarkThemeDecorator(Theme decoratedTheme) {
        super(decoratedTheme);
    }
    @Override
    public void tema(){
        decoratedTheme.tema();
        setDark(decoratedTheme);
    }
    private void setDark(Theme decoratedTheme){
        textArea.setBackground(new java.awt.Color(0, 0, 0));
        textArea.setForeground(new java.awt.Color(255, 255, 255));
        
        
        
    }
}
