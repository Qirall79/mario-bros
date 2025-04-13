package org.mario.game;

import java.awt.*;
import javax.swing.*;

public class GamePanel extends JPanel {
	public GamePanel() {
		setPreferredSize(new Dimension(Game.WIDTH, Game.HEIGHT));
		setBackground(Color.blue);
	}
}
