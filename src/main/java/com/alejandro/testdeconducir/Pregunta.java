package com.alejandro.testdeconducir;

import java.util.ArrayList;
import java.util.Collections;

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
    private static ArrayList<String> respuestas = new ArrayList<>();
    
    public Pregunta() {
        
    }
    public Pregunta(String pregunta,String resp1,String resp2,String resp3,String respCorrecta){
        this.pregunta = pregunta;
        this.resp1 = resp1;
        this.resp2 = resp2;
        this.resp3 = resp3;
        this.respuestas.add(resp1);
        this.respuestas.add(resp2);
        this.respuestas.add(resp3);
    }

    public static ArrayList<String> getRespuestas() {        
        Collections.shuffle(respuestas);
        return respuestas;
    }

    public void setRespuestas(ArrayList<String> respuestas) {
        this.respuestas = respuestas;
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
    public String getRespCorrecta() {
        return respCorrecta;
    }

    public void setRespCorrecta(String respCorrecta) {
        this.respCorrecta = respCorrecta;
    }
}
