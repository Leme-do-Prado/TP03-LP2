import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Form extends Frame implements ActionListener {
	TextField  tfa = new TextField(), tfb = new TextField(), tfsoma = new TextField(), tfsubtracao = new TextField(), tfmultiplicacao = new TextField(), tfdivisao = new TextField();
	Label lbla = new Label("A: "), lblb = new Label("B: "), lblsoma = new Label("Soma: "), lblsubtracao = new Label("Subtracao: "), lblmultiplicacao = new Label("Multiplicação: "), lbldivisao = new Label("Divisão: ");
	Button l = new Button("Limpar"), c = new Button("Calcular"), s = new Button("Sair");
		
	Form(String titulo, int largura, int altura, int colinic, int lininic ){
		super(titulo);
		setSize(largura,altura);
		setLocation(colinic,lininic);
		setLayout(new FlowLayout());
		
		add(lbla);
		add(tfa);
		
		add(lblb);
		add(tfb);
		
		add(lblsoma);
		add(tfsoma);
		
		add(lblsubtracao);
		add(tfsubtracao);
		
		add(lblmultiplicacao);
		add(tfmultiplicacao);
		
		add(lbldivisao);
		add(tfdivisao);
		
		l.addActionListener(this);
		add(l);
		c.addActionListener(this);
		add(c);
		s.addActionListener(this);
		add(s);
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource()==l)
			{
				tfa.setText(" ");
				tfb.setText(" ");
				tfsoma.setText(" ");
				tfsubtracao.setText(" ");
				tfmultiplicacao.setText(" ");
				tfdivisao.setText(" ");
			} else if (e.getSource()==c) {
				int A = Integer.parseInt(tfa.getText());
				int B = Integer.parseInt(tfb.getText());
				tfsoma.setText(Integer.toString(A + B));
				tfsubtracao.setText(Integer.toString(A - B));
				tfmultiplicacao.setText(Integer.toString(A * B));
				tfdivisao.setText(Integer.toString(A / B));
			} else if(e.getSource() == s) {
				dispose(); 
				System.exit(0);
			}
		}
}
