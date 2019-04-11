
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class mainFrame {

	public static void main(String[] args) {
		Addmouse jframe = new Addmouse("GUI console");
		
		//設定視窗大小
		jframe.setSize(800, 800);
		//設定起始位置
		jframe.setLocation(0, 0);
		//視窗可以看見，未設定僅會在背景執行
		jframe.setVisible(true);
		

	}

}

class shapes{
	public shapes() {
		// TODO Auto-generated constructor stub
	}
}

class drawPanel extends JPanel{
	public drawPanel() {
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<shapes> al;
	
	public void gogoPaintLine(Graphics g) {

		Graphics2D g2d = (Graphics2D) g;
		
		//g2d.drawOval(x, y, width, height);
		
        g2d.setPaint(Color.blue);

        g2d.drawLine(100, 100, 150, 150);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		gogoPaintLine(g);
	}
	
}

class Addmouse extends JFrame{

	public Addmouse(String frame_name) {
		super(frame_name);
		
		panel_button.setLayout(new GridLayout(0, 1));
		//panel_button.setSize(500, 500);//.setBounds(0, 0, 300, 300);//
		panel_draw.setSize(500, 500);//.setBounds(500, 500, 200, 200);//.setSize(300, 300);
		
		
		panel_button.setBorder(BorderFactory.createLineBorder(Color.black));
		panel_draw.setBorder(BorderFactory.createLineBorder(Color.black));
		
		getContentPane().setLayout(new GridLayout());
		getContentPane().add(panel_button);//, BorderLayout.WEST);
		getContentPane().add(panel_draw);//, BorderLayout.CENTER);
		//add(panel_all);
		
		/*button01.setSize(300, 100);
		button02.setSize(300, 100);
		button03.setSize(300, 100);
		button04.setSize(300, 100);
		button05.setSize(300, 100);*/
		
		//設定button image
		button01.setIcon(img01);
		button02.setIcon(img02);
		button03.setIcon(img03);
		button04.setIcon(img04);
		button05.setIcon(img05);
		button06.setIcon(img06);
		
		panel_button.add(button01);
		panel_button.add(button02);
		panel_button.add(button03);
		panel_button.add(button04);
		panel_button.add(button05);
		panel_button.add(button06);
		panel_draw.addMouseListener(new mouseListener_draw(panel_draw));
		
		button01.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				select_state = 1;
				System.out.println(select_state);
				
			}
		});
		button02.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				select_state = 2;
				System.out.println(select_state);
			}
		});
		button03.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				select_state = 3;
				System.out.println(select_state);
			}
		});
		button04.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				select_state = 4;
				System.out.println(select_state);
			}	
		});
		button05.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				select_state = 5;
				System.out.println(select_state);
			}	
		});
		button06.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				select_state = 6;
				System.out.println(select_state);
			}	
		});

	}
	
	//選擇狀態
	public int select_state=0;	
	
	//UI固定物件
	JPanel panel_draw = new drawPanel();
	JPanel panel_button = new JPanel();
	JButton button01 = new JButton();
	JButton button02 = new JButton();
	JButton button03 = new JButton();
	JButton button04 = new JButton();
	JButton button05 = new JButton();
	JButton button06 = new JButton();
	//放上圖片
	ImageIcon img01 = new ImageIcon(getClass().getResource("/image/select.PNG"));
	ImageIcon img02 = new ImageIcon(getClass().getResource("/image/association_line.PNG"));
	ImageIcon img03 = new ImageIcon(getClass().getResource("/image/generalization_line.PNG"));
	ImageIcon img04 = new ImageIcon(getClass().getResource("/image/composition_line.PNG"));
	ImageIcon img05 = new ImageIcon(getClass().getResource("/image/class.PNG"));
	ImageIcon img06 = new ImageIcon(getClass().getResource("/image/use_case.PNG"));
	
	
	JSplitPane panel_all = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel_button, panel_draw);
	static final long serialVersionUID=0;
	
	
}

class mouseListener_draw implements MouseListener{
	public mouseListener_draw(JPanel panel) {
		this.panel=panel;
	}

	
	JPanel panel;
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseClicked");
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("mouseEntered");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
