package project;

import static project.NewJFrame.textArea;

/**
 *

 */
public class LightThemeDecorator extends ThemeDecorator {
    //Aydınlık tema için görsel düzenlemeleri yapan class
    public LightThemeDecorator(Theme decoratedTheme) {
        super(decoratedTheme);
    }
    
    @Override
    public void tema(){
        decoratedTheme.tema();
        setLight(decoratedTheme);
    }
    private void setLight(Theme decoratedTheme){
        textArea.setBackground(new java.awt.Color(255, 255, 255));
        textArea.setForeground(new java.awt.Color(0, 0, 0));
        
    }
}
