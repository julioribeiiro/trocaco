/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.time.LocalDateTime;

/**
 *
 * @author julioribeiro
 */
public class Botao {
    private int tag;
    private int num;
    private String data; 
    
    public Botao(){
        
    }
    
    public Botao(int tag, int num, String data){
        this.tag = tag;
        this.num = num;
        this.data = data;
    }

    public int getTag() {
        return tag;
    }

    public void setTag(int tag) {
        this.tag = tag;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    
    
}
