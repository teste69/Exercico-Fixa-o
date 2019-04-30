
public class FuncionarioV1 {
    double salario;
    String funcionario;
    String departamento;
    String rg; 
    boolean ativo=true;
    String entradaBanco;
    
    void bonifica(double aumento){
        salario = salario + (salario * aumento);
    }
void demite(){
        
    ativo = false;
        }
}
