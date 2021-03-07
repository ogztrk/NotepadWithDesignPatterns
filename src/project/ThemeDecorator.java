package project;

/**
 *
 
 */
public abstract class ThemeDecorator implements Theme {
    // Decorator pattern için thema'yı override eden decorator class'ı.
    protected Theme decoratedTheme;
    
    public ThemeDecorator(Theme decoratedTheme){
        this.decoratedTheme=decoratedTheme;
    }
    
    
    public void tema() {
        decoratedTheme.tema();
    }
    
}
