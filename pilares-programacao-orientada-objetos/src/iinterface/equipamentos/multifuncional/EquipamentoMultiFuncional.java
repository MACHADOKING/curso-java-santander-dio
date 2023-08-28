package iinterface.equipamentos.multifuncional;

import iinterface.equipamentos.copiadora.Copiadora;
import iinterface.equipamentos.digitalizadora.Digitalizadora;
import iinterface.equipamentos.impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora, Digitalizadora, Impressora  {
    public void copiar() {
        System.out.println("COPIANDO via multifuncional");
    }
    public void digitalizar() {
        System.out.println("DIGITALIZANDO via multifuncional");
    }
    public void imprimir() {
        System.out.println("IMPRIMINDO via multifuncional");
    }
}
