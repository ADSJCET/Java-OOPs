import java.awt.*;
import java.awt.event.*;
public class mouseMoveHandle extends Frame implements MouseListener, MouseMotionListener {
	Label label;
	public mouseMoveHandle(){
		setTitle("My Canvas");
		label = new Label();
		label.setText("Welcome to My Canvas");
		label.setBounds(8,30,500,20);
		add(label);
		
		addMouseListener(this);
		addMouseMotionListener(this);
		
		setSize(500, 500);
		setLayout(null);
		setVisible(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	public void mouseDragged(MouseEvent e) {
		label.setText("Mouse Dragged");
		setBackground(Color.lightGray);
	}
	public void mouseMoved(MouseEvent e) {
		label.setText("Mouse is Moving");	
		setBackground(Color.cyan);
	}
	public void mouseClicked(MouseEvent e) {
		label.setText("Mouse just Clicked");
		setBackground(Color.green);
		System.out.println("Mouse just Clicked");	
	}
	public void mousePressed(MouseEvent e) {
		label.setText("Mouse Key Long Pressed");
		setBackground(Color.blue);
		System.out.println("Mouse Key Long Pressed");	
	}
	public void mouseReleased(MouseEvent e) {
		label.setText("Mouse Key Released");
		setBackground(Color.black);
		System.out.println("Mouse Key Released");
	}
	public void mouseEntered(MouseEvent e) {
		label.setText("Mouse Entered the Canvas");
		setBackground(Color.red);
		System.out.println("Mouse Entered the Canvas");
	}
	public void mouseExited(MouseEvent e) {
		label.setText("Mouse Exited the Canvas");
		setBackground(Color.orange);
		System.out.println("Mouse Exited the Canvas");	
	}
	public static void main(String[] args) {
		new mouseMoveHandle();
	}
}

