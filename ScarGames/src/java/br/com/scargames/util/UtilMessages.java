/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.scargames.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author aluno1
 */
public class UtilMessages {
    
    public static void messageInfo(String message){
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, 
                            message,""));
            context.getExternalContext().getFlash().setKeepMessages(true);
    }
    
    public static void messageInfoDetail(String message, String detail){
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, 
                            message,detail));
            context.getExternalContext().getFlash().setKeepMessages(true);
    }
    
    public static void messageError(String message){
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                            message,""));
            context.getExternalContext().getFlash().setKeepMessages(true);
    }
    
    public static void messageErrorDetail(String message, String detail){
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, 
                            message,detail));
            context.getExternalContext().getFlash().setKeepMessages(true);
    }
}
