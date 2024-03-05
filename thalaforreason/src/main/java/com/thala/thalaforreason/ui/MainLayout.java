package com.thala.thalaforreason.ui;

import com.thala.thalaforreason.service.WordLengthService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;


@Route("/main")
public class MainLayout extends VerticalLayout {

    public MainLayout(WordLengthService wordLengthService){



        TextField field = new TextField("Enter word here ");
        field.setRequiredIndicatorVisible(true);
        //field.setPattern("^[+]?[(]?[0-9]{3}[)]?[-s.]?[0-9]{3}[-s.]?[0-9]{4,6}$");
        //field.setAllowedCharPattern("[0-9()+-]");
        field.setMinLength(1);
        field.setMaxLength(18);

        add(field);

        H1 readonlyArea = new H1();

        add(readonlyArea);
        Button primaryButton = new Button("Check",buttonClickEvent -> setdisplayH1(wordLengthService,field,readonlyArea));
        primaryButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY,
                ButtonVariant.LUMO_SUCCESS);
        
        add(primaryButton);


        

    }

    private void setdisplayH1(WordLengthService wordLengthService, TextField field, H1 readonlyArea) {

       var thalaResp =  wordLengthService.isWordThalaforaReason(field.getValue());
        readonlyArea.setText(thalaResp.result());
    }

}
