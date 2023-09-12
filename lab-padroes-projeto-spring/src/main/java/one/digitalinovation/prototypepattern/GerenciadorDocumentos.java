package one.digitalinovation.prototypepattern;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class GerenciadorDocumentos {
    private Map<String, Documento> documentos = new HashMap<>();

    public void adicionarDocumento(String chave, Documento documento) {
        documentos.put(chave, documento);
    }

    public Documento clonarDocumento(String chave) {
        try {
            return documentos.get(chave).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
