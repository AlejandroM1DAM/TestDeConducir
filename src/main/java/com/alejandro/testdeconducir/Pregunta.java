package com.alejandro.testdeconducir;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author Alejandro
 */
public class Pregunta {
    
    private String pregunta,resp1,resp2,resp3,respCorrecta;
    //private boolean correcto = false;    

    public String getRespCorrecta() {
        return respCorrecta;
    }

    public void setRespCorrecta(String respCorrecta) {
        this.respCorrecta = respCorrecta;
    }
    
    public Pregunta() {
        
    }
    public Pregunta(String pregunta,String resp1,String resp2,String resp3,String respCorrecta){
        this.pregunta = pregunta;
        this.resp1 = resp1;
        this.resp2 = resp2;
        this.resp3 = resp3;
    }
    
    public String getPregunta() {
       
        return pregunta;
    }
    
    public String getRespuesta1() {
        return resp1;
    }
    
    public String getRespuesta2() {
        return resp2;
    }
    
    public String getRespuesta3() {
        return resp3;
    }
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public void setResp1(String resp1) {
        this.resp1 = resp1;
    }

    public void setResp2(String resp2) {
        this.resp2 = resp2;
    }

    public void setResp3(String resp3) {
        this.resp3 = resp3;
    }
    
}
