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
    
    private String pregunta,resp1,resp2,resp3;
    private String[] respuestas;
    private boolean correcto = false;
    
    public Pregunta() {
        
    }
    public Pregunta(String pregunta,String resp1,String resp2,String resp3){
        this.pregunta = pregunta;
        this.resp1 = resp1;
        this.resp2=resp2;
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
    
    public String[] getRespuestas() {
        return respuestas;
    }
    
    
    //*********************************************************************//
    public void setPregunta() {
        
    }
    
    public void setRespuesta1() {
    }
    
    public void setRespuesta2() {
    }
    
    public void setRespuesta3() {
    }
    
    public void setRespuestas() {
    }
    
    
    
}
