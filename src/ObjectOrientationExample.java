public class ObjectOrientationExample {
    public String forma = "cilindrica";
    public String material = "Latex";
    public Double diametro = 7.2;
    public String escala_or_unit = "cm";
    public Double tamanho = 20.;

    public boolean isOn = false;

    public Integer battery = 80;

    public ObjectOrientationExample(){}

    public ObjectOrientationExample(String forma, String material){
        this.forma = forma;
        this.material = material;
    }


    public void about(){
        System.out.println("Este mangalho do tipo " + forma + " tem " + tamanho + escala_or_unit);
    }


    public String getForma(){
        return forma;
    }

    public void setForma(String forma){
        this.forma = forma;
    }

    public static void exists(){
        System.out.println("Sim, esse objeto existe");
    }
}
