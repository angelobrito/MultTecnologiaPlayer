package uk.co.caprica.vlcjplayer.view.main;

import static uk.co.caprica.vlcjplayer.Application.application;

import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.JPanel;

import uk.co.caprica.vlcjplayer.view.image.ImagePane;

final class VideoContentPane extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = -6221988282365733223L;

	private static final String NAME_DEFAULT = "default";

    private static final String NAME_VIDEO = "video";

    private final CardLayout cardLayout;
    
    private final ImagePane  videoBackground;

    VideoContentPane() {
        cardLayout = new CardLayout();
        setLayout(cardLayout);
        this.setBackground(Color.WHITE);
        
        videoBackground = new ImagePane(
        		ImagePane.Mode.CENTER, 
				getClass().getResource("/MultTecnologia-logo-name.png"), 
				0.3f); 
        videoBackground.setBackground(Color.WHITE);
        
        add(videoBackground, NAME_DEFAULT);
        add(application().mediaPlayerComponent(), NAME_VIDEO);
    }

    public void showDefault() {
        cardLayout.show(this, NAME_DEFAULT);
    }

    public void showVideo() {
        cardLayout.show(this, NAME_VIDEO);
    }
}
