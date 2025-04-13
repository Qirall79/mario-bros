package org.mario.game;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;

import org.mario.utils.Utils;

import java.awt.KeyboardFocusManager;
import java.awt.event.*;
import java.net.URL;

class KeyEventListener implements KeyListener {
	@Override
	public void keyPressed(KeyEvent e) {
		System.err.println(e.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.err.println(e.getKeyChar());
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.err.println(e.getKeyChar());
	}
}

public class Game {
	public static final int HEIGHT = 720;
	public static final int WIDTH = 1280;
	JFrame f;
	KeyboardFocusManager manager;

	public void init() {
		f = new JFrame("Super Mario");
		manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();

		f.setSize(WIDTH, HEIGHT);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);

		GamePanel gamePanel = new GamePanel();
		f.add(gamePanel);
		f.pack();
		f.setVisible(true);
	}

	public void display() {
	}

	public void start() {
		System.out.println("Game started...");
	}
}
