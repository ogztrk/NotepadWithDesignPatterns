package project;

import static project.NewJFrame.textArea;

/**
 *
 
 */
public class GeriAll {
    // Geri alma fonksiyonu
     public void SonHarfiSil(){
        String temp=textArea.getText();
        int L = temp.length();
        if(L>1) textArea.setText(temp.substring(0,L-1));
        
        
    }
    
}
