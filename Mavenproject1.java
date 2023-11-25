// Definición de la clase Edificio
class Edificio {
    private String tipoDeEdificio;
    private double consumoAnualDeEnergia;

    public Edificio(String tipoDeEdificio, double consumoAnualDeEnergia) {
        this.tipoDeEdificio = tipoDeEdificio;
        this.consumoAnualDeEnergia = consumoAnualDeEnergia;
    }

    public String getTipoDeEdificio() {
        return tipoDeEdificio;
    }

    public double getConsumoAnualDeEnergia() {
        return consumoAnualDeEnergia;
    }
}

// Definición de la clase Auto
class Auto {
    private String tipoDeAuto;
    private double consumoAnualDeGasolina;

    public Auto(String tipoDeAuto, double consumoAnualDeGasolina) {
        this.tipoDeAuto = tipoDeAuto;
        this.consumoAnualDeGasolina = consumoAnualDeGasolina;
    }

    public String getTipoDeAuto() {
        return tipoDeAuto;
    }

    public double getConsumoAnualDeGasolina() {
        return consumoAnualDeGasolina;
    }
}

// Definición de la clase Bicicleta
class Bicicleta {
    private String tipoDeBicicleta;
    private int cantidadDeCambios;

    public Bicicleta(String tipoDeBicicleta, int cantidadDeCambios) {
        this.tipoDeBicicleta = tipoDeBicicleta;
        this.cantidadDeCambios = cantidadDeCambios;
    }

    public String getTipoDeBicicleta() {
        return tipoDeBicicleta;
    }

    public int getCantidadDeCambios() {
        return cantidadDeCambios;
    }
}

// Interfaz ImpactoEcologico
interface ImpactoEcologico {
    double obtenerImpactoEcologico();
}

// Implementación de la interfaz ImpactoEcologico en la clase Edificio
class EdificioImpactoEcologico implements ImpactoEcologico {
    private Edificio edificio;

    public EdificioImpactoEcologico(Edificio edificio) {
        this.edificio = edificio;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Cálculo del impacto ecológico del carbono
        // Este valor puede variar dependiendo de las emisiones del edificio
        return edificio.getConsumoAnualDeEnergia() * 0.00001;
    }
}

// Implementación de la interfaz ImpactoEcologico en la clase Auto
class AutoImpactoEcologico implements ImpactoEcologico {
    private Auto auto;

    public AutoImpactoEcologico(Auto auto) {
        this.auto = auto;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // Cálculo del impacto ecológico del carbono
        // Este valor puede variar dependiendo de las emisiones del auto
        return auto.getConsumoAnualDeGasolina() * 0.00001;
    }
}

// Implementación de la interfaz ImpactoEcologico en la clase Bicicleta
class BicicletaImpactoEcologico implements ImpactoEcologico {
    private Bicicleta bicicleta;

    public BicicletaImpactoEcologico(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    @Override
    public double obtenerImpactoEcologico() {
        // El impacto ecológico del carbono en una bicicleta es cero
        return 0;
    }
}

public class Mavenproject1 {
    public static void main(String[] args) {
        Edificio edificio = new Edificio("Casa", 5000);
        Auto auto = new Auto("Carro", 10000);
        Bicicleta bicicleta = new Bicicleta("Montaña", 1);

        EdificioImpactoEcologico edificioImpactoEcologico = new EdificioImpactoEcologico(edificio);
        AutoImpactoEcologico autoImpactoEcologico = new AutoImpactoEcologico(auto);
        BicicletaImpactoEcologico bicicletaImpactoEcologico = new BicicletaImpactoEcologico(bicicleta);

        System.out.println("Impacto ecológico del edificio: " + edificioImpactoEcologico.obtenerImpactoEcologico());
        System.out.println("Impacto ecológico del auto: " + autoImpactoEcologico.obtenerImpactoEcologico());
        System.out.println("Impacto ecológico de la bicicleta: " + bicicletaImpactoEcologico.obtenerImpactoEcologico());
    }

}
