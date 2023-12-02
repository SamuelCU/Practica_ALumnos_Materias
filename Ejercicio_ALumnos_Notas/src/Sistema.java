class Sistema {
    private int ci;
    private String nombres;
    private String apellidos;
    private String materia;
    private double nota1;
    private double nota2;

    public Sistema(int ci) {
        this.ci = ci;
    }

    public int getCi() {
        return ci;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double calcularPromedio() {
        return (nota1 + nota2) / 2.0;
    }
}