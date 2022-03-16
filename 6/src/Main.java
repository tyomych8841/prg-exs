import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main{
	private static JFrame jf;
	private static JPanel jp;
	private static JButton jb;
	private static JTextArea jta;
	public static void main(String[] args){
		jf = new JFrame("dsadasd");
		jp = new JPanel(new FlowLayout(FlowLayout.LEFT));
		jta = new JTextArea();
		jb = new JButton("Получить поздравление");
		jb.addActionListener(listener->{
			try{
			if(checkBday()){
			jta.setText("Поздравляю с днем рождения!" + "\n" + "Желаем здоровья и счастья");
			}else{
				jta.setText("Привет" + "\n" + "Приходи в следующий раз");
			}
			
			}catch(ParseException e){
				e.printStackTrace();
			}
		});
		jp.add(jb);
		jp.add(jta);
		jf.setContentPane(jp);
		jf.setBounds(600, 200, 200, 480);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
	private static boolean checkBday() throws ParseException{
		Date bDay = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		bDay = sdf.parse("2022-03-26");
		Date cDate = new Date();
		System.out.println(bDay + "\n" + cDate);
		boolean isMonthEquals = cDate.getMonth() == bDay.getMonth();
		boolean isDayEquals = cDate.getDay() == bDay.getDay();
		
		boolean fff = isDayEquals && isMonthEquals;
//		System.out.println(fff + "\n" + cDate.getMonth() + "\n" + bDay.getMonth() + "\n" + cDate.getDay() + "\n" + bDay.getDay());
//		System.out.println((cDate.getMonth() == bDay.getMonth()) + "\n" + (cDate.getDay() == bDay.getDay()));
		return fff;
	}
}
