/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categorias;

/*
Graduação
Especialização
Mestrado
Doutorado
/**
 *
 * @author Junior
 */
public enum Tipo {
    GRADUAÇAO("Graduação"),
    ESPECIALIZAÇÃO("Especialização"),
    MESTRADO("Mestrado"),
    DOUTORADO("Doutorado");

    private final String tipo;

    /**
     *
     * @param tipo
     */
    private Tipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     *
     * @return Tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo
     * @return
     */
    public static Tipo verificarTipo(String tipo) {
        if (Tipo.DOUTORADO.getTipo().equals(tipo)) {
            return Tipo.DOUTORADO;
        } else if (Tipo.ESPECIALIZAÇÃO.getTipo().equals(tipo)) {
            return Tipo.ESPECIALIZAÇÃO;
        } else if (Tipo.MESTRADO.getTipo().equals(tipo)) {
            return Tipo.MESTRADO;
        } else if (Tipo.GRADUAÇAO.getTipo().equals(tipo)) {
            return Tipo.GRADUAÇAO;
        } else {
            return null;
        }
    }
}
