/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.io.IOException;

/**
 *
 * @author HP
 */
public class ViewManager {
     public static AdminPage adminPage=null;
     public static PatientPage patientPage=null;


    private ViewManager(){}

    

    public static void openAdminPage() throws IOException {
        if (adminPage == null) {
            adminPage = new AdminPage();
            adminPage.show();
        } else {
            adminPage.show();
        }

    }
    public static void closeAdminPage(){
        if(adminPage != null)
            adminPage.close();
    }
    
     public static void openPatientPage() throws IOException {
        if (patientPage == null) {
            patientPage = new PatientPage();
            patientPage.show();
        } else {
            patientPage.show();
        }

    }
    public static void closePatientPage(){
        if(patientPage != null)
            patientPage.close();
    }
}
