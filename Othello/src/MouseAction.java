// Tyrone Cheng
// 4 March 2004
// Description: Othello project

import java.awt.*;
import java.awt.event.*;

public interface MouseAction extends MouseListener
	{
	public void mouseClicked( MouseEvent e );
	public void mouseEntered( MouseEvent e );
	public void mouseExited( MouseEvent e );
	}