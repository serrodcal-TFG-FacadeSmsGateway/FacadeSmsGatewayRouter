/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.preferya.facadesmsgatewatrouter.providers;

/**
 *
 * @author Sergio
 */
public interface IProvider {
    
    public void turnOffProvider();
    
    public int getNumIntentRemaining();
    
    public void sendMessage(String phone, String code, String iso_lang);
    
    //private void errorOcurred();
    
    //private boolean checkTimeOut();
    
    //private int numIntents(String code);
    
    //private String systemCheapest();
    
    //private void sleep(int numMiliSecond);
    
}
