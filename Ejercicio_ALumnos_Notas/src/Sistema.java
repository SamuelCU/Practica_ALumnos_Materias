public class Sistema {
    public int CI;
    public String nombres;
    public  String apellidos;

    public String materia;

    public Sistema(int CI) {
        this.CI = CI;
    }

    public int getCI() {
        return CI;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getMateria() {
        return materia;
    }


    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }


    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }



    public int nota1;
    public int nota2;
    public double calcularPromedio() {
        return (double) (getNota1() + getNota2() ) / 2;
    }
    public boolean quedoEnSupletoria() {
        return calcularPromedio() < 14;
    }

}
