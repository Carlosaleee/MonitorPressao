package Telas;


    public class Registro {
        
        private String data;
        private String hora;
        private int pressaoSistolica;
        private int pressaoDistolica;
        private boolean nivelPressao;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getPressaoSistolica() {
        return pressaoSistolica;
    }

    public void setPressaoSistolica(int pressaoSistolica) {
        this.pressaoSistolica = pressaoSistolica;
    }

    public int getPressaoDistolica() {
        return pressaoDistolica;
    }

    public void setPressaoDistolica(int pressaoDistolica) {
        this.pressaoDistolica = pressaoDistolica;
    }

    public boolean isNivelPressao() {
        return nivelPressao;
    }

    public void setNivelPressao(boolean nivelPressao) {
        this.nivelPressao = nivelPressao;
    }
        
    
}
