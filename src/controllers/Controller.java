package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.Model;
import views.Views;

/**
 *
 * @author Lupita
 */
public class Controller implements ActionListener{
        private Model model;
    private Views view;
    
    public Controller(Model model, Views view){
        this.model = model;
        this.view = view;
        
        this.view.Jb_Calcular.addActionListener(this);
    }
    
    public void init_view(){
        this.view.setTitle("CALCULAR IMC");
        this.view.Jtf_Peso.setText(""+this.model.getPeso());
        this.view.Jtf_Altura.setText(""+this.model.getPeso());
        this.view.setLocationRelativeTo(null);
        this.view.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == this.view.Jb_Calcular){
            calcularimc();
        }
    }
    

    private void calcularimc() {
       
       this.model.setAltura(Double.parseDouble(this.view.Jtf_Altura.getText()));
       this.model.setPeso(Double.parseDouble(this.view.Jtf_Peso.getText()));
       
       JOptionPane.showMessageDialog(null,"LA MASA CORPORAL ES: "+ this.model.calcular());
       
    }
}
