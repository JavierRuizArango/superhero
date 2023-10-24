
class SuperHero extends Hero implements interfaz {
    String nombreHeroe;
    int edad;
    String velocidad;
    String debilidad;
    boolean usaTraje;
    String enemigo;

    public SuperHero(int salud, int energia) {
        super(salud, energia);
    }

    public String getNombreHeroe() {
        return nombreHeroe;
    }

    public void setNombreHeroe(String nombreHeroe) {
        this.nombreHeroe = nombreHeroe;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public boolean isUsaTraje() {
        return usaTraje;
    }

    public void setUsaTraje(boolean usaTraje) {
        this.usaTraje = usaTraje;
    }

    public String getEnemigo() {
        return enemigo;
    }

    public void setEnemigo(String enemigo) {
        this.enemigo = enemigo;
    }

    public void Poder(int energiaActual) {
        this.correrRapido();
        this.respirarBajoAgua();
        this.regenerarse();
        this.visionLaser();
        this.superFuerza();
    }

    @Override
    public void correrRapido() {
        System.out.println("corre como el viento");
    }

    @Override
    public void respirarBajoAgua() {
        System.out.println("respira bajo el agua");
    }

    @Override
    public void regenerarse() {
        System.out.println("recupera sus extremidades");
    }

    @Override
    public void visionLaser() {
        System.out.println("derrite las cosas con mirarlas");
    }

    @Override
    public void superFuerza() {
        System.out.println("levanta cualquier cosa");
    }

    public void PoderLevantarTodo() {
        System.out.println("con la super fuerza alzo cualquier cosa");
    }

    public void hablaConLosPeces() {
        System.out.println("nada en el océano y habla con los peces");
    }

    public void inmortalidad() {
        System.out.println("multiplica sus partes luego de perderlas");
    }

    public void ataque(int saludTotal) {
        int verSalud = super.salud - saludTotal;
        System.out.println("la salud del héroe actual es " + verSalud);
    }

    public void energiaActual(int energia) {
        int verEnergia = super.energia - energia;
        System.out.println("la energía que tiene  es " + verEnergia);


    }
}

