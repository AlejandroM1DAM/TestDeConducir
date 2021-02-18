package com.alejandro.testdeconducir;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedReader;
import java.io.FileReader;

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
    
    
    public void next() {
    
        //BufferedReader br = new BufferedReader(new FileReader());
        try {
            // create object mapper instance
            ObjectMapper mapper = new ObjectMapper();

            // convert JSON array to list of books
            List<Book> books = Arrays.asList(mapper.readValue(Paths.get("books.json").toFile(), Book[].class));

            // print books
            books.forEach(System.out::println);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    
    }
}
