//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Club club1 = new Club();
    Presidente presidente1 = new Presidente();
    presidente1.setCodigo("20203732");
    presidente1.setNombre("julio");
    club1.setNombre("fibra toxica");
    club1.setTipo("facultad");
    club1.setPresidente(presidente1);

    ArrayList eventos = new ArrayList();

    Evento evento1 = new Evento();
    evento1.setFecha("20/4/26");
    evento1.setNombre("fiesta 1");
    evento1.setCant_asist(35);

    Evento evento2 = new Evento();
    evento2.setFecha("25/6/26");
    evento2.setNombre("fiesta 2");
    evento2.setCant_asist(50);
    eventos.add(evento1);
    eventos.add(evento2);
    club1.imprimir();



}
