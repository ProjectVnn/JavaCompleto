package excecao.personalizadaB;


public class NumeroNegativoException extends RuntimeException{


    private String nomeDoAtributo;
    public NumeroNegativoException (String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getmessage(){
        return String.format
                ("O atributo $s está negativo", nomeDoAtributo);
    }
}
