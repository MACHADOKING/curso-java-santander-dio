package iinterface.estabelecimento;

import iinterface.equipamentos.copiadora.Copiadora;
import iinterface.equipamentos.digitalizadora.Digitalizadora;
import iinterface.equipamentos.digitalizadora.Scanner;
import iinterface.equipamentos.impressora.Deskjet;
import iinterface.equipamentos.impressora.Impressora;
import iinterface.equipamentos.impressora.Laserjet;
import iinterface.equipamentos.multifuncional.EquipamentoMultiFuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();

        Deskjet deskjet = new Deskjet();
        Scanner scanner = new Scanner();

        Impressora impressora = deskjet;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = em;


        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
