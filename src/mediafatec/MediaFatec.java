
package mediafatec;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class MediaFatec {
    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;   
    
    
    public void setNome(){  
        do{
            nome = JOptionPane.showInputDialog("Digite o nome do Aluno: ");
        }while(nome.isEmpty());
    }

    public void setNota1(){
        do{
            nota1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a primeira Nota: "));
            if (nota1<0){
                JOptionPane.showMessageDialog(null,"Nota inválida, digite novamente a nota.");
            }else if(nota1 > 10){
                JOptionPane.showMessageDialog(null,"Nota inválida, digite novamente a nota.");
            }
        }while ((nota1 <0)||(nota1 > 10));
    }
    
    public void setNota2(){
        do {
            nota2 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a segunda nota"));
            if (nota2<0){
                JOptionPane.showMessageDialog(null,"Nota inválida, digite novamente a nota.");
            }else if(nota2 > 10){
                JOptionPane.showMessageDialog(null,"Nota inválida, digite novamente a nota.");
            }
        }while((nota2 < 0)||(nota2 > 10));
    }
    
    public void setNota3(){
        do {
            nota3 = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a terceira nota"));
            if (nota3<0){
                JOptionPane.showMessageDialog(null,"Nota inválida, digite novamente a nota.");
            }else if(nota3 > 10){
                JOptionPane.showMessageDialog(null,"Nota inválida, digite novamente a nota.");
            }
        }while((nota3 < 0)||(nota3 > 10));
    }
    public void CalculaMedia(){
        
        media = (nota1+nota2+nota3)/3;
        DecimalFormat df = new DecimalFormat();
        df.format(media);
        JOptionPane.showMessageDialog(null,"O aluno " + nome + ", teve uma média de: " + media);
        if (media < 6.0){
            JOptionPane.showMessageDialog(null,"Aluno Reprovado!");
        }else{
            JOptionPane.showMessageDialog(null,"Aluno Aprovado!");
        }
          
    }
}
